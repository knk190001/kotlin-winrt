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

@ABIMarker(PrintTicketFeatureSelectionType.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintTicket.PrintTicketFeatureSelectionType;i4)")
@WinRTByReference(brClass = PrintTicketFeatureSelectionType.ByReference::class)
public enum class PrintTicketFeatureSelectionType(
  public val value: Int
) : NativeMapped {
  PickOne(0),
  PickMany(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintTicketFeatureSelectionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PickOne
      1 -> PickMany
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PrintTicketFeatureSelectionType> {
    public fun setValue(newValue: PrintTicketFeatureSelectionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintTicketFeatureSelectionType =
        PrintTicketFeatureSelectionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintTicketFeatureSelectionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintTicketFeatureSelectionType =
        PrintTicketFeatureSelectionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintTicketFeatureSelectionType): Int = obj.value
  }
}
