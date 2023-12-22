package Windows.Media.Playback

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

@ABIMarker(MediaPlaybackItemErrorCode.ABI::class)
@Signature("enum(Windows.Media.Playback.MediaPlaybackItemErrorCode;i4)")
@WinRTByReference(brClass = MediaPlaybackItemErrorCode.ByReference::class)
public enum class MediaPlaybackItemErrorCode(
  public val value: Int
) : NativeMapped {
  None(0),
  Aborted(1),
  NetworkError(2),
  DecodeError(3),
  SourceNotSupportedError(4),
  EncryptionError(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaPlaybackItemErrorCode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Aborted
      2 -> NetworkError
      3 -> DecodeError
      4 -> SourceNotSupportedError
      5 -> EncryptionError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MediaPlaybackItemErrorCode> {
    public fun setValue(newValue: MediaPlaybackItemErrorCode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaPlaybackItemErrorCode =
        MediaPlaybackItemErrorCode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaPlaybackItemErrorCode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaPlaybackItemErrorCode =
        MediaPlaybackItemErrorCode.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaPlaybackItemErrorCode): Int = obj.value
  }
}
