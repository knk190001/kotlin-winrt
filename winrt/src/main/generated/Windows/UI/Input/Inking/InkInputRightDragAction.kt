package Windows.UI.Input.Inking

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

@ABIMarker(InkInputRightDragAction.ABI::class)
@Signature("enum(Windows.UI.Input.Inking.InkInputRightDragAction;i4)")
@WinRTByReference(brClass = InkInputRightDragAction.ByReference::class)
public enum class InkInputRightDragAction(
  public val value: Int
) : NativeMapped {
  LeaveUnprocessed(0),
  AllowProcessing(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkInputRightDragAction {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LeaveUnprocessed
      1 -> AllowProcessing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkInputRightDragAction> {
    public fun setValue(newValue: InkInputRightDragAction): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkInputRightDragAction =
        InkInputRightDragAction.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkInputRightDragAction, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkInputRightDragAction =
        InkInputRightDragAction.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkInputRightDragAction): Int = obj.value
  }
}
