package Windows.UI.Xaml.Media

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

@ABIMarker(MediaCanPlayResponse.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.MediaCanPlayResponse;i4)")
@WinRTByReference(brClass = MediaCanPlayResponse.ByReference::class)
public enum class MediaCanPlayResponse(
  public val value: Int
) : NativeMapped {
  NotSupported(0),
  Maybe(1),
  Probably(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaCanPlayResponse {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotSupported
      1 -> Maybe
      2 -> Probably
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaCanPlayResponse> {
    public fun setValue(newValue: MediaCanPlayResponse): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaCanPlayResponse =
        MediaCanPlayResponse.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaCanPlayResponse, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaCanPlayResponse =
        MediaCanPlayResponse.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaCanPlayResponse): Int = obj.value
  }
}
