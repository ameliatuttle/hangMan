// This class keeps track of the correct and incorrect guesses.
class Guess {
    val correctGuesses = mutableSetOf<Char>()
    val incorrectGuesses = mutableSetOf<Char>()
    var attemptsLeft = 6

    // This function returns a boolean if the word is or isn't guessed.
    fun makeGuess(word: String, guess: Char): Boolean {

        return if (guess in word) {
            correctGuesses.add(guess)
            true
        }

        else {
            incorrectGuesses.add(guess)
            attemptsLeft--
            false
        }
    }

    fun isAlreadyGuessed(guess: Char): Boolean {
        return guess in correctGuesses || guess in incorrectGuesses
    }
}