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

@ABIMarker(ContactFieldCategory.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactFieldCategory;i4)")
@WinRTByReference(brClass = ContactFieldCategory.ByReference::class)
public enum class ContactFieldCategory(
  public val value: Int
) : NativeMapped {
  None(0),
  Home(1),
  Work(2),
  Mobile(3),
  Other(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactFieldCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Home
      2 -> Work
      3 -> Mobile
      4 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactFieldCategory> {
    public fun setValue(newValue: ContactFieldCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactFieldCategory =
        ContactFieldCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactFieldCategory, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactFieldCategory =
        ContactFieldCategory.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactFieldCategory): Int = obj.value
  }
}
