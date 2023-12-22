package Windows.Networking.Connectivity

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

@ABIMarker(WwanDataClass.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.WwanDataClass;u4)")
@WinRTByReference(brClass = WwanDataClass.ByReference::class)
public enum class WwanDataClass(
  public val value: Int
) : NativeMapped {
  None(0),
  Gprs(1),
  Edge(2),
  Umts(4),
  Hsdpa(8),
  Hsupa(16),
  LteAdvanced(32),
  Cdma1xRtt(65536),
  Cdma1xEvdo(131072),
  Cdma1xEvdoRevA(262144),
  Cdma1xEvdv(524288),
  Cdma3xRtt(1048576),
  Cdma1xEvdoRevB(2097152),
  CdmaUmb(4194304),
  Custom(-2147483648),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WwanDataClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Gprs
      2 -> Edge
      4 -> Umts
      8 -> Hsdpa
      16 -> Hsupa
      32 -> LteAdvanced
      65536 -> Cdma1xRtt
      131072 -> Cdma1xEvdo
      262144 -> Cdma1xEvdoRevA
      524288 -> Cdma1xEvdv
      1048576 -> Cdma3xRtt
      2097152 -> Cdma1xEvdoRevB
      4194304 -> CdmaUmb
      -2147483648 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WwanDataClass> {
    public fun setValue(newValue: WwanDataClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WwanDataClass =
        WwanDataClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WwanDataClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WwanDataClass =
        WwanDataClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: WwanDataClass): Int = obj.value
  }
}
