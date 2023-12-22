package Windows.ApplicationModel.Email

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

@ABIMarker(EmailAttachmentDownloadState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailAttachmentDownloadState;i4)")
@WinRTByReference(brClass = EmailAttachmentDownloadState.ByReference::class)
public enum class EmailAttachmentDownloadState(
  public val value: Int
) : NativeMapped {
  NotDownloaded(0),
  Downloading(1),
  Downloaded(2),
  Failed(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailAttachmentDownloadState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotDownloaded
      1 -> Downloading
      2 -> Downloaded
      3 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailAttachmentDownloadState> {
    public fun setValue(newValue: EmailAttachmentDownloadState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailAttachmentDownloadState =
        EmailAttachmentDownloadState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailAttachmentDownloadState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailAttachmentDownloadState =
        EmailAttachmentDownloadState.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailAttachmentDownloadState): Int = obj.value
  }
}
