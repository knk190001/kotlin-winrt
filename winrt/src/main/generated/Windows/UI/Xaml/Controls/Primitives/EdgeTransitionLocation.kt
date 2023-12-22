package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(EdgeTransitionLocation.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.EdgeTransitionLocation;i4)")
@WinRTByReference(brClass = EdgeTransitionLocation.ByReference::class)
public enum class EdgeTransitionLocation(
  public val value: Int
) : NativeMapped {
  Left(0),
  Top(1),
  Right(2),
  Bottom(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EdgeTransitionLocation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Left
      1 -> Top
      2 -> Right
      3 -> Bottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EdgeTransitionLocation> {
    public fun setValue(newValue: EdgeTransitionLocation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EdgeTransitionLocation =
        EdgeTransitionLocation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EdgeTransitionLocation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EdgeTransitionLocation =
        EdgeTransitionLocation.values()[0].fromNative(value, null)

    public override fun toNative(obj: EdgeTransitionLocation): Int = obj.value
  }
}
