package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(PhoneIncomingCallDismissedReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.Background.PhoneIncomingCallDismissedReason;i4)")
@WinRTByReference(brClass = PhoneIncomingCallDismissedReason.ByReference::class)
public enum class PhoneIncomingCallDismissedReason(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  CallRejected(1),
  TextReply(2),
  ConnectionLost(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneIncomingCallDismissedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> CallRejected
      2 -> TextReply
      3 -> ConnectionLost
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhoneIncomingCallDismissedReason> {
    public fun setValue(newValue: PhoneIncomingCallDismissedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneIncomingCallDismissedReason =
        PhoneIncomingCallDismissedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneIncomingCallDismissedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneIncomingCallDismissedReason =
        PhoneIncomingCallDismissedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneIncomingCallDismissedReason): Int = obj.value
  }
}
