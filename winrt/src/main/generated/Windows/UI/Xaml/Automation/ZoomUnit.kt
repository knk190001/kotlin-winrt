package Windows.UI.Xaml.Automation

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

@ABIMarker(ZoomUnit.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.ZoomUnit;i4)")
@WinRTByReference(brClass = ZoomUnit.ByReference::class)
public enum class ZoomUnit(
  public val value: Int
) : NativeMapped {
  NoAmount(0),
  LargeDecrement(1),
  SmallDecrement(2),
  LargeIncrement(3),
  SmallIncrement(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): ZoomUnit {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoAmount
      1 -> LargeDecrement
      2 -> SmallDecrement
      3 -> LargeIncrement
      4 -> SmallIncrement
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ZoomUnit> {
    public fun setValue(newValue: ZoomUnit): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ZoomUnit =
        ZoomUnit.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ZoomUnit, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ZoomUnit =
        ZoomUnit.values()[0].fromNative(value, null)

    public override fun toNative(obj: ZoomUnit): Int = obj.value
  }
}
