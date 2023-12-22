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

@ABIMarker(ContactDateKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactDateKind;i4)")
@WinRTByReference(brClass = ContactDateKind.ByReference::class)
public enum class ContactDateKind(
  public val value: Int
) : NativeMapped {
  Birthday(0),
  Anniversary(1),
  Other(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactDateKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Birthday
      1 -> Anniversary
      2 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactDateKind> {
    public fun setValue(newValue: ContactDateKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactDateKind =
        ContactDateKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactDateKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactDateKind =
        ContactDateKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactDateKind): Int = obj.value
  }
}
