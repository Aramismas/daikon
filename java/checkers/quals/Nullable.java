package checkers.quals;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.*;

import checkers.metaquals.*;
import checkers.nonnull.NonNullChecker;

import com.sun.source.tree.Tree;


/**
 * Indicates that a variable may have a null value.
 * 
 * <p>
 * 
 * This annotation is associated with the {@link NonNullChecker}.
 * 
 * @see NonNull
 * @see NonNullChecker
 * @manual #nonnull NonNull Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD, LOCAL_VARIABLE, METHOD, PARAMETER, TYPE})
@TypeQualifier @QualifierRoot
@ImplicitFor(trees={Tree.Kind.NULL_LITERAL})
public @interface Nullable {

}
