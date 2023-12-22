package Windows.Graphics.Printing.OptionDetails

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

@ABIMarker(PrintOptionStates.ABI::class)
@Signature("enum(Windows.Graphics.Printing.OptionDetails.PrintOptionStates;u4)")
@WinRTByReference(brClass = PrintOptionStates.ByReference::class)
public enum class PrintOptionStates(
  public val value: Int
) : NativeMapped {
  None(0),
  Enabled(1),
  Constrained(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintOptionStates {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Enabled
      2 -> Constrained
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintOptionStates> {
    public fun setValue(newValue: PrintOptionStates): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintOptionStates =
        PrintOptionStates.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintOptionStates, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintOptionStates =
        PrintOptionStates.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintOptionStates): Int = obj.value
  }
}
