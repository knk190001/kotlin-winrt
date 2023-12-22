package Windows.Devices.Lights

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

@ABIMarker(LampArrayKind.ABI::class)
@Signature("enum(Windows.Devices.Lights.LampArrayKind;i4)")
@WinRTByReference(brClass = LampArrayKind.ByReference::class)
public enum class LampArrayKind(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Keyboard(1),
  Mouse(2),
  GameController(3),
  Peripheral(4),
  Scene(5),
  Notification(6),
  Chassis(7),
  Wearable(8),
  Furniture(9),
  Art(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LampArrayKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Keyboard
      2 -> Mouse
      3 -> GameController
      4 -> Peripheral
      5 -> Scene
      6 -> Notification
      7 -> Chassis
      8 -> Wearable
      9 -> Furniture
      10 -> Art
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LampArrayKind> {
    public fun setValue(newValue: LampArrayKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LampArrayKind =
        LampArrayKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LampArrayKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LampArrayKind =
        LampArrayKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: LampArrayKind): Int = obj.value
  }
}
