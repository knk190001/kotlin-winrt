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

@ABIMarker(PhoneNumberMatchResult.ABI::class)
@Signature("enum(Windows.Globalization.PhoneNumberFormatting.PhoneNumberMatchResult;i4)")
@WinRTByReference(brClass = PhoneNumberMatchResult.ByReference::class)
public enum class PhoneNumberMatchResult(
  public val value: Int
) : NativeMapped {
  NoMatch(0),
  ShortNationalSignificantNumberMatch(1),
  NationalSignificantNumberMatch(2),
  ExactMatch(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneNumberMatchResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoMatch
      1 -> ShortNationalSignificantNumberMatch
      2 -> NationalSignificantNumberMatch
      3 -> ExactMatch
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneNumberMatchResult> {
    public fun setValue(newValue: PhoneNumberMatchResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneNumberMatchResult =
        PhoneNumberMatchResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneNumberMatchResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneNumberMatchResult =
        PhoneNumberMatchResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneNumberMatchResult): Int = obj.value
  }
}
