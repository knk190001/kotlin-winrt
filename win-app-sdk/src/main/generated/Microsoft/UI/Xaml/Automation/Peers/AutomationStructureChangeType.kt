package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(AutomationStructureChangeType.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.AutomationStructureChangeType;i4)")
@WinRTByReference(brClass = AutomationStructureChangeType.ByReference::class)
public enum class AutomationStructureChangeType(
  public val value: Int
) : NativeMapped {
  ChildAdded(0),
  ChildRemoved(1),
  ChildrenInvalidated(2),
  ChildrenBulkAdded(3),
  ChildrenBulkRemoved(4),
  ChildrenReordered(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationStructureChangeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ChildAdded
      1 -> ChildRemoved
      2 -> ChildrenInvalidated
      3 -> ChildrenBulkAdded
      4 -> ChildrenBulkRemoved
      5 -> ChildrenReordered
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationStructureChangeType> {
    public fun setValue(newValue: AutomationStructureChangeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationStructureChangeType =
        AutomationStructureChangeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationStructureChangeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationStructureChangeType =
        AutomationStructureChangeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationStructureChangeType): Int = obj.value
  }
}
