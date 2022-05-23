package com.example.contactlist.ui.contactListScreen.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactListViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ContactListUiState())
    val uiState = _uiState.asStateFlow()

    init {
        fetchContactList()
    }

    fun fetchContactList() {
        _uiState.update { ContactListUiState(contacts = listOf(Contact(name = "Mitchell"))) }
    }

}
