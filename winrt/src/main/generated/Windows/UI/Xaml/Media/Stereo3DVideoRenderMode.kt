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

@ABIMarker(Stereo3DVideoRenderMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Stereo3DVideoRenderMode;i4)")
@WinRTByReference(brClass = Stereo3DVideoRenderMode.ByReference::class)
public enum class Stereo3DVideoRenderMode(
  public val value: Int
) : NativeMapped {
  Mono(0),
  Stereo(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Stereo3DVideoRenderMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Mono
      1 -> Stereo
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Stereo3DVideoRenderMode> {
    public fun setValue(newValue: Stereo3DVideoRenderMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Stereo3DVideoRenderMode =
        Stereo3DVideoRenderMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Stereo3DVideoRenderMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Stereo3DVideoRenderMode =
        Stereo3DVideoRenderMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: Stereo3DVideoRenderMode): Int = obj.value
  }
}
