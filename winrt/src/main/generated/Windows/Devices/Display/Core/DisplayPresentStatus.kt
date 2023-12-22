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

@ABIMarker(DisplayPresentStatus.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayPresentStatus;i4)")
@WinRTByReference(brClass = DisplayPresentStatus.ByReference::class)
public enum class DisplayPresentStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  SourceStatusPreventedPresent(1),
  ScanoutInvalid(2),
  SourceInvalid(3),
  DeviceInvalid(4),
  UnknownFailure(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayPresentStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> SourceStatusPreventedPresent
      2 -> ScanoutInvalid
      3 -> SourceInvalid
      4 -> DeviceInvalid
      5 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayPresentStatus> {
    public fun setValue(newValue: DisplayPresentStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayPresentStatus =
        DisplayPresentStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayPresentStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayPresentStatus =
        DisplayPresentStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayPresentStatus): Int = obj.value
  }
}
