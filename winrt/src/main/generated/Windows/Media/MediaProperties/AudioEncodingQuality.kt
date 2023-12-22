package Windows.Media.MediaProperties

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

@ABIMarker(AudioEncodingQuality.ABI::class)
@Signature("enum(Windows.Media.MediaProperties.AudioEncodingQuality;i4)")
@WinRTByReference(brClass = AudioEncodingQuality.ByReference::class)
public enum class AudioEncodingQuality(
  public val value: Int
) : NativeMapped {
  Auto(0),
  High(1),
  Medium(2),
  Low(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioEncodingQuality {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> High
      2 -> Medium
      3 -> Low
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AudioEncodingQuality> {
    public fun setValue(newValue: AudioEncodingQuality): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioEncodingQuality =
        AudioEncodingQuality.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioEncodingQuality, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioEncodingQuality =
        AudioEncodingQuality.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioEncodingQuality): Int = obj.value
  }
}
