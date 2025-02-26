# Overview

I chose this project so that I could expand my JVM programming knowledge. The last project I did when I learned a new language I learned Java so Kotlin is the natural next step because it was created to be interoperable with Java. It even uses the same IDE, IntelliJ.

This program is a simple command line app written in Kotlin that lets a user play hangman. The game prompts the user for a guess and checks to see if the letter is in the word. If it is, the word is displayed with blanks and the correct letter placement, if it is not, the hangman is displayed with a new body part and the guessed letter is added to the guessed letters list. The program is broken into 4 files/classes called Main, Draw, Guess, and Word. Main controls the program by calling the different functions at the appropriate times, Draw controls what is put on screen and the phase of hangman that is shown, Guess handles the user's input to know if it is valid or already input, and Word chooses the word for the round by randomly selecting one from it's word bank.

[Software Demo Video](https://www.youtube.com/watch?v=yS-3bJDv7Vo)

# Development Environment

The tools I used to develop this software are IntelliJ and W3 Schools. IntelliJ is an IDE created by JetBrains primarily for Java, but it works just as well for Kotlin because it was also created by JetBrains. The IDE runs with many other languages but was developed with JVM in mind. W3 Schools is an incredible online resource for all kinds of programming languages. It offers helpful demonstrations and tutorial sandboxes to practice in. 

Kotlin is a high-level, object-oriented and functional language developed to be interoperable with Java. This means that in Kotlin you can call Java code and in Java you can call Kotlin code. It was created in 2010 by JetBrains and it was made to improve upon Java. It has simpler syntax, less specific variable declarations, and built-in null safety. For this program the only library I used was Random so that I could randomly chose a word from the word bank. 
