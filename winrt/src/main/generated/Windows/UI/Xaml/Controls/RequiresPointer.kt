package Windows.UI.Xaml.Controls

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

@ABIMarker(RequiresPointer.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.RequiresPointer;i4)")
@WinRTByReference(brClass = RequiresPointer.ByReference::class)
public enum class RequiresPointer(
  public val value: Int
) : NativeMapped {
  Never(0),
  WhenEngaged(1),
  WhenFocused(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RequiresPointer {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Never
      1 -> WhenEngaged
      2 -> WhenFocused
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RequiresPointer> {
    public fun setValue(newValue: RequiresPointer): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RequiresPointer =
        RequiresPointer.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RequiresPointer, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RequiresPointer =
        RequiresPointer.values()[0].fromNative(value, null)

    public override fun toNative(obj: RequiresPointer): Int = obj.value
  }
}
