package com.acme.myapp.springbootproperties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("dev")
public class WelcomeControllerDevTest extends AbstractWelcomeControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeControllerDevTest.class);

    @Override
    @Test
    public void testWelcome() {
        super.testWelcome();
    }

}
