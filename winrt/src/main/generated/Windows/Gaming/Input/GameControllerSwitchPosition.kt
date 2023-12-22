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

@ABIMarker(GameControllerSwitchPosition.ABI::class)
@Signature("enum(Windows.Gaming.Input.GameControllerSwitchPosition;i4)")
@WinRTByReference(brClass = GameControllerSwitchPosition.ByReference::class)
public enum class GameControllerSwitchPosition(
  public val value: Int
) : NativeMapped {
  Center(0),
  Up(1),
  UpRight(2),
  Right(3),
  DownRight(4),
  Down(5),
  DownLeft(6),
  Left(7),
  UpLeft(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameControllerSwitchPosition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Center
      1 -> Up
      2 -> UpRight
      3 -> Right
      4 -> DownRight
      5 -> Down
      6 -> DownLeft
      7 -> Left
      8 -> UpLeft
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GameControllerSwitchPosition> {
    public fun setValue(newValue: GameControllerSwitchPosition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameControllerSwitchPosition =
        GameControllerSwitchPosition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameControllerSwitchPosition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameControllerSwitchPosition =
        GameControllerSwitchPosition.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameControllerSwitchPosition): Int = obj.value
  }
}
