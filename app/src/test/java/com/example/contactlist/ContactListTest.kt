package com.example.contactlist

import androidx.compose.runtime.collectAsState
import com.example.contactlist.ui.contactListScreen.view.Contact
import com.example.contactlist.ui.contactListScreen.view.ContactListUiState
import com.example.contactlist.ui.contactListScreen.view.ContactListViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Test


internal class ContactListTest {

    private val viewModel = ContactListViewModel()

    @Test
    fun `GIVEN a list of contacts WHEN getContacts THEN ui state with contacts received`() {
        val expected = ContactListUiState(
            contacts = listOf(
                Contact(
                    name = "Mitchell",
                    imageUri = ""
                )
            )
        )

        viewModel.fetchContactList()
        val actual = viewModel.uiModel.value

        assertEquals(actual, expected)
    }
}
