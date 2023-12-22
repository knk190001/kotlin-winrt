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

@ABIMarker(ContentDialogPlacement.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.ContentDialogPlacement;i4)")
@WinRTByReference(brClass = ContentDialogPlacement.ByReference::class)
public enum class ContentDialogPlacement(
  public val value: Int
) : NativeMapped {
  Popup(0),
  InPlace(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContentDialogPlacement {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Popup
      1 -> InPlace
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContentDialogPlacement> {
    public fun setValue(newValue: ContentDialogPlacement): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContentDialogPlacement =
        ContentDialogPlacement.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContentDialogPlacement, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContentDialogPlacement =
        ContentDialogPlacement.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContentDialogPlacement): Int = obj.value
  }
}
