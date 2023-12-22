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

@ABIMarker(RequiredUINavigationButtons.ABI::class)
@Signature("enum(Windows.Gaming.Input.RequiredUINavigationButtons;u4)")
@WinRTByReference(brClass = RequiredUINavigationButtons.ByReference::class)
public enum class RequiredUINavigationButtons(
  public val value: Int
) : NativeMapped {
  None(0),
  Menu(1),
  View(2),
  Accept(4),
  Cancel(8),
  Up(16),
  Down(32),
  Left(64),
  Right(128),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RequiredUINavigationButtons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Menu
      2 -> View
      4 -> Accept
      8 -> Cancel
      16 -> Up
      32 -> Down
      64 -> Left
      128 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RequiredUINavigationButtons> {
    public fun setValue(newValue: RequiredUINavigationButtons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RequiredUINavigationButtons =
        RequiredUINavigationButtons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RequiredUINavigationButtons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RequiredUINavigationButtons =
        RequiredUINavigationButtons.values()[0].fromNative(value, null)

    public override fun toNative(obj: RequiredUINavigationButtons): Int = obj.value
  }
}
