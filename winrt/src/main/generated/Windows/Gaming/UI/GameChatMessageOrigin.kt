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

@ABIMarker(GameChatMessageOrigin.ABI::class)
@Signature("enum(Windows.Gaming.UI.GameChatMessageOrigin;i4)")
@WinRTByReference(brClass = GameChatMessageOrigin.ByReference::class)
public enum class GameChatMessageOrigin(
  public val value: Int
) : NativeMapped {
  Voice(0),
  Text(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameChatMessageOrigin {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Voice
      1 -> Text
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameChatMessageOrigin> {
    public fun setValue(newValue: GameChatMessageOrigin): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameChatMessageOrigin =
        GameChatMessageOrigin.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameChatMessageOrigin, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameChatMessageOrigin =
        GameChatMessageOrigin.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameChatMessageOrigin): Int = obj.value
  }
}
