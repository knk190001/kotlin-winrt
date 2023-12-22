package Windows.Foundation.Diagnostics

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

@ABIMarker(CausalityTraceLevel.ABI::class)
@Signature("enum(Windows.Foundation.Diagnostics.CausalityTraceLevel;i4)")
@WinRTByReference(brClass = CausalityTraceLevel.ByReference::class)
public enum class CausalityTraceLevel(
  public val value: Int
) : NativeMapped {
  Required(0),
  Important(1),
  Verbose(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CausalityTraceLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Required
      1 -> Important
      2 -> Verbose
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CausalityTraceLevel> {
    public fun setValue(newValue: CausalityTraceLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CausalityTraceLevel =
        CausalityTraceLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CausalityTraceLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CausalityTraceLevel =
        CausalityTraceLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: CausalityTraceLevel): Int = obj.value
  }
}
