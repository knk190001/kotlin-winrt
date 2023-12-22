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

@ABIMarker(DisplayPathStatus.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayPathStatus;i4)")
@WinRTByReference(brClass = DisplayPathStatus.ByReference::class)
public enum class DisplayPathStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Succeeded(1),
  Pending(2),
  Failed(3),
  FailedAsync(4),
  InvalidatedAsync(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayPathStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Succeeded
      2 -> Pending
      3 -> Failed
      4 -> FailedAsync
      5 -> InvalidatedAsync
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayPathStatus> {
    public fun setValue(newValue: DisplayPathStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayPathStatus =
        DisplayPathStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayPathStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayPathStatus =
        DisplayPathStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayPathStatus): Int = obj.value
  }
}
