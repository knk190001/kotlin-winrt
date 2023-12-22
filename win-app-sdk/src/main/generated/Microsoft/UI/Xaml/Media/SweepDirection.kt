package Microsoft.UI.Xaml.Media

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

@ABIMarker(SweepDirection.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.SweepDirection;i4)")
@WinRTByReference(brClass = SweepDirection.ByReference::class)
public enum class SweepDirection(
  public val value: Int
) : NativeMapped {
  Counterclockwise(0),
  Clockwise(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SweepDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Counterclockwise
      1 -> Clockwise
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SweepDirection> {
    public fun setValue(newValue: SweepDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SweepDirection =
        SweepDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SweepDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SweepDirection =
        SweepDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: SweepDirection): Int = obj.value
  }
}
