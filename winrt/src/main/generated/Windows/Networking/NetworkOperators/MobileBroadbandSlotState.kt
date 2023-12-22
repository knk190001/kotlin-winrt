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

@ABIMarker(MobileBroadbandSlotState.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.MobileBroadbandSlotState;i4)")
@WinRTByReference(brClass = MobileBroadbandSlotState.ByReference::class)
public enum class MobileBroadbandSlotState(
  public val value: Int
) : NativeMapped {
  Unmanaged(0),
  Unknown(1),
  OffEmpty(2),
  Off(3),
  Empty(4),
  NotReady(5),
  Active(6),
  Error(7),
  ActiveEsim(8),
  ActiveEsimNoProfile(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MobileBroadbandSlotState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unmanaged
      1 -> Unknown
      2 -> OffEmpty
      3 -> Off
      4 -> Empty
      5 -> NotReady
      6 -> Active
      7 -> Error
      8 -> ActiveEsim
      9 -> ActiveEsimNoProfile
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MobileBroadbandSlotState>
      {
    public fun setValue(newValue: MobileBroadbandSlotState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MobileBroadbandSlotState =
        MobileBroadbandSlotState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MobileBroadbandSlotState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MobileBroadbandSlotState =
        MobileBroadbandSlotState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MobileBroadbandSlotState): Int = obj.value
  }
}
