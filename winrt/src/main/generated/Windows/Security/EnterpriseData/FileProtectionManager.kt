package Windows.Security.EnterpriseData

import Windows.Foundation.Collections.IIterable
import Windows.Storage.CreationCollisionOption
import Windows.Storage.IStorageFile
import Windows.Storage.IStorageFolder
import Windows.Storage.IStorageItem
import Windows.Storage.NameCollisionOption
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

@ABIMarker(FileProtectionManager.ABI::class)
@WinRTByReference(brClass = FileProtectionManager.ByReference::class)
public class FileProtectionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileProtectionManager> {
    public override fun getValue() = FileProtectionManager(pointer.getPointer(0))

    public fun setValue(value: FileProtectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileProtectionManager, MemoryAddress> {
    public val IFileProtectionManagerStatics_Instance: IFileProtectionManagerStatics by lazy {
      createIFileProtectionManagerStatics()
    }


    public val IFileProtectionManagerStatics2_Instance: IFileProtectionManagerStatics2 by lazy {
      createIFileProtectionManagerStatics2()
    }


    public val IFileProtectionManagerStatics3_Instance: IFileProtectionManagerStatics3 by lazy {
      createIFileProtectionManagerStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileProtectionManagerStatics(): IFileProtectionManagerStatics {
      val refiid = Guid.REFIID(IFileProtectionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.FileProtectionManager".toHandle(),refiid,interfacePtr)
      val result =
          IFileProtectionManagerStatics.ABI.makeIFileProtectionManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIFileProtectionManagerStatics2(): IFileProtectionManagerStatics2 {
      val refiid = Guid.REFIID(IFileProtectionManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.FileProtectionManager".toHandle(),refiid,interfacePtr)
      val result =
          IFileProtectionManagerStatics2.ABI.makeIFileProtectionManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIFileProtectionManagerStatics3(): IFileProtectionManagerStatics3 {
      val refiid = Guid.REFIID(IFileProtectionManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.FileProtectionManager".toHandle(),refiid,interfacePtr)
      val result =
          IFileProtectionManagerStatics3.ABI.makeIFileProtectionManagerStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FileProtectionManager {
      val address = segment.toRawLongValue()
      return FileProtectionManager(Pointer(address))
    }

    public override fun toNative(obj: FileProtectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ProtectAsync(target: IStorageItem, identity: String) =
        ABI.IFileProtectionManagerStatics_Instance.ProtectAsync(target, identity)

    public fun CopyProtectionAsync(source: IStorageItem, target: IStorageItem) =
        ABI.IFileProtectionManagerStatics_Instance.CopyProtectionAsync(source, target)

    public fun GetProtectionInfoAsync(source: IStorageItem) =
        ABI.IFileProtectionManagerStatics_Instance.GetProtectionInfoAsync(source)

    public fun SaveFileAsContainerAsync(protectedFile: IStorageFile) =
        ABI.IFileProtectionManagerStatics_Instance.SaveFileAsContainerAsync(protectedFile)

    public fun LoadFileFromContainerAsync(containerFile: IStorageFile) =
        ABI.IFileProtectionManagerStatics_Instance.LoadFileFromContainerAsync(containerFile)

    public fun LoadFileFromContainerAsync(containerFile: IStorageFile, target: IStorageItem) =
        ABI.IFileProtectionManagerStatics_Instance.LoadFileFromContainerAsync(containerFile, target)

    public fun CreateProtectedAndOpenAsync(
      parentFolder: IStorageFolder,
      desiredName: String,
      identity: String,
      collisionOption: CreationCollisionOption
    ) = ABI.IFileProtectionManagerStatics_Instance.CreateProtectedAndOpenAsync(parentFolder,
        desiredName, identity, collisionOption)

    public fun IsContainerAsync(`file`: IStorageFile) =
        ABI.IFileProtectionManagerStatics2_Instance.IsContainerAsync(file)

    public fun LoadFileFromContainerAsync(
      containerFile: IStorageFile,
      target: IStorageItem,
      collisionOption: NameCollisionOption
    ) = ABI.IFileProtectionManagerStatics2_Instance.LoadFileFromContainerAsync(containerFile,
        target, collisionOption)

    public fun SaveFileAsContainerAsync(protectedFile: IStorageFile,
        sharedWithIdentities: IIterable<String?>) =
        ABI.IFileProtectionManagerStatics2_Instance.SaveFileAsContainerAsync(protectedFile,
        sharedWithIdentities)

    public fun UnprotectAsync(target: IStorageItem) =
        ABI.IFileProtectionManagerStatics3_Instance.UnprotectAsync(target)

    public fun UnprotectAsync(target: IStorageItem, options: FileUnprotectOptions) =
        ABI.IFileProtectionManagerStatics3_Instance.UnprotectAsync(target, options)
  }
}
