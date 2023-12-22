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

@ABIMarker(PointerUpdateKind.ABI::class)
@Signature("enum(Windows.UI.Input.PointerUpdateKind;i4)")
@WinRTByReference(brClass = PointerUpdateKind.ByReference::class)
public enum class PointerUpdateKind(
  public val value: Int
) : NativeMapped {
  Other(0),
  LeftButtonPressed(1),
  LeftButtonReleased(2),
  RightButtonPressed(3),
  RightButtonReleased(4),
  MiddleButtonPressed(5),
  MiddleButtonReleased(6),
  XButton1Pressed(7),
  XButton1Released(8),
  XButton2Pressed(9),
  XButton2Released(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PointerUpdateKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> LeftButtonPressed
      2 -> LeftButtonReleased
      3 -> RightButtonPressed
      4 -> RightButtonReleased
      5 -> MiddleButtonPressed
      6 -> MiddleButtonReleased
      7 -> XButton1Pressed
      8 -> XButton1Released
      9 -> XButton2Pressed
      10 -> XButton2Released
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PointerUpdateKind> {
    public fun setValue(newValue: PointerUpdateKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PointerUpdateKind =
        PointerUpdateKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PointerUpdateKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PointerUpdateKind =
        PointerUpdateKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: PointerUpdateKind): Int = obj.value
  }
}
