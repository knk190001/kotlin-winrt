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

@ABIMarker(InkToolbarToggle.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.InkToolbarToggle;i4)")
@WinRTByReference(brClass = InkToolbarToggle.ByReference::class)
public enum class InkToolbarToggle(
  public val value: Int
) : NativeMapped {
  Ruler(0),
  Custom(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkToolbarToggle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ruler
      1 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkToolbarToggle> {
    public fun setValue(newValue: InkToolbarToggle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkToolbarToggle =
        InkToolbarToggle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkToolbarToggle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkToolbarToggle =
        InkToolbarToggle.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkToolbarToggle): Int = obj.value
  }
}
