package com.donkeydevelopers.icora

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager

object CustomAppIcon {
    fun setAppIcon(context: Context, aliasClassName: String) {
        val pm = context.packageManager
        val packageName = context.packageName

        val aliases = listOf(
            "$packageName.MainActivityAliasA",
            "$packageName.MainActivityAliasB",
            "$packageName.MainActivityAliasC",
            "$packageName.MainActivityAliasD",
            "$packageName.MainActivityAliasE",
            "$packageName.MainActivityAliasF",
            "$packageName.MainActivityAliasDefault",
        )

        for (alias in aliases) {
            val component = ComponentName(packageName, alias)
            val state = if (alias == "$packageName.$aliasClassName") {
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED
            } else {
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED
            }
            pm.setComponentEnabledSetting(
                component,
                state,
                PackageManager.DONT_KILL_APP
            )
        }
    }
}