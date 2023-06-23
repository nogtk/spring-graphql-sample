package com.example.graphqldemo

data class Author(val id: String, val firstName: String, val lastName: String) {
    companion object {
        fun getById(id: String): Author {
            return authors().first { it.id == id }
        }

        private fun authors(): List<Author> = listOf(
            Author("author-1", "Joshua", "Bloch"),
            Author("author-2", "Robert", "Martin"),
            Author("author-3", "Steve", "McConnell")
        )
    }
}
