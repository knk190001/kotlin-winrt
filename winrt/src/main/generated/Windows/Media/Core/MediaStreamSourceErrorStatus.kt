package Windows.Media.Core

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

@ABIMarker(MediaStreamSourceErrorStatus.ABI::class)
@Signature("enum(Windows.Media.Core.MediaStreamSourceErrorStatus;i4)")
@WinRTByReference(brClass = MediaStreamSourceErrorStatus.ByReference::class)
public enum class MediaStreamSourceErrorStatus(
  public val value: Int
) : NativeMapped {
  Other(0),
  OutOfMemory(1),
  FailedToOpenFile(2),
  FailedToConnectToServer(3),
  ConnectionToServerLost(4),
  UnspecifiedNetworkError(5),
  DecodeError(6),
  UnsupportedMediaFormat(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaStreamSourceErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> OutOfMemory
      2 -> FailedToOpenFile
      3 -> FailedToConnectToServer
      4 -> ConnectionToServerLost
      5 -> UnspecifiedNetworkError
      6 -> DecodeError
      7 -> UnsupportedMediaFormat
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaStreamSourceErrorStatus> {
    public fun setValue(newValue: MediaStreamSourceErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaStreamSourceErrorStatus =
        MediaStreamSourceErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaStreamSourceErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaStreamSourceErrorStatus =
        MediaStreamSourceErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaStreamSourceErrorStatus): Int = obj.value
  }
}
