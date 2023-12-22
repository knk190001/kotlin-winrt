package Windows.UI.Xaml.Controls

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

@ABIMarker(InkToolbarTool.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.InkToolbarTool;i4)")
@WinRTByReference(brClass = InkToolbarTool.ByReference::class)
public enum class InkToolbarTool(
  public val value: Int
) : NativeMapped {
  BallpointPen(0),
  Pencil(1),
  Highlighter(2),
  Eraser(3),
  CustomPen(4),
  CustomTool(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkToolbarTool {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> BallpointPen
      1 -> Pencil
      2 -> Highlighter
      3 -> Eraser
      4 -> CustomPen
      5 -> CustomTool
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkToolbarTool> {
    public fun setValue(newValue: InkToolbarTool): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkToolbarTool =
        InkToolbarTool.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkToolbarTool, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkToolbarTool =
        InkToolbarTool.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkToolbarTool): Int = obj.value
  }
}
