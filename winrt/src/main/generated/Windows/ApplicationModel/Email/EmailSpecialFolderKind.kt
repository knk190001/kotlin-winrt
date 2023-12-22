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

@ABIMarker(EmailSpecialFolderKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailSpecialFolderKind;i4)")
@WinRTByReference(brClass = EmailSpecialFolderKind.ByReference::class)
public enum class EmailSpecialFolderKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Root(1),
  Inbox(2),
  Outbox(3),
  Drafts(4),
  DeletedItems(5),
  Sent(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailSpecialFolderKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Root
      2 -> Inbox
      3 -> Outbox
      4 -> Drafts
      5 -> DeletedItems
      6 -> Sent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailSpecialFolderKind> {
    public fun setValue(newValue: EmailSpecialFolderKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailSpecialFolderKind =
        EmailSpecialFolderKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailSpecialFolderKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailSpecialFolderKind =
        EmailSpecialFolderKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailSpecialFolderKind): Int = obj.value
  }
}
