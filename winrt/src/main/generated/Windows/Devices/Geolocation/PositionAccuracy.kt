package Windows.Devices.Geolocation

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

@ABIMarker(PositionAccuracy.ABI::class)
@Signature("enum(Windows.Devices.Geolocation.PositionAccuracy;i4)")
@WinRTByReference(brClass = PositionAccuracy.ByReference::class)
public enum class PositionAccuracy(
  public val value: Int
) : NativeMapped {
  Default(0),
  High(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PositionAccuracy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PositionAccuracy> {
    public fun setValue(newValue: PositionAccuracy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PositionAccuracy =
        PositionAccuracy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PositionAccuracy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PositionAccuracy =
        PositionAccuracy.values()[0].fromNative(value, null)

    public override fun toNative(obj: PositionAccuracy): Int = obj.value
  }
}
