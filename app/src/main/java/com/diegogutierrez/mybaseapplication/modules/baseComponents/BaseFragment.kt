package com.diegogutierrez.mybaseapplication.modules.baseComponents

import android.content.Context
import android.content.res.Resources
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity


abstract class BaseFragment<BViewModel : BaseViewModel<*>, BBinding : ViewDataBinding> : Fragment(), BaseView {
    protected var dataBinding: BBinding? = null

    abstract val viewModel: BViewModel


    override fun onAttach(context: Context) {
        super.onAttach(context)
        val baseView:BaseView=this
        viewModel.setView(baseView)
    }

    override fun onStart() {
        super.onStart()
        viewModel.onStart()
    }

    override fun onStop() {
        super.onStop()
        viewModel.onStop()
    }

    override fun getCurrentActivity(): FragmentActivity {
        return this.activity!!
    }

    override fun getRootView(): View {
        return dataBinding!!.root
    }

    override fun getSResources(): Resources {
        return resources
    }
}
