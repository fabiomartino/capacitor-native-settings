package nl.raphael.settings

enum class AndroidSettings(private val value: String, private val setting: String) {
    Accessibility("accessibility", android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS),
    Account("account", android.provider.Settings.ACTION_ADD_ACCOUNT),
    AirplaneMode("airplane_mode", android.provider.Settings.ACTION_AIRPLANE_MODE_SETTINGS),
    Apn("apn", android.provider.Settings.ACTION_APN_SETTINGS),
    ApplicationDetails(
        "application_details",
        android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS
    ),
    ApplicationDevelopment(
        "application_development",
        android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS
    ),
    Application("application", android.provider.Settings.ACTION_APPLICATION_SETTINGS),
    AppNotification("app_notification", android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS),
    BatteryOptimization(
        "battery_optimization",
        android.provider.Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS
    ),
    Bluetooth("bluetooth", android.provider.Settings.ACTION_BLUETOOTH_SETTINGS),
    Captioning("captioning", android.provider.Settings.ACTION_CAPTIONING_SETTINGS),
    Cast("cast", android.provider.Settings.ACTION_CAST_SETTINGS),
    DataRoaming("data_roaming", android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS),
    Date("date", android.provider.Settings.ACTION_DATE_SETTINGS),
    Display("display", android.provider.Settings.ACTION_DISPLAY_SETTINGS),
    Dream("dream", android.provider.Settings.ACTION_DREAM_SETTINGS),
    Home("home", android.provider.Settings.ACTION_HOME_SETTINGS),
    Keyboard("keyboard", android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS),
    KeyboardSubType(
        "keyboard_subtype",
        android.provider.Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS
    ),
    Locale("locale", android.provider.Settings.ACTION_LOCALE_SETTINGS),
    Location("location", android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS),
    ManageApplications(
        "manage_applications",
        android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS
    ),
    ManageAllApplications(
        "manage_all_applications",
        android.provider.Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS
    ),
    MemoryCard("memory_card", android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS),
    Network("network", android.provider.Settings.ACTION_NETWORK_OPERATOR_SETTINGS),
    NfcSharing("nfcsharing", android.provider.Settings.ACTION_NFCSHARING_SETTINGS),
    NfcPayment("nfc_payment", android.provider.Settings.ACTION_NFC_PAYMENT_SETTINGS),
    NfcSettings("nfc_settings", android.provider.Settings.ACTION_NFC_SETTINGS),
    Print("print", android.provider.Settings.ACTION_PRINT_SETTINGS),
    Privacy("privacy", android.provider.Settings.ACTION_PRIVACY_SETTINGS),
    QuickLaunch("quick_launch", android.provider.Settings.ACTION_QUICK_LAUNCH_SETTINGS),
    Search("search", android.provider.Settings.ACTION_SEARCH_SETTINGS),
    Security("security", android.provider.Settings.ACTION_SECURITY_SETTINGS),
    Settings("settings", android.provider.Settings.ACTION_SETTINGS),
    ShowRegulatoryInfo(
        "show_regulatory_info",
        android.provider.Settings.ACTION_SHOW_REGULATORY_INFO
    ),
    Sound("sound", android.provider.Settings.ACTION_SOUND_SETTINGS),
    Storage("storage", android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS),
    Sync("sync", android.provider.Settings.ACTION_SYNC_SETTINGS),
    Usage("usage", android.provider.Settings.ACTION_USAGE_ACCESS_SETTINGS),
    UserDictionary("user_dictionary", android.provider.Settings.ACTION_USER_DICTIONARY_SETTINGS),
    VoiceInput("voice_input", android.provider.Settings.ACTION_VOICE_INPUT_SETTINGS),
    Wifi("wifi", android.provider.Settings.ACTION_WIFI_SETTINGS),
    WifiIp("wifi_ip", android.provider.Settings.ACTION_WIFI_IP_SETTINGS),
    Wireless("wireless", android.provider.Settings.ACTION_WIRELESS_SETTINGS);

    companion object {
        fun getAction(value: String): String? {
            for (setting in entries) {
                if (setting.value == value) {
                    return setting.setting
                }
            }
            return null
        }
    }
}
