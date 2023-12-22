package Windows.UI.Core

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

@ABIMarker(CoreCursorType.ABI::class)
@Signature("enum(Windows.UI.Core.CoreCursorType;i4)")
@WinRTByReference(brClass = CoreCursorType.ByReference::class)
public enum class CoreCursorType(
  public val value: Int
) : NativeMapped {
  Arrow(0),
  Cross(1),
  Custom(2),
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
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreCursorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Arrow
      1 -> Cross
      2 -> Custom
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
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreCursorType> {
    public fun setValue(newValue: CoreCursorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreCursorType =
        CoreCursorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreCursorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreCursorType =
        CoreCursorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreCursorType): Int = obj.value
  }
}
