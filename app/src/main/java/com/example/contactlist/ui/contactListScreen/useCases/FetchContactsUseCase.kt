package com.example.contactlist.ui.contactListScreen.useCases

import com.example.contactlist.ui.contactListScreen.view.ContactUiModel
import com.example.contactlist.util.resource.Resource

class FetchContactsUseCase {

    operator fun invoke(): Resource<List<ContactUiModel>> {
        return Resource.Success(listOf(ContactUiModel(name = "Mitchell")))
    }
}
