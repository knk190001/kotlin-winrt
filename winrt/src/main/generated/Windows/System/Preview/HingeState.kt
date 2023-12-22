package Windows.System.Preview

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

@ABIMarker(HingeState.ABI::class)
@Signature("enum(Windows.System.Preview.HingeState;i4)")
@WinRTByReference(brClass = HingeState.ByReference::class)
public enum class HingeState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Closed(1),
  Concave(2),
  Flat(3),
  Convex(4),
  Full(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HingeState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Closed
      2 -> Concave
      3 -> Flat
      4 -> Convex
      5 -> Full
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HingeState> {
    public fun setValue(newValue: HingeState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HingeState =
        HingeState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HingeState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HingeState =
        HingeState.values()[0].fromNative(value, null)

    public override fun toNative(obj: HingeState): Int = obj.value
  }
}
