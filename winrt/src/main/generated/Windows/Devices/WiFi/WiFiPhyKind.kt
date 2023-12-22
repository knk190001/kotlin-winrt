package Windows.Devices.WiFi

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

@ABIMarker(WiFiPhyKind.ABI::class)
@Signature("enum(Windows.Devices.WiFi.WiFiPhyKind;i4)")
@WinRTByReference(brClass = WiFiPhyKind.ByReference::class)
public enum class WiFiPhyKind(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Fhss(1),
  Dsss(2),
  IRBaseband(3),
  Ofdm(4),
  Hrdsss(5),
  Erp(6),
  HT(7),
  Vht(8),
  Dmg(9),
  HE(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiPhyKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Fhss
      2 -> Dsss
      3 -> IRBaseband
      4 -> Ofdm
      5 -> Hrdsss
      6 -> Erp
      7 -> HT
      8 -> Vht
      9 -> Dmg
      10 -> HE
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiPhyKind> {
    public fun setValue(newValue: WiFiPhyKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiPhyKind =
        WiFiPhyKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiPhyKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiPhyKind =
        WiFiPhyKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiPhyKind): Int = obj.value
  }
}
