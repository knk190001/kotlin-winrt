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

@ABIMarker(ContactMatchReasonKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactMatchReasonKind;i4)")
@WinRTByReference(brClass = ContactMatchReasonKind.ByReference::class)
public enum class ContactMatchReasonKind(
  public val value: Int
) : NativeMapped {
  Name(0),
  EmailAddress(1),
  PhoneNumber(2),
  JobInfo(3),
  YomiName(4),
  Other(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactMatchReasonKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Name
      1 -> EmailAddress
      2 -> PhoneNumber
      3 -> JobInfo
      4 -> YomiName
      5 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactMatchReasonKind> {
    public fun setValue(newValue: ContactMatchReasonKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactMatchReasonKind =
        ContactMatchReasonKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactMatchReasonKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactMatchReasonKind =
        ContactMatchReasonKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactMatchReasonKind): Int = obj.value
  }
}
