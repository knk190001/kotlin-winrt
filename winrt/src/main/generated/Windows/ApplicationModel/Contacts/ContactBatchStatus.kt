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

@ABIMarker(ContactBatchStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Contacts.ContactBatchStatus;i4)")
@WinRTByReference(brClass = ContactBatchStatus.ByReference::class)
public enum class ContactBatchStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  ServerSearchSyncManagerError(1),
  ServerSearchUnknownError(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContactBatchStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> ServerSearchSyncManagerError
      2 -> ServerSearchUnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContactBatchStatus> {
    public fun setValue(newValue: ContactBatchStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContactBatchStatus =
        ContactBatchStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContactBatchStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContactBatchStatus =
        ContactBatchStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContactBatchStatus): Int = obj.value
  }
}
