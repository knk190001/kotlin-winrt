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

@ABIMarker(ItemCollectionTransitionTriggers.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ItemCollectionTransitionTriggers;u4)")
@WinRTByReference(brClass = ItemCollectionTransitionTriggers.ByReference::class)
public enum class ItemCollectionTransitionTriggers(
  public val value: Int
) : NativeMapped {
  CollectionChangeAdd(1),
  CollectionChangeRemove(2),
  CollectionChangeReset(4),
  LayoutTransition(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ItemCollectionTransitionTriggers {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> CollectionChangeAdd
      2 -> CollectionChangeRemove
      4 -> CollectionChangeReset
      8 -> LayoutTransition
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ItemCollectionTransitionTriggers> {
    public fun setValue(newValue: ItemCollectionTransitionTriggers): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ItemCollectionTransitionTriggers =
        ItemCollectionTransitionTriggers.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ItemCollectionTransitionTriggers, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ItemCollectionTransitionTriggers =
        ItemCollectionTransitionTriggers.values()[0].fromNative(value, null)

    public override fun toNative(obj: ItemCollectionTransitionTriggers): Int = obj.value
  }
}
