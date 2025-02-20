package me.mudkip.moememos.ui.page.memos

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import me.mudkip.moememos.R
import me.mudkip.moememos.ext.string

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TagMemoPage(
    drawerState: DrawerState,
    tag: String
) {
    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(tag) },
                navigationIcon = {
                    IconButton(onClick = { scope.launch { drawerState.open() } }) {
                        Icon(Icons.Filled.Menu, contentDescription = R.string.menu.string)
                    }
                },
//                actions = {
//                    IconButton(onClick = {
//
//                    }) {
//                        Icon(Icons.Filled.Search, contentDescription = "Search")
//                    }
//                }
            )
        },

        content = { innerPadding ->
            MemosList(
                contentPadding = innerPadding,
                tag = tag
            )
        }
    )
}