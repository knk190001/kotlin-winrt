package Windows.UI.WebUI

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

@ABIMarker(PrintContent.ABI::class)
@Signature("enum(Windows.UI.WebUI.PrintContent;i4)")
@WinRTByReference(brClass = PrintContent.ByReference::class)
public enum class PrintContent(
  public val value: Int
) : NativeMapped {
  AllPages(0),
  CurrentPage(1),
  CustomPageRange(2),
  CurrentSelection(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintContent {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AllPages
      1 -> CurrentPage
      2 -> CustomPageRange
      3 -> CurrentSelection
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintContent> {
    public fun setValue(newValue: PrintContent): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintContent =
        PrintContent.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintContent, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintContent =
        PrintContent.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintContent): Int = obj.value
  }
}
