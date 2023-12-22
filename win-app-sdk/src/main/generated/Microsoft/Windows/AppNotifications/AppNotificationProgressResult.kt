package Microsoft.Windows.AppNotifications

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

@ABIMarker(AppNotificationProgressResult.ABI::class)
@Signature("enum(Microsoft.Windows.AppNotifications.AppNotificationProgressResult;i4)")
@WinRTByReference(brClass = AppNotificationProgressResult.ByReference::class)
public enum class AppNotificationProgressResult(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  AppNotificationNotFound(1),
  Unsupported(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppNotificationProgressResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> AppNotificationNotFound
      2 -> Unsupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppNotificationProgressResult> {
    public fun setValue(newValue: AppNotificationProgressResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppNotificationProgressResult =
        AppNotificationProgressResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppNotificationProgressResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppNotificationProgressResult =
        AppNotificationProgressResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppNotificationProgressResult): Int = obj.value
  }
}
