package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ScrollingInputKinds.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollingInputKinds;u4)")
@WinRTByReference(brClass = ScrollingInputKinds.ByReference::class)
public enum class ScrollingInputKinds(
  public val value: Int
) : NativeMapped {
  None(0),
  Touch(1),
  Pen(2),
  MouseWheel(4),
  Keyboard(8),
  Gamepad(16),
  All(255),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollingInputKinds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Touch
      2 -> Pen
      4 -> MouseWheel
      8 -> Keyboard
      16 -> Gamepad
      255 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollingInputKinds> {
    public fun setValue(newValue: ScrollingInputKinds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollingInputKinds =
        ScrollingInputKinds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollingInputKinds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollingInputKinds =
        ScrollingInputKinds.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollingInputKinds): Int = obj.value
  }
}
