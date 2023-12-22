package Windows.ApplicationModel.ExtendedExecution.Foreground

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

@ABIMarker(ExtendedExecutionForegroundResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundResult;i4)")
@WinRTByReference(brClass = ExtendedExecutionForegroundResult.ByReference::class)
public enum class ExtendedExecutionForegroundResult(
  public val value: Int
) : NativeMapped {
  Allowed(0),
  Denied(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExtendedExecutionForegroundResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allowed
      1 -> Denied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ExtendedExecutionForegroundResult> {
    public fun setValue(newValue: ExtendedExecutionForegroundResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExtendedExecutionForegroundResult =
        ExtendedExecutionForegroundResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExtendedExecutionForegroundResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExtendedExecutionForegroundResult =
        ExtendedExecutionForegroundResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExtendedExecutionForegroundResult): Int = obj.value
  }
}
