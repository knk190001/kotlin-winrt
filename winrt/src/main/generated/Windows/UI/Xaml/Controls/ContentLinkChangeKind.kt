package Windows.UI.Xaml.Controls

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

@ABIMarker(ContentLinkChangeKind.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.ContentLinkChangeKind;i4)")
@WinRTByReference(brClass = ContentLinkChangeKind.ByReference::class)
public enum class ContentLinkChangeKind(
  public val value: Int
) : NativeMapped {
  Inserted(0),
  Removed(1),
  Edited(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContentLinkChangeKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Inserted
      1 -> Removed
      2 -> Edited
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ContentLinkChangeKind> {
    public fun setValue(newValue: ContentLinkChangeKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContentLinkChangeKind =
        ContentLinkChangeKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContentLinkChangeKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContentLinkChangeKind =
        ContentLinkChangeKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContentLinkChangeKind): Int = obj.value
  }
}
