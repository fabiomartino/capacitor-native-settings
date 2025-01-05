package nl.raphael.settings

import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.activity.result.ActivityResult
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.ActivityCallback
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "NativeSettings")
class NativeSettingsPlugin : Plugin() {
    @PluginMethod
    fun open(call: PluginCall) {
        call.getString("optionAndroid")?.let { option ->
            val setting = AndroidSettings.getAction(option)
            if (setting != null) {
                this.openOption(call, setting)
            } else {
                call.reject("Could not find native android setting: $option")
            }
        } ?: call.reject("Option 'optionAndroid' is required")
    }

    @PluginMethod
    fun openAndroid(call: PluginCall) {
        call.getString("option")?.let { option ->
            val setting = AndroidSettings.getAction(option)
            if (setting != null) {
                this.openOption(call, setting)
            } else {
                call.reject("Could not find native android setting: $option")
            }
        } ?: call.reject("Option 'option' is required")
    }

    private fun openOption(call: PluginCall, setting: String) {
        val intent = Intent()

        // Application details requires package name as URI.
        if (Settings.ACTION_APPLICATION_DETAILS_SETTINGS == setting) {
            intent.setAction(setting)
            intent.setData(Uri.parse("package:" + activity.packageName))
        } else if (Settings.ACTION_APP_NOTIFICATION_SETTINGS == setting) { // App notification settings requires package name as extra app package.
            intent.setAction(setting)
            intent.putExtra(Settings.EXTRA_APP_PACKAGE, activity.packageName)
        } else {
            intent.setAction(setting)
        }

        startActivityForResult(call, intent, "activityResult")
    }

    /**
     * Send response on activityResult (when intent closes)
     */
    @ActivityCallback
    private fun activityResult(call: PluginCall, result: ActivityResult) {
        val js = JSObject()
        js.put("status", true)
        call.resolve(js)
    }
}
