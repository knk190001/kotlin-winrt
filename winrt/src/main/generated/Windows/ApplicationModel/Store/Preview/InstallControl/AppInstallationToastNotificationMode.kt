package Windows.ApplicationModel.Store.Preview.InstallControl

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(AppInstallationToastNotificationMode.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallationToastNotificationMode;i4)")
@WinRTByReference(brClass = AppInstallationToastNotificationMode.ByReference::class)
public enum class AppInstallationToastNotificationMode(
  public val value: Int
) : NativeMapped {
  Default(0),
  Toast(1),
  ToastWithoutPopup(2),
  NoToast(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppInstallationToastNotificationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Toast
      2 -> ToastWithoutPopup
      3 -> NoToast
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppInstallationToastNotificationMode> {
    public fun setValue(newValue: AppInstallationToastNotificationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppInstallationToastNotificationMode =
        AppInstallationToastNotificationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppInstallationToastNotificationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppInstallationToastNotificationMode =
        AppInstallationToastNotificationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppInstallationToastNotificationMode): Int = obj.value
  }
}
