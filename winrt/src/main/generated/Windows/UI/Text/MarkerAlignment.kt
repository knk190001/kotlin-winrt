package Windows.UI.Text

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

@ABIMarker(MarkerAlignment.ABI::class)
@Signature("enum(Windows.UI.Text.MarkerAlignment;i4)")
@WinRTByReference(brClass = MarkerAlignment.ByReference::class)
public enum class MarkerAlignment(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Left(1),
  Center(2),
  Right(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MarkerAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Left
      2 -> Center
      3 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MarkerAlignment> {
    public fun setValue(newValue: MarkerAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MarkerAlignment =
        MarkerAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MarkerAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MarkerAlignment =
        MarkerAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: MarkerAlignment): Int = obj.value
  }
}
