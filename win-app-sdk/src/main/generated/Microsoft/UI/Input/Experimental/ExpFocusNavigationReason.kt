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

@ABIMarker(ExpFocusNavigationReason.ABI::class)
@Signature("enum(Microsoft.UI.Input.Experimental.ExpFocusNavigationReason;i4)")
@WinRTByReference(brClass = ExpFocusNavigationReason.ByReference::class)
public enum class ExpFocusNavigationReason(
  public val value: Int
) : NativeMapped {
  Programmatic(0),
  Restore(1),
  First(2),
  Last(3),
  Left(4),
  Up(5),
  Right(6),
  Down(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExpFocusNavigationReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Programmatic
      1 -> Restore
      2 -> First
      3 -> Last
      4 -> Left
      5 -> Up
      6 -> Right
      7 -> Down
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExpFocusNavigationReason>
      {
    public fun setValue(newValue: ExpFocusNavigationReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExpFocusNavigationReason =
        ExpFocusNavigationReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExpFocusNavigationReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExpFocusNavigationReason =
        ExpFocusNavigationReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExpFocusNavigationReason): Int = obj.value
  }
}
