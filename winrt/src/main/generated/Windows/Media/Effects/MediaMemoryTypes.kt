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

@ABIMarker(MediaMemoryTypes.ABI::class)
@Signature("enum(Windows.Media.Effects.MediaMemoryTypes;i4)")
@WinRTByReference(brClass = MediaMemoryTypes.ByReference::class)
public enum class MediaMemoryTypes(
  public val value: Int
) : NativeMapped {
  Gpu(0),
  Cpu(1),
  GpuAndCpu(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaMemoryTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Gpu
      1 -> Cpu
      2 -> GpuAndCpu
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaMemoryTypes> {
    public fun setValue(newValue: MediaMemoryTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaMemoryTypes =
        MediaMemoryTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaMemoryTypes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaMemoryTypes =
        MediaMemoryTypes.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaMemoryTypes): Int = obj.value
  }
}
