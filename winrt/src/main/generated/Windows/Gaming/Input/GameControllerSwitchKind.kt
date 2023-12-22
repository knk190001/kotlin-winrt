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

@ABIMarker(GameControllerSwitchKind.ABI::class)
@Signature("enum(Windows.Gaming.Input.GameControllerSwitchKind;i4)")
@WinRTByReference(brClass = GameControllerSwitchKind.ByReference::class)
public enum class GameControllerSwitchKind(
  public val value: Int
) : NativeMapped {
  TwoWay(0),
  FourWay(1),
  EightWay(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameControllerSwitchKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> TwoWay
      1 -> FourWay
      2 -> EightWay
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameControllerSwitchKind>
      {
    public fun setValue(newValue: GameControllerSwitchKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameControllerSwitchKind =
        GameControllerSwitchKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameControllerSwitchKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameControllerSwitchKind =
        GameControllerSwitchKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameControllerSwitchKind): Int = obj.value
  }
}
