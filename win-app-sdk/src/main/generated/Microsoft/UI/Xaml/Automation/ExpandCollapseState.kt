package Microsoft.UI.Xaml.Automation

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

@ABIMarker(ExpandCollapseState.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.ExpandCollapseState;i4)")
@WinRTByReference(brClass = ExpandCollapseState.ByReference::class)
public enum class ExpandCollapseState(
  public val value: Int
) : NativeMapped {
  Collapsed(0),
  Expanded(1),
  PartiallyExpanded(2),
  LeafNode(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExpandCollapseState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Collapsed
      1 -> Expanded
      2 -> PartiallyExpanded
      3 -> LeafNode
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExpandCollapseState> {
    public fun setValue(newValue: ExpandCollapseState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExpandCollapseState =
        ExpandCollapseState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExpandCollapseState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExpandCollapseState =
        ExpandCollapseState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExpandCollapseState): Int = obj.value
  }
}
