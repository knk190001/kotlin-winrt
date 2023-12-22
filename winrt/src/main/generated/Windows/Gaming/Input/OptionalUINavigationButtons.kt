package Windows.Gaming.Input

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

@ABIMarker(OptionalUINavigationButtons.ABI::class)
@Signature("enum(Windows.Gaming.Input.OptionalUINavigationButtons;u4)")
@WinRTByReference(brClass = OptionalUINavigationButtons.ByReference::class)
public enum class OptionalUINavigationButtons(
  public val value: Int
) : NativeMapped {
  None(0),
  Context1(1),
  Context2(2),
  Context3(4),
  Context4(8),
  PageUp(16),
  PageDown(32),
  PageLeft(64),
  PageRight(128),
  ScrollUp(256),
  ScrollDown(512),
  ScrollLeft(1024),
  ScrollRight(2048),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      OptionalUINavigationButtons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Context1
      2 -> Context2
      4 -> Context3
      8 -> Context4
      16 -> PageUp
      32 -> PageDown
      64 -> PageLeft
      128 -> PageRight
      256 -> ScrollUp
      512 -> ScrollDown
      1024 -> ScrollLeft
      2048 -> ScrollRight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<OptionalUINavigationButtons> {
    public fun setValue(newValue: OptionalUINavigationButtons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): OptionalUINavigationButtons =
        OptionalUINavigationButtons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<OptionalUINavigationButtons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): OptionalUINavigationButtons =
        OptionalUINavigationButtons.values()[0].fromNative(value, null)

    public override fun toNative(obj: OptionalUINavigationButtons): Int = obj.value
  }
}
