import kotlin.random.Random

// The class selects a random word from the word bank and returns the selected word for hangman.
class Word {
    private val words = listOf("computer","peanut","wrench","ball","star","fan","heart","ladder","onion","rain","anger","fur","blossom","eucalyptus","organic")
    val selectedWord = words[Random.nextInt(words.size)].toUpperCase()
}