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

@ABIMarker(ContactEmailKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactEmailKind;i4)")
@WinRTByReference(brClass = ContactEmailKind.ByReference::class)
public enum class ContactEmailKind(
  public val value: Int
) : NativeMapped {
  Personal(0),
  Work(1),
  Other(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactEmailKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Personal
      1 -> Work
      2 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactEmailKind> {
    public fun setValue(newValue: ContactEmailKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactEmailKind =
        ContactEmailKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactEmailKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactEmailKind =
        ContactEmailKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactEmailKind): Int = obj.value
  }
}
