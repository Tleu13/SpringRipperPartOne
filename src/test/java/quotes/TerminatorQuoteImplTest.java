package quotes;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TerminatorQuoteImplTest {

   @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void sayQuote(){

    }

}