package Windows.Graphics.Capture

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

@ABIMarker(GraphicsCaptureAccessKind.ABI::class)
@Signature("enum(Windows.Graphics.Capture.GraphicsCaptureAccessKind;i4)")
@WinRTByReference(brClass = GraphicsCaptureAccessKind.ByReference::class)
public enum class GraphicsCaptureAccessKind(
  public val value: Int
) : NativeMapped {
  Borderless(0),
  Programmatic(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GraphicsCaptureAccessKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Borderless
      1 -> Programmatic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GraphicsCaptureAccessKind>
      {
    public fun setValue(newValue: GraphicsCaptureAccessKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GraphicsCaptureAccessKind =
        GraphicsCaptureAccessKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GraphicsCaptureAccessKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GraphicsCaptureAccessKind =
        GraphicsCaptureAccessKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: GraphicsCaptureAccessKind): Int = obj.value
  }
}
