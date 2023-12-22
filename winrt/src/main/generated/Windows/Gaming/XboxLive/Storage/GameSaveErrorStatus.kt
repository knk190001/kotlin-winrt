package Windows.Gaming.XboxLive.Storage

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

@ABIMarker(GameSaveErrorStatus.ABI::class)
@Signature("enum(Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus;i4)")
@WinRTByReference(brClass = GameSaveErrorStatus.ByReference::class)
public enum class GameSaveErrorStatus(
  public val value: Int
) : NativeMapped {
  Ok(0),
  Abort(-2147467260),
  InvalidContainerName(-2138898431),
  NoAccess(-2138898430),
  OutOfLocalStorage(-2138898429),
  UserCanceled(-2138898428),
  UpdateTooBig(-2138898427),
  QuotaExceeded(-2138898426),
  ProvidedBufferTooSmall(-2138898425),
  BlobNotFound(-2138898424),
  NoXboxLiveInfo(-2138898423),
  ContainerNotInSync(-2138898422),
  ContainerSyncFailed(-2138898421),
  UserHasNoXboxLiveInfo(-2138898420),
  ObjectExpired(-2138898419),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GameSaveErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ok
      -2147467260 -> Abort
      -2138898431 -> InvalidContainerName
      -2138898430 -> NoAccess
      -2138898429 -> OutOfLocalStorage
      -2138898428 -> UserCanceled
      -2138898427 -> UpdateTooBig
      -2138898426 -> QuotaExceeded
      -2138898425 -> ProvidedBufferTooSmall
      -2138898424 -> BlobNotFound
      -2138898423 -> NoXboxLiveInfo
      -2138898422 -> ContainerNotInSync
      -2138898421 -> ContainerSyncFailed
      -2138898420 -> UserHasNoXboxLiveInfo
      -2138898419 -> ObjectExpired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GameSaveErrorStatus> {
    public fun setValue(newValue: GameSaveErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GameSaveErrorStatus =
        GameSaveErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GameSaveErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GameSaveErrorStatus =
        GameSaveErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GameSaveErrorStatus): Int = obj.value
  }
}
