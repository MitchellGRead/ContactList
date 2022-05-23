package com.example.contactlist

import com.example.contactlist.ui.contactListScreen.view.Contact
import com.example.contactlist.ui.contactListScreen.view.ContactListUiState
import com.example.contactlist.ui.contactListScreen.view.ContactListViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Test


internal class ContactListTest {

    private val viewModel = ContactListViewModel()

    @Test
    fun `WHEN the view model is created THEN ui state with contacts emitted`() {
        val expected = ContactListUiState(
            contacts = listOf(
                Contact(
                    name = "Mitchell",
                    imageUri = ""
                )
            )
        )

        val actual = viewModel.uiState.value

        assertEquals(actual, expected)
    }
}
