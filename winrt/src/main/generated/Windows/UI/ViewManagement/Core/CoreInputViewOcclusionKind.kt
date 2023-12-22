package Windows.UI.ViewManagement.Core

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

@ABIMarker(CoreInputViewOcclusionKind.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.Core.CoreInputViewOcclusionKind;i4)")
@WinRTByReference(brClass = CoreInputViewOcclusionKind.ByReference::class)
public enum class CoreInputViewOcclusionKind(
  public val value: Int
) : NativeMapped {
  Docked(0),
  Floating(1),
  Overlay(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreInputViewOcclusionKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Docked
      1 -> Floating
      2 -> Overlay
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreInputViewOcclusionKind> {
    public fun setValue(newValue: CoreInputViewOcclusionKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreInputViewOcclusionKind =
        CoreInputViewOcclusionKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreInputViewOcclusionKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreInputViewOcclusionKind =
        CoreInputViewOcclusionKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreInputViewOcclusionKind): Int = obj.value
  }
}
