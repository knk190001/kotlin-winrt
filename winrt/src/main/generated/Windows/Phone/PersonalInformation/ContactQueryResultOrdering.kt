package Windows.Phone.PersonalInformation

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

@ABIMarker(ContactQueryResultOrdering.ABI::class)
@Signature("enum(Windows.Phone.PersonalInformation.ContactQueryResultOrdering;i4)")
@WinRTByReference(brClass = ContactQueryResultOrdering.ByReference::class)
public enum class ContactQueryResultOrdering(
  public val value: Int
) : NativeMapped {
  SystemDefault(0),
  GivenNameFamilyName(1),
  FamilyNameGivenName(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactQueryResultOrdering {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SystemDefault
      1 -> GivenNameFamilyName
      2 -> FamilyNameGivenName
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ContactQueryResultOrdering> {
    public fun setValue(newValue: ContactQueryResultOrdering): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactQueryResultOrdering =
        ContactQueryResultOrdering.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactQueryResultOrdering, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactQueryResultOrdering =
        ContactQueryResultOrdering.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactQueryResultOrdering): Int = obj.value
  }
}
