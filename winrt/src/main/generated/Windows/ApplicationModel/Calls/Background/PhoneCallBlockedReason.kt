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

@ABIMarker(PhoneCallBlockedReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason;i4)")
@WinRTByReference(brClass = PhoneCallBlockedReason.ByReference::class)
public enum class PhoneCallBlockedReason(
  public val value: Int
) : NativeMapped {
  InCallBlockingList(0),
  PrivateNumber(1),
  UnknownNumber(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallBlockedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> InCallBlockingList
      1 -> PrivateNumber
      2 -> UnknownNumber
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallBlockedReason> {
    public fun setValue(newValue: PhoneCallBlockedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallBlockedReason =
        PhoneCallBlockedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallBlockedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallBlockedReason =
        PhoneCallBlockedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallBlockedReason): Int = obj.value
  }
}
