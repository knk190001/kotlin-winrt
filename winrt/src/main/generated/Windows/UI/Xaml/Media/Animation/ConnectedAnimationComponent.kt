package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ConnectedAnimationComponent.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Animation.ConnectedAnimationComponent;i4)")
@WinRTByReference(brClass = ConnectedAnimationComponent.ByReference::class)
public enum class ConnectedAnimationComponent(
  public val value: Int
) : NativeMapped {
  OffsetX(0),
  OffsetY(1),
  CrossFade(2),
  Scale(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ConnectedAnimationComponent {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> OffsetX
      1 -> OffsetY
      2 -> CrossFade
      3 -> Scale
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ConnectedAnimationComponent> {
    public fun setValue(newValue: ConnectedAnimationComponent): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ConnectedAnimationComponent =
        ConnectedAnimationComponent.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ConnectedAnimationComponent, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ConnectedAnimationComponent =
        ConnectedAnimationComponent.values()[0].fromNative(value, null)

    public override fun toNative(obj: ConnectedAnimationComponent): Int = obj.value
  }
}
