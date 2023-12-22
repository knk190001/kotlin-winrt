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

@ABIMarker(TargetedContentObjectKind.ABI::class)
@Signature("enum(Windows.Services.TargetedContent.TargetedContentObjectKind;i4)")
@WinRTByReference(brClass = TargetedContentObjectKind.ByReference::class)
public enum class TargetedContentObjectKind(
  public val value: Int
) : NativeMapped {
  Collection(0),
  Item(1),
  Value(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TargetedContentObjectKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Collection
      1 -> Item
      2 -> Value
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TargetedContentObjectKind>
      {
    public fun setValue(newValue: TargetedContentObjectKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TargetedContentObjectKind =
        TargetedContentObjectKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TargetedContentObjectKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TargetedContentObjectKind =
        TargetedContentObjectKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: TargetedContentObjectKind): Int = obj.value
  }
}
