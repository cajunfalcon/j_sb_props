package com.acme.myapp.springbootproperties.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Configuration
@ConfigurationProperties
public class GlobalProperties extends AbstractProperties {

    @Autowired
    private Environment environment;

    private String[] activeProfiles;

    @Max(50)
    @Min(1)
    private int threadPool;

    @NotEmpty
    private String email;

    @PostConstruct
    public void init() {
        activeProfiles = environment.getActiveProfiles();
    }

    public int getThreadPool() {
        return threadPool;
    }

    public void setThreadPool(int threadPool) {
        this.threadPool = threadPool;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getActiveProfilesAsStr() {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("[");
        for (int i = 0; i < activeProfiles.length; i++) {
            if (i > 0) {
                strBuf.append(", ");
            }
            strBuf.append(activeProfiles[i]);
        }
        strBuf.append("]");
        return strBuf.toString();
    }

    @Override
    public String toString() {
        return "GlobalProperties{" +
                "profiles=" + getActiveProfilesAsStr() +
                ", threadPool=" + threadPool +
                ", email='" + email + '\'' +
                '}';
    }
}
