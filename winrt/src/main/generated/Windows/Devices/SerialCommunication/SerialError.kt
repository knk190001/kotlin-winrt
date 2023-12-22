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

@ABIMarker(SerialError.ABI::class)
@Signature("enum(Windows.Devices.SerialCommunication.SerialError;i4)")
@WinRTByReference(brClass = SerialError.ByReference::class)
public enum class SerialError(
  public val value: Int
) : NativeMapped {
  Frame(0),
  BufferOverrun(1),
  ReceiveFull(2),
  ReceiveParity(3),
  TransmitFull(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SerialError {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Frame
      1 -> BufferOverrun
      2 -> ReceiveFull
      3 -> ReceiveParity
      4 -> TransmitFull
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SerialError> {
    public fun setValue(newValue: SerialError): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SerialError =
        SerialError.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SerialError, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SerialError =
        SerialError.values()[0].fromNative(value, null)

    public override fun toNative(obj: SerialError): Int = obj.value
  }
}
