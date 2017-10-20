package quotes.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//This annotation will add some profiling logic when any method will run, by using Proxy
// We can control our profiling start or stop with Mbean server by change profile enable/disable
@Retention(RetentionPolicy.RUNTIME)
public @interface Profiling {
}
