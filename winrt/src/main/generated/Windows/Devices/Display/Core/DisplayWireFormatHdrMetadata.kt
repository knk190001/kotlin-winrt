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

@ABIMarker(DisplayWireFormatHdrMetadata.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayWireFormatHdrMetadata;i4)")
@WinRTByReference(brClass = DisplayWireFormatHdrMetadata.ByReference::class)
public enum class DisplayWireFormatHdrMetadata(
  public val value: Int
) : NativeMapped {
  None(0),
  Hdr10(1),
  Hdr10Plus(2),
  DolbyVisionLowLatency(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayWireFormatHdrMetadata {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Hdr10
      2 -> Hdr10Plus
      3 -> DolbyVisionLowLatency
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisplayWireFormatHdrMetadata> {
    public fun setValue(newValue: DisplayWireFormatHdrMetadata): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayWireFormatHdrMetadata =
        DisplayWireFormatHdrMetadata.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayWireFormatHdrMetadata, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayWireFormatHdrMetadata =
        DisplayWireFormatHdrMetadata.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayWireFormatHdrMetadata): Int = obj.value
  }
}
