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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DownloadsFolder.ABI::class)
@WinRTByReference(brClass = DownloadsFolder.ByReference::class)
public class DownloadsFolder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DownloadsFolder> {
    public override fun getValue() = DownloadsFolder(pointer.getPointer(0))

    public fun setValue(value: DownloadsFolder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DownloadsFolder, MemoryAddress> {
    public val IDownloadsFolderStatics2_Instance: IDownloadsFolderStatics2 by lazy {
      createIDownloadsFolderStatics2()
    }


    public val IDownloadsFolderStatics_Instance: IDownloadsFolderStatics by lazy {
      createIDownloadsFolderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDownloadsFolderStatics2(): IDownloadsFolderStatics2 {
      val refiid = Guid.REFIID(IDownloadsFolderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.DownloadsFolder".toHandle(),refiid,interfacePtr)
      val result = IDownloadsFolderStatics2.ABI.makeIDownloadsFolderStatics2(interfacePtr.value)
      return result
    }

    public fun createIDownloadsFolderStatics(): IDownloadsFolderStatics {
      val refiid = Guid.REFIID(IDownloadsFolderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.DownloadsFolder".toHandle(),refiid,interfacePtr)
      val result = IDownloadsFolderStatics.ABI.makeIDownloadsFolderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DownloadsFolder {
      val address = segment.toRawLongValue()
      return DownloadsFolder(Pointer(address))
    }

    public override fun toNative(obj: DownloadsFolder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFileForUserAsync(user: User, desiredName: String) =
        ABI.IDownloadsFolderStatics2_Instance.CreateFileForUserAsync(user, desiredName)

    public fun CreateFolderForUserAsync(user: User, desiredName: String) =
        ABI.IDownloadsFolderStatics2_Instance.CreateFolderForUserAsync(user, desiredName)

    public fun CreateFileForUserAsync(
      user: User,
      desiredName: String,
      option: CreationCollisionOption
    ) = ABI.IDownloadsFolderStatics2_Instance.CreateFileForUserAsync(user, desiredName, option)

    public fun CreateFolderForUserAsync(
      user: User,
      desiredName: String,
      option: CreationCollisionOption
    ) = ABI.IDownloadsFolderStatics2_Instance.CreateFolderForUserAsync(user, desiredName, option)

    public fun CreateFileAsync(desiredName: String) =
        ABI.IDownloadsFolderStatics_Instance.CreateFileAsync(desiredName)

    public fun CreateFolderAsync(desiredName: String) =
        ABI.IDownloadsFolderStatics_Instance.CreateFolderAsync(desiredName)

    public fun CreateFileAsync(desiredName: String, option: CreationCollisionOption) =
        ABI.IDownloadsFolderStatics_Instance.CreateFileAsync(desiredName, option)

    public fun CreateFolderAsync(desiredName: String, option: CreationCollisionOption) =
        ABI.IDownloadsFolderStatics_Instance.CreateFolderAsync(desiredName, option)
  }
}
