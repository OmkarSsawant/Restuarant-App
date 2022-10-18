package com.visiondev.ccthrusdaytrivia4.data.models

import android.location.Location
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes

data class Hotel(val name:String, val address:String, @DrawableRes val imgRes:Int, val description:String/*,val location:Location*/)
