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

@ABIMarker(DisplayPathScaling.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayPathScaling;i4)")
@WinRTByReference(brClass = DisplayPathScaling.ByReference::class)
public enum class DisplayPathScaling(
  public val value: Int
) : NativeMapped {
  Identity(0),
  Centered(1),
  Stretched(2),
  AspectRatioStretched(3),
  Custom(4),
  DriverPreferred(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayPathScaling {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Identity
      1 -> Centered
      2 -> Stretched
      3 -> AspectRatioStretched
      4 -> Custom
      5 -> DriverPreferred
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayPathScaling> {
    public fun setValue(newValue: DisplayPathScaling): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayPathScaling =
        DisplayPathScaling.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayPathScaling, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayPathScaling =
        DisplayPathScaling.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayPathScaling): Int = obj.value
  }
}
