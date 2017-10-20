package quotes.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// This annotation generate some random integer with min and max range and then inject it in a field on runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {
    int min();
    int max();
}
