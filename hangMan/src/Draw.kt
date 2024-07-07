// This class controls what is drawn to the screen.
class Draw {
    // This list has the different stages of hangman. They are in order and every time a letter is guessed incorrectly the next stage is shown so that we see a new body part added.
    private val hangmanStages = listOf(
        """
         _______
        |      |
        |
        |
        |
        |
        |
      __|_____
        """,
        """
         _______
        |      |
        |      O
        |
        |
        |
        |
      __|_____
        """,
        """
         _______
        |      |
        |      O
        |      |
        |
        |
        |
      __|_____
        """,
        """
         _______
        |      |
        |      O
        |     /|
        |
        |
        |
      __|_____
        """,
        """
         _______
        |      |
        |      O
        |     /|\
        |
        |
        |
      __|_____
        """,
        """
         _______
        |      |
        |      O
        |     /|\
        |     /
        |
        |
      __|_____
        """,
        """
         _______
        |      |
        |      O
        |     /|\
        |     / \
        |
        |
      __|_____
        """
    )

    // This function is what actively prints the proper hangman stage by keeping track of the stage.
    fun printHangman(attemptsLeft: Int) {
        val stageIndex = 6 - attemptsLeft
        println(hangmanStages[stageIndex])
    }

    // This prints the word the user has guessed with blanks or the guessed letter.
    fun printWord(word: String, correctGuesses: Set<Char>) {

        for (letter in word) {

            if (letter in correctGuesses) {
                print("$letter ")
            }

            else {
                print("_ ")
            }
        }
        println()
    }
}