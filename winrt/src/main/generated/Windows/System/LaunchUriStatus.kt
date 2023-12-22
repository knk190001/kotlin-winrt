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

@ABIMarker(LaunchUriStatus.ABI::class)
@Signature("enum(Windows.System.LaunchUriStatus;i4)")
@WinRTByReference(brClass = LaunchUriStatus.ByReference::class)
public enum class LaunchUriStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  AppUnavailable(1),
  ProtocolUnavailable(2),
  Unknown(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LaunchUriStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> AppUnavailable
      2 -> ProtocolUnavailable
      3 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LaunchUriStatus> {
    public fun setValue(newValue: LaunchUriStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LaunchUriStatus =
        LaunchUriStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LaunchUriStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LaunchUriStatus =
        LaunchUriStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: LaunchUriStatus): Int = obj.value
  }
}
