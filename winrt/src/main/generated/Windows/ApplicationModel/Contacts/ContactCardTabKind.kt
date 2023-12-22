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

@ABIMarker(ContactCardTabKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactCardTabKind;i4)")
@WinRTByReference(brClass = ContactCardTabKind.ByReference::class)
public enum class ContactCardTabKind(
  public val value: Int
) : NativeMapped {
  Default(0),
  Email(1),
  Messaging(2),
  Phone(3),
  Video(4),
  OrganizationalHierarchy(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactCardTabKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Email
      2 -> Messaging
      3 -> Phone
      4 -> Video
      5 -> OrganizationalHierarchy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactCardTabKind> {
    public fun setValue(newValue: ContactCardTabKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactCardTabKind =
        ContactCardTabKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactCardTabKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactCardTabKind =
        ContactCardTabKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactCardTabKind): Int = obj.value
  }
}
