package Windows.UI.Xaml.Controls

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

@ABIMarker(SwipeMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.SwipeMode;i4)")
@WinRTByReference(brClass = SwipeMode.ByReference::class)
public enum class SwipeMode(
  public val value: Int
) : NativeMapped {
  Reveal(0),
  Execute(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): SwipeMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Reveal
      1 -> Execute
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SwipeMode> {
    public fun setValue(newValue: SwipeMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SwipeMode =
        SwipeMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SwipeMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SwipeMode =
        SwipeMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: SwipeMode): Int = obj.value
  }
}
