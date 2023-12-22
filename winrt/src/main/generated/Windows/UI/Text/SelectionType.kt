package Windows.UI.Text

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

@ABIMarker(SelectionType.ABI::class)
@Signature("enum(Windows.UI.Text.SelectionType;i4)")
@WinRTByReference(brClass = SelectionType.ByReference::class)
public enum class SelectionType(
  public val value: Int
) : NativeMapped {
  None(0),
  InsertionPoint(1),
  Normal(2),
  InlineShape(7),
  Shape(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SelectionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> InsertionPoint
      2 -> Normal
      7 -> InlineShape
      8 -> Shape
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SelectionType> {
    public fun setValue(newValue: SelectionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SelectionType =
        SelectionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SelectionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SelectionType =
        SelectionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SelectionType): Int = obj.value
  }
}
