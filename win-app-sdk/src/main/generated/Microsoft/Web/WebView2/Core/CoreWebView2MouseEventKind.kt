package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2MouseEventKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2MouseEventKind;i4)")
@WinRTByReference(brClass = CoreWebView2MouseEventKind.ByReference::class)
public enum class CoreWebView2MouseEventKind(
  public val value: Int
) : NativeMapped {
  HorizontalWheel(526),
  LeftButtonDoubleClick(515),
  LeftButtonDown(513),
  LeftButtonUp(514),
  Leave(675),
  MiddleButtonDoubleClick(521),
  MiddleButtonDown(519),
  MiddleButtonUp(520),
  Move(512),
  RightButtonDoubleClick(518),
  RightButtonDown(516),
  RightButtonUp(517),
  Wheel(522),
  XButtonDoubleClick(525),
  XButtonDown(523),
  XButtonUp(524),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2MouseEventKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      526 -> HorizontalWheel
      515 -> LeftButtonDoubleClick
      513 -> LeftButtonDown
      514 -> LeftButtonUp
      675 -> Leave
      521 -> MiddleButtonDoubleClick
      519 -> MiddleButtonDown
      520 -> MiddleButtonUp
      512 -> Move
      518 -> RightButtonDoubleClick
      516 -> RightButtonDown
      517 -> RightButtonUp
      522 -> Wheel
      525 -> XButtonDoubleClick
      523 -> XButtonDown
      524 -> XButtonUp
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2MouseEventKind> {
    public fun setValue(newValue: CoreWebView2MouseEventKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2MouseEventKind =
        CoreWebView2MouseEventKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2MouseEventKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2MouseEventKind =
        CoreWebView2MouseEventKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2MouseEventKind): Int = obj.value
  }
}
