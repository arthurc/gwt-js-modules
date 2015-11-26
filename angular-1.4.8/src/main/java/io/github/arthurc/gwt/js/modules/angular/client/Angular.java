package io.github.arthurc.gwt.js.modules.angular.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Angular {

    @JsProperty(name = "angular", namespace = JsPackage.GLOBAL)
    public native static Angular angular();

    @JsMethod
    public native Module module(String name, String[] requires);

    @JsMethod
    public native void bootstrap(Object element, String... modules);
}
