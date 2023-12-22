package Microsoft.UI.Input

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

@ABIMarker(VirtualKeyStates.ABI::class)
@Signature("enum(Microsoft.UI.Input.VirtualKeyStates;u4)")
@WinRTByReference(brClass = VirtualKeyStates.ByReference::class)
public enum class VirtualKeyStates(
  public val value: Int
) : NativeMapped {
  None(0),
  Down(1),
  Locked(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VirtualKeyStates {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Down
      2 -> Locked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VirtualKeyStates> {
    public fun setValue(newValue: VirtualKeyStates): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VirtualKeyStates =
        VirtualKeyStates.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VirtualKeyStates, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VirtualKeyStates =
        VirtualKeyStates.values()[0].fromNative(value, null)

    public override fun toNative(obj: VirtualKeyStates): Int = obj.value
  }
}
