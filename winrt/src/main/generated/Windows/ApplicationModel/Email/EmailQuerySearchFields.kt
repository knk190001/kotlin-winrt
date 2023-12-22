package Windows.ApplicationModel.Email

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

@ABIMarker(EmailQuerySearchFields.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailQuerySearchFields;u4)")
@WinRTByReference(brClass = EmailQuerySearchFields.ByReference::class)
public enum class EmailQuerySearchFields(
  public val value: Int
) : NativeMapped {
  None(0),
  Subject(1),
  Sender(2),
  Preview(4),
  Recipients(8),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailQuerySearchFields {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Subject
      2 -> Sender
      4 -> Preview
      8 -> Recipients
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailQuerySearchFields> {
    public fun setValue(newValue: EmailQuerySearchFields): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailQuerySearchFields =
        EmailQuerySearchFields.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailQuerySearchFields, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailQuerySearchFields =
        EmailQuerySearchFields.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailQuerySearchFields): Int = obj.value
  }
}
