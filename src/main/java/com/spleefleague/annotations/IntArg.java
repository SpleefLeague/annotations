/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spleefleague.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author jonas
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER})
@Argument(target = int.class)
public @interface IntArg {
    int min() default Integer.MIN_VALUE;
    int max() default Integer.MAX_VALUE;
}