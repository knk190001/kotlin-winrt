package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(TickPlacement.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.Primitives.TickPlacement;i4)")
@WinRTByReference(brClass = TickPlacement.ByReference::class)
public enum class TickPlacement(
  public val value: Int
) : NativeMapped {
  None(0),
  TopLeft(1),
  BottomRight(2),
  Outside(3),
  Inline(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TickPlacement {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> TopLeft
      2 -> BottomRight
      3 -> Outside
      4 -> Inline
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TickPlacement> {
    public fun setValue(newValue: TickPlacement): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TickPlacement =
        TickPlacement.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TickPlacement, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TickPlacement =
        TickPlacement.values()[0].fromNative(value, null)

    public override fun toNative(obj: TickPlacement): Int = obj.value
  }
}
