package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(AccessibilityView.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.AccessibilityView;i4)")
@WinRTByReference(brClass = AccessibilityView.ByReference::class)
public enum class AccessibilityView(
  public val value: Int
) : NativeMapped {
  Raw(0),
  Control(1),
  Content(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AccessibilityView {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Raw
      1 -> Control
      2 -> Content
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AccessibilityView> {
    public fun setValue(newValue: AccessibilityView): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AccessibilityView =
        AccessibilityView.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AccessibilityView, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AccessibilityView =
        AccessibilityView.values()[0].fromNative(value, null)

    public override fun toNative(obj: AccessibilityView): Int = obj.value
  }
}
