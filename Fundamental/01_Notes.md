# Java Fundamentals

## What is Java?

Java is a high-level, object-oriented programming language developed by Sun Microsystems.

Java is:

- Simple
- Secure
- Platform Independent
- Robust
- Beginner Friendly

---

# Why Learn Java?

✅ Easy to learn  
✅ Used in DSA and Interviews  
✅ Platform independent  
✅ Strong community support  
✅ Used in Android and Backend Development

---

# Features of Java

| Feature | Description |
|---|---|
| Platform Independent | Write Once Run Anywhere |
| Secure | JVM provides security |
| Robust | Handles memory properly |
| Simple | Easy syntax |
| Portable | Runs on multiple systems |

---

# Java Program Structure

```java
class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java");

    }
}
```

---

# Explanation of Java Program

| Part | Meaning |
|---|---|
| class Main | Class name |
| public | Accessible everywhere |
| static | Can run without object |
| void | Returns nothing |
| main() | Entry point of program |
| System.out.println() | Prints output |

---

# First Java Program

```java
class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Welcome to Java DSA Journey ");

    }
}
```

---

# Variables in Java

Variables are used to store data.

Example:

```java
int age = 20;
```

---

# Rules for Variables

✅ Variable names should be meaningful  
✅ Cannot start with numbers  
✅ Cannot contain spaces  
✅ Java is case-sensitive

Correct:

```java
int marks = 90;
```

Wrong:

```java
int 1marks = 90;
```

---

# Data Types in Java

Data types define what type of data a variable can store.

---

# Primitive Data Types

| Data Type | Example |
|---|---|
| int | 10 |
| double | 10.5 |
| char | 'A' |
| boolean | true |
| float | 5.5f |
| long | 100000 |

---

# Example Program

```java
class DataTypes {

    public static void main(String[] args) {

        int age = 20;
        double marks = 85.5;
        char grade = 'A';
        boolean passed = true;

        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
        System.out.println(passed);

    }
}
```

---

# Operators in Java

Operators are used to perform operations.

---

# Arithmetic Operators

| Operator | Meaning |
|---|---|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus |

---

# Example

```java
class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

    }
}
```

---

# Relational Operators

| Operator | Meaning |
|---|---|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than equal to |
| <= | Less than equal to |

---

# Logical Operators

| Operator | Meaning |
|---|---|
| && | AND |
| \|\| | OR |
| ! | NOT |

---

# Conditional Statements

Conditional statements are used for decision making.

---

# if Statement

```java
int age = 18;

if(age >= 18) {
    System.out.println("Adult");
}
```

---

# if-else Statement

```java
int number = 5;

if(number % 2 == 0) {
    System.out.println("Even");
}
else {
    System.out.println("Odd");
}
```

---

# else-if Ladder

```java
int marks = 85;

if(marks >= 90) {
    System.out.println("Grade A");
}
else if(marks >= 75) {
    System.out.println("Grade B");
}
else {
    System.out.println("Grade C");
}
```

---

# switch Statement

```java
int day = 2;

switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid Day");

}
```

---

# Loops in Java

Loops are used to repeat tasks.

---

# for Loop

```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

# while Loop

```java
int i = 1;

while(i <= 5) {
    System.out.println(i);
    i++;
}
```

---

# do-while Loop

```java
int i = 1;

do {
    System.out.println(i);
    i++;
}
while(i <= 5);
```

---

# break Statement

Used to stop the loop.

```java
for(int i = 1; i <= 10; i++) {

    if(i == 5) {
        break;
    }

    System.out.println(i);
}
```

---

# continue Statement

Used to skip current iteration.

```java
for(int i = 1; i <= 5; i++) {

    if(i == 3) {
        continue;
    }

    System.out.println(i);
}
```

---

# User Input in Java

Java uses Scanner class for input.

---

# Example

```java
import java.util.Scanner;

class InputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(age);

    }
}
```

---

# Comments in Java

Comments improve code readability.

---

# Single Line Comment

```java
// This is comment
```

---

# Multi Line Comment

```java
/*
This is
multi-line comment
*/
```

---

# Type Casting

Type casting means converting one data type into another.

---

# Implicit Casting

```java
int num = 10;
double data = num;
```

---

# Explicit Casting

```java
double num = 10.5;
int data = (int) num;
```

---

# JVM, JRE, and JDK

| Term | Meaning |
|---|---|
| JVM | Java Virtual Machine |
| JRE | Java Runtime Environment |
| JDK | Java Development Kit |

---

# Java Compilation Process

```text
Java Code (.java)
       ↓
Compiler (javac)
       ↓
Bytecode (.class)
       ↓
JVM
       ↓
Output
```

---

# Important Beginner Programs

- Prime Number
- Palindrome Number
- Reverse Number
- Fibonacci Series
- Factorial
- Calculator Program
- Multiplication Table

---

# Interview Questions

1. Why is Java platform independent?
2. Difference between JDK, JRE, and JVM?
3. What are variables?
4. Difference between while and do-while?
5. What is type casting?
6. Difference between == and = ?
7. What is Scanner class?

---

# Best Practices

✅ Use meaningful variable names  
✅ Maintain proper indentation  
✅ Write clean code  
✅ Practice daily  
✅ Focus on logic building

---

# Summary

In Java Fundamentals, we learned:

- Variables
- Data Types
- Operators
- Conditions
- Loops
- User Input
- Type Casting
- Comments

These concepts build the foundation for DSA and problem solving.

