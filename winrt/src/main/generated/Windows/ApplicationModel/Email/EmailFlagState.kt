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

@ABIMarker(EmailFlagState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailFlagState;i4)")
@WinRTByReference(brClass = EmailFlagState.ByReference::class)
public enum class EmailFlagState(
  public val value: Int
) : NativeMapped {
  Unflagged(0),
  Flagged(1),
  Completed(2),
  Cleared(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailFlagState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unflagged
      1 -> Flagged
      2 -> Completed
      3 -> Cleared
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailFlagState> {
    public fun setValue(newValue: EmailFlagState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailFlagState =
        EmailFlagState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailFlagState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailFlagState =
        EmailFlagState.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailFlagState): Int = obj.value
  }
}
