package com.acme.myapp.springbootproperties.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
        @PropertySource("classpath:config/default.properties"),
        @PropertySource(ignoreResourceNotFound=true, value="classpath:config/default-${spring.profiles.active}.properties"),
        @PropertySource(ignoreResourceNotFound=true, value="classpath:config/deploy.properties"),
            /* deploy.properties - inject this file into app for all but dev envs
             *   - Use this to set empty default properties values.  For dev envs, they are set in local.properties.
             *   - This can be used to prevent dev envs from using default prod config values.
             */
        @PropertySource({
                "classpath:config/cluster.properties",
                "classpath:config/node.properties",
                "classpath:config/local.properties",
        })
})
public abstract class AbstractProperties {
}
