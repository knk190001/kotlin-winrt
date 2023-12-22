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

@ABIMarker(EmailQuerySortProperty.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailQuerySortProperty;i4)")
@WinRTByReference(brClass = EmailQuerySortProperty.ByReference::class)
public enum class EmailQuerySortProperty(
  public val value: Int
) : NativeMapped {
  Date(0),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailQuerySortProperty {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Date
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailQuerySortProperty> {
    public fun setValue(newValue: EmailQuerySortProperty): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailQuerySortProperty =
        EmailQuerySortProperty.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailQuerySortProperty, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailQuerySortProperty =
        EmailQuerySortProperty.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailQuerySortProperty): Int = obj.value
  }
}
