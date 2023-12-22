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

@ABIMarker(ClosedCaptionSize.ABI::class)
@Signature("enum(Windows.Media.ClosedCaptioning.ClosedCaptionSize;i4)")
@WinRTByReference(brClass = ClosedCaptionSize.ByReference::class)
public enum class ClosedCaptionSize(
  public val value: Int
) : NativeMapped {
  Default(0),
  FiftyPercent(1),
  OneHundredPercent(2),
  OneHundredFiftyPercent(3),
  TwoHundredPercent(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ClosedCaptionSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> FiftyPercent
      2 -> OneHundredPercent
      3 -> OneHundredFiftyPercent
      4 -> TwoHundredPercent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ClosedCaptionSize> {
    public fun setValue(newValue: ClosedCaptionSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ClosedCaptionSize =
        ClosedCaptionSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ClosedCaptionSize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ClosedCaptionSize =
        ClosedCaptionSize.values()[0].fromNative(value, null)

    public override fun toNative(obj: ClosedCaptionSize): Int = obj.value
  }
}
