object Version {
    const val core = "1.9.0"
    const val runTime = "2.6.2"
    const val compose = "1.8.1"
    const val jUnit = "4.13.2"
    const val jUnitAndroid = "1.1.5"
    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalerConvertor = "2.1.0"
    const val dagger = "2.44"
    const val hiltCompiler = "1.0.0"
    const val hiltComposeNavigation = "1.0.0"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Version.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val scalersConvertors = "com.squareup.retrofit2:converter-scalars:${Version.scalerConvertor}"
}

object DaggerHilt {
    const val hilt = "com.google.dagger:hilt-android:${Version.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Version.dagger}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Version.dagger}"
    const val hiltComposeNavigation =
        "androidx.hilt:hilt-navigation-compose:${Version.hiltComposeNavigation}"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.runTime}"
    const val compose = "androidx.activity:activity-compose:${Version.compose}"
    const val ui = "androidx.compose.ui:ui"
    const val graphics = "androidx.compose.ui:ui-graphics"
    const val preview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"
    const val junit = "junit:junit:${Version.jUnit}"
    const val jUnitAndroid = "androidx.test.ext:junit:${Version.jUnitAndroid}"
    const val jUnit4 = "androidx.compose.ui:ui-test-junit4"
    const val tooling = "androidx.compose.ui:ui-tooling"
    const val manifest = "androidx.compose.ui:ui-test-manifest"
}