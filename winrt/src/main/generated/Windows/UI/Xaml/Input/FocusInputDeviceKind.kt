package Windows.UI.Xaml.Input

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

@ABIMarker(FocusInputDeviceKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.FocusInputDeviceKind;i4)")
@WinRTByReference(brClass = FocusInputDeviceKind.ByReference::class)
public enum class FocusInputDeviceKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Mouse(1),
  Touch(2),
  Pen(3),
  Keyboard(4),
  GameController(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FocusInputDeviceKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Mouse
      2 -> Touch
      3 -> Pen
      4 -> Keyboard
      5 -> GameController
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FocusInputDeviceKind> {
    public fun setValue(newValue: FocusInputDeviceKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FocusInputDeviceKind =
        FocusInputDeviceKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FocusInputDeviceKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FocusInputDeviceKind =
        FocusInputDeviceKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: FocusInputDeviceKind): Int = obj.value
  }
}
