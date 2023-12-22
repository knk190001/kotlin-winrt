package Windows.UI.Popups

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

@ABIMarker(Placement.ABI::class)
@Signature("enum(Windows.UI.Popups.Placement;i4)")
@WinRTByReference(brClass = Placement.ByReference::class)
public enum class Placement(
  public val value: Int
) : NativeMapped {
  Default(0),
  Above(1),
  Below(2),
  Left(3),
  Right(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): Placement {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Above
      2 -> Below
      3 -> Left
      4 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Placement> {
    public fun setValue(newValue: Placement): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Placement =
        Placement.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Placement, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Placement =
        Placement.values()[0].fromNative(value, null)

    public override fun toNative(obj: Placement): Int = obj.value
  }
}
