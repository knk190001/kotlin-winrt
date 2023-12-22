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

@ABIMarker(SelectionOptions.ABI::class)
@Signature("enum(Windows.UI.Text.SelectionOptions;u4)")
@WinRTByReference(brClass = SelectionOptions.ByReference::class)
public enum class SelectionOptions(
  public val value: Int
) : NativeMapped {
  StartActive(1),
  AtEndOfLine(2),
  Overtype(4),
  Active(8),
  Replace(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SelectionOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> StartActive
      2 -> AtEndOfLine
      4 -> Overtype
      8 -> Active
      16 -> Replace
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SelectionOptions> {
    public fun setValue(newValue: SelectionOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SelectionOptions =
        SelectionOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SelectionOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SelectionOptions =
        SelectionOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: SelectionOptions): Int = obj.value
  }
}
