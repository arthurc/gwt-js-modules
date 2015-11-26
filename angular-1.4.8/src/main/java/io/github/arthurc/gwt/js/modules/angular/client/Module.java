package io.github.arthurc.gwt.js.modules.angular.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType
public class Module {

    @JsMethod
    public native Module controller(String name, InlineArrayAnnotations inlineArrayAnnotations);

    @JsMethod
    public native Module service(String name, InlineArrayAnnotations inlineArrayAnnotations);

}
