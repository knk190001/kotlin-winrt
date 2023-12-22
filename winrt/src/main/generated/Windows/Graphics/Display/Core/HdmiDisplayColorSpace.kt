package Windows.Graphics.Display.Core

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

@ABIMarker(HdmiDisplayColorSpace.ABI::class)
@Signature("enum(Windows.Graphics.Display.Core.HdmiDisplayColorSpace;i4)")
@WinRTByReference(brClass = HdmiDisplayColorSpace.ByReference::class)
public enum class HdmiDisplayColorSpace(
  public val value: Int
) : NativeMapped {
  RgbLimited(0),
  RgbFull(1),
  BT2020(2),
  BT709(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HdmiDisplayColorSpace {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RgbLimited
      1 -> RgbFull
      2 -> BT2020
      3 -> BT709
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HdmiDisplayColorSpace> {
    public fun setValue(newValue: HdmiDisplayColorSpace): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HdmiDisplayColorSpace =
        HdmiDisplayColorSpace.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HdmiDisplayColorSpace, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HdmiDisplayColorSpace =
        HdmiDisplayColorSpace.values()[0].fromNative(value, null)

    public override fun toNative(obj: HdmiDisplayColorSpace): Int = obj.value
  }
}
