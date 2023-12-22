package Windows.UI.Xaml.Input

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

@ABIMarker(StandardUICommandKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Input.StandardUICommandKind;i4)")
@WinRTByReference(brClass = StandardUICommandKind.ByReference::class)
public enum class StandardUICommandKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Cut(1),
  Copy(2),
  Paste(3),
  SelectAll(4),
  Delete(5),
  Share(6),
  Save(7),
  Open(8),
  Close(9),
  Pause(10),
  Play(11),
  Stop(12),
  Forward(13),
  Backward(14),
  Undo(15),
  Redo(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StandardUICommandKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Cut
      2 -> Copy
      3 -> Paste
      4 -> SelectAll
      5 -> Delete
      6 -> Share
      7 -> Save
      8 -> Open
      9 -> Close
      10 -> Pause
      11 -> Play
      12 -> Stop
      13 -> Forward
      14 -> Backward
      15 -> Undo
      16 -> Redo
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StandardUICommandKind> {
    public fun setValue(newValue: StandardUICommandKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StandardUICommandKind =
        StandardUICommandKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StandardUICommandKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StandardUICommandKind =
        StandardUICommandKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: StandardUICommandKind): Int = obj.value
  }
}
