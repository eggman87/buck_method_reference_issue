# buck_method_reference_issue
Demonstrates method reference issue with buck and okbuck on a android project. As well as a NPE in newest version of okbuck. 

Run `EXTRA_OKBUCK_ARGS="--stacktrace" ./buckw build //app:bin_debug` and notice that you get error: 

```
MainActivity.java:-1: error: cannot find symbol

  symbol:   method getImplMethodKind()
  location: interface java.lang.invoke.SerializedLambda
Errors: 1. Warnings: 0.
```

Remove `extends Serializable` from `UiItemAdapter` and run build again. Notice the build succeeds. This code compiles fine with gradle. 

Another issue is that the app does not build with okbuck `0.0.36`. If you update the version and run `EXTRA_OKBUCK_ARGS="--stacktrace" ./buckw build //app:bin_debug` you will see an exception at: 
```
Caused by: java.lang.NullPointerException
        at com.uber.okbuck.core.model.base.Scope.extractConfiguration(Scope.java:354)
        at com.uber.okbuck.core.model.base.Scope.<init>(Scope.java:102)
        at com.uber.okbuck.core.model.base.Scope.lambda$from$3(Scope.java:170)
        at com.uber.okbuck.core.model.base.Scope.from(Scope.java:169)
        at com.uber.okbuck.core.model.base.Scope.from(Scope.java:124)
        at com.uber.okbuck.core.model.base.Scope.from(Scope.java:152)
        at com.uber.okbuck.core.model.base.Scope$from.call(Unknown Source)
        at com.uber.okbuck.core.dependency.DependencyCache.<init>(DependencyCache.groovy:55)
```
The same command works fine with `0.0.35`
