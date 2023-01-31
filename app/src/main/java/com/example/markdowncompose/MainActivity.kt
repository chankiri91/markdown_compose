package com.example.markdowncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.markdowncompose.ui.theme.MarkdownComposeTheme
import com.halilibo.richtext.markdown.Markdown
import com.halilibo.richtext.ui.RichText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarkdownComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MinimalExampleContent()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//Minimal example
@Composable
fun MinimalExampleContent() {
    RichText() {
        Markdown(
            """
            # Demo
        
            Emphasis, aka italics, with *asterisks* or _underscores_. Strong emphasis, aka bold, with **asterisks** or __underscores__. Combined emphasis with **asterisks and _underscores_**. [Links with two blocks, text in square-brackets, destination is in parentheses.](https://www.example.com). Inline `code` has `back-ticks around` it.
        
            1. First ordered list item
            2. Another item
                * Unordered sub-list.
            3. And another item.
                You can have properly indented paragraphs within list items. Notice the blank line above, and the leading spaces (at least one, but we'll use three here to also align the raw Markdown).
        
            * Unordered list can use asterisks
            - Or minuses
            + Or pluses
            ---
        
            ```javascript
            var s = "code blocks use monospace font";
            alert(s);
            ```
        
            Markdown | Table | Extension
            --- | --- | ---
            *renders* | `beautiful images` | ![random image](https://picsum.photos/seed/picsum/400/400 "Text 1")
            1 | 2 | 3
        
            > Blockquotes are very handy in email to emulate reply text.
            > This line is part of the same quote.
            """.trimIndent()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarkdownComposeTheme {
        Greeting("Android")
    }
}