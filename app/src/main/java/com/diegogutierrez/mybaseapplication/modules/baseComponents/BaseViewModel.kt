package com.diegogutierrez.mybaseapplication.modules.baseComponents

import androidx.lifecycle.ViewModel


abstract class BaseViewModel<BView : BaseView> : ViewModel() {
    private var view: BView? = null

    fun setView(view:BaseView){
        this.view=view as BView
    }
    fun getView(): BView? {
        return this.view
    }
    abstract fun onStart()
    abstract fun onStop()
}
