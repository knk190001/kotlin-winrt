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

@ABIMarker(PhoneNumberFormat.ABI::class)
@Signature("enum(Windows.Globalization.PhoneNumberFormatting.PhoneNumberFormat;i4)")
@WinRTByReference(brClass = PhoneNumberFormat.ByReference::class)
public enum class PhoneNumberFormat(
  public val value: Int
) : NativeMapped {
  E164(0),
  International(1),
  National(2),
  Rfc3966(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneNumberFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> E164
      1 -> International
      2 -> National
      3 -> Rfc3966
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneNumberFormat> {
    public fun setValue(newValue: PhoneNumberFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneNumberFormat =
        PhoneNumberFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneNumberFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneNumberFormat =
        PhoneNumberFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneNumberFormat): Int = obj.value
  }
}
