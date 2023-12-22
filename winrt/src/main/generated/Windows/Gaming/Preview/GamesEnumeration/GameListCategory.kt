package Windows.Gaming.Preview.GamesEnumeration

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

@ABIMarker(GameListCategory.ABI::class)
@Signature("enum(Windows.Gaming.Preview.GamesEnumeration.GameListCategory;i4)")
@WinRTByReference(brClass = GameListCategory.ByReference::class)
public enum class GameListCategory(
  public val value: Int
) : NativeMapped {
  Candidate(0),
  ConfirmedBySystem(1),
  ConfirmedByUser(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameListCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Candidate
      1 -> ConfirmedBySystem
      2 -> ConfirmedByUser
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameListCategory> {
    public fun setValue(newValue: GameListCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameListCategory =
        GameListCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameListCategory, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameListCategory =
        GameListCategory.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameListCategory): Int = obj.value
  }
}
