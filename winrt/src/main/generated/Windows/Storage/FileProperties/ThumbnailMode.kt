package Windows.Storage.FileProperties

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

@ABIMarker(ThumbnailMode.ABI::class)
@Signature("enum(Windows.Storage.FileProperties.ThumbnailMode;i4)")
@WinRTByReference(brClass = ThumbnailMode.ByReference::class)
public enum class ThumbnailMode(
  public val value: Int
) : NativeMapped {
  PicturesView(0),
  VideosView(1),
  MusicView(2),
  DocumentsView(3),
  ListView(4),
  SingleItem(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ThumbnailMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PicturesView
      1 -> VideosView
      2 -> MusicView
      3 -> DocumentsView
      4 -> ListView
      5 -> SingleItem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ThumbnailMode> {
    public fun setValue(newValue: ThumbnailMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ThumbnailMode =
        ThumbnailMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ThumbnailMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ThumbnailMode =
        ThumbnailMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ThumbnailMode): Int = obj.value
  }
}
