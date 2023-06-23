package com.example.graphqldemo

data class Book(val id: String, val name: String, val pageCount: Int, val authorId: String) {
    companion object {
        fun getById(id: String): Book {
            return books().first { it.id == id }
        }

        private fun books(): List<Book> = listOf(
            Book("book-1", "Effective Java", 416, "author-1"),
            Book("book-2", "Clean Code", 464, "author-2"),
            Book("book-3", "Code Complete", 960, "author-3")
        )
    }
}
