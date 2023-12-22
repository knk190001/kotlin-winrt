package Windows.Security.EnterpriseData

import Windows.Storage.IStorageItem
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

@ABIMarker(FileRevocationManager.ABI::class)
@WinRTByReference(brClass = FileRevocationManager.ByReference::class)
public class FileRevocationManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileRevocationManager> {
    public override fun getValue() = FileRevocationManager(pointer.getPointer(0))

    public fun setValue(value: FileRevocationManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileRevocationManager, MemoryAddress> {
    public val IFileRevocationManagerStatics_Instance: IFileRevocationManagerStatics by lazy {
      createIFileRevocationManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileRevocationManagerStatics(): IFileRevocationManagerStatics {
      val refiid = Guid.REFIID(IFileRevocationManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.FileRevocationManager".toHandle(),refiid,interfacePtr)
      val result =
          IFileRevocationManagerStatics.ABI.makeIFileRevocationManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FileRevocationManager {
      val address = segment.toRawLongValue()
      return FileRevocationManager(Pointer(address))
    }

    public override fun toNative(obj: FileRevocationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ProtectAsync(storageItem: IStorageItem, enterpriseIdentity: String) =
        ABI.IFileRevocationManagerStatics_Instance.ProtectAsync(storageItem, enterpriseIdentity)

    public fun CopyProtectionAsync(sourceStorageItem: IStorageItem, targetStorageItem: IStorageItem)
        = ABI.IFileRevocationManagerStatics_Instance.CopyProtectionAsync(sourceStorageItem,
        targetStorageItem)

    public fun Revoke(enterpriseIdentity: String) =
        ABI.IFileRevocationManagerStatics_Instance.Revoke(enterpriseIdentity)

    public fun GetStatusAsync(storageItem: IStorageItem) =
        ABI.IFileRevocationManagerStatics_Instance.GetStatusAsync(storageItem)
  }
}
