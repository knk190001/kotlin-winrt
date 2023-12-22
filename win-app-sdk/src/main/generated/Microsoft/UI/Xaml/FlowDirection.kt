package Microsoft.UI.Xaml

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

@ABIMarker(FlowDirection.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.FlowDirection;i4)")
@WinRTByReference(brClass = FlowDirection.ByReference::class)
public enum class FlowDirection(
  public val value: Int
) : NativeMapped {
  LeftToRight(0),
  RightToLeft(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FlowDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LeftToRight
      1 -> RightToLeft
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FlowDirection> {
    public fun setValue(newValue: FlowDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FlowDirection =
        FlowDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FlowDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FlowDirection =
        FlowDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: FlowDirection): Int = obj.value
  }
}
