package checkers.quals;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import checkers.javari.JavariChecker;
import checkers.metaquals.*;
import static java.lang.annotation.ElementType.*;

/**
 * Indicates that, for the variable on which this annotation appears,
 * the object to which this variable refers can be modified via this
 * reference, except its fields explicitly marked as {@link ReadOnly}.
 * 
 * <p>
 * 
 * This annotation is part of the Javari language.
 * 
 * @see ReadOnly
 * @see JavariChecker
 * @manual #javari Javari Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD, LOCAL_VARIABLE, METHOD, PARAMETER, TYPE})
@TypeQualifier
@SubtypeOf({ReadOnly.class})
public @interface Mutable {

}
