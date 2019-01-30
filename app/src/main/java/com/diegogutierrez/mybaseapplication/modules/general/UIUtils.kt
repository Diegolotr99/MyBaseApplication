package com.diegogutierrez.mybaseapplication.modules.general

import android.content.Context
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.diegogutierrez.mybaseapplication.R
import com.google.android.material.snackbar.Snackbar

class UIUtils
{
    fun showErrorSnackbar(context: Context, view: View, message: String) {
        val sb = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE)
        sb.setAction("Ok") { v1 -> sb.dismiss() }
        sb.setActionTextColor(ResourcesCompat.getColor(context.resources, R.color.white, null))
        sb.view.setBackgroundResource(R.color.red)
        setSnackBarBaseParam(context, sb)
        sb.show()
    }

    fun showSuccessSnackbar(context: Context, view: View, message: String) {
        val sb = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
        sb.setAction("Ok") { v1 -> sb.dismiss() }
        sb.setActionTextColor(ResourcesCompat.getColor(context.resources, R.color.white, null))
        sb.view.setBackgroundResource(R.color.green)
        setSnackBarBaseParam(context, sb)
        sb.show()
    }

    fun showInfoSnackbar(context: Context, view: View, message: String) {
        val sb = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE)
        sb.setAction("Ok") { v1 -> sb.dismiss() }
        sb.setActionTextColor(ResourcesCompat.getColor(context.resources, R.color.white, null))
        sb.view.setBackgroundResource(R.color.blue)
        setSnackBarBaseParam(context, sb)
        sb.show()
    }

    fun showLoadingSnackbar(context: Context, view: View, message: String): Snackbar {
        val bar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE)
        val contentLay = bar.view.findViewById<View>(com.google.android.material.R.id.snackbar_text).parent as ViewGroup
        contentLay.addView(ProgressBar(context))
        setSnackBarBaseParam(context, bar)
        bar.view.setBackgroundResource(R.color.darkBlue)
        bar.show()
        return bar
    }

    private fun setSnackBarBaseParam(context: Context, sb: Snackbar) {
        //sb.getView().setMinimumHeight((int) context.getResources().getDimension(R.dimen.mainFooterHeight));
        val tv = sb.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        tv.gravity = Gravity.CENTER_VERTICAL
        //tv.setMinimumHeight((int) c.getResources().getDimension(R.dimen.mainFooterHeight));
        tv.setSingleLine(false)
        tv.maxLines = 5
    }

}