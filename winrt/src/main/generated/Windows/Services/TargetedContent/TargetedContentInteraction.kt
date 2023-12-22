package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentInteraction.ABI::class)
@Signature("enum(Windows.Services.TargetedContent.TargetedContentInteraction;i4)")
@WinRTByReference(brClass = TargetedContentInteraction.ByReference::class)
public enum class TargetedContentInteraction(
  public val value: Int
) : NativeMapped {
  Impression(0),
  ClickThrough(1),
  Hover(2),
  Like(3),
  Dislike(4),
  Dismiss(5),
  Ineligible(6),
  Accept(7),
  Decline(8),
  Defer(9),
  Canceled(10),
  Conversion(11),
  Opportunity(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TargetedContentInteraction {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Impression
      1 -> ClickThrough
      2 -> Hover
      3 -> Like
      4 -> Dislike
      5 -> Dismiss
      6 -> Ineligible
      7 -> Accept
      8 -> Decline
      9 -> Defer
      10 -> Canceled
      11 -> Conversion
      12 -> Opportunity
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<TargetedContentInteraction> {
    public fun setValue(newValue: TargetedContentInteraction): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TargetedContentInteraction =
        TargetedContentInteraction.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TargetedContentInteraction, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TargetedContentInteraction =
        TargetedContentInteraction.values()[0].fromNative(value, null)

    public override fun toNative(obj: TargetedContentInteraction): Int = obj.value
  }
}
