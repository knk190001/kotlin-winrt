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

@ABIMarker(DisplaySourceStatus.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplaySourceStatus;i4)")
@WinRTByReference(brClass = DisplaySourceStatus.ByReference::class)
public enum class DisplaySourceStatus(
  public val value: Int
) : NativeMapped {
  Active(0),
  PoweredOff(1),
  Invalid(2),
  OwnedByAnotherDevice(3),
  Unowned(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplaySourceStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Active
      1 -> PoweredOff
      2 -> Invalid
      3 -> OwnedByAnotherDevice
      4 -> Unowned
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplaySourceStatus> {
    public fun setValue(newValue: DisplaySourceStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplaySourceStatus =
        DisplaySourceStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplaySourceStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplaySourceStatus =
        DisplaySourceStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplaySourceStatus): Int = obj.value
  }
}
