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

@ABIMarker(ContactAddressKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactAddressKind;i4)")
@WinRTByReference(brClass = ContactAddressKind.ByReference::class)
public enum class ContactAddressKind(
  public val value: Int
) : NativeMapped {
  Home(0),
  Work(1),
  Other(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactAddressKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Home
      1 -> Work
      2 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactAddressKind> {
    public fun setValue(newValue: ContactAddressKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactAddressKind =
        ContactAddressKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactAddressKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactAddressKind =
        ContactAddressKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactAddressKind): Int = obj.value
  }
}
