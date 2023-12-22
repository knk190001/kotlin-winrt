package Windows.Media.DialProtocol

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

@ABIMarker(DialAppStopResult.ABI::class)
@Signature("enum(Windows.Media.DialProtocol.DialAppStopResult;i4)")
@WinRTByReference(brClass = DialAppStopResult.ByReference::class)
public enum class DialAppStopResult(
  public val value: Int
) : NativeMapped {
  Stopped(0),
  StopFailed(1),
  OperationNotSupported(2),
  NetworkFailure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DialAppStopResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Stopped
      1 -> StopFailed
      2 -> OperationNotSupported
      3 -> NetworkFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DialAppStopResult> {
    public fun setValue(newValue: DialAppStopResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DialAppStopResult =
        DialAppStopResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DialAppStopResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DialAppStopResult =
        DialAppStopResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: DialAppStopResult): Int = obj.value
  }
}
