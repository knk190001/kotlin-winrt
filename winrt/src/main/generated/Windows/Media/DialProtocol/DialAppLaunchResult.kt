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

@ABIMarker(DialAppLaunchResult.ABI::class)
@Signature("enum(Windows.Media.DialProtocol.DialAppLaunchResult;i4)")
@WinRTByReference(brClass = DialAppLaunchResult.ByReference::class)
public enum class DialAppLaunchResult(
  public val value: Int
) : NativeMapped {
  Launched(0),
  FailedToLaunch(1),
  NotFound(2),
  NetworkFailure(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DialAppLaunchResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Launched
      1 -> FailedToLaunch
      2 -> NotFound
      3 -> NetworkFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DialAppLaunchResult> {
    public fun setValue(newValue: DialAppLaunchResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DialAppLaunchResult =
        DialAppLaunchResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DialAppLaunchResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DialAppLaunchResult =
        DialAppLaunchResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: DialAppLaunchResult): Int = obj.value
  }
}
