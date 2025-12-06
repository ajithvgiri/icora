<div align="center">

<img src="assets/icora_icon.png" alt="Icora App Icon" width="110"/>

# **Icora — Dynamic App Icon Demo**

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)]()
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white)]()
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?logo=jetpackcompose&logoColor=white)]()

A demo Android app showcasing **dynamic launcher icon switching** using `activity-alias` and `PackageManager`.  
Tap any button to instantly change the app's icon. Built fully with **Jetpack Compose**.

</div>

---

## 🎥 **Demo (Screen Recording)**

![Icora](assets/screen_recording.gif)

---

## 🚀 **Overview**

Android does not allow replacing launcher icons using downloaded images,  
but it *does* allow switching between **predefined icons** using `activity-alias`.

**Icora demonstrates:**
- Multiple prepackaged launcher icons  
- Enabling one alias while disabling others  
- Instant icon switching from Compose UI  
- Clean, minimal implementation  

Perfect for apps offering:
- Theming / personalization  
- Seasonal icons  
- Branding variations  
- User-selectable icon styles  

---

## 🧱 **How It Works**

1. Each launcher icon is defined as an `<activity-alias>` with its own icon.  
2. Only **one alias** is enabled at a time (others disabled).  
3. On button click, Icora calls `PackageManager.setComponentEnabledSetting()` to switch icons without restarting the app.

---

## 📁 **Manifest Setup Example**

```xml
<activity
    android:name=".MainActivity"
    android:exported="true" />

<activity-alias
    android:name=".MainActivityAliasA"
    android:enabled="true"
    android:exported="true"
    android:icon="@mipmap/ic_launcher_a"
    android:targetActivity=".MainActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity-alias>

<activity-alias
    android:name=".MainActivityAliasB"
    android:enabled="false"
    android:exported="true"
    android:icon="@mipmap/ic_launcher_b"
    android:targetActivity=".MainActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity-alias>
```
---
## 🔄 **Important Notes**
- Launcher updates may take 1–5 seconds.
- Uninstall the app after manifest changes to reset launcher cache.
- If multiple icons appear:
- Only one alias should be enabled in the manifest.
- MainActivity must NOT contain the LAUNCHER intent-filter.
- Works across Pixel Launcher, Samsung One UI, Xiaomi MIUI, Oppo, Vivo, etc.

---
## 🤝 **Contributing**
Contributions, suggestions, and new icon sets are welcome!
Feel free to open issues or PRs.

---
## 📜 **License**
Released under the MIT License — free to modify and use.

---

<div align="center">
Made with ❤️ for Android developers exploring dynamic launcher icons.
</div>

