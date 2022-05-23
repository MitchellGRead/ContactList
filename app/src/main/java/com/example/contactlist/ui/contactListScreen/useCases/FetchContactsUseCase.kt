package com.example.contactlist.ui.contactListScreen.useCases

import com.example.contactlist.ui.contactListScreen.view.Contact

class FetchContactsUseCase {

    operator fun invoke(): List<Contact> {
        return listOf(Contact(name = "Mitchell"))
    }
}
