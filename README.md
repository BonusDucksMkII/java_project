
# Overview
This program is supposed to pull JSON data from the National Weather Service's API, parse the data, and return relevant data.
At some point, it will have a user interface written in Swing.

I wrote this program to learn more about Java and its different packages.

Here's a YouTube video demonstrating what I have so far.

[Software Demo Video](https://youtu.be/IG44APTb94w)

# Development Environment

## Dependencies
This was written using packages like Swing and java.net and .io; you'll want at least JDK 6 for this.
You'll also need [json.simple] (https://code.google.com/archive/p/json-simple/).
Compile like so:
`javac -cp json-simple-1.1.1.jar weatherData.java`
NOTE: As of right now, compiling from the command line and then running with *java* throws an exception.
It'll work fine in an IDE, though, if you reference json-simple-1.1.1.jar in it.


I worked mostly in VSCode, for simplicity's sake.

Java is a class-based programming language that typically runs in its own JVM (Java Virtual Machine). In essence,
it leverages OOP to create interfacing methods and objects to make a program.

# Useful Websites

I used these websites (and many more I won't list) for reference during this project:

- [Small reference for json.simple](https://alex-public-doc.s3.amazonaws.com/json_simple-1.1/index.html)
- [The ubiquitous W3Schools](https://www.w3schools.com/java/default.asp)

# Future Work

{Make a list of things that you need to fix, improve, and add in the future.}

- Properly parse JSON data to get what's relevant.
- Implement a user interface.
- Figure out what I'm doing.