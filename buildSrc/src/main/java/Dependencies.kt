object Version {
    const val core = "1.9.0"
    const val runTime = "2.6.2"
    const val compose = "1.8.1"
    const val jUnit = "4.13.2"
    const val jUnitAndroid = "1.1.5"
}

object DaggerHilt {

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