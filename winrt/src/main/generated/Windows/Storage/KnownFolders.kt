package Windows.Storage

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KnownFolders.ABI::class)
@WinRTByReference(brClass = KnownFolders.ByReference::class)
public class KnownFolders(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<KnownFolders> {
    public override fun getValue() = KnownFolders(pointer.getPointer(0))

    public fun setValue(value: KnownFolders): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownFolders, MemoryAddress> {
    public val IKnownFoldersCameraRollStatics_Instance: IKnownFoldersCameraRollStatics by lazy {
      createIKnownFoldersCameraRollStatics()
    }


    public val IKnownFoldersStatics3_Instance: IKnownFoldersStatics3 by lazy {
      createIKnownFoldersStatics3()
    }


    public val IKnownFoldersStatics2_Instance: IKnownFoldersStatics2 by lazy {
      createIKnownFoldersStatics2()
    }


    public val IKnownFoldersPlaylistsStatics_Instance: IKnownFoldersPlaylistsStatics by lazy {
      createIKnownFoldersPlaylistsStatics()
    }


    public val IKnownFoldersSavedPicturesStatics_Instance: IKnownFoldersSavedPicturesStatics by
        lazy {
      createIKnownFoldersSavedPicturesStatics()
    }


    public val IKnownFoldersStatics4_Instance: IKnownFoldersStatics4 by lazy {
      createIKnownFoldersStatics4()
    }


    public val IKnownFoldersStatics_Instance: IKnownFoldersStatics by lazy {
      createIKnownFoldersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownFoldersCameraRollStatics(): IKnownFoldersCameraRollStatics {
      val refiid = Guid.REFIID(IKnownFoldersCameraRollStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result =
          IKnownFoldersCameraRollStatics.ABI.makeIKnownFoldersCameraRollStatics(interfacePtr.value)
      return result
    }

    public fun createIKnownFoldersStatics3(): IKnownFoldersStatics3 {
      val refiid = Guid.REFIID(IKnownFoldersStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result = IKnownFoldersStatics3.ABI.makeIKnownFoldersStatics3(interfacePtr.value)
      return result
    }

    public fun createIKnownFoldersStatics2(): IKnownFoldersStatics2 {
      val refiid = Guid.REFIID(IKnownFoldersStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result = IKnownFoldersStatics2.ABI.makeIKnownFoldersStatics2(interfacePtr.value)
      return result
    }

    public fun createIKnownFoldersPlaylistsStatics(): IKnownFoldersPlaylistsStatics {
      val refiid = Guid.REFIID(IKnownFoldersPlaylistsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result =
          IKnownFoldersPlaylistsStatics.ABI.makeIKnownFoldersPlaylistsStatics(interfacePtr.value)
      return result
    }

    public fun createIKnownFoldersSavedPicturesStatics(): IKnownFoldersSavedPicturesStatics {
      val refiid = Guid.REFIID(IKnownFoldersSavedPicturesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result =
          IKnownFoldersSavedPicturesStatics.ABI.makeIKnownFoldersSavedPicturesStatics(interfacePtr.value)
      return result
    }

    public fun createIKnownFoldersStatics4(): IKnownFoldersStatics4 {
      val refiid = Guid.REFIID(IKnownFoldersStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result = IKnownFoldersStatics4.ABI.makeIKnownFoldersStatics4(interfacePtr.value)
      return result
    }

    public fun createIKnownFoldersStatics(): IKnownFoldersStatics {
      val refiid = Guid.REFIID(IKnownFoldersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.KnownFolders".toHandle(),refiid,interfacePtr)
      val result = IKnownFoldersStatics.ABI.makeIKnownFoldersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownFolders {
      val address = segment.toRawLongValue()
      return KnownFolders(Pointer(address))
    }

    public override fun toNative(obj: KnownFolders): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CameraRoll() = ABI.IKnownFoldersCameraRollStatics_Instance.get_CameraRoll()

    public fun GetFolderForUserAsync(user: User, folderId: KnownFolderId) =
        ABI.IKnownFoldersStatics3_Instance.GetFolderForUserAsync(user, folderId)

    public fun get_Objects3D() = ABI.IKnownFoldersStatics2_Instance.get_Objects3D()

    public fun get_AppCaptures() = ABI.IKnownFoldersStatics2_Instance.get_AppCaptures()

    public fun get_RecordedCalls() = ABI.IKnownFoldersStatics2_Instance.get_RecordedCalls()

    public fun get_Playlists() = ABI.IKnownFoldersPlaylistsStatics_Instance.get_Playlists()

    public fun get_SavedPictures() =
        ABI.IKnownFoldersSavedPicturesStatics_Instance.get_SavedPictures()

    public fun RequestAccessAsync(folderId: KnownFolderId) =
        ABI.IKnownFoldersStatics4_Instance.RequestAccessAsync(folderId)

    public fun RequestAccessForUserAsync(user: User, folderId: KnownFolderId) =
        ABI.IKnownFoldersStatics4_Instance.RequestAccessForUserAsync(user, folderId)

    public fun GetFolderAsync(folderId: KnownFolderId) =
        ABI.IKnownFoldersStatics4_Instance.GetFolderAsync(folderId)

    public fun get_MusicLibrary() = ABI.IKnownFoldersStatics_Instance.get_MusicLibrary()

    public fun get_PicturesLibrary() = ABI.IKnownFoldersStatics_Instance.get_PicturesLibrary()

    public fun get_VideosLibrary() = ABI.IKnownFoldersStatics_Instance.get_VideosLibrary()

    public fun get_DocumentsLibrary() = ABI.IKnownFoldersStatics_Instance.get_DocumentsLibrary()

    public fun get_HomeGroup() = ABI.IKnownFoldersStatics_Instance.get_HomeGroup()

    public fun get_RemovableDevices() = ABI.IKnownFoldersStatics_Instance.get_RemovableDevices()

    public fun get_MediaServerDevices() = ABI.IKnownFoldersStatics_Instance.get_MediaServerDevices()
  }
}
