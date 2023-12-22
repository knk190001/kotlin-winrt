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

@ABIMarker(ItemCollectionTransitionOperation.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ItemCollectionTransitionOperation;i4)")
@WinRTByReference(brClass = ItemCollectionTransitionOperation.ByReference::class)
public enum class ItemCollectionTransitionOperation(
  public val value: Int
) : NativeMapped {
  Add(0),
  Remove(1),
  Move(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ItemCollectionTransitionOperation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Add
      1 -> Remove
      2 -> Move
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ItemCollectionTransitionOperation> {
    public fun setValue(newValue: ItemCollectionTransitionOperation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ItemCollectionTransitionOperation =
        ItemCollectionTransitionOperation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ItemCollectionTransitionOperation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ItemCollectionTransitionOperation =
        ItemCollectionTransitionOperation.values()[0].fromNative(value, null)

    public override fun toNative(obj: ItemCollectionTransitionOperation): Int = obj.value
  }
}
