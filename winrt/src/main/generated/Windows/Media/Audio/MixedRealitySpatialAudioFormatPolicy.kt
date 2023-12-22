package Windows.Media.Audio

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

@ABIMarker(MixedRealitySpatialAudioFormatPolicy.ABI::class)
@Signature("enum(Windows.Media.Audio.MixedRealitySpatialAudioFormatPolicy;i4)")
@WinRTByReference(brClass = MixedRealitySpatialAudioFormatPolicy.ByReference::class)
public enum class MixedRealitySpatialAudioFormatPolicy(
  public val value: Int
) : NativeMapped {
  UseMixedRealityDefaultSpatialAudioFormat(0),
  UseDeviceConfigurationDefaultSpatialAudioFormat(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MixedRealitySpatialAudioFormatPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UseMixedRealityDefaultSpatialAudioFormat
      1 -> UseDeviceConfigurationDefaultSpatialAudioFormat
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MixedRealitySpatialAudioFormatPolicy> {
    public fun setValue(newValue: MixedRealitySpatialAudioFormatPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MixedRealitySpatialAudioFormatPolicy =
        MixedRealitySpatialAudioFormatPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MixedRealitySpatialAudioFormatPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MixedRealitySpatialAudioFormatPolicy =
        MixedRealitySpatialAudioFormatPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: MixedRealitySpatialAudioFormatPolicy): Int = obj.value
  }
}
