package Microsoft.UI.Xaml.Media

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

@ABIMarker(BrushMappingMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.BrushMappingMode;i4)")
@WinRTByReference(brClass = BrushMappingMode.ByReference::class)
public enum class BrushMappingMode(
  public val value: Int
) : NativeMapped {
  Absolute(0),
  RelativeToBoundingBox(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BrushMappingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Absolute
      1 -> RelativeToBoundingBox
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BrushMappingMode> {
    public fun setValue(newValue: BrushMappingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BrushMappingMode =
        BrushMappingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BrushMappingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BrushMappingMode =
        BrushMappingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: BrushMappingMode): Int = obj.value
  }
}
