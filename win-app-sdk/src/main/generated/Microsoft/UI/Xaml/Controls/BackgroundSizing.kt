package Microsoft.UI.Xaml.Controls

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

@ABIMarker(BackgroundSizing.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.BackgroundSizing;i4)")
@WinRTByReference(brClass = BackgroundSizing.ByReference::class)
public enum class BackgroundSizing(
  public val value: Int
) : NativeMapped {
  InnerBorderEdge(0),
  OuterBorderEdge(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundSizing {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> InnerBorderEdge
      1 -> OuterBorderEdge
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BackgroundSizing> {
    public fun setValue(newValue: BackgroundSizing): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundSizing =
        BackgroundSizing.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundSizing, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundSizing =
        BackgroundSizing.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundSizing): Int = obj.value
  }
}
