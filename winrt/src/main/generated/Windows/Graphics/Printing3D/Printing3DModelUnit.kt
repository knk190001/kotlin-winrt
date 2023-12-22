package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DModelUnit.ABI::class)
@Signature("enum(Windows.Graphics.Printing3D.Printing3DModelUnit;i4)")
@WinRTByReference(brClass = Printing3DModelUnit.ByReference::class)
public enum class Printing3DModelUnit(
  public val value: Int
) : NativeMapped {
  Meter(0),
  Micron(1),
  Millimeter(2),
  Centimeter(3),
  Inch(4),
  Foot(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Printing3DModelUnit {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Meter
      1 -> Micron
      2 -> Millimeter
      3 -> Centimeter
      4 -> Inch
      5 -> Foot
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Printing3DModelUnit> {
    public fun setValue(newValue: Printing3DModelUnit): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Printing3DModelUnit =
        Printing3DModelUnit.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Printing3DModelUnit, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Printing3DModelUnit =
        Printing3DModelUnit.values()[0].fromNative(value, null)

    public override fun toNative(obj: Printing3DModelUnit): Int = obj.value
  }
}
