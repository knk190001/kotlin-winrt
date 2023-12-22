package Windows.UI.Input

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

@ABIMarker(EdgeGestureKind.ABI::class)
@Signature("enum(Windows.UI.Input.EdgeGestureKind;i4)")
@WinRTByReference(brClass = EdgeGestureKind.ByReference::class)
public enum class EdgeGestureKind(
  public val value: Int
) : NativeMapped {
  Touch(0),
  Keyboard(1),
  Mouse(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EdgeGestureKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Touch
      1 -> Keyboard
      2 -> Mouse
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EdgeGestureKind> {
    public fun setValue(newValue: EdgeGestureKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EdgeGestureKind =
        EdgeGestureKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EdgeGestureKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EdgeGestureKind =
        EdgeGestureKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: EdgeGestureKind): Int = obj.value
  }
}
