package Windows.UI.ViewManagement.Core

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

@ABIMarker(CoreInputViewKind.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.Core.CoreInputViewKind;i4)")
@WinRTByReference(brClass = CoreInputViewKind.ByReference::class)
public enum class CoreInputViewKind(
  public val value: Int
) : NativeMapped {
  Default(0),
  Keyboard(1),
  Handwriting(2),
  Emoji(3),
  Symbols(4),
  Clipboard(5),
  Dictation(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreInputViewKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Keyboard
      2 -> Handwriting
      3 -> Emoji
      4 -> Symbols
      5 -> Clipboard
      6 -> Dictation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreInputViewKind> {
    public fun setValue(newValue: CoreInputViewKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreInputViewKind =
        CoreInputViewKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreInputViewKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreInputViewKind =
        CoreInputViewKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreInputViewKind): Int = obj.value
  }
}
