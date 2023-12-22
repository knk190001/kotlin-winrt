package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ActivationSignalDetectorPowerState.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectorPowerState;i4)")
@WinRTByReference(brClass = ActivationSignalDetectorPowerState.ByReference::class)
public enum class ActivationSignalDetectorPowerState(
  public val value: Int
) : NativeMapped {
  HighPower(0),
  ConnectedLowPower(1),
  DisconnectedLowPower(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivationSignalDetectorPowerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HighPower
      1 -> ConnectedLowPower
      2 -> DisconnectedLowPower
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ActivationSignalDetectorPowerState> {
    public fun setValue(newValue: ActivationSignalDetectorPowerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivationSignalDetectorPowerState =
        ActivationSignalDetectorPowerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ActivationSignalDetectorPowerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ActivationSignalDetectorPowerState =
        ActivationSignalDetectorPowerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivationSignalDetectorPowerState): Int = obj.value
  }
}
