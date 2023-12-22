package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(AutomationLandmarkType.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.Peers.AutomationLandmarkType;i4)")
@WinRTByReference(brClass = AutomationLandmarkType.ByReference::class)
public enum class AutomationLandmarkType(
  public val value: Int
) : NativeMapped {
  None(0),
  Custom(1),
  Form(2),
  Main(3),
  Navigation(4),
  Search(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationLandmarkType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Custom
      2 -> Form
      3 -> Main
      4 -> Navigation
      5 -> Search
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationLandmarkType> {
    public fun setValue(newValue: AutomationLandmarkType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationLandmarkType =
        AutomationLandmarkType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationLandmarkType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationLandmarkType =
        AutomationLandmarkType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationLandmarkType): Int = obj.value
  }
}
