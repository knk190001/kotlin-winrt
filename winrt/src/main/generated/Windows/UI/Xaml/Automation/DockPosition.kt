package Windows.UI.Xaml.Automation

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

@ABIMarker(DockPosition.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.DockPosition;i4)")
@WinRTByReference(brClass = DockPosition.ByReference::class)
public enum class DockPosition(
  public val value: Int
) : NativeMapped {
  Top(0),
  Left(1),
  Bottom(2),
  Right(3),
  Fill(4),
  None(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DockPosition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Top
      1 -> Left
      2 -> Bottom
      3 -> Right
      4 -> Fill
      5 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DockPosition> {
    public fun setValue(newValue: DockPosition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DockPosition =
        DockPosition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DockPosition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DockPosition =
        DockPosition.values()[0].fromNative(value, null)

    public override fun toNative(obj: DockPosition): Int = obj.value
  }
}
