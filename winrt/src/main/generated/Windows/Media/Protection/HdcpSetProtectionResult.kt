package Windows.Media.Protection

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

@ABIMarker(HdcpSetProtectionResult.ABI::class)
@Signature("enum(Windows.Media.Protection.HdcpSetProtectionResult;i4)")
@WinRTByReference(brClass = HdcpSetProtectionResult.ByReference::class)
public enum class HdcpSetProtectionResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  TimedOut(1),
  NotSupported(2),
  UnknownFailure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HdcpSetProtectionResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> TimedOut
      2 -> NotSupported
      3 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HdcpSetProtectionResult> {
    public fun setValue(newValue: HdcpSetProtectionResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HdcpSetProtectionResult =
        HdcpSetProtectionResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HdcpSetProtectionResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HdcpSetProtectionResult =
        HdcpSetProtectionResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: HdcpSetProtectionResult): Int = obj.value
  }
}
