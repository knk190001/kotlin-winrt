package Windows.System

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

@ABIMarker(LaunchQuerySupportStatus.ABI::class)
@Signature("enum(Windows.System.LaunchQuerySupportStatus;i4)")
@WinRTByReference(brClass = LaunchQuerySupportStatus.ByReference::class)
public enum class LaunchQuerySupportStatus(
  public val value: Int
) : NativeMapped {
  Available(0),
  AppNotInstalled(1),
  AppUnavailable(2),
  NotSupported(3),
  Unknown(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LaunchQuerySupportStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Available
      1 -> AppNotInstalled
      2 -> AppUnavailable
      3 -> NotSupported
      4 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LaunchQuerySupportStatus>
      {
    public fun setValue(newValue: LaunchQuerySupportStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LaunchQuerySupportStatus =
        LaunchQuerySupportStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LaunchQuerySupportStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LaunchQuerySupportStatus =
        LaunchQuerySupportStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: LaunchQuerySupportStatus): Int = obj.value
  }
}
