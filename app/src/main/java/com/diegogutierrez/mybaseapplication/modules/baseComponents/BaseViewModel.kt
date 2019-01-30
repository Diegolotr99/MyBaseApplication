package com.diegogutierrez.mybaseapplication.modules.baseComponents

import androidx.lifecycle.ViewModel


abstract class BaseViewModel<BView : BaseView> : ViewModel() {
        private lateinit var view: BaseView

        fun setView(view:BaseView){
            this.view=view
        }
        fun getView():BaseView?{
            return this.view
        }

    abstract fun onStart()
    abstract fun onStop()
}
