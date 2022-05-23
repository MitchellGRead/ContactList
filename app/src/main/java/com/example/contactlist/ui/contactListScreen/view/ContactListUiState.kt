package com.example.contactlist.ui.contactListScreen.view

import com.example.contactlist.util.resource.Resource

data class ContactListUiState(
    val contacts: Resource<List<ContactUiModel>> = Resource.Loading,
)

data class ContactUiModel(
    val name: String,
    val imageUri: String = "",
)
