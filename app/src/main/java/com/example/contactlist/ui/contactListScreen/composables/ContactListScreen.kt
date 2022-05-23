package com.example.contactlist.ui.contactListScreen.composables

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactlist.ui.theme.ContactListTheme

/* Scaffolding for the screen */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ContactListScreen() {
    val contacts by remember { mutableStateOf(listOf("Mitchell", "Jadyn", "Tom"))}

    Scaffold {
        ContactList(contacts)
    }
}

@Composable
fun ContactList(contacts: List<String>) {
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
    ContactListTheme {
        ContactListScreen()
    }
}
// endregion
