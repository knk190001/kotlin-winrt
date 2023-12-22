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

@ABIMarker(AutoSuggestionBoxTextChangeReason.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.AutoSuggestionBoxTextChangeReason;i4)")
@WinRTByReference(brClass = AutoSuggestionBoxTextChangeReason.ByReference::class)
public enum class AutoSuggestionBoxTextChangeReason(
  public val value: Int
) : NativeMapped {
  UserInput(0),
  ProgrammaticChange(1),
  SuggestionChosen(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutoSuggestionBoxTextChangeReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UserInput
      1 -> ProgrammaticChange
      2 -> SuggestionChosen
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutoSuggestionBoxTextChangeReason> {
    public fun setValue(newValue: AutoSuggestionBoxTextChangeReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutoSuggestionBoxTextChangeReason =
        AutoSuggestionBoxTextChangeReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutoSuggestionBoxTextChangeReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutoSuggestionBoxTextChangeReason =
        AutoSuggestionBoxTextChangeReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutoSuggestionBoxTextChangeReason): Int = obj.value
  }
}
