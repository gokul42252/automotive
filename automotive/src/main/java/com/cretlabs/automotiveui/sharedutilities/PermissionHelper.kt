package com.cretlabs.automotiveui.sharedutilities


import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment

object PermissionHelper {

    fun hasPermission(context: Context, permission: String): Boolean {
        return ActivityCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED
    }

    fun requestPermission(fragment: Fragment, permission: String, requestCode: Int) {
        fragment.requestPermissions(arrayOf(permission), requestCode)
    }

    fun shouldShowRationale(fragment: Fragment, permission: String): Boolean {
        return fragment.shouldShowRequestPermissionRationale(permission)
    }
}
