package com.muditasoft.didemo.Notes;

public class Notes {
    /**
     * + Is the Dependency Inversion Principle the same as Dependeny Injection?
     * - No, Dependency Inversion addresses abstractions. While Dependency Injection refers
     *  to the injection of Dependencies into a class.
     *
     *  + Which type of Dependency Injection should you favor?
     *  - By Constructor; This requires the dependency to be injected when the class
     *  is instantiated.
     *
     *  + Can you use Dependency Injection against a private property in Spring?
     *  - Yes, Spring will support this, and inject the dependency using reflection at runtime.
     *  However, this is considered a VERY bad practice.
     *
     *  + Is it good practice to use concrete classes for dependency injection?
     *  - No, You should use interfaces, which will allow the runtime environment to determine
     *  the implementation to inject.
     *
     *  + What is IoC?
     *  - Inversion of Control; the runtime environment (or framework) which injects dependencies
     *
     *  + What is the annotation used in Spring to indicate you want a dependency injected?
     *  - @Autowired
     *
     *  + If you have two beans of the same type, how do you specify a preference for one
     *  over the other?
     *  - The @Primary annotation can be used to designate a primary bean.
     *
     *  + What are the two callback interfaces you can implement to tap into the bean lifecycle?
     *  - InitializingBean and DisposableBean
     *
     *  + What two annotations can be used to access the Spring Bean lifecycle?
     *  - @PostConstruct and @PreDestroy
     *
     *  + How do you specify a bean name you want injected?
     *  - Use the @Qualifier annotation.
     *
     * */
}
