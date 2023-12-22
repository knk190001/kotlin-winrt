package Windows.Media.ClosedCaptioning

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

@ABIMarker(ClosedCaptionOpacity.ABI::class)
@Signature("enum(Windows.Media.ClosedCaptioning.ClosedCaptionOpacity;i4)")
@WinRTByReference(brClass = ClosedCaptionOpacity.ByReference::class)
public enum class ClosedCaptionOpacity(
  public val value: Int
) : NativeMapped {
  Default(0),
  OneHundredPercent(1),
  SeventyFivePercent(2),
  TwentyFivePercent(3),
  ZeroPercent(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ClosedCaptionOpacity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> OneHundredPercent
      2 -> SeventyFivePercent
      3 -> TwentyFivePercent
      4 -> ZeroPercent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ClosedCaptionOpacity> {
    public fun setValue(newValue: ClosedCaptionOpacity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ClosedCaptionOpacity =
        ClosedCaptionOpacity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ClosedCaptionOpacity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ClosedCaptionOpacity =
        ClosedCaptionOpacity.values()[0].fromNative(value, null)

    public override fun toNative(obj: ClosedCaptionOpacity): Int = obj.value
  }
}
