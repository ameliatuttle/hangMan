// This function calls the other functions and controls the game.
fun main() {
    // Declare instances of the classes
    val draw = Draw()
    val guess = Guess()
    val word = Word()

    // This loop repeats until the user either won or killed the hangman.
    while (guess.attemptsLeft > 0) {
        draw.printHangman(guess.attemptsLeft)
        draw.printWord(word.selectedWord, guess.correctGuesses)

        // If the player wins this is printed and the loop is exited.
        if (guess.correctGuesses.containsAll(word.selectedWord.toSet())) {
            println("Congratulations! You've won!")
            return
        }

        // This shows th collection of letters that have been guessed, the incorrect attempts you have left, and prompts for a letter.
        println("Incorrect guesses: ${guess.incorrectGuesses.joinToString(", ")}")
        println("Attempts left: ${guess.attemptsLeft}")
        print("Guess a letter: ")
        val userGuess = readLine()?.toUpperCase()?.firstOrNull()

        // If they don't enter a valid letter it will prompt them to enter another letter.
        if (userGuess == null || !userGuess.isLetter()) {
            println("Please enter a valid letter.")
            continue
        }

        // If the letter has already been guessed it will prompt for another letter.
        if (guess.isAlreadyGuessed(userGuess)) {
            println("You've already guessed that letter.")
            continue
        }

        // These are the outputs for valid not yet guessed letters.
        if (guess.makeGuess(word.selectedWord, userGuess)) {
            println("Good guess!")
        }
        else {
            println("Wrong guess.")
        }
    }

    draw.printHangman(0)
    println("Game over! The word was: ${word.selectedWord}")
}