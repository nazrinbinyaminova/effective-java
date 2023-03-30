package com.example.effective_java.chapter_2_create_destroy.static_factory_method;

public class StaticFactoryMethodExample {

    private int a;
    // create private constructor to avoid instance creation
    private StaticFactoryMethodExample(){
    }

    /*
    * + naming is available in static Factory Method
    * + can be returned subtype of class
    * + are not required to create a new object each time they’re invoked.
    * + vary from call to call as a function of the input parameters
    * - classes without public or protected constructors cannot be subclassed.
    * - hard for programmers to find
    * */
    public static StaticFactoryMethodExample getInstance(){
        return new StaticFactoryMethodExample();
    }
}
