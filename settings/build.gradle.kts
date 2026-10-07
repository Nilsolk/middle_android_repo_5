plugins {
    id("myproject.android.feature")
}

android {
    namespace = "com.yandex.practicum.middle_homework_5.settings"

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
    implementation(libs.androidx.data.store)
}