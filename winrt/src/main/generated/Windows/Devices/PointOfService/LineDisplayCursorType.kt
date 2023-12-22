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

@ABIMarker(LineDisplayCursorType.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.LineDisplayCursorType;i4)")
@WinRTByReference(brClass = LineDisplayCursorType.ByReference::class)
public enum class LineDisplayCursorType(
  public val value: Int
) : NativeMapped {
  None(0),
  Block(1),
  HalfBlock(2),
  Underline(3),
  Reverse(4),
  Other(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LineDisplayCursorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Block
      2 -> HalfBlock
      3 -> Underline
      4 -> Reverse
      5 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LineDisplayCursorType> {
    public fun setValue(newValue: LineDisplayCursorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LineDisplayCursorType =
        LineDisplayCursorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LineDisplayCursorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LineDisplayCursorType =
        LineDisplayCursorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: LineDisplayCursorType): Int = obj.value
  }
}
