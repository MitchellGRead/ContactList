package com.example.contactlist.ui.contactListScreen.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.contactlist.ui.contactListScreen.useCases.FetchContactsUseCase

@Suppress("UNCHECKED_CAST")
class ContactListViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactListViewModel::class.java)) {
            return ContactListViewModel(FetchContactsUseCase()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class $modelClass")
    }
}
