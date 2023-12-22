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

@ABIMarker(ContactPhoneKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactPhoneKind;i4)")
@WinRTByReference(brClass = ContactPhoneKind.ByReference::class)
public enum class ContactPhoneKind(
  public val value: Int
) : NativeMapped {
  Home(0),
  Mobile(1),
  Work(2),
  Other(3),
  Pager(4),
  BusinessFax(5),
  HomeFax(6),
  Company(7),
  Assistant(8),
  Radio(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactPhoneKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Home
      1 -> Mobile
      2 -> Work
      3 -> Other
      4 -> Pager
      5 -> BusinessFax
      6 -> HomeFax
      7 -> Company
      8 -> Assistant
      9 -> Radio
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactPhoneKind> {
    public fun setValue(newValue: ContactPhoneKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactPhoneKind =
        ContactPhoneKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactPhoneKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactPhoneKind =
        ContactPhoneKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactPhoneKind): Int = obj.value
  }
}
