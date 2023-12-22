package Windows.Graphics.Printing.PrintTicket

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

@ABIMarker(PrintTicketParameterDataType.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintTicket.PrintTicketParameterDataType;i4)")
@WinRTByReference(brClass = PrintTicketParameterDataType.ByReference::class)
public enum class PrintTicketParameterDataType(
  public val value: Int
) : NativeMapped {
  Integer(0),
  NumericString(1),
  String(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintTicketParameterDataType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Integer
      1 -> NumericString
      2 -> String
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PrintTicketParameterDataType> {
    public fun setValue(newValue: PrintTicketParameterDataType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintTicketParameterDataType =
        PrintTicketParameterDataType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintTicketParameterDataType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintTicketParameterDataType =
        PrintTicketParameterDataType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintTicketParameterDataType): Int = obj.value
  }
}
