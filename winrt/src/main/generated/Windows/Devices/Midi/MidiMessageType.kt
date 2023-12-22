package Windows.Devices.Midi

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

@ABIMarker(MidiMessageType.ABI::class)
@Signature("enum(Windows.Devices.Midi.MidiMessageType;i4)")
@WinRTByReference(brClass = MidiMessageType.ByReference::class)
public enum class MidiMessageType(
  public val value: Int
) : NativeMapped {
  None(0),
  NoteOff(128),
  NoteOn(144),
  PolyphonicKeyPressure(160),
  ControlChange(176),
  ProgramChange(192),
  ChannelPressure(208),
  PitchBendChange(224),
  SystemExclusive(240),
  MidiTimeCode(241),
  SongPositionPointer(242),
  SongSelect(243),
  TuneRequest(246),
  EndSystemExclusive(247),
  TimingClock(248),
  Start(250),
  Continue(251),
  Stop(252),
  ActiveSensing(254),
  SystemReset(255),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MidiMessageType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      128 -> NoteOff
      144 -> NoteOn
      160 -> PolyphonicKeyPressure
      176 -> ControlChange
      192 -> ProgramChange
      208 -> ChannelPressure
      224 -> PitchBendChange
      240 -> SystemExclusive
      241 -> MidiTimeCode
      242 -> SongPositionPointer
      243 -> SongSelect
      246 -> TuneRequest
      247 -> EndSystemExclusive
      248 -> TimingClock
      250 -> Start
      251 -> Continue
      252 -> Stop
      254 -> ActiveSensing
      255 -> SystemReset
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MidiMessageType> {
    public fun setValue(newValue: MidiMessageType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MidiMessageType =
        MidiMessageType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MidiMessageType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MidiMessageType =
        MidiMessageType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MidiMessageType): Int = obj.value
  }
}
