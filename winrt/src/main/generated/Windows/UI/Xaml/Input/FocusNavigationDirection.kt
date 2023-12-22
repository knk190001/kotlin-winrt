package Windows.UI.Xaml.Input

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

@ABIMarker(FocusNavigationDirection.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.FocusNavigationDirection;i4)")
@WinRTByReference(brClass = FocusNavigationDirection.ByReference::class)
public enum class FocusNavigationDirection(
  public val value: Int
) : NativeMapped {
  Next(0),
  Previous(1),
  Up(2),
  Down(3),
  Left(4),
  Right(5),
  None(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FocusNavigationDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Next
      1 -> Previous
      2 -> Up
      3 -> Down
      4 -> Left
      5 -> Right
      6 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FocusNavigationDirection>
      {
    public fun setValue(newValue: FocusNavigationDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FocusNavigationDirection =
        FocusNavigationDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FocusNavigationDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FocusNavigationDirection =
        FocusNavigationDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: FocusNavigationDirection): Int = obj.value
  }
}
