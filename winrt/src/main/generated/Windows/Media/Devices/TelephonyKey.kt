package Windows.Media.Devices

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

@ABIMarker(TelephonyKey.ABI::class)
@Signature("enum(Windows.Media.Devices.TelephonyKey;i4)")
@WinRTByReference(brClass = TelephonyKey.ByReference::class)
public enum class TelephonyKey(
  public val value: Int
) : NativeMapped {
  D0(0),
  D1(1),
  D2(2),
  D3(3),
  D4(4),
  D5(5),
  D6(6),
  D7(7),
  D8(8),
  D9(9),
  Star(10),
  Pound(11),
  A(12),
  B(13),
  C(14),
  D(15),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TelephonyKey {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> D0
      1 -> D1
      2 -> D2
      3 -> D3
      4 -> D4
      5 -> D5
      6 -> D6
      7 -> D7
      8 -> D8
      9 -> D9
      10 -> Star
      11 -> Pound
      12 -> A
      13 -> B
      14 -> C
      15 -> D
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TelephonyKey> {
    public fun setValue(newValue: TelephonyKey): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TelephonyKey =
        TelephonyKey.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TelephonyKey, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TelephonyKey =
        TelephonyKey.values()[0].fromNative(value, null)

    public override fun toNative(obj: TelephonyKey): Int = obj.value
  }
}
