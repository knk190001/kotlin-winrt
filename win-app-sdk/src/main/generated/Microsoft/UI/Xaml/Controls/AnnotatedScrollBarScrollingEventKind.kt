package Microsoft.UI.Xaml.Controls

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

@ABIMarker(AnnotatedScrollBarScrollingEventKind.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.AnnotatedScrollBarScrollingEventKind;i4)")
@WinRTByReference(brClass = AnnotatedScrollBarScrollingEventKind.ByReference::class)
public enum class AnnotatedScrollBarScrollingEventKind(
  public val value: Int
) : NativeMapped {
  Click(0),
  Drag(1),
  IncrementButton(2),
  DecrementButton(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnnotatedScrollBarScrollingEventKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Click
      1 -> Drag
      2 -> IncrementButton
      3 -> DecrementButton
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AnnotatedScrollBarScrollingEventKind> {
    public fun setValue(newValue: AnnotatedScrollBarScrollingEventKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnnotatedScrollBarScrollingEventKind =
        AnnotatedScrollBarScrollingEventKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnnotatedScrollBarScrollingEventKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnnotatedScrollBarScrollingEventKind =
        AnnotatedScrollBarScrollingEventKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnnotatedScrollBarScrollingEventKind): Int = obj.value
  }
}
