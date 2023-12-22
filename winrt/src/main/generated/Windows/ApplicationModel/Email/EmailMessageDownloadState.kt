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

@ABIMarker(EmailMessageDownloadState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMessageDownloadState;i4)")
@WinRTByReference(brClass = EmailMessageDownloadState.ByReference::class)
public enum class EmailMessageDownloadState(
  public val value: Int
) : NativeMapped {
  PartiallyDownloaded(0),
  Downloading(1),
  Downloaded(2),
  Failed(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMessageDownloadState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PartiallyDownloaded
      1 -> Downloading
      2 -> Downloaded
      3 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailMessageDownloadState>
      {
    public fun setValue(newValue: EmailMessageDownloadState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMessageDownloadState =
        EmailMessageDownloadState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMessageDownloadState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMessageDownloadState =
        EmailMessageDownloadState.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMessageDownloadState): Int = obj.value
  }
}
