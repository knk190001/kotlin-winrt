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

@ABIMarker(SerialParity.ABI::class)
@Signature("enum(Windows.Devices.SerialCommunication.SerialParity;i4)")
@WinRTByReference(brClass = SerialParity.ByReference::class)
public enum class SerialParity(
  public val value: Int
) : NativeMapped {
  None(0),
  Odd(1),
  Even(2),
  Mark(3),
  Space(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SerialParity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Odd
      2 -> Even
      3 -> Mark
      4 -> Space
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SerialParity> {
    public fun setValue(newValue: SerialParity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SerialParity =
        SerialParity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SerialParity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SerialParity =
        SerialParity.values()[0].fromNative(value, null)

    public override fun toNative(obj: SerialParity): Int = obj.value
  }
}
