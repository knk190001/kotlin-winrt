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

@ABIMarker(ContactListOtherAppReadAccess.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess;i4)")
@WinRTByReference(brClass = ContactListOtherAppReadAccess.ByReference::class)
public enum class ContactListOtherAppReadAccess(
  public val value: Int
) : NativeMapped {
  SystemOnly(0),
  Limited(1),
  Full(2),
  None(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactListOtherAppReadAccess {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SystemOnly
      1 -> Limited
      2 -> Full
      3 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ContactListOtherAppReadAccess> {
    public fun setValue(newValue: ContactListOtherAppReadAccess): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactListOtherAppReadAccess =
        ContactListOtherAppReadAccess.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactListOtherAppReadAccess, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactListOtherAppReadAccess =
        ContactListOtherAppReadAccess.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactListOtherAppReadAccess): Int = obj.value
  }
}
