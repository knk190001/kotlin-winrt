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

@ABIMarker(SerialStopBitCount.ABI::class)
@Signature("enum(Windows.Devices.SerialCommunication.SerialStopBitCount;i4)")
@WinRTByReference(brClass = SerialStopBitCount.ByReference::class)
public enum class SerialStopBitCount(
  public val value: Int
) : NativeMapped {
  One(0),
  OnePointFive(1),
  Two(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SerialStopBitCount {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> One
      1 -> OnePointFive
      2 -> Two
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SerialStopBitCount> {
    public fun setValue(newValue: SerialStopBitCount): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SerialStopBitCount =
        SerialStopBitCount.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SerialStopBitCount, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SerialStopBitCount =
        SerialStopBitCount.values()[0].fromNative(value, null)

    public override fun toNative(obj: SerialStopBitCount): Int = obj.value
  }
}
