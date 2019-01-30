package com.diegogutierrez.mybaseapplication.modules.baseComponents


import android.content.Context
import android.content.res.Resources
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import io.github.inflationx.viewpump.ViewPumpContextWrapper

abstract class BaseActivity<BViewModel : BaseViewModel<*>, BBinding : ViewDataBinding> : AppCompatActivity(), BaseView {
    protected var dataBinding: BBinding? = null

    abstract val viewModel: BViewModel

    abstract fun initializeDataBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // initialize Data-binding must be called before getViewModel() because to generate the viewModel needs the UI data-binding
        initializeDataBinding()
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

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    override fun getCurrentActivity(): FragmentActivity {
        return this
    }

    override fun getRootView(): View {
        return dataBinding!!.root
    }

    override fun getSResources(): Resources {
        return resources
    }
}


