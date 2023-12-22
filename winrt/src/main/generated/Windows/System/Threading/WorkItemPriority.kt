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

@ABIMarker(WorkItemPriority.ABI::class)
@Signature("enum(Windows.System.Threading.WorkItemPriority;i4)")
@WinRTByReference(brClass = WorkItemPriority.ByReference::class)
public enum class WorkItemPriority(
  public val value: Int
) : NativeMapped {
  Low(-1),
  Normal(0),
  High(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WorkItemPriority {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      -1 -> Low
      0 -> Normal
      1 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WorkItemPriority> {
    public fun setValue(newValue: WorkItemPriority): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WorkItemPriority =
        WorkItemPriority.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WorkItemPriority, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WorkItemPriority =
        WorkItemPriority.values()[0].fromNative(value, null)

    public override fun toNative(obj: WorkItemPriority): Int = obj.value
  }
}
