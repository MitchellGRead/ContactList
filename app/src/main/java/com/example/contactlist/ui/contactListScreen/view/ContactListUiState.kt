package com.example.contactlist.ui.contactListScreen.view

data class ContactListUiState(
    val contacts: List<Contact> = listOf()
)

data class Contact(
    val name: String,
    val imageUri: String = "",
)
