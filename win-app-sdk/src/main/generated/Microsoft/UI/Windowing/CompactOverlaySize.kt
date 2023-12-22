package Microsoft.UI.Windowing

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

@ABIMarker(CompactOverlaySize.ABI::class)
@Signature("enum(Microsoft.UI.Windowing.CompactOverlaySize;i4)")
@WinRTByReference(brClass = CompactOverlaySize.ByReference::class)
public enum class CompactOverlaySize(
  public val value: Int
) : NativeMapped {
  Small(0),
  Medium(1),
  Large(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompactOverlaySize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Small
      1 -> Medium
      2 -> Large
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompactOverlaySize> {
    public fun setValue(newValue: CompactOverlaySize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompactOverlaySize =
        CompactOverlaySize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompactOverlaySize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompactOverlaySize =
        CompactOverlaySize.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompactOverlaySize): Int = obj.value
  }
}
