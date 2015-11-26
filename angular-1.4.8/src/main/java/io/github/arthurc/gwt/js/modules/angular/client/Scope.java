package io.github.arthurc.gwt.js.modules.angular.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Created by arthurcarlsson on 2015-11-26.
 */
@JsType(isNative = true)
public interface Scope {

    @JsMethod
    <T> void $on(String eventName, T listener);

    @JsMethod
    void $emit(String eventName);

    @JsMethod
    void $emit(String eventName, Object arg1);

    @JsMethod
    void $emit(String eventName, Object arg1, Object arg2);

    @JsMethod
    void $emit(String eventName, Object arg1, Object arg2, Object arg3);

}
