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

@ABIMarker(GameListEntryLaunchableState.ABI::class)
@Signature("enum(Windows.Gaming.Preview.GamesEnumeration.GameListEntryLaunchableState;i4)")
@WinRTByReference(brClass = GameListEntryLaunchableState.ByReference::class)
public enum class GameListEntryLaunchableState(
  public val value: Int
) : NativeMapped {
  NotLaunchable(0),
  ByLastRunningFullPath(1),
  ByUserProvidedPath(2),
  ByTile(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameListEntryLaunchableState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotLaunchable
      1 -> ByLastRunningFullPath
      2 -> ByUserProvidedPath
      3 -> ByTile
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GameListEntryLaunchableState> {
    public fun setValue(newValue: GameListEntryLaunchableState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameListEntryLaunchableState =
        GameListEntryLaunchableState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameListEntryLaunchableState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameListEntryLaunchableState =
        GameListEntryLaunchableState.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameListEntryLaunchableState): Int = obj.value
  }
}
