package Windows.UI.Input.Inking

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

@ABIMarker(InkInputProcessingMode.ABI::class)
@Signature("enum(Windows.UI.Input.Inking.InkInputProcessingMode;i4)")
@WinRTByReference(brClass = InkInputProcessingMode.ByReference::class)
public enum class InkInputProcessingMode(
  public val value: Int
) : NativeMapped {
  None(0),
  Inking(1),
  Erasing(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkInputProcessingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Inking
      2 -> Erasing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkInputProcessingMode> {
    public fun setValue(newValue: InkInputProcessingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkInputProcessingMode =
        InkInputProcessingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkInputProcessingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkInputProcessingMode =
        InkInputProcessingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkInputProcessingMode): Int = obj.value
  }
}
