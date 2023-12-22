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

@ABIMarker(InkToolbarInitialControls.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.InkToolbarInitialControls;i4)")
@WinRTByReference(brClass = InkToolbarInitialControls.ByReference::class)
public enum class InkToolbarInitialControls(
  public val value: Int
) : NativeMapped {
  All(0),
  None(1),
  PensOnly(2),
  AllExceptPens(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkToolbarInitialControls {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> None
      2 -> PensOnly
      3 -> AllExceptPens
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkToolbarInitialControls>
      {
    public fun setValue(newValue: InkToolbarInitialControls): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkToolbarInitialControls =
        InkToolbarInitialControls.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkToolbarInitialControls, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkToolbarInitialControls =
        InkToolbarInitialControls.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkToolbarInitialControls): Int = obj.value
  }
}
