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

@ABIMarker(CommandBarDefaultLabelPosition.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.CommandBarDefaultLabelPosition;i4)")
@WinRTByReference(brClass = CommandBarDefaultLabelPosition.ByReference::class)
public enum class CommandBarDefaultLabelPosition(
  public val value: Int
) : NativeMapped {
  Bottom(0),
  Right(1),
  Collapsed(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CommandBarDefaultLabelPosition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Bottom
      1 -> Right
      2 -> Collapsed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CommandBarDefaultLabelPosition> {
    public fun setValue(newValue: CommandBarDefaultLabelPosition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CommandBarDefaultLabelPosition =
        CommandBarDefaultLabelPosition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CommandBarDefaultLabelPosition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CommandBarDefaultLabelPosition =
        CommandBarDefaultLabelPosition.values()[0].fromNative(value, null)

    public override fun toNative(obj: CommandBarDefaultLabelPosition): Int = obj.value
  }
}
