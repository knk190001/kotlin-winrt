package Windows.Media.Effects

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

@ABIMarker(MediaEffectClosedReason.ABI::class)
@Signature("enum(Windows.Media.Effects.MediaEffectClosedReason;i4)")
@WinRTByReference(brClass = MediaEffectClosedReason.ByReference::class)
public enum class MediaEffectClosedReason(
  public val value: Int
) : NativeMapped {
  Done(0),
  UnknownError(1),
  UnsupportedEncodingFormat(2),
  EffectCurrentlyUnloaded(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaEffectClosedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Done
      1 -> UnknownError
      2 -> UnsupportedEncodingFormat
      3 -> EffectCurrentlyUnloaded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaEffectClosedReason> {
    public fun setValue(newValue: MediaEffectClosedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaEffectClosedReason =
        MediaEffectClosedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaEffectClosedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaEffectClosedReason =
        MediaEffectClosedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaEffectClosedReason): Int = obj.value
  }
}
