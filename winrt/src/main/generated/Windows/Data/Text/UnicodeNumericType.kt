package Windows.Data.Text

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

@ABIMarker(UnicodeNumericType.ABI::class)
@Signature("enum(Windows.Data.Text.UnicodeNumericType;i4)")
@WinRTByReference(brClass = UnicodeNumericType.ByReference::class)
public enum class UnicodeNumericType(
  public val value: Int
) : NativeMapped {
  None(0),
  Decimal(1),
  Digit(2),
  Numeric(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UnicodeNumericType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Decimal
      2 -> Digit
      3 -> Numeric
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UnicodeNumericType> {
    public fun setValue(newValue: UnicodeNumericType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UnicodeNumericType =
        UnicodeNumericType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UnicodeNumericType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UnicodeNumericType =
        UnicodeNumericType.values()[0].fromNative(value, null)

    public override fun toNative(obj: UnicodeNumericType): Int = obj.value
  }
}
