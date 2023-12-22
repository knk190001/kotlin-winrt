package Windows.Graphics.Display

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

@ABIMarker(AdvancedColorKind.ABI::class)
@Signature("enum(Windows.Graphics.Display.AdvancedColorKind;i4)")
@WinRTByReference(brClass = AdvancedColorKind.ByReference::class)
public enum class AdvancedColorKind(
  public val value: Int
) : NativeMapped {
  StandardDynamicRange(0),
  WideColorGamut(1),
  HighDynamicRange(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AdvancedColorKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> StandardDynamicRange
      1 -> WideColorGamut
      2 -> HighDynamicRange
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AdvancedColorKind> {
    public fun setValue(newValue: AdvancedColorKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AdvancedColorKind =
        AdvancedColorKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AdvancedColorKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AdvancedColorKind =
        AdvancedColorKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: AdvancedColorKind): Int = obj.value
  }
}
