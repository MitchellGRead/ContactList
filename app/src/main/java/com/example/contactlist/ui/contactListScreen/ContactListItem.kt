package com.example.contactlist.ui.contactListScreen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactlist.ui.theme.ContactListTheme
import com.example.contactlist.ui.theme.Dimen

@Composable
internal fun ContactListItem(contact: String) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = Dimen.M)
            ) {
                ContactImage()
                ContactName(contact)
            }
            BottomBorder()
        }
    }
}

// region Sub-Composables
@Composable
private fun ContactImage() {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(ContactListScreenDimen.imageSize)
            .clip(CircleShape)
            .background(Color.Cyan),
    ) {
        Image(
            imageVector = Icons.Filled.Person,
            contentDescription = "Person Image",
            modifier = Modifier.size(ContactListScreenDimen.imageIconSize)
        )
    }
}

@Composable
private fun ContactName(contactName: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = Dimen.XS)
    ) {
        Text(
            text = contactName,
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun BottomBorder() {
    Divider(
        modifier = Modifier.fillMaxWidth(),
    )
}
// endregion

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
        ContactListItem("Mitchell")
    }
}
// endregion
