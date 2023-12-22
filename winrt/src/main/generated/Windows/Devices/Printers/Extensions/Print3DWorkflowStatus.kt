package Windows.Devices.Printers.Extensions

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

@ABIMarker(Print3DWorkflowStatus.ABI::class)
@Signature("enum(Windows.Devices.Printers.Extensions.Print3DWorkflowStatus;i4)")
@WinRTByReference(brClass = Print3DWorkflowStatus.ByReference::class)
public enum class Print3DWorkflowStatus(
  public val value: Int
) : NativeMapped {
  Abandoned(0),
  Canceled(1),
  Failed(2),
  Slicing(3),
  Submitted(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Print3DWorkflowStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Abandoned
      1 -> Canceled
      2 -> Failed
      3 -> Slicing
      4 -> Submitted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Print3DWorkflowStatus> {
    public fun setValue(newValue: Print3DWorkflowStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Print3DWorkflowStatus =
        Print3DWorkflowStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Print3DWorkflowStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Print3DWorkflowStatus =
        Print3DWorkflowStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: Print3DWorkflowStatus): Int = obj.value
  }
}
