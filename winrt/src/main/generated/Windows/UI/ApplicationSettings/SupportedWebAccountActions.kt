package Windows.UI.ApplicationSettings

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

@ABIMarker(SupportedWebAccountActions.ABI::class)
@Signature("enum(Windows.UI.ApplicationSettings.SupportedWebAccountActions;u4)")
@WinRTByReference(brClass = SupportedWebAccountActions.ByReference::class)
public enum class SupportedWebAccountActions(
  public val value: Int
) : NativeMapped {
  None(0),
  Reconnect(1),
  Remove(2),
  ViewDetails(4),
  Manage(8),
  More(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SupportedWebAccountActions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Reconnect
      2 -> Remove
      4 -> ViewDetails
      8 -> Manage
      16 -> More
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SupportedWebAccountActions> {
    public fun setValue(newValue: SupportedWebAccountActions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SupportedWebAccountActions =
        SupportedWebAccountActions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SupportedWebAccountActions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SupportedWebAccountActions =
        SupportedWebAccountActions.values()[0].fromNative(value, null)

    public override fun toNative(obj: SupportedWebAccountActions): Int = obj.value
  }
}
