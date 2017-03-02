Code Guidelines
==================
1.D.R.Y(Don't Repeat Yourself)
-----------------------------
You should not write same code or logic twice

```
public static void main(String[] args) {
    int a = 10;
    if(a>0){
      a++;
      System.out.print("NewInteger = "+a);
    }
    else{
      System.out.print("NewInteger = "+a);
    }
  }
```
Let's see. In java code that i write above.

We have same `System.out.print("NewInteger = "+a)`. Both of them give we `NewInteger = a` so why we write it twice?

Let's fix it:

```
public static void main(String[] args) {
    int a = 10;
    if(a>0){
      a++;
    }
    System.out.print("NewInteger = "+a);
  }
```

When we fix it we will have new code that shorter than the old one.

DRY will help use less time to coding.


2.Use meaningful name for variables, methods and classes.
---------

Using meaningful name for variables, methods and classes that will help you when you have bug or errors in your code.

Meaningful will help other people to under stand your code too.

You can [click here](https://dzone.com/articles/best-practices-variable-and) to learn more and practice for best naming.

This is example for bad naming:

```
  double m = 350.00;
  double n = m/35.00;
  System.out.print("You have %.2f dollars",n);


```
You can see it hard to read and understand when you forgot what is `m` and `n` ? that will make you hard to find errors in your code.

You can make it easier to read

 ```
 double thaiMoney = 350.00;
 double usMoney = thaiMoney/35.00;
 System.out.print("You have %.2f dollars",usMoney);

```



Useful References
-------

http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html

https://dzone.com/articles/best-practices-variable-and
