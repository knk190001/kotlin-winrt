package Windows.ApplicationModel.Core

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

@ABIMarker(AppRestartFailureReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.Core.AppRestartFailureReason;i4)")
@WinRTByReference(brClass = AppRestartFailureReason.ByReference::class)
public enum class AppRestartFailureReason(
  public val value: Int
) : NativeMapped {
  RestartPending(0),
  NotInForeground(1),
  InvalidUser(2),
  Other(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppRestartFailureReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RestartPending
      1 -> NotInForeground
      2 -> InvalidUser
      3 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppRestartFailureReason> {
    public fun setValue(newValue: AppRestartFailureReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppRestartFailureReason =
        AppRestartFailureReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppRestartFailureReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppRestartFailureReason =
        AppRestartFailureReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppRestartFailureReason): Int = obj.value
  }
}
