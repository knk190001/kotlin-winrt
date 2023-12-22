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

@ABIMarker(ContactAnnotationOperations.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactAnnotationOperations;u4)")
@WinRTByReference(brClass = ContactAnnotationOperations.ByReference::class)
public enum class ContactAnnotationOperations(
  public val value: Int
) : NativeMapped {
  None(0),
  ContactProfile(1),
  Message(2),
  AudioCall(4),
  VideoCall(8),
  SocialFeeds(16),
  Share(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactAnnotationOperations {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ContactProfile
      2 -> Message
      4 -> AudioCall
      8 -> VideoCall
      16 -> SocialFeeds
      32 -> Share
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ContactAnnotationOperations> {
    public fun setValue(newValue: ContactAnnotationOperations): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactAnnotationOperations =
        ContactAnnotationOperations.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactAnnotationOperations, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactAnnotationOperations =
        ContactAnnotationOperations.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactAnnotationOperations): Int = obj.value
  }
}
