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

@ABIMarker(DisplayWireFormatColorSpace.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayWireFormatColorSpace;i4)")
@WinRTByReference(brClass = DisplayWireFormatColorSpace.ByReference::class)
public enum class DisplayWireFormatColorSpace(
  public val value: Int
) : NativeMapped {
  BT709(0),
  BT2020(1),
  ProfileDefinedWideColorGamut(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayWireFormatColorSpace {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> BT709
      1 -> BT2020
      2 -> ProfileDefinedWideColorGamut
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisplayWireFormatColorSpace> {
    public fun setValue(newValue: DisplayWireFormatColorSpace): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayWireFormatColorSpace =
        DisplayWireFormatColorSpace.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayWireFormatColorSpace, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayWireFormatColorSpace =
        DisplayWireFormatColorSpace.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayWireFormatColorSpace): Int = obj.value
  }
}
