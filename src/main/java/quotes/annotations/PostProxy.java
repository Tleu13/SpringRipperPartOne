package quotes.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//Run method after everything like Proxy in spring already set up
@Retention(RetentionPolicy.RUNTIME)
public @interface PostProxy {
}
