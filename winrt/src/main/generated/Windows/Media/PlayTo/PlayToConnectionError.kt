package Windows.Media.PlayTo

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

@ABIMarker(PlayToConnectionError.ABI::class)
@Signature("enum(Windows.Media.PlayTo.PlayToConnectionError;i4)")
@WinRTByReference(brClass = PlayToConnectionError.ByReference::class)
public enum class PlayToConnectionError(
  public val value: Int
) : NativeMapped {
  None(0),
  DeviceNotResponding(1),
  DeviceError(2),
  DeviceLocked(3),
  ProtectedPlaybackFailed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlayToConnectionError {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> DeviceNotResponding
      2 -> DeviceError
      3 -> DeviceLocked
      4 -> ProtectedPlaybackFailed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlayToConnectionError> {
    public fun setValue(newValue: PlayToConnectionError): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlayToConnectionError =
        PlayToConnectionError.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlayToConnectionError, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlayToConnectionError =
        PlayToConnectionError.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlayToConnectionError): Int = obj.value
  }
}
