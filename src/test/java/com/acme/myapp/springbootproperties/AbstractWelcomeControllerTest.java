package com.acme.myapp.springbootproperties;

import com.acme.myapp.springbootproperties.config.AppProperties;
import com.acme.myapp.springbootproperties.config.GlobalProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/* TODO
 * - load logger configs before Logger initializes
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractWelcomeControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(AbstractWelcomeControllerTest.class);

    private AppProperties app;
    private GlobalProperties global;

    @Autowired
    public void setApp(AppProperties app) {
        this.app = app;
    }

    @Autowired
    public void setGlobal(GlobalProperties global) {
        this.global = global;
    }

    @Test
    public void testWelcome() {
        String appProperties = app.toString();
        String globalProperties = global.toString();

        logger.debug("Welcome {}, {}", global, app);
    }

}
