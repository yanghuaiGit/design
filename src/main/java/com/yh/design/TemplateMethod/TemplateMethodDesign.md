<p>模板方法模式(封装算法)</p> 
模板方法：
在一个方法中定义一个方法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤

模板就是一个方法，具体的说，这个方法将算法定义成一组步骤，其中的任何步骤都可以是抽象的，由子类负责实现。这可以确保算法的结构保持不变，同时由子类提供部分实现。

模板方法可以加一个hook()，钩子函数。
    钩子是一种声明在抽象类中的方法，但只有空的或者默认的实现。钩子的存在，可以让子类有能力对算法的不同点进行挂钩，由子类自行决定。
    
好莱坞原则;
    别调用我们，我们会调用你。

好莱坞原则可以防止"依赖腐败"出现。当高层组件依赖低层组件，而低层组件右依赖高层组件，而高层组件右依赖边侧组件，而边侧组件右依赖低层组件，依赖腐败就产生了。在这种情况下，没有人能够轻易的弄懂系统是如何设计的。

在好莱坞原则之下,我们允许低层组件将自己挂钩到系统上，但是高层组件会决定什么时候和怎样使用这些低层组件。换句话说，高层组件对待低层组件的方式是别调用我们，我们会调用你们。

低层组件可以参与计算，但绝对不能直接调用高层组件。


好莱坞原则和依赖倒置原则的关系？
    依赖倒置原则要求我们尽量避免使用具体类，而多使用抽象。而好莱坞原则是在创建框架或组件上的一个技巧，
    好让低层组件能够被倒钩进计算中，而且又不会让高层依赖低层组件，两者的目标都是在于解耦，但是依赖倒置原则
    则更加注重如何在设计中避免依赖。
    好莱坞原则教我们一个技巧，创建一个有弹性的设计，允许低层结构能够互相操作，而又防止其他类太过于依赖他们。
    
模板方法和策略方法区别：
    策略方法：定义一个算法家族，并让这些算法可以互换，正因为每一个算法都被分装了，所以客户可以很轻易的使用不同的算法。
    通过对象组合的方式，让客户可以选择算法的实现    
    模板方法：定义一个算法的大纲，而由子类定义其中某些步骤的内容。可以在算法的个别步骤可以有不同的实现细节，但是算法的结构仍然保持不变。
    
    模板方法对算法有更多的控制权，而且不会重复代码，会重复使用的代码都整合到了超类中，相对于策略模式，需要更少的对象，但是策略模式使用对象组合的方式，更有弹性。
    客户可以在运行时改变算法，模板还比较依赖，必须依赖超类中的方法的实现，因为这是算法的一部分，策略就不需要，一个对象就是一个完整的算法。    