package Windows.ApplicationModel.Contacts

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

@ABIMarker(ContactQueryDesiredFields.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactQueryDesiredFields;u4)")
@WinRTByReference(brClass = ContactQueryDesiredFields.ByReference::class)
public enum class ContactQueryDesiredFields(
  public val value: Int
) : NativeMapped {
  None(0),
  PhoneNumber(1),
  EmailAddress(2),
  PostalAddress(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactQueryDesiredFields {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> PhoneNumber
      2 -> EmailAddress
      4 -> PostalAddress
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactQueryDesiredFields>
      {
    public fun setValue(newValue: ContactQueryDesiredFields): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactQueryDesiredFields =
        ContactQueryDesiredFields.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactQueryDesiredFields, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactQueryDesiredFields =
        ContactQueryDesiredFields.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactQueryDesiredFields): Int = obj.value
  }
}
