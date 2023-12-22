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

@ABIMarker(TetheringOperationalState.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.TetheringOperationalState;i4)")
@WinRTByReference(brClass = TetheringOperationalState.ByReference::class)
public enum class TetheringOperationalState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  On(1),
  Off(2),
  InTransition(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TetheringOperationalState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> On
      2 -> Off
      3 -> InTransition
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TetheringOperationalState>
      {
    public fun setValue(newValue: TetheringOperationalState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TetheringOperationalState =
        TetheringOperationalState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TetheringOperationalState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TetheringOperationalState =
        TetheringOperationalState.values()[0].fromNative(value, null)

    public override fun toNative(obj: TetheringOperationalState): Int = obj.value
  }
}
