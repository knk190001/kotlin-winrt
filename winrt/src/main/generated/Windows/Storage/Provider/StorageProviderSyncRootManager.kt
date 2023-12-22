package Windows.Storage.Provider

import Windows.Storage.IStorageFolder
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

@ABIMarker(StorageProviderSyncRootManager.ABI::class)
@WinRTByReference(brClass = StorageProviderSyncRootManager.ByReference::class)
public class StorageProviderSyncRootManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderSyncRootManager> {
    public override fun getValue() = StorageProviderSyncRootManager(pointer.getPointer(0))

    public fun setValue(value: StorageProviderSyncRootManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderSyncRootManager, MemoryAddress> {
    public val IStorageProviderSyncRootManagerStatics_Instance:
        IStorageProviderSyncRootManagerStatics by lazy {
      createIStorageProviderSyncRootManagerStatics()
    }


    public val IStorageProviderSyncRootManagerStatics2_Instance:
        IStorageProviderSyncRootManagerStatics2 by lazy {
      createIStorageProviderSyncRootManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageProviderSyncRootManagerStatics():
        IStorageProviderSyncRootManagerStatics {
      val refiid = Guid.REFIID(IStorageProviderSyncRootManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderSyncRootManager".toHandle(),refiid,interfacePtr)
      val result =
          IStorageProviderSyncRootManagerStatics.ABI.makeIStorageProviderSyncRootManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIStorageProviderSyncRootManagerStatics2():
        IStorageProviderSyncRootManagerStatics2 {
      val refiid = Guid.REFIID(IStorageProviderSyncRootManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderSyncRootManager".toHandle(),refiid,interfacePtr)
      val result =
          IStorageProviderSyncRootManagerStatics2.ABI.makeIStorageProviderSyncRootManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageProviderSyncRootManager {
      val address = segment.toRawLongValue()
      return StorageProviderSyncRootManager(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderSyncRootManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Register(syncRootInformation: StorageProviderSyncRootInfo) =
        ABI.IStorageProviderSyncRootManagerStatics_Instance.Register(syncRootInformation)

    public fun Unregister(id: String) =
        ABI.IStorageProviderSyncRootManagerStatics_Instance.Unregister(id)

    public fun GetSyncRootInformationForFolder(folder: IStorageFolder) =
        ABI.IStorageProviderSyncRootManagerStatics_Instance.GetSyncRootInformationForFolder(folder)

    public fun GetSyncRootInformationForId(id: String) =
        ABI.IStorageProviderSyncRootManagerStatics_Instance.GetSyncRootInformationForId(id)

    public fun GetCurrentSyncRoots() =
        ABI.IStorageProviderSyncRootManagerStatics_Instance.GetCurrentSyncRoots()

    public fun IsSupported() = ABI.IStorageProviderSyncRootManagerStatics2_Instance.IsSupported()
  }
}
