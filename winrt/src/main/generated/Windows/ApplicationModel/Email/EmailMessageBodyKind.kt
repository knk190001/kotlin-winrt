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

@ABIMarker(EmailMessageBodyKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMessageBodyKind;i4)")
@WinRTByReference(brClass = EmailMessageBodyKind.ByReference::class)
public enum class EmailMessageBodyKind(
  public val value: Int
) : NativeMapped {
  Html(0),
  PlainText(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMessageBodyKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Html
      1 -> PlainText
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailMessageBodyKind> {
    public fun setValue(newValue: EmailMessageBodyKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMessageBodyKind =
        EmailMessageBodyKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMessageBodyKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMessageBodyKind =
        EmailMessageBodyKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMessageBodyKind): Int = obj.value
  }
}
