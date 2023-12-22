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

@ABIMarker(ContactFieldType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactFieldType;i4)")
@WinRTByReference(brClass = ContactFieldType.ByReference::class)
public enum class ContactFieldType(
  public val value: Int
) : NativeMapped {
  Email(0),
  PhoneNumber(1),
  Location(2),
  InstantMessage(3),
  Custom(4),
  ConnectedServiceAccount(5),
  ImportantDate(6),
  Address(7),
  SignificantOther(8),
  Notes(9),
  Website(10),
  JobInfo(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactFieldType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Email
      1 -> PhoneNumber
      2 -> Location
      3 -> InstantMessage
      4 -> Custom
      5 -> ConnectedServiceAccount
      6 -> ImportantDate
      7 -> Address
      8 -> SignificantOther
      9 -> Notes
      10 -> Website
      11 -> JobInfo
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactFieldType> {
    public fun setValue(newValue: ContactFieldType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactFieldType =
        ContactFieldType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactFieldType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactFieldType =
        ContactFieldType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactFieldType): Int = obj.value
  }
}
