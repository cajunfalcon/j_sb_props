package com.acme.myapp.springbootproperties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
public class WelcomeControllerTest extends AbstractWelcomeControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeControllerTest.class);

    @Override
    @Test
    public void testWelcome() {
        super.testWelcome();
    }

}
