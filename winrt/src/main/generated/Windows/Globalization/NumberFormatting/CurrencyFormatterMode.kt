package Windows.Globalization.NumberFormatting

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

@ABIMarker(CurrencyFormatterMode.ABI::class)
@Signature("enum(Windows.Globalization.NumberFormatting.CurrencyFormatterMode;i4)")
@WinRTByReference(brClass = CurrencyFormatterMode.ByReference::class)
public enum class CurrencyFormatterMode(
  public val value: Int
) : NativeMapped {
  UseSymbol(0),
  UseCurrencyCode(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CurrencyFormatterMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UseSymbol
      1 -> UseCurrencyCode
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CurrencyFormatterMode> {
    public fun setValue(newValue: CurrencyFormatterMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CurrencyFormatterMode =
        CurrencyFormatterMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CurrencyFormatterMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CurrencyFormatterMode =
        CurrencyFormatterMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CurrencyFormatterMode): Int = obj.value
  }
}
