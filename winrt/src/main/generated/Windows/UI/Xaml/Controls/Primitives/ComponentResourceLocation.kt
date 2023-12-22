package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(ComponentResourceLocation.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.ComponentResourceLocation;i4)")
@WinRTByReference(brClass = ComponentResourceLocation.ByReference::class)
public enum class ComponentResourceLocation(
  public val value: Int
) : NativeMapped {
  Application(0),
  Nested(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ComponentResourceLocation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Application
      1 -> Nested
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ComponentResourceLocation>
      {
    public fun setValue(newValue: ComponentResourceLocation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ComponentResourceLocation =
        ComponentResourceLocation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ComponentResourceLocation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ComponentResourceLocation =
        ComponentResourceLocation.values()[0].fromNative(value, null)

    public override fun toNative(obj: ComponentResourceLocation): Int = obj.value
  }
}
