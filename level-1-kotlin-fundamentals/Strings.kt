fun main(){

    val bookTitle = "The Great Gatsby"
    println(bookTitle.length)
    println(bookTitle.uppercase())
    println(bookTitle.lowercase())
    println(bookTitle.substring(0, 5))
    println(bookTitle.contains("Gat"))
    println("The book title is $bookTitle, and it has a length of ${bookTitle.length}")
    val aboutTheBook = """
        It's a great book
        It has good story
        Book
    """.trimIndent()
    println(aboutTheBook)
}