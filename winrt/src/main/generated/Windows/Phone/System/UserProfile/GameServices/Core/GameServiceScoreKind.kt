package Windows.Phone.System.UserProfile.GameServices.Core

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

@ABIMarker(GameServiceScoreKind.ABI::class)
@Signature("enum(Windows.Phone.System.UserProfile.GameServices.Core.GameServiceScoreKind;i4)")
@WinRTByReference(brClass = GameServiceScoreKind.ByReference::class)
public enum class GameServiceScoreKind(
  public val value: Int
) : NativeMapped {
  Number(0),
  Time(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameServiceScoreKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Number
      1 -> Time
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameServiceScoreKind> {
    public fun setValue(newValue: GameServiceScoreKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameServiceScoreKind =
        GameServiceScoreKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameServiceScoreKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameServiceScoreKind =
        GameServiceScoreKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameServiceScoreKind): Int = obj.value
  }
}
