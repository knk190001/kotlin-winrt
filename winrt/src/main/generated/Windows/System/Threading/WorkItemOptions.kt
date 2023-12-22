package Windows.System.Threading

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

@ABIMarker(WorkItemOptions.ABI::class)
@Signature("enum(Windows.System.Threading.WorkItemOptions;u4)")
@WinRTByReference(brClass = WorkItemOptions.ByReference::class)
public enum class WorkItemOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  TimeSliced(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WorkItemOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TimeSliced
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WorkItemOptions> {
    public fun setValue(newValue: WorkItemOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WorkItemOptions =
        WorkItemOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WorkItemOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WorkItemOptions =
        WorkItemOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: WorkItemOptions): Int = obj.value
  }
}
