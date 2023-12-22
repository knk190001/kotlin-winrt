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

@ABIMarker(InkToolbarFlyoutItemKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.InkToolbarFlyoutItemKind;i4)")
@WinRTByReference(brClass = InkToolbarFlyoutItemKind.ByReference::class)
public enum class InkToolbarFlyoutItemKind(
  public val value: Int
) : NativeMapped {
  Simple(0),
  Radio(1),
  Check(2),
  RadioCheck(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InkToolbarFlyoutItemKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Simple
      1 -> Radio
      2 -> Check
      3 -> RadioCheck
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InkToolbarFlyoutItemKind>
      {
    public fun setValue(newValue: InkToolbarFlyoutItemKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InkToolbarFlyoutItemKind =
        InkToolbarFlyoutItemKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InkToolbarFlyoutItemKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InkToolbarFlyoutItemKind =
        InkToolbarFlyoutItemKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: InkToolbarFlyoutItemKind): Int = obj.value
  }
}
