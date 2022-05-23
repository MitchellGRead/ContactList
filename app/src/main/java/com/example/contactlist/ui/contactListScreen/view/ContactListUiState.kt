package com.example.contactlist.ui.contactListScreen.view

data class ContactListUiState(
    val contacts: List<ContactUiModel> = listOf()
)

data class ContactUiModel(
    val name: String,
    val imageUri: String = "",
)
