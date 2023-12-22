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

@ABIMarker(SmsEncoding.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsEncoding;i4)")
@WinRTByReference(brClass = SmsEncoding.ByReference::class)
public enum class SmsEncoding(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Optimal(1),
  SevenBitAscii(2),
  Unicode(3),
  GsmSevenBit(4),
  EightBit(5),
  Latin(6),
  Korean(7),
  IA5(8),
  ShiftJis(9),
  LatinHebrew(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsEncoding {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Optimal
      2 -> SevenBitAscii
      3 -> Unicode
      4 -> GsmSevenBit
      5 -> EightBit
      6 -> Latin
      7 -> Korean
      8 -> IA5
      9 -> ShiftJis
      10 -> LatinHebrew
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsEncoding> {
    public fun setValue(newValue: SmsEncoding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsEncoding =
        SmsEncoding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsEncoding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsEncoding =
        SmsEncoding.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsEncoding): Int = obj.value
  }
}
