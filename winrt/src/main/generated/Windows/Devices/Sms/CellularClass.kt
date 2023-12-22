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

@ABIMarker(CellularClass.ABI::class)
@Signature("enum(Windows.Devices.Sms.CellularClass;i4)")
@WinRTByReference(brClass = CellularClass.ByReference::class)
public enum class CellularClass(
  public val value: Int
) : NativeMapped {
  None(0),
  Gsm(1),
  Cdma(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CellularClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Gsm
      2 -> Cdma
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CellularClass> {
    public fun setValue(newValue: CellularClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CellularClass =
        CellularClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CellularClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CellularClass =
        CellularClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: CellularClass): Int = obj.value
  }
}
