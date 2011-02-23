package org.bridj.ann;

import java.lang.annotation.ElementType;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Force the method call convention to some value.<br>
 * Without this annotation, BridJ will do its best to infer the call convention from the context (C++ method, symbol decoration...)
 * @author Olivier Chafik
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PACKAGE, ElementType.PARAMETER, ElementType.CONSTRUCTOR})
@Inherited
public @interface Convention {
    public enum Style {
        //Auto,
        StdCall,
        //ThisCall,
        FastCall,
        CDecl, 
        Pascal,
        CLRCall,
        ThisCall
    }
    Style value();
}
