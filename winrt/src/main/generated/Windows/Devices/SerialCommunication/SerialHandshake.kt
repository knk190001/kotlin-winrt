package Windows.Devices.SerialCommunication

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

@ABIMarker(SerialHandshake.ABI::class)
@Signature("enum(Windows.Devices.SerialCommunication.SerialHandshake;i4)")
@WinRTByReference(brClass = SerialHandshake.ByReference::class)
public enum class SerialHandshake(
  public val value: Int
) : NativeMapped {
  None(0),
  RequestToSend(1),
  XOnXOff(2),
  RequestToSendXOnXOff(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SerialHandshake {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> RequestToSend
      2 -> XOnXOff
      3 -> RequestToSendXOnXOff
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SerialHandshake> {
    public fun setValue(newValue: SerialHandshake): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SerialHandshake =
        SerialHandshake.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SerialHandshake, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SerialHandshake =
        SerialHandshake.values()[0].fromNative(value, null)

    public override fun toNative(obj: SerialHandshake): Int = obj.value
  }
}
