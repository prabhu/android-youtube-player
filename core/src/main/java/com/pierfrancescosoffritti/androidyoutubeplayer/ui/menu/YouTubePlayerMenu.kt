package com.pierfrancescosoffritti.androidyoutubeplayer.ui.menu

import android.view.View

interface YouTubePlayerMenu {
    val itemCount: Int
    fun show(anchorView: View)
    fun dismiss()

    fun addItem(menuItem: MenuItem): YouTubePlayerMenu
    fun removeItem(itemIndex: Int): YouTubePlayerMenu
}
