package Windows.ApplicationModel.DataTransfer

import Windows.Storage.IStorageFile
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

@ABIMarker(SharedStorageAccessManager.ABI::class)
@WinRTByReference(brClass = SharedStorageAccessManager.ByReference::class)
public class SharedStorageAccessManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SharedStorageAccessManager> {
    public override fun getValue() = SharedStorageAccessManager(pointer.getPointer(0))

    public fun setValue(value: SharedStorageAccessManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SharedStorageAccessManager, MemoryAddress> {
    public val ISharedStorageAccessManagerStatics_Instance: ISharedStorageAccessManagerStatics by
        lazy {
      createISharedStorageAccessManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISharedStorageAccessManagerStatics(): ISharedStorageAccessManagerStatics {
      val refiid = Guid.REFIID(ISharedStorageAccessManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager".toHandle(),refiid,interfacePtr)
      val result =
          ISharedStorageAccessManagerStatics.ABI.makeISharedStorageAccessManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SharedStorageAccessManager {
      val address = segment.toRawLongValue()
      return SharedStorageAccessManager(Pointer(address))
    }

    public override fun toNative(obj: SharedStorageAccessManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AddFile(`file`: IStorageFile) =
        ABI.ISharedStorageAccessManagerStatics_Instance.AddFile(file)

    public fun RedeemTokenForFileAsync(token: String) =
        ABI.ISharedStorageAccessManagerStatics_Instance.RedeemTokenForFileAsync(token)

    public fun RemoveFile(token: String) =
        ABI.ISharedStorageAccessManagerStatics_Instance.RemoveFile(token)
  }
}
