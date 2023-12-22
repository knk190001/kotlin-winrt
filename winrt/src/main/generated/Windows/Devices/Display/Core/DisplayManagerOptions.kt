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

@ABIMarker(DisplayManagerOptions.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayManagerOptions;u4)")
@WinRTByReference(brClass = DisplayManagerOptions.ByReference::class)
public enum class DisplayManagerOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  EnforceSourceOwnership(1),
  VirtualRefreshRateAware(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayManagerOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> EnforceSourceOwnership
      2 -> VirtualRefreshRateAware
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayManagerOptions> {
    public fun setValue(newValue: DisplayManagerOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayManagerOptions =
        DisplayManagerOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayManagerOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayManagerOptions =
        DisplayManagerOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayManagerOptions): Int = obj.value
  }
}
