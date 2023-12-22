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

@ABIMarker(ContactQuerySearchFields.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactQuerySearchFields;u4)")
@WinRTByReference(brClass = ContactQuerySearchFields.ByReference::class)
public enum class ContactQuerySearchFields(
  public val value: Int
) : NativeMapped {
  None(0),
  Name(1),
  Email(2),
  Phone(4),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactQuerySearchFields {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Name
      2 -> Email
      4 -> Phone
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactQuerySearchFields>
      {
    public fun setValue(newValue: ContactQuerySearchFields): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactQuerySearchFields =
        ContactQuerySearchFields.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactQuerySearchFields, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactQuerySearchFields =
        ContactQuerySearchFields.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactQuerySearchFields): Int = obj.value
  }
}
