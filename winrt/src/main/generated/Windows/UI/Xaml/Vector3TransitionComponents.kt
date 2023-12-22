package Windows.UI.Xaml

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

@ABIMarker(Vector3TransitionComponents.ABI::class)
@Signature("enum(Windows.UI.Xaml.Vector3TransitionComponents;u4)")
@WinRTByReference(brClass = Vector3TransitionComponents.ByReference::class)
public enum class Vector3TransitionComponents(
  public val value: Int
) : NativeMapped {
  X(1),
  Y(2),
  Z(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Vector3TransitionComponents {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> X
      2 -> Y
      4 -> Z
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<Vector3TransitionComponents> {
    public fun setValue(newValue: Vector3TransitionComponents): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Vector3TransitionComponents =
        Vector3TransitionComponents.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Vector3TransitionComponents, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Vector3TransitionComponents =
        Vector3TransitionComponents.values()[0].fromNative(value, null)

    public override fun toNative(obj: Vector3TransitionComponents): Int = obj.value
  }
}
