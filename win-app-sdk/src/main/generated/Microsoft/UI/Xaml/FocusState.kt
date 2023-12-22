package Microsoft.UI.Xaml

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

@ABIMarker(FocusState.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.FocusState;i4)")
@WinRTByReference(brClass = FocusState.ByReference::class)
public enum class FocusState(
  public val value: Int
) : NativeMapped {
  Unfocused(0),
  Pointer(1),
  Keyboard(2),
  Programmatic(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FocusState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unfocused
      1 -> Pointer
      2 -> Keyboard
      3 -> Programmatic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FocusState> {
    public fun setValue(newValue: FocusState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FocusState =
        FocusState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FocusState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FocusState =
        FocusState.values()[0].fromNative(value, null)

    public override fun toNative(obj: FocusState): Int = obj.value
  }
}
