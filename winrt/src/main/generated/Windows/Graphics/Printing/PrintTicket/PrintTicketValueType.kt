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

@ABIMarker(PrintTicketValueType.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintTicket.PrintTicketValueType;i4)")
@WinRTByReference(brClass = PrintTicketValueType.ByReference::class)
public enum class PrintTicketValueType(
  public val value: Int
) : NativeMapped {
  Integer(0),
  String(1),
  Unknown(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintTicketValueType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Integer
      1 -> String
      2 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintTicketValueType> {
    public fun setValue(newValue: PrintTicketValueType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintTicketValueType =
        PrintTicketValueType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintTicketValueType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintTicketValueType =
        PrintTicketValueType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintTicketValueType): Int = obj.value
  }
}
