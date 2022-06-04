package mobiler.abbosbek.telegrammui

import androidx.compose.ui.graphics.painter.Painter

data class ImageWithText(
    val name : String,
    val image : Painter,
    val title : String
)