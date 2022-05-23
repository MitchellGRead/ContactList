package com.example.contactlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.example.contactlist.ui.contactListScreen.composables.ContactListScreen
import com.example.contactlist.ui.theme.ContactListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactListTheme {
                Surface {
                    ContactListScreen()
                }
            }
        }
    }
}
