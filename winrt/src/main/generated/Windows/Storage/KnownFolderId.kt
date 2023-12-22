package Windows.Storage

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

@ABIMarker(KnownFolderId.ABI::class)
@Signature("enum(Windows.Storage.KnownFolderId;i4)")
@WinRTByReference(brClass = KnownFolderId.ByReference::class)
public enum class KnownFolderId(
  public val value: Int
) : NativeMapped {
  AppCaptures(0),
  CameraRoll(1),
  DocumentsLibrary(2),
  HomeGroup(3),
  MediaServerDevices(4),
  MusicLibrary(5),
  Objects3D(6),
  PicturesLibrary(7),
  Playlists(8),
  RecordedCalls(9),
  RemovableDevices(10),
  SavedPictures(11),
  Screenshots(12),
  VideosLibrary(13),
  AllAppMods(14),
  CurrentAppMods(15),
  DownloadsFolder(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KnownFolderId {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AppCaptures
      1 -> CameraRoll
      2 -> DocumentsLibrary
      3 -> HomeGroup
      4 -> MediaServerDevices
      5 -> MusicLibrary
      6 -> Objects3D
      7 -> PicturesLibrary
      8 -> Playlists
      9 -> RecordedCalls
      10 -> RemovableDevices
      11 -> SavedPictures
      12 -> Screenshots
      13 -> VideosLibrary
      14 -> AllAppMods
      15 -> CurrentAppMods
      16 -> DownloadsFolder
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KnownFolderId> {
    public fun setValue(newValue: KnownFolderId): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KnownFolderId =
        KnownFolderId.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KnownFolderId, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KnownFolderId =
        KnownFolderId.values()[0].fromNative(value, null)

    public override fun toNative(obj: KnownFolderId): Int = obj.value
  }
}
