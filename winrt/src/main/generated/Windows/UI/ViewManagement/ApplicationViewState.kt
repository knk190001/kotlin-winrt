package Windows.UI.ViewManagement

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

@ABIMarker(ApplicationViewState.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.ApplicationViewState;i4)")
@WinRTByReference(brClass = ApplicationViewState.ByReference::class)
public enum class ApplicationViewState(
  public val value: Int
) : NativeMapped {
  FullScreenLandscape(0),
  Filled(1),
  Snapped(2),
  FullScreenPortrait(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ApplicationViewState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FullScreenLandscape
      1 -> Filled
      2 -> Snapped
      3 -> FullScreenPortrait
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ApplicationViewState> {
    public fun setValue(newValue: ApplicationViewState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ApplicationViewState =
        ApplicationViewState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ApplicationViewState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ApplicationViewState =
        ApplicationViewState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ApplicationViewState): Int = obj.value
  }
}
