package Windows.Media.Playlists

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

@ABIMarker(PlaylistFormat.ABI::class)
@Signature("enum(Windows.Media.Playlists.PlaylistFormat;i4)")
@WinRTByReference(brClass = PlaylistFormat.ByReference::class)
public enum class PlaylistFormat(
  public val value: Int
) : NativeMapped {
  WindowsMedia(0),
  Zune(1),
  M3u(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlaylistFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> WindowsMedia
      1 -> Zune
      2 -> M3u
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlaylistFormat> {
    public fun setValue(newValue: PlaylistFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlaylistFormat =
        PlaylistFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlaylistFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlaylistFormat =
        PlaylistFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlaylistFormat): Int = obj.value
  }
}
