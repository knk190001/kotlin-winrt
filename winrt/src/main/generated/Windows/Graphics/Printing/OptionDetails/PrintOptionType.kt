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

@ABIMarker(PrintOptionType.ABI::class)
@Signature("enum(Windows.Graphics.Printing.OptionDetails.PrintOptionType;i4)")
@WinRTByReference(brClass = PrintOptionType.ByReference::class)
public enum class PrintOptionType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Number(1),
  Text(2),
  ItemList(3),
  Toggle(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintOptionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Number
      2 -> Text
      3 -> ItemList
      4 -> Toggle
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintOptionType> {
    public fun setValue(newValue: PrintOptionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintOptionType =
        PrintOptionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintOptionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintOptionType =
        PrintOptionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintOptionType): Int = obj.value
  }
}
