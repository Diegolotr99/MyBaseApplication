package com.diegogutierrez.mybaseapplication.modules.baseComponents

import android.content.res.Resources
import android.view.View
import androidx.fragment.app.FragmentActivity



interface BaseView {
    /**
     *
     * Returns activity of the view.
     *
     * @return Activity of the view.
     */
    fun getCurrentActivity(): FragmentActivity
    fun getRootView(): View
    fun getSResources(): Resources

}