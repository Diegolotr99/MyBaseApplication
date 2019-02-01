package com.diegogutierrez.mybaseapplication.modules.main


import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.diegogutierrez.mybaseapplication.R
import com.diegogutierrez.mybaseapplication.modules.baseComponents.BaseActivity
import com.diegogutierrez.mybaseapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity: BaseActivity<MainViewModel, ActivityMainBinding>(), MainView, View.OnClickListener {



    override val viewModel: MainViewModel
        get() = ViewModelProviders.of(this).get(MainViewModel::class.java)


    override fun initializeDataBinding() {
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(p0: View?) {
        val snackBar = Snackbar.make(getRootView(), "Success", Snackbar.LENGTH_LONG)
        snackBar.show()
    }
}
