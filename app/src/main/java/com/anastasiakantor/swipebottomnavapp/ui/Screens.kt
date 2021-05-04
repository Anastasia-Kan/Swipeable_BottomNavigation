package com.anastasiakantor.swipebottomnavapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.anastasiakantor.swipebottomnavapp.R
import com.anastasiakantor.swipebottomnavapp.ui.dashboard.DashboardFragment
import com.anastasiakantor.swipebottomnavapp.ui.home.HomeFragment
import com.anastasiakantor.swipebottomnavapp.ui.notifications.NotificationsFragment

enum class MainScreen(@IdRes val menuItemId: Int,
                      @DrawableRes val menuItemIconId: Int,
                      @StringRes val titleStringId: Int,
                      val fragment: Fragment
) {
    HOME(R.id.navigation_home, R.drawable.ic_home, R.string.title_home, HomeFragment()),
    DASHBOARD(R.id.navigation_dashboard, R.drawable.ic_dashboard, R.string.title_dashboard, DashboardFragment()),
    NOTIFICATIONS(R.id.navigation_notifications, R.drawable.ic_notifications, R.string.title_notifications, NotificationsFragment())
}

fun getMainScreenForMenuItem(menuItemId: Int): MainScreen? {
    for (mainScreen in MainScreen.values()) {
        if (mainScreen.menuItemId == menuItemId) {
            return mainScreen
        }
    }
    return null
}