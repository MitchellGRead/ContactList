package com.example.contactlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.lifecycle.ViewModelProvider
import com.example.contactlist.ui.contactListScreen.composables.ContactListView
import com.example.contactlist.ui.contactListScreen.view.ContactListViewModel
import com.example.contactlist.ui.contactListScreen.view.ContactListViewModelFactory
import com.example.contactlist.ui.theme.ContactListTheme

class MainActivity : ComponentActivity() {
    lateinit var viewModel: ContactListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModelFactory = ContactListViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory)[ContactListViewModel::class.java]

        setContent {
            ContactListTheme {
                Surface {
                    ContactListView(viewModel)
                }
            }
        }
    }
}
