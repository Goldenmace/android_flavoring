Cold starts
-----

Cold starts happen in cases such as your app’s being launched for the first time since the device booted, or since the system killed the app.This type of start presents the greatest challenge in terms of minimizing startup time, because the system and app have more work to do than in the other launch states.

####themes.xml
```
<style name="AppTheme.ColdStart">
        <item name="android:windowBackground">@drawable/splash_bg</item>
</style>
```

####splash_bg.xml
```
<layer-list
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:opacity="opaque">
<!-- The background color, preferably the same as your normal theme -->
    <item android:drawable="@android:color/white"/>
<!-- Your product logo - 144dp color version of your app icon -->
    <item>
        <bitmap
            android:gravity="center"
            android:src="@drawable/new_logo"/>
    </item>
</layer-list>
```

Flavors
-----
**`Why flavors is important:`**
As an app developer, you would like to release a given app using a new brand name, logo and/or theme, along with some minor feature differences. Using this to maintain app very quickly.

Using multi flavors developer can easy way to build and maintain different version of app.

If you have create two flavors, called free and promo, and two build types called debug and release, the Build Variants will be:
* `freeDebug`
* `freeRelease`
* `promoDebug`
* `promoRelease`
* `paidDebug`
* `paidRelease`

####Working with flavors:
```
productFlavors {
        free {}
        paid {}
        promo {}
    }
```

####variants.gradle with the different properties of each flavor:
```
ext {

    free = [
            applicationId   : "com.gmits.free",
            versionCode     : 1,
            versionName     : "1.0",
            app_name        : "Flavour Free",
            buildConfigField: '"Hi"'
    ]

    paid = [
            applicationId   : "com.gmits.paid",
            versionCode     : 1,
            versionName     : "1.0",
            app_name        : "Flavour Paid",
            buildConfigField: '"Hello"'
    ]

    promo = [
            applicationId   : "com.gmits.promo",
            versionCode     : 1,
            versionName     : "1.0",
            app_name        : "Flavour Promo",
            buildConfigField: '"Demo"'
    ]
}    
```

####build.gradle
```
productFlavors.whenObjectAdded {
        flavor ->
            def flavorData = rootProject.ext[flavor.name]
            flavor.applicationId = flavorData.applicationId
            flavor.versionCode = flavorData.versionCode
            flavor.versionName = flavorData.versionName
            flavor.resValue 'string', "app_name", flavorData.app_name
            flavor.buildConfigField("String", "DEFAULT_BASE_DOMAIN", flavorData.buildConfigField)
    }
```
Screenshots
-----------

![screenshot][1] ![screenshot][2] ![screenshot][3]

License
-------

    Copyright (C) 2017 Goldenmace IT Solutions
     
     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at
     
         http://www.apache.org/licenses/LICENSE-2.0
    
     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.

[1]: ./art/Free.gif
[2]: ./art/Paid.gif
[3]: ./art/Promo.gif
