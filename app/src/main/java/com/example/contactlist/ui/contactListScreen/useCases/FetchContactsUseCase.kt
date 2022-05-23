package com.example.contactlist.ui.contactListScreen.useCases

import com.example.contactlist.ui.contactListScreen.view.ContactUiModel

class FetchContactsUseCase {

    operator fun invoke(): List<ContactUiModel> {
        return listOf(ContactUiModel(name = "Mitchell"))
    }
}
