package io.github.arthurc.gwt.js.modules.angular.client;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public class InlineArrayAnnotations {

    @JsOverlay
    public static InlineArrayAnnotations of(Function0 function) {
        return create(function);
    }

    @JsOverlay
    public static <T1> InlineArrayAnnotations of(String p1, Function1<T1> function) {
        return create(p1, function);
    }

    @JsOverlay
    public static <T1, T2> InlineArrayAnnotations of(String p1, String p2, Function2<T1, T2> function) {
        return create(p1, p2, function);
    }

    @JsOverlay
    private static InlineArrayAnnotations create(Object... objects) {
        InlineArrayAnnotations inlineArrayAnnotations = new InlineArrayAnnotations();
        for (Object o : objects) {
            inlineArrayAnnotations.push(o);
        }
        return inlineArrayAnnotations;
    }

    native void push(Object o);

    @JsFunction
    @FunctionalInterface
    public interface Function0 {
        Object apply();
    }

    @JsFunction
    @FunctionalInterface
    public interface Function1<T1> {
        Object apply(T1 p1);
    }

    @JsFunction
    @FunctionalInterface
    public interface Function2<T1, T2> {
        Object apply(T1 p1, T2 p2);
    }
}
