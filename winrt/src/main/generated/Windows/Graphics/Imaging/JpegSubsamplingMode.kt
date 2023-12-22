package Windows.Graphics.Imaging

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

@ABIMarker(JpegSubsamplingMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.JpegSubsamplingMode;i4)")
@WinRTByReference(brClass = JpegSubsamplingMode.ByReference::class)
public enum class JpegSubsamplingMode(
  public val value: Int
) : NativeMapped {
  Default(0),
  Y4Cb2Cr0(1),
  Y4Cb2Cr2(2),
  Y4Cb4Cr4(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      JpegSubsamplingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Y4Cb2Cr0
      2 -> Y4Cb2Cr2
      3 -> Y4Cb4Cr4
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<JpegSubsamplingMode> {
    public fun setValue(newValue: JpegSubsamplingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): JpegSubsamplingMode =
        JpegSubsamplingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<JpegSubsamplingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): JpegSubsamplingMode =
        JpegSubsamplingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: JpegSubsamplingMode): Int = obj.value
  }
}
