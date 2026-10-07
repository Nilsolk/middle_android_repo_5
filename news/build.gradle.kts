plugins {
    id("myproject.android.feature")
    alias(libs.plugins.kotlin.kapt)
}
android {

    namespace = "com.yandex.practicum.middle_homework_5.news"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(libs.androidx.paging.compose)
    implementation(libs.goodle.gson)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.paging)
    kapt(libs.room.kapt)
    implementation(libs.squareup.retrofit2)
    implementation(libs.androidx.work.manager.ktx)

    implementation(project(":settings"))
}