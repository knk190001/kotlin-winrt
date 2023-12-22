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

@ABIMarker(SmsFilterActionType.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsFilterActionType;i4)")
@WinRTByReference(brClass = SmsFilterActionType.ByReference::class)
public enum class SmsFilterActionType(
  public val value: Int
) : NativeMapped {
  AcceptImmediately(0),
  Drop(1),
  Peek(2),
  Accept(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsFilterActionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AcceptImmediately
      1 -> Drop
      2 -> Peek
      3 -> Accept
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsFilterActionType> {
    public fun setValue(newValue: SmsFilterActionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsFilterActionType =
        SmsFilterActionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsFilterActionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsFilterActionType =
        SmsFilterActionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsFilterActionType): Int = obj.value
  }
}
