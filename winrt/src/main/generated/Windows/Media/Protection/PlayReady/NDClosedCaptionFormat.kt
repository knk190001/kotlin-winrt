package Windows.Media.Protection.PlayReady

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

@ABIMarker(NDClosedCaptionFormat.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.NDClosedCaptionFormat;i4)")
@WinRTByReference(brClass = NDClosedCaptionFormat.ByReference::class)
public enum class NDClosedCaptionFormat(
  public val value: Int
) : NativeMapped {
  ATSC(0),
  SCTE20(1),
  Unknown(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NDClosedCaptionFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ATSC
      1 -> SCTE20
      2 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NDClosedCaptionFormat> {
    public fun setValue(newValue: NDClosedCaptionFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NDClosedCaptionFormat =
        NDClosedCaptionFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NDClosedCaptionFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NDClosedCaptionFormat =
        NDClosedCaptionFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: NDClosedCaptionFormat): Int = obj.value
  }
}
