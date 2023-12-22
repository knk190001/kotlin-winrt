package Windows.UI.Xaml.Media

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

@ABIMarker(AcrylicBackgroundSource.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.AcrylicBackgroundSource;i4)")
@WinRTByReference(brClass = AcrylicBackgroundSource.ByReference::class)
public enum class AcrylicBackgroundSource(
  public val value: Int
) : NativeMapped {
  HostBackdrop(0),
  Backdrop(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AcrylicBackgroundSource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HostBackdrop
      1 -> Backdrop
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AcrylicBackgroundSource> {
    public fun setValue(newValue: AcrylicBackgroundSource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AcrylicBackgroundSource =
        AcrylicBackgroundSource.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AcrylicBackgroundSource, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AcrylicBackgroundSource =
        AcrylicBackgroundSource.values()[0].fromNative(value, null)

    public override fun toNative(obj: AcrylicBackgroundSource): Int = obj.value
  }
}
