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

@ABIMarker(EmailMailboxOtherAppReadAccess.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxOtherAppReadAccess;i4)")
@WinRTByReference(brClass = EmailMailboxOtherAppReadAccess.ByReference::class)
public enum class EmailMailboxOtherAppReadAccess(
  public val value: Int
) : NativeMapped {
  SystemOnly(0),
  Full(1),
  None(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxOtherAppReadAccess {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SystemOnly
      1 -> Full
      2 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailMailboxOtherAppReadAccess> {
    public fun setValue(newValue: EmailMailboxOtherAppReadAccess): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxOtherAppReadAccess =
        EmailMailboxOtherAppReadAccess.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxOtherAppReadAccess, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxOtherAppReadAccess =
        EmailMailboxOtherAppReadAccess.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxOtherAppReadAccess): Int = obj.value
  }
}
