package io.github.arthurc.gwt.js.modules.examples.angular.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;
import io.github.arthurc.gwt.js.modules.angular.client.InlineArrayAnnotations;
import io.github.arthurc.gwt.js.modules.angular.client.Scope;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;

import static io.github.arthurc.gwt.js.modules.angular.client.Angular.angular;

public class AngularEntry implements EntryPoint {

    @Override
    public void onModuleLoad() {
        angular().module("myModule", new String[0])
                .service("myService", InlineArrayAnnotations.of(MyService::new))
                .controller("myCtrl", InlineArrayAnnotations.of("myService", "$scope", MyController::new));
        angular().bootstrap(Document.get(), "myModule");
    }

    @JsFunction
    @FunctionalInterface
    interface NameListener {
        void listen(Object event, String name);
    }

    static class MyController {

        private MyService myService;
        private Scope scope;

        public MyController(MyService myService, Scope scope) {
            this.myService = myService;
            this.scope = scope;

            this.scope.<NameListener>$on("name", (event, name) -> Window.alert("Hello " + name));
        }

        @JsMethod
        public void clicked() {
            scope.$emit("name", myService.name());
        }

    }

    static class MyService {

        public String name() {
            return "Bob";
        }

    }
}
