package Windows.Devices.Sensors

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

@ABIMarker(SimpleOrientation.ABI::class)
@Signature("enum(Windows.Devices.Sensors.SimpleOrientation;i4)")
@WinRTByReference(brClass = SimpleOrientation.ByReference::class)
public enum class SimpleOrientation(
  public val value: Int
) : NativeMapped {
  NotRotated(0),
  Rotated90DegreesCounterclockwise(1),
  Rotated180DegreesCounterclockwise(2),
  Rotated270DegreesCounterclockwise(3),
  Faceup(4),
  Facedown(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SimpleOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotRotated
      1 -> Rotated90DegreesCounterclockwise
      2 -> Rotated180DegreesCounterclockwise
      3 -> Rotated270DegreesCounterclockwise
      4 -> Faceup
      5 -> Facedown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SimpleOrientation> {
    public fun setValue(newValue: SimpleOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SimpleOrientation =
        SimpleOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SimpleOrientation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SimpleOrientation =
        SimpleOrientation.values()[0].fromNative(value, null)

    public override fun toNative(obj: SimpleOrientation): Int = obj.value
  }
}
