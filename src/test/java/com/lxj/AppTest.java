package com.lxj;

import static org.junit.Assert.assertTrue;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("hello log");

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

        StatusPrinter.print(loggerContext);
    }
}
