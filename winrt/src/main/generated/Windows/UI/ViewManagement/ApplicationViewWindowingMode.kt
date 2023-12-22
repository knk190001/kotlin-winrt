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

@ABIMarker(ApplicationViewWindowingMode.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.ApplicationViewWindowingMode;i4)")
@WinRTByReference(brClass = ApplicationViewWindowingMode.ByReference::class)
public enum class ApplicationViewWindowingMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  PreferredLaunchViewSize(1),
  FullScreen(2),
  CompactOverlay(3),
  Maximized(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ApplicationViewWindowingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> PreferredLaunchViewSize
      2 -> FullScreen
      3 -> CompactOverlay
      4 -> Maximized
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ApplicationViewWindowingMode> {
    public fun setValue(newValue: ApplicationViewWindowingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ApplicationViewWindowingMode =
        ApplicationViewWindowingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ApplicationViewWindowingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ApplicationViewWindowingMode =
        ApplicationViewWindowingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ApplicationViewWindowingMode): Int = obj.value
  }
}
