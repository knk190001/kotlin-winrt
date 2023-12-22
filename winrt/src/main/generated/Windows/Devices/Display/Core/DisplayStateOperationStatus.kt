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

@ABIMarker(DisplayStateOperationStatus.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayStateOperationStatus;i4)")
@WinRTByReference(brClass = DisplayStateOperationStatus.ByReference::class)
public enum class DisplayStateOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  PartialFailure(1),
  UnknownFailure(2),
  TargetOwnershipLost(3),
  SystemStateChanged(4),
  TooManyPathsForAdapter(5),
  ModesNotSupported(6),
  RemoteSessionNotSupported(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayStateOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> PartialFailure
      2 -> UnknownFailure
      3 -> TargetOwnershipLost
      4 -> SystemStateChanged
      5 -> TooManyPathsForAdapter
      6 -> ModesNotSupported
      7 -> RemoteSessionNotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisplayStateOperationStatus> {
    public fun setValue(newValue: DisplayStateOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayStateOperationStatus =
        DisplayStateOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayStateOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayStateOperationStatus =
        DisplayStateOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayStateOperationStatus): Int = obj.value
  }
}
