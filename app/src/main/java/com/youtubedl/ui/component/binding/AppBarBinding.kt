package com.youtubedl.ui.component.binding

import android.databinding.BindingAdapter
import android.support.design.widget.AppBarLayout

/**
 * Created by cuongpm on 12/23/18.
 */

object AppBarBinding {

    @BindingAdapter("app:smoothExpanded")
    @JvmStatic
    fun setExpanded(appBarLayout: AppBarLayout, isExpanded: Boolean) {
        appBarLayout.setExpanded(isExpanded, true)
    }
}