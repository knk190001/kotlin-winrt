package Windows.Gaming.UI

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

@ABIMarker(GameChatOverlayPosition.ABI::class)
@Signature("enum(Windows.Gaming.UI.GameChatOverlayPosition;i4)")
@WinRTByReference(brClass = GameChatOverlayPosition.ByReference::class)
public enum class GameChatOverlayPosition(
  public val value: Int
) : NativeMapped {
  BottomCenter(0),
  BottomLeft(1),
  BottomRight(2),
  MiddleRight(3),
  MiddleLeft(4),
  TopCenter(5),
  TopLeft(6),
  TopRight(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameChatOverlayPosition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> BottomCenter
      1 -> BottomLeft
      2 -> BottomRight
      3 -> MiddleRight
      4 -> MiddleLeft
      5 -> TopCenter
      6 -> TopLeft
      7 -> TopRight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameChatOverlayPosition> {
    public fun setValue(newValue: GameChatOverlayPosition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameChatOverlayPosition =
        GameChatOverlayPosition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameChatOverlayPosition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameChatOverlayPosition =
        GameChatOverlayPosition.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameChatOverlayPosition): Int = obj.value
  }
}
