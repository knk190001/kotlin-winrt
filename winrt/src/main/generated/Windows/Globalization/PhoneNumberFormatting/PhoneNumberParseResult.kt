package Windows.Globalization.PhoneNumberFormatting

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

@ABIMarker(PhoneNumberParseResult.ABI::class)
@Signature("enum(Windows.Globalization.PhoneNumberFormatting.PhoneNumberParseResult;i4)")
@WinRTByReference(brClass = PhoneNumberParseResult.ByReference::class)
public enum class PhoneNumberParseResult(
  public val value: Int
) : NativeMapped {
  Valid(0),
  NotANumber(1),
  InvalidCountryCode(2),
  TooShort(3),
  TooLong(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneNumberParseResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Valid
      1 -> NotANumber
      2 -> InvalidCountryCode
      3 -> TooShort
      4 -> TooLong
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneNumberParseResult> {
    public fun setValue(newValue: PhoneNumberParseResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneNumberParseResult =
        PhoneNumberParseResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneNumberParseResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneNumberParseResult =
        PhoneNumberParseResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneNumberParseResult): Int = obj.value
  }
}
