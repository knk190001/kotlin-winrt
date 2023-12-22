package Windows.Gaming.Input

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

@ABIMarker(GamepadButtons.ABI::class)
@Signature("enum(Windows.Gaming.Input.GamepadButtons;u4)")
@WinRTByReference(brClass = GamepadButtons.ByReference::class)
public enum class GamepadButtons(
  public val value: Int
) : NativeMapped {
  None(0),
  Menu(1),
  View(2),
  A(4),
  B(8),
  X(16),
  Y(32),
  DPadUp(64),
  DPadDown(128),
  DPadLeft(256),
  DPadRight(512),
  LeftShoulder(1024),
  RightShoulder(2048),
  LeftThumbstick(4096),
  RightThumbstick(8192),
  Paddle1(16384),
  Paddle2(32768),
  Paddle3(65536),
  Paddle4(131072),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GamepadButtons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Menu
      2 -> View
      4 -> A
      8 -> B
      16 -> X
      32 -> Y
      64 -> DPadUp
      128 -> DPadDown
      256 -> DPadLeft
      512 -> DPadRight
      1024 -> LeftShoulder
      2048 -> RightShoulder
      4096 -> LeftThumbstick
      8192 -> RightThumbstick
      16384 -> Paddle1
      32768 -> Paddle2
      65536 -> Paddle3
      131072 -> Paddle4
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GamepadButtons> {
    public fun setValue(newValue: GamepadButtons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GamepadButtons =
        GamepadButtons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GamepadButtons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GamepadButtons =
        GamepadButtons.values()[0].fromNative(value, null)

    public override fun toNative(obj: GamepadButtons): Int = obj.value
  }
}
