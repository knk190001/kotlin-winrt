package Windows.Devices.PointOfService

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

@ABIMarker(LineDisplayHorizontalAlignment.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.LineDisplayHorizontalAlignment;i4)")
@WinRTByReference(brClass = LineDisplayHorizontalAlignment.ByReference::class)
public enum class LineDisplayHorizontalAlignment(
  public val value: Int
) : NativeMapped {
  Left(0),
  Center(1),
  Right(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LineDisplayHorizontalAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Left
      1 -> Center
      2 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<LineDisplayHorizontalAlignment> {
    public fun setValue(newValue: LineDisplayHorizontalAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LineDisplayHorizontalAlignment =
        LineDisplayHorizontalAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LineDisplayHorizontalAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LineDisplayHorizontalAlignment =
        LineDisplayHorizontalAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: LineDisplayHorizontalAlignment): Int = obj.value
  }
}
