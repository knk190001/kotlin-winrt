package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceResourceType.ABI::class)
@Signature("enum(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceResourceType;i4)")
@WinRTByReference(brClass = AdaptiveMediaSourceResourceType.ByReference::class)
public enum class AdaptiveMediaSourceResourceType(
  public val value: Int
) : NativeMapped {
  Manifest(0),
  InitializationSegment(1),
  MediaSegment(2),
  Key(3),
  InitializationVector(4),
  MediaSegmentIndex(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AdaptiveMediaSourceResourceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Manifest
      1 -> InitializationSegment
      2 -> MediaSegment
      3 -> Key
      4 -> InitializationVector
      5 -> MediaSegmentIndex
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AdaptiveMediaSourceResourceType> {
    public fun setValue(newValue: AdaptiveMediaSourceResourceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AdaptiveMediaSourceResourceType =
        AdaptiveMediaSourceResourceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AdaptiveMediaSourceResourceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AdaptiveMediaSourceResourceType =
        AdaptiveMediaSourceResourceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AdaptiveMediaSourceResourceType): Int = obj.value
  }
}
