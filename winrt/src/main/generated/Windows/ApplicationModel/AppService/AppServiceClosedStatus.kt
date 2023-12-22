package Windows.ApplicationModel.AppService

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

@ABIMarker(AppServiceClosedStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.AppService.AppServiceClosedStatus;i4)")
@WinRTByReference(brClass = AppServiceClosedStatus.ByReference::class)
public enum class AppServiceClosedStatus(
  public val value: Int
) : NativeMapped {
  Completed(0),
  Canceled(1),
  ResourceLimitsExceeded(2),
  Unknown(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppServiceClosedStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Completed
      1 -> Canceled
      2 -> ResourceLimitsExceeded
      3 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppServiceClosedStatus> {
    public fun setValue(newValue: AppServiceClosedStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppServiceClosedStatus =
        AppServiceClosedStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppServiceClosedStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppServiceClosedStatus =
        AppServiceClosedStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppServiceClosedStatus): Int = obj.value
  }
}
