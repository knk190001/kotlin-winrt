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

@ABIMarker(SmsDataFormat.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsDataFormat;i4)")
@WinRTByReference(brClass = SmsDataFormat.ByReference::class)
public enum class SmsDataFormat(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  CdmaSubmit(1),
  GsmSubmit(2),
  CdmaDeliver(3),
  GsmDeliver(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsDataFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> CdmaSubmit
      2 -> GsmSubmit
      3 -> CdmaDeliver
      4 -> GsmDeliver
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsDataFormat> {
    public fun setValue(newValue: SmsDataFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsDataFormat =
        SmsDataFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsDataFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsDataFormat =
        SmsDataFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsDataFormat): Int = obj.value
  }
}
