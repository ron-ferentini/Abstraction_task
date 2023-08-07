<link rel='stylesheet' href='https://codefinity-content-media.s3.eu-west-1.amazonaws.com/css_custom_styles/StudyMore.css'>
<link rel='stylesheet' href='https://codefinity-content-media.s3.eu-west-1.amazonaws.com/css_custom_styles/TextFormatting.css'>

# Abstraction_task

An abstract class called ``Shape`` has been created for you. It contains two abstract methods: ``calculateArea()`` and ``calculatePerimeter()``. Your task is to implement two classes: ``Rectangle`` and ``Circle``. You need to inherit these classes from the abstract class ``Shape`` and **override** its methods.
Here's a brief guide:

* For the ``Circle`` class, you will need fields such as `radius`, and for the `Rectangle` class, you will need fields like `width` and `height`. These fields and their constructors are **already provided for you**. Use these fields when overriding the methods.

* If you don't have strong geometry knowledge, here's a quick reference with formulas you need to use:
    *  Circle Area: **Pi * radius * radius**;
    * Circle Perimeter: **2 * PI * radius**;
    * Rectangle Area: **width * height**;
    * Rectangle Perimeter: **2 * (width + height)**.

To use the value of π (PI), make use of the ``Math`` library. You can use ``Math.PI`` to access the value of π.
