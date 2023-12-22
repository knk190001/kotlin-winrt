package Windows.Globalization.NumberFormatting

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

@ABIMarker(RoundingAlgorithm.ABI::class)
@Signature("enum(Windows.Globalization.NumberFormatting.RoundingAlgorithm;i4)")
@WinRTByReference(brClass = RoundingAlgorithm.ByReference::class)
public enum class RoundingAlgorithm(
  public val value: Int
) : NativeMapped {
  None(0),
  RoundDown(1),
  RoundUp(2),
  RoundTowardsZero(3),
  RoundAwayFromZero(4),
  RoundHalfDown(5),
  RoundHalfUp(6),
  RoundHalfTowardsZero(7),
  RoundHalfAwayFromZero(8),
  RoundHalfToEven(9),
  RoundHalfToOdd(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RoundingAlgorithm {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> RoundDown
      2 -> RoundUp
      3 -> RoundTowardsZero
      4 -> RoundAwayFromZero
      5 -> RoundHalfDown
      6 -> RoundHalfUp
      7 -> RoundHalfTowardsZero
      8 -> RoundHalfAwayFromZero
      9 -> RoundHalfToEven
      10 -> RoundHalfToOdd
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RoundingAlgorithm> {
    public fun setValue(newValue: RoundingAlgorithm): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RoundingAlgorithm =
        RoundingAlgorithm.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RoundingAlgorithm, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RoundingAlgorithm =
        RoundingAlgorithm.values()[0].fromNative(value, null)

    public override fun toNative(obj: RoundingAlgorithm): Int = obj.value
  }
}
