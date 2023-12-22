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

@ABIMarker(ArcadeStickButtons.ABI::class)
@Signature("enum(Windows.Gaming.Input.ArcadeStickButtons;u4)")
@WinRTByReference(brClass = ArcadeStickButtons.ByReference::class)
public enum class ArcadeStickButtons(
  public val value: Int
) : NativeMapped {
  None(0),
  StickUp(1),
  StickDown(2),
  StickLeft(4),
  StickRight(8),
  Action1(16),
  Action2(32),
  Action3(64),
  Action4(128),
  Action5(256),
  Action6(512),
  Special1(1024),
  Special2(2048),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ArcadeStickButtons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> StickUp
      2 -> StickDown
      4 -> StickLeft
      8 -> StickRight
      16 -> Action1
      32 -> Action2
      64 -> Action3
      128 -> Action4
      256 -> Action5
      512 -> Action6
      1024 -> Special1
      2048 -> Special2
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ArcadeStickButtons> {
    public fun setValue(newValue: ArcadeStickButtons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ArcadeStickButtons =
        ArcadeStickButtons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ArcadeStickButtons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ArcadeStickButtons =
        ArcadeStickButtons.values()[0].fromNative(value, null)

    public override fun toNative(obj: ArcadeStickButtons): Int = obj.value
  }
}
