package Windows.Devices.Display.Core

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

@ABIMarker(DisplayWireFormatEotf.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayWireFormatEotf;i4)")
@WinRTByReference(brClass = DisplayWireFormatEotf.ByReference::class)
public enum class DisplayWireFormatEotf(
  public val value: Int
) : NativeMapped {
  Sdr(0),
  HdrSmpte2084(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayWireFormatEotf {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Sdr
      1 -> HdrSmpte2084
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayWireFormatEotf> {
    public fun setValue(newValue: DisplayWireFormatEotf): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayWireFormatEotf =
        DisplayWireFormatEotf.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayWireFormatEotf, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayWireFormatEotf =
        DisplayWireFormatEotf.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayWireFormatEotf): Int = obj.value
  }
}
