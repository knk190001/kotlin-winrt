package Windows.Storage.Pickers

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

@ABIMarker(PickerLocationId.ABI::class)
@Signature("enum(Windows.Storage.Pickers.PickerLocationId;i4)")
@WinRTByReference(brClass = PickerLocationId.ByReference::class)
public enum class PickerLocationId(
  public val value: Int
) : NativeMapped {
  DocumentsLibrary(0),
  ComputerFolder(1),
  Desktop(2),
  Downloads(3),
  HomeGroup(4),
  MusicLibrary(5),
  PicturesLibrary(6),
  VideosLibrary(7),
  Objects3D(8),
  Unspecified(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PickerLocationId {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DocumentsLibrary
      1 -> ComputerFolder
      2 -> Desktop
      3 -> Downloads
      4 -> HomeGroup
      5 -> MusicLibrary
      6 -> PicturesLibrary
      7 -> VideosLibrary
      8 -> Objects3D
      9 -> Unspecified
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PickerLocationId> {
    public fun setValue(newValue: PickerLocationId): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PickerLocationId =
        PickerLocationId.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PickerLocationId, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PickerLocationId =
        PickerLocationId.values()[0].fromNative(value, null)

    public override fun toNative(obj: PickerLocationId): Int = obj.value
  }
}
