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

@ABIMarker(SmsMessageType.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsMessageType;i4)")
@WinRTByReference(brClass = SmsMessageType.ByReference::class)
public enum class SmsMessageType(
  public val value: Int
) : NativeMapped {
  Binary(0),
  Text(1),
  Wap(2),
  App(3),
  Broadcast(4),
  Voicemail(5),
  Status(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsMessageType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Binary
      1 -> Text
      2 -> Wap
      3 -> App
      4 -> Broadcast
      5 -> Voicemail
      6 -> Status
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsMessageType> {
    public fun setValue(newValue: SmsMessageType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsMessageType =
        SmsMessageType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsMessageType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsMessageType =
        SmsMessageType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsMessageType): Int = obj.value
  }
}
