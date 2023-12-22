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

@ABIMarker(MediaBreakInsertionMethod.ABI::class)
@Signature("enum(Windows.Media.Playback.MediaBreakInsertionMethod;i4)")
@WinRTByReference(brClass = MediaBreakInsertionMethod.ByReference::class)
public enum class MediaBreakInsertionMethod(
  public val value: Int
) : NativeMapped {
  Interrupt(0),
  Replace(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaBreakInsertionMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Interrupt
      1 -> Replace
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaBreakInsertionMethod>
      {
    public fun setValue(newValue: MediaBreakInsertionMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaBreakInsertionMethod =
        MediaBreakInsertionMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaBreakInsertionMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaBreakInsertionMethod =
        MediaBreakInsertionMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaBreakInsertionMethod): Int = obj.value
  }
}
