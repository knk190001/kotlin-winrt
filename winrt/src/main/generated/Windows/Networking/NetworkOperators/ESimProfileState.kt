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

@ABIMarker(ESimProfileState.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.ESimProfileState;i4)")
@WinRTByReference(brClass = ESimProfileState.ByReference::class)
public enum class ESimProfileState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Disabled(1),
  Enabled(2),
  Deleted(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ESimProfileState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Disabled
      2 -> Enabled
      3 -> Deleted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ESimProfileState> {
    public fun setValue(newValue: ESimProfileState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ESimProfileState =
        ESimProfileState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ESimProfileState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ESimProfileState =
        ESimProfileState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ESimProfileState): Int = obj.value
  }
}
