package com.example.contactlist.ui.contactListScreen.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactListViewModel : ViewModel() {

    private val _uiModel = MutableStateFlow(ContactListUiState())
    val uiModel = _uiModel.asStateFlow()

    fun fetchContactList() {
        _uiModel.update { ContactListUiState(contacts = listOf(Contact(name = "Mitchell"))) }
    }

}
