package Microsoft.UI.Input.DragDrop

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

@ABIMarker(DragDropModifiers.ABI::class)
@Signature("enum(Microsoft.UI.Input.DragDrop.DragDropModifiers;u4)")
@WinRTByReference(brClass = DragDropModifiers.ByReference::class)
public enum class DragDropModifiers(
  public val value: Int
) : NativeMapped {
  None(0),
  Shift(1),
  Control(2),
  Alt(4),
  LeftButton(8),
  MiddleButton(16),
  RightButton(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DragDropModifiers {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Shift
      2 -> Control
      4 -> Alt
      8 -> LeftButton
      16 -> MiddleButton
      32 -> RightButton
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DragDropModifiers> {
    public fun setValue(newValue: DragDropModifiers): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DragDropModifiers =
        DragDropModifiers.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DragDropModifiers, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DragDropModifiers =
        DragDropModifiers.values()[0].fromNative(value, null)

    public override fun toNative(obj: DragDropModifiers): Int = obj.value
  }
}
