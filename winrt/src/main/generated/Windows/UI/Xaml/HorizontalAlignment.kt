package Windows.UI.Xaml

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

@ABIMarker(HorizontalAlignment.ABI::class)
@Signature("enum(Windows.UI.Xaml.HorizontalAlignment;i4)")
@WinRTByReference(brClass = HorizontalAlignment.ByReference::class)
public enum class HorizontalAlignment(
  public val value: Int
) : NativeMapped {
  Left(0),
  Center(1),
  Right(2),
  Stretch(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HorizontalAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Left
      1 -> Center
      2 -> Right
      3 -> Stretch
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HorizontalAlignment> {
    public fun setValue(newValue: HorizontalAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HorizontalAlignment =
        HorizontalAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HorizontalAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HorizontalAlignment =
        HorizontalAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: HorizontalAlignment): Int = obj.value
  }
}
