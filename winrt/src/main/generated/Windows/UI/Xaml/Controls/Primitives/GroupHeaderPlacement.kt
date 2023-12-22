package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(GroupHeaderPlacement.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Primitives.GroupHeaderPlacement;i4)")
@WinRTByReference(brClass = GroupHeaderPlacement.ByReference::class)
public enum class GroupHeaderPlacement(
  public val value: Int
) : NativeMapped {
  Top(0),
  Left(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GroupHeaderPlacement {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Top
      1 -> Left
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GroupHeaderPlacement> {
    public fun setValue(newValue: GroupHeaderPlacement): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GroupHeaderPlacement =
        GroupHeaderPlacement.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GroupHeaderPlacement, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GroupHeaderPlacement =
        GroupHeaderPlacement.values()[0].fromNative(value, null)

    public override fun toNative(obj: GroupHeaderPlacement): Int = obj.value
  }
}
