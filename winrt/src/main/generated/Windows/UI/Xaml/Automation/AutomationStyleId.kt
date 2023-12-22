package Windows.UI.Xaml.Automation

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

@ABIMarker(AutomationStyleId.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.AutomationStyleId;i4)")
@WinRTByReference(brClass = AutomationStyleId.ByReference::class)
public enum class AutomationStyleId(
  public val value: Int
) : NativeMapped {
  Heading1(70001),
  Heading2(70002),
  Heading3(70003),
  Heading4(70004),
  Heading5(70005),
  Heading6(70006),
  Heading7(70007),
  Heading8(70008),
  Heading9(70009),
  Title(70010),
  Subtitle(70011),
  Normal(70012),
  Emphasis(70013),
  Quote(70014),
  BulletedList(70015),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationStyleId {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      70001 -> Heading1
      70002 -> Heading2
      70003 -> Heading3
      70004 -> Heading4
      70005 -> Heading5
      70006 -> Heading6
      70007 -> Heading7
      70008 -> Heading8
      70009 -> Heading9
      70010 -> Title
      70011 -> Subtitle
      70012 -> Normal
      70013 -> Emphasis
      70014 -> Quote
      70015 -> BulletedList
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationStyleId> {
    public fun setValue(newValue: AutomationStyleId): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationStyleId =
        AutomationStyleId.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationStyleId, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationStyleId =
        AutomationStyleId.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationStyleId): Int = obj.value
  }
}
