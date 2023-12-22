package Microsoft.UI.Text

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

@ABIMarker(LinkType.ABI::class)
@Signature("enum(Microsoft.UI.Text.LinkType;i4)")
@WinRTByReference(brClass = LinkType.ByReference::class)
public enum class LinkType(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  NotALink(1),
  ClientLink(2),
  FriendlyLinkName(3),
  FriendlyLinkAddress(4),
  AutoLink(5),
  AutoLinkEmail(6),
  AutoLinkPhone(7),
  AutoLinkPath(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): LinkType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> NotALink
      2 -> ClientLink
      3 -> FriendlyLinkName
      4 -> FriendlyLinkAddress
      5 -> AutoLink
      6 -> AutoLinkEmail
      7 -> AutoLinkPhone
      8 -> AutoLinkPath
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LinkType> {
    public fun setValue(newValue: LinkType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LinkType =
        LinkType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LinkType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LinkType =
        LinkType.values()[0].fromNative(value, null)

    public override fun toNative(obj: LinkType): Int = obj.value
  }
}
