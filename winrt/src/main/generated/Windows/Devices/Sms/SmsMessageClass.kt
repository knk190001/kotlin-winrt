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

@ABIMarker(SmsMessageClass.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsMessageClass;i4)")
@WinRTByReference(brClass = SmsMessageClass.ByReference::class)
public enum class SmsMessageClass(
  public val value: Int
) : NativeMapped {
  None(0),
  Class0(1),
  Class1(2),
  Class2(3),
  Class3(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsMessageClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Class0
      2 -> Class1
      3 -> Class2
      4 -> Class3
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsMessageClass> {
    public fun setValue(newValue: SmsMessageClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsMessageClass =
        SmsMessageClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsMessageClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsMessageClass =
        SmsMessageClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsMessageClass): Int = obj.value
  }
}
