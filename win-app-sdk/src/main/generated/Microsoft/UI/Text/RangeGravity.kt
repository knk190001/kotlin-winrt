package Microsoft.UI.Text

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

@ABIMarker(RangeGravity.ABI::class)
@Signature("enum(Microsoft.UI.Text.RangeGravity;i4)")
@WinRTByReference(brClass = RangeGravity.ByReference::class)
public enum class RangeGravity(
  public val value: Int
) : NativeMapped {
  UIBehavior(0),
  Backward(1),
  Forward(2),
  Inward(3),
  Outward(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RangeGravity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UIBehavior
      1 -> Backward
      2 -> Forward
      3 -> Inward
      4 -> Outward
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RangeGravity> {
    public fun setValue(newValue: RangeGravity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RangeGravity =
        RangeGravity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RangeGravity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RangeGravity =
        RangeGravity.values()[0].fromNative(value, null)

    public override fun toNative(obj: RangeGravity): Int = obj.value
  }
}
