package com.example.graphqldemo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest
import org.springframework.graphql.test.tester.GraphQlTester
import org.springframework.graphql.test.tester.HttpGraphQlTester

@GraphQlTest(BookController::class)
class BookControllerTests {

    @Autowired
    private lateinit var graphQlTester: GraphQlTester

    @Test
    fun shouldGetFirstBook() {

        graphQlTester
            .documentName("bookDetails")
            .variable("id", "book-1")
            .execute()
            .path("bookById")
            .matchesJson("""
                {
                    "id": "book-1",
                    "name": "Effective Java",
                    "pageCount": 416,
                    "author": {
                        "id": "author-1",
                        "firstName": "Joshua",
                        "lastName": "Bloch"
                    }
                }
            """.trimIndent())
    }

}
