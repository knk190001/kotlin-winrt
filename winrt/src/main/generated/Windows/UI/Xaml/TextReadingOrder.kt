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

@ABIMarker(TextReadingOrder.ABI::class)
@Signature("enum(Windows.UI.Xaml.TextReadingOrder;i4)")
@WinRTByReference(brClass = TextReadingOrder.ByReference::class)
public enum class TextReadingOrder(
  public val value: Int
) : NativeMapped {
  Default(0),
  UseFlowDirection(0),
  DetectFromContent(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextReadingOrder {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      0 -> UseFlowDirection
      1 -> DetectFromContent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextReadingOrder> {
    public fun setValue(newValue: TextReadingOrder): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextReadingOrder =
        TextReadingOrder.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextReadingOrder, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextReadingOrder =
        TextReadingOrder.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextReadingOrder): Int = obj.value
  }
}
