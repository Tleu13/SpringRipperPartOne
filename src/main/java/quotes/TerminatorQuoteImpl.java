package quotes;

import quotes.annotations.InjectRandomInt;
import quotes.annotations.PostProxy;
import quotes.annotations.Profiling;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoteImpl implements Quotes {

    @InjectRandomInt(min = 2 , max = 8)
    private int repeat;
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoteImpl() {
        System.out.println("Phase 1");
    }

    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i=0; i<repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
