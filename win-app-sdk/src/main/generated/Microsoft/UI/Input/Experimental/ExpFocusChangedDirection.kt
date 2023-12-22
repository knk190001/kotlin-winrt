package Microsoft.UI.Input.Experimental

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

@ABIMarker(ExpFocusChangedDirection.ABI::class)
@Signature("enum(Microsoft.UI.Input.Experimental.ExpFocusChangedDirection;i4)")
@WinRTByReference(brClass = ExpFocusChangedDirection.ByReference::class)
public enum class ExpFocusChangedDirection(
  public val value: Int
) : NativeMapped {
  None(0),
  Next(1),
  Previous(2),
  Up(3),
  Down(4),
  Left(5),
  Right(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExpFocusChangedDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Next
      2 -> Previous
      3 -> Up
      4 -> Down
      5 -> Left
      6 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExpFocusChangedDirection>
      {
    public fun setValue(newValue: ExpFocusChangedDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExpFocusChangedDirection =
        ExpFocusChangedDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExpFocusChangedDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExpFocusChangedDirection =
        ExpFocusChangedDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExpFocusChangedDirection): Int = obj.value
  }
}
