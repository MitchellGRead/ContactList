package com.example.contactlist.ui.contactListScreen.view

import androidx.lifecycle.ViewModel
import com.example.contactlist.ui.contactListScreen.useCases.FetchContactsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactListViewModel(
    private val fetchContactsUseCase: FetchContactsUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(ContactListUiState())
    val uiState = _uiState.asStateFlow()

    init {
        fetchContactList()
    }

    fun fetchContactList() {
        _uiState.update { ContactListUiState(contacts = fetchContactsUseCase()) }
    }

}
