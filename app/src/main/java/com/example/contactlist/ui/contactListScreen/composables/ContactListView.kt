package com.example.contactlist.ui.contactListScreen.composables

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactlist.ui.contactListScreen.view.ContactUiModel
import com.example.contactlist.ui.contactListScreen.view.ContactListUiState
import com.example.contactlist.ui.contactListScreen.view.ContactListViewModel
import com.example.contactlist.ui.theme.ContactListTheme

@Composable
fun ContactListView(viewModel: ContactListViewModel) {
    val uiState = viewModel.uiState.collectAsState()

    ContactListView(uiState.value)
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
private fun ContactListView(uiState: ContactListUiState) {
    Scaffold {
        ContactList(uiState.contacts)
    }
}

@Composable
fun ContactList(contacts: List<ContactUiModel>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(contacts) { contact ->
            ContactListItem(contact)
        }
    }
}

// region Previews
@Preview(
    name = "Dark Theme",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Default",
    showBackground = true
)
@Composable
private fun ContactScreenPreview() {
    val uiState = ContactListUiState(
        contacts = listOf(
            ContactUiModel("Mitchell"),
            ContactUiModel("Jadyn"),
            ContactUiModel("Tom"),
        )
    )
    ContactListTheme {
        ContactListView(uiState)
    }
}
// endregion
