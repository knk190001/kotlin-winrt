package Windows.Devices.Sms

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

@ABIMarker(SmsBroadcastType.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsBroadcastType;i4)")
@WinRTByReference(brClass = SmsBroadcastType.ByReference::class)
public enum class SmsBroadcastType(
  public val value: Int
) : NativeMapped {
  Other(0),
  CmasPresidential(1),
  CmasExtreme(2),
  CmasSevere(3),
  CmasAmber(4),
  CmasTest(5),
  EUAlert1(6),
  EUAlert2(7),
  EUAlert3(8),
  EUAlertAmber(9),
  EUAlertInfo(10),
  EtwsEarthquake(11),
  EtwsTsunami(12),
  EtwsTsunamiAndEarthquake(13),
  LatAlertLocal(14),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsBroadcastType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> CmasPresidential
      2 -> CmasExtreme
      3 -> CmasSevere
      4 -> CmasAmber
      5 -> CmasTest
      6 -> EUAlert1
      7 -> EUAlert2
      8 -> EUAlert3
      9 -> EUAlertAmber
      10 -> EUAlertInfo
      11 -> EtwsEarthquake
      12 -> EtwsTsunami
      13 -> EtwsTsunamiAndEarthquake
      14 -> LatAlertLocal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsBroadcastType> {
    public fun setValue(newValue: SmsBroadcastType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsBroadcastType =
        SmsBroadcastType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsBroadcastType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsBroadcastType =
        SmsBroadcastType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsBroadcastType): Int = obj.value
  }
}
