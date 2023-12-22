package Windows.Devices.Sms

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

@ABIMarker(SmsMessageFilter.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsMessageFilter;i4)")
@WinRTByReference(brClass = SmsMessageFilter.ByReference::class)
public enum class SmsMessageFilter(
  public val value: Int
) : NativeMapped {
  All(0),
  Unread(1),
  Read(2),
  Sent(3),
  Draft(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsMessageFilter {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> Unread
      2 -> Read
      3 -> Sent
      4 -> Draft
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsMessageFilter> {
    public fun setValue(newValue: SmsMessageFilter): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsMessageFilter =
        SmsMessageFilter.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsMessageFilter, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsMessageFilter =
        SmsMessageFilter.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsMessageFilter): Int = obj.value
  }
}
