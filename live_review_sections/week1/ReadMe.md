# Note Week 1 : 

Welcome to the Cybertek School.

- Introduction to programming 
- Command line 
- Running your first java program from command line 

- Running your program from Eclipse 
- Variables and Data type 
___

### What is Computer Program :

    set of instructions to tell computer what to do. 



### How does Java turn source code into machine code 
1. `java compiler` turn your source code into --> `bytecode` 
   
byte code is intermediate code between src code and machine code 

2. then the `bytecode` get coverted to `machine code` so your program can eventually run in `jvm`(Java Virtual Machine).
> bytecode is not platform specific. It can run on mac , windows, linux .. 

**That is how Java achieve write once and run anywhere**



### Editor
You can write source code in any plain text editor 
 like notepad on windows and
 like textedit on mac 

But as programmer we always want to have
syntax highlighting and some other help 
to write code better 

Few common text edtors are 
- [Sublime](https://www.sublimetext.com/3) 
- [Atom](https://atom.io/) 
- [VSCode](https://code.visualstudio.com/) (very popular)

## Java Installation 

In order to run a Java Program we need to have `JRE(Java Runtime Environment)`, It has `JVM (Java Virtual Machine)` to run java code.

In order to write and develop Java Program we need to have `JDK (Java Development Kit)` installed on the machine. 

`JDK` Contains `JRE` and `JRE` has `JVM` . 

So first step is to [download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and install JDK on your computer. any version with 8 or above will just work in this case. 

Make sure to follow canvas instruction to set up your JDK properly. 

---



Here we wrote our source code in sublime and saved as `Hello.java` on Desktop :

```java
public class Hello {

	public static void main(String[] args){

		System.out.println("Hello World");

	}

}
```

We openned the command line (or terminal) and navigate to desktop using below command.  

    cd Desktop

We compiled the Java source code using `javac` commmand 

    javac Hello.java

It generated `byte code` with `.class` extention as `Hello.class` 
then we used the below command to execute the program 

    #java YourClassNameGoesHere
    java Hello

It generated the output 

    Hello World

---- 

As a programmer , we always want to have a tool to compile and run our program all in one place and create and manage Java projects. 

That's where IDE(Integrated Devellopment Environment)) comes in. 

Few Popular options are : 

-  [Eclispe](https://www.eclipse.org/downloads/)
-  [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
-  NetBean and others. 

--- 
## Creating First Eclipse Project

Assuming you already [downloaded](https://www.eclipse.org/downloads) and openned Eclipse. 

Here is how to create first Java Project. 

![Creating First Java Project](https://user-images.githubusercontent.com/59104509/94446509-bc309000-0176-11eb-9b00-29f71d83af5d.gif)

Once we have the project,
 next step is to create package and class under the package. 

`package` in Eclipse is just a **folder** in file system to organize your classes. 
![Creating_First_Package_in_Eclipse_Project](https://user-images.githubusercontent.com/59104509/94447330-a374aa00-0177-11eb-95b4-5180a8753a2e.gif)

Once we have the package now we can create classes under the package and start writing the source code and run it.

![Creating_And_Running_HelloWorld_class_](https://user-images.githubusercontent.com/59104509/94448641-1f232680-0179-11eb-83c8-2f5cdadabc3c.gif)

--- 
### Understanding Eclipse Project Structure

```


This is how Project structure looks like for mac users, windows users will not have `.DS_Store` . everything else is exactly the same. 

There are a hidden file 
- `.classpath` to specify classpath information
- `.settings`  to store eclipse specific settings.
- `.project` to store project specific information
- `bin` folder is the folder for compiled `bytecodes` and it has same structore as `src` folder. 
>We do not need to do anything with above files and folders. 

- `src` folder is where the source code `.java` files stored. 



As a programmer , we just focus on writing source code under the source folder and let IDE take care of complation and running the compiled codes. 

That's why eclipse only shows `src` folder rather than displaying entire files and folders like `.classpath` ,`.settings` and `bin` folder. 

If you want to see what's inside the eclipse project directly from IDE you may follow below instruction. 

![How_to_See_Whats_Inside_Eclipse_Project](https://user-images.githubusercontent.com/59104509/94450856-c5702b80-017b-11eb-9531-340a469473e3.gif)

--- 

### Creating sub-package (package under the package)

Sometimes we want to organize the packages even more granual manner. 

For example , create a package called `assignments` and create another package under assignments called `week1`. Create a class called `AnotherHello` under week1 package. 

Process of creation is the same the only extra thing we need to make it happen is to provide package name as 

    assignments.week1

![Creating_SubPackage](https://user-images.githubusercontent.com/59104509/94451918-f735c200-017c-11eb-8b37-59c365ce6083.gif)

--- 

## Variables 

**Variable** is a container can store piece of information in programming. 

It has 3 parts : 
- Data type 
- Variable name
- Variable value 

For examle , to store whole number 75 in a variable named score: 
```java
//int score = 75 ; 
```
Now we can use this variable to represent the value `75` anywhere in the program.

```java
//System.out.println(score);  // 75 on the console.
```

**Data types :**
    Java is strongly typed language and each variable must have data type. 

**Primitive Data types : **
 - The most basic data types in java to store pure values like `numbers` , `characters` , `boolean` 
 - There are 8 primitive data types in java and all starts with lowercase letters.

According to the range of numbers it can hold  we have 
- whole number data types `byte` , `shorts` , `int` , `long` 
- fractional numbers data types `float` , `double`
For characters and boolean 
- `char`   :  `'A'`, `'B'`
- `boolean` : `true` , `false`


|  Type |  Range |
|:---:|:---:|    
| byte  |  -128 to 127 |
| short |  -32,768 to 32,767 |
|  int |  -2,147,483,648 to 2,147,483, 647 |
|  long | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  |
| float  |  approximately ±3.40282347E+38F <br> (6-7 significant decimal digits) |
| double |  approximately ±1.79769313486231570E+308 <br>(15 significant decimal digits) |
| char  |  0 to 65,536 (unsigned) |
| boolean |  true, false |

--- 

There is another data type very commonly used for store sequence of characters is `String` . String is not a primitive and yet since it's so common we will be using it early on and explain when we come to topic class and object.

--- 

## Naming in Java 

It's good to build good habbit in early stage of your learning to follow good naming convention. 

### Rules for names 
In any case , 
1. **spaces are not allowed as a name in java.**
2. **can not start a name with number**
3. **Name can be letters [a-z] , [A-Z] , [0-9]**
    >number can be anywhere after first character
4. **Only 2 special characters are allowed** 
   1. underscore `_`
   2. dollar sign `$`

### Naming Convention 
These are not rules but commonly accepted criteria to follow. 

Variables names should be always descriptive and meaningful. 

* **Class Names**
  * Always start with first letter uppercase : `Hello`
  * If you have more than one word, use uppercase for second Word first character : `HelloPractice` 
    * >This is also known as `TitleCase`
* **Package Names**
  * Always use `lowercase` : day01
  * if you have more than one word add `_` in between words 
* **Variable Names** (and methods later)
  * Always use lowecase!!!
  * More than one word you can use `camelCase`
    * >For Example : `myAwesome1stVariable`


### Declaring a variable : 

Giving a name and data type without assigning a value, you are claiming a space in memory to store data (later) . 
```java 
byte num1 ; 
short score ; 
int distance ; 
long distanceBetween2Planet ; 
float price ; 
double pi ;
char firstLetter ; 
boolean lightOn ; 

String name ; 
```

### Initilizing the Variable 

Giving a value for the first time. it can be also called assigning a value to variable. 
```java 
byte num1 ; 
num1 = 123; 

short score ;
score = 12398; 

int distance ;
distance = 123123123 ;  

long distanceBetween2Planet ; 
distanceBetween2Planet = 123487537456L ;

float price ; 
price = 1.99f ; 

double pi ;
pi = 3.14897987897d ; 

char firstLetter ; 
firstLetter = 'K' ; 

boolean lightOn ;
lightOn = false ;  


String name ; 
name = "Europe Batch 4" ; 
```

### Declaring and Initilizing the Variable

You may declare and initialize Variables at the same time. 

```java 
byte num1 = 123; 
short = 12398; 
int distance = 123123123 ;  
long distanceBetween2Planet = 123487537456L ;
float price = 1.99f ; 
double pi = 3.14897987897d ; 
char firstLetter = 'K' ; 
boolean lightOn = false ;  

String name "Europe Batch 4" ; 
```
