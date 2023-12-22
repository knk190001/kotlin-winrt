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

@ABIMarker(DisplayScanoutOptions.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayScanoutOptions;u4)")
@WinRTByReference(brClass = DisplayScanoutOptions.ByReference::class)
public enum class DisplayScanoutOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  AllowTearing(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayScanoutOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      2 -> AllowTearing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayScanoutOptions> {
    public fun setValue(newValue: DisplayScanoutOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayScanoutOptions =
        DisplayScanoutOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayScanoutOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayScanoutOptions =
        DisplayScanoutOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayScanoutOptions): Int = obj.value
  }
}
