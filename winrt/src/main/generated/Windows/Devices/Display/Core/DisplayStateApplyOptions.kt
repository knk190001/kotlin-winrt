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

@ABIMarker(DisplayStateApplyOptions.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayStateApplyOptions;u4)")
@WinRTByReference(brClass = DisplayStateApplyOptions.ByReference::class)
public enum class DisplayStateApplyOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  FailIfStateChanged(1),
  ForceReapply(2),
  ForceModeEnumeration(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayStateApplyOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> FailIfStateChanged
      2 -> ForceReapply
      4 -> ForceModeEnumeration
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayStateApplyOptions>
      {
    public fun setValue(newValue: DisplayStateApplyOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayStateApplyOptions =
        DisplayStateApplyOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayStateApplyOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayStateApplyOptions =
        DisplayStateApplyOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayStateApplyOptions): Int = obj.value
  }
}
