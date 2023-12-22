package Windows.UI.Xaml.Hosting

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

@ABIMarker(DesignerAppViewState.ABI::class)
@Signature("enum(Windows.UI.Xaml.Hosting.DesignerAppViewState;i4)")
@WinRTByReference(brClass = DesignerAppViewState.ByReference::class)
public enum class DesignerAppViewState(
  public val value: Int
) : NativeMapped {
  Visible(0),
  Hidden(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DesignerAppViewState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Visible
      1 -> Hidden
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DesignerAppViewState> {
    public fun setValue(newValue: DesignerAppViewState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DesignerAppViewState =
        DesignerAppViewState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DesignerAppViewState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DesignerAppViewState =
        DesignerAppViewState.values()[0].fromNative(value, null)

    public override fun toNative(obj: DesignerAppViewState): Int = obj.value
  }
}
