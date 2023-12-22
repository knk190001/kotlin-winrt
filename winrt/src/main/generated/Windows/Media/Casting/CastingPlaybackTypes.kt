package Windows.Media.Casting

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

@ABIMarker(CastingPlaybackTypes.ABI::class)
@Signature("enum(Windows.Media.Casting.CastingPlaybackTypes;u4)")
@WinRTByReference(brClass = CastingPlaybackTypes.ByReference::class)
public enum class CastingPlaybackTypes(
  public val value: Int
) : NativeMapped {
  None(0),
  Audio(1),
  Video(2),
  Picture(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CastingPlaybackTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Audio
      2 -> Video
      4 -> Picture
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CastingPlaybackTypes> {
    public fun setValue(newValue: CastingPlaybackTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CastingPlaybackTypes =
        CastingPlaybackTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CastingPlaybackTypes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CastingPlaybackTypes =
        CastingPlaybackTypes.values()[0].fromNative(value, null)

    public override fun toNative(obj: CastingPlaybackTypes): Int = obj.value
  }
}
