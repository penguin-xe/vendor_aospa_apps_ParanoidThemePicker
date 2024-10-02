package co.aospa.android.customization.picker

import android.app.Application;
import com.android.wallpaper.module.InjectorProvider;
import co.aospa.android.customization.module.ParanoidThemePickerInjector;
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp(Application::class)
class ParanoidCustomizationPickerApplication : Hilt_ParanoidCustomizationPickerApplication() {

  @Inject
  lateinit var injector: ParanoidThemePickerInjector

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(injector);
    }

}
