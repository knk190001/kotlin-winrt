package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimState.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.ESimState;i4)")
@WinRTByReference(brClass = ESimState.ByReference::class)
public enum class ESimState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Idle(1),
  Removed(2),
  Busy(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): ESimState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Idle
      2 -> Removed
      3 -> Busy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ESimState> {
    public fun setValue(newValue: ESimState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ESimState =
        ESimState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ESimState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ESimState =
        ESimState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ESimState): Int = obj.value
  }
}
