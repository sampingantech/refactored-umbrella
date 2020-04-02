object GradlePlugins {
    const val ANDROID = "com.android.tools.build:gradle:4.0.0-beta03"

    interface GradlePlugin {
        val ID: String
        val VERSION: String
        val APPLY: Boolean
            get() = true
    }

    object Kotlin : GradlePlugin {
        override val ID = "gradle-plugin"
        override val VERSION = "1.3.71"
    }

    private object Detekt : GradlePlugin {
        override val ID: String = "io.gitlab.arturbosch.detekt"
        override val VERSION: String = "1.6.0"
    }

    private object Spotless : GradlePlugin {
        override val ID: String = "com.diffplug.gradle.spotless"
        override val VERSION: String = "3.28.0"
        override val APPLY: Boolean = false
    }

    private object DependencyAnalysis : GradlePlugin {
        override val ID: String = "com.autonomousapps.dependency-analysis"
        override val VERSION: String = "0.32.0"
    }

    val plugins = listOf(Detekt, Spotless, DependencyAnalysis)
}
