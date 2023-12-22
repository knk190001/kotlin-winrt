package Microsoft.UI.Input

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

@ABIMarker(InputSystemCursorShape.ABI::class)
@Signature("enum(Microsoft.UI.Input.InputSystemCursorShape;i4)")
@WinRTByReference(brClass = InputSystemCursorShape.ByReference::class)
public enum class InputSystemCursorShape(
  public val value: Int
) : NativeMapped {
  Arrow(0),
  Cross(1),
  Hand(3),
  Help(4),
  IBeam(5),
  SizeAll(6),
  SizeNortheastSouthwest(7),
  SizeNorthSouth(8),
  SizeNorthwestSoutheast(9),
  SizeWestEast(10),
  UniversalNo(11),
  UpArrow(12),
  Wait(13),
  Pin(14),
  Person(15),
  AppStarting(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InputSystemCursorShape {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Arrow
      1 -> Cross
      3 -> Hand
      4 -> Help
      5 -> IBeam
      6 -> SizeAll
      7 -> SizeNortheastSouthwest
      8 -> SizeNorthSouth
      9 -> SizeNorthwestSoutheast
      10 -> SizeWestEast
      11 -> UniversalNo
      12 -> UpArrow
      13 -> Wait
      14 -> Pin
      15 -> Person
      16 -> AppStarting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InputSystemCursorShape> {
    public fun setValue(newValue: InputSystemCursorShape): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InputSystemCursorShape =
        InputSystemCursorShape.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InputSystemCursorShape, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InputSystemCursorShape =
        InputSystemCursorShape.values()[0].fromNative(value, null)

    public override fun toNative(obj: InputSystemCursorShape): Int = obj.value
  }
}
