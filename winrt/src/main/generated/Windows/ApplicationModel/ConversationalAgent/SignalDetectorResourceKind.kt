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

@ABIMarker(SignalDetectorResourceKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.SignalDetectorResourceKind;i4)")
@WinRTByReference(brClass = SignalDetectorResourceKind.ByReference::class)
public enum class SignalDetectorResourceKind(
  public val value: Int
) : NativeMapped {
  ParallelModelSupport(0),
  ParallelModelSupportForAgent(1),
  ParallelSignalSupport(2),
  ParallelSignalSupportForAgent(3),
  DisplayOffSupport(4),
  PluggedInPower(5),
  Detector(6),
  SupportedSleepState(7),
  SupportedBatterySaverState(8),
  ScreenAvailability(9),
  InputHardware(10),
  AcousticEchoCancellation(11),
  ModelIdSupport(12),
  DataChannel(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SignalDetectorResourceKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ParallelModelSupport
      1 -> ParallelModelSupportForAgent
      2 -> ParallelSignalSupport
      3 -> ParallelSignalSupportForAgent
      4 -> DisplayOffSupport
      5 -> PluggedInPower
      6 -> Detector
      7 -> SupportedSleepState
      8 -> SupportedBatterySaverState
      9 -> ScreenAvailability
      10 -> InputHardware
      11 -> AcousticEchoCancellation
      12 -> ModelIdSupport
      13 -> DataChannel
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SignalDetectorResourceKind> {
    public fun setValue(newValue: SignalDetectorResourceKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SignalDetectorResourceKind =
        SignalDetectorResourceKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SignalDetectorResourceKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SignalDetectorResourceKind =
        SignalDetectorResourceKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: SignalDetectorResourceKind): Int = obj.value
  }
}
