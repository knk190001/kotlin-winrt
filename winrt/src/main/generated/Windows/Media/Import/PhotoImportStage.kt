package Windows.Media.Import

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

@ABIMarker(PhotoImportStage.ABI::class)
@Signature("enum(Windows.Media.Import.PhotoImportStage;i4)")
@WinRTByReference(brClass = PhotoImportStage.ByReference::class)
public enum class PhotoImportStage(
  public val value: Int
) : NativeMapped {
  NotStarted(0),
  FindingItems(1),
  ImportingItems(2),
  DeletingImportedItemsFromSource(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhotoImportStage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStarted
      1 -> FindingItems
      2 -> ImportingItems
      3 -> DeletingImportedItemsFromSource
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhotoImportStage> {
    public fun setValue(newValue: PhotoImportStage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhotoImportStage =
        PhotoImportStage.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhotoImportStage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhotoImportStage =
        PhotoImportStage.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhotoImportStage): Int = obj.value
  }
}
