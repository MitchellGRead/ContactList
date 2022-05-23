package com.example.contactlist

import com.example.contactlist.ui.contactListScreen.useCases.FetchContactsUseCase
import com.example.contactlist.ui.contactListScreen.view.ContactUiModel
import com.example.contactlist.ui.contactListScreen.view.ContactListUiState
import com.example.contactlist.ui.contactListScreen.view.ContactListViewModel
import com.example.contactlist.util.resource.Resource
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.lang.RuntimeException


internal class ContactListTest {

    private val fetchContactsUseCase = FetchContactsUseCase()
    private val viewModel = ContactListViewModel(fetchContactsUseCase)

    @Test
    fun `GIVEN success WHEN the view model is created THEN ui state with contacts emitted`() {
        val expected = ContactListUiState(
            contacts = Resource.Success(
                listOf(
                    ContactUiModel(
                        name = "Mitchell",
                        imageUri = ""
                    )
                )
            )
        )

        val actual = viewModel.uiState.value

        assertEquals(expected, actual)
    }
}
