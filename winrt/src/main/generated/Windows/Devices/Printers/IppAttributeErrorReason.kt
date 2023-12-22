package Windows.Devices.Printers

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

@ABIMarker(IppAttributeErrorReason.ABI::class)
@Signature("enum(Windows.Devices.Printers.IppAttributeErrorReason;i4)")
@WinRTByReference(brClass = IppAttributeErrorReason.ByReference::class)
public enum class IppAttributeErrorReason(
  public val value: Int
) : NativeMapped {
  RequestEntityTooLarge(0),
  AttributeNotSupported(1),
  AttributeValuesNotSupported(2),
  AttributeNotSettable(3),
  ConflictingAttributes(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IppAttributeErrorReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RequestEntityTooLarge
      1 -> AttributeNotSupported
      2 -> AttributeValuesNotSupported
      3 -> AttributeNotSettable
      4 -> ConflictingAttributes
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IppAttributeErrorReason> {
    public fun setValue(newValue: IppAttributeErrorReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IppAttributeErrorReason =
        IppAttributeErrorReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IppAttributeErrorReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IppAttributeErrorReason =
        IppAttributeErrorReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: IppAttributeErrorReason): Int = obj.value
  }
}
