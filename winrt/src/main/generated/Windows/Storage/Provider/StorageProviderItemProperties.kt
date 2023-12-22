package Windows.Storage.Provider

import Windows.Foundation.Collections.IIterable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StorageProviderItemProperties.ABI::class)
@WinRTByReference(brClass = StorageProviderItemProperties.ByReference::class)
public class StorageProviderItemProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProviderItemProperties> {
    public override fun getValue() = StorageProviderItemProperties(pointer.getPointer(0))

    public fun setValue(value: StorageProviderItemProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProviderItemProperties, MemoryAddress> {
    public val IStorageProviderItemPropertiesStatics_Instance: IStorageProviderItemPropertiesStatics
        by lazy {
      createIStorageProviderItemPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageProviderItemPropertiesStatics():
        IStorageProviderItemPropertiesStatics {
      val refiid = Guid.REFIID(IStorageProviderItemPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.StorageProviderItemProperties".toHandle(),refiid,interfacePtr)
      val result =
          IStorageProviderItemPropertiesStatics.ABI.makeIStorageProviderItemPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageProviderItemProperties {
      val address = segment.toRawLongValue()
      return StorageProviderItemProperties(Pointer(address))
    }

    public override fun toNative(obj: StorageProviderItemProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetAsync(item: IStorageItem, itemProperties: IIterable<StorageProviderItemProperty?>)
        = ABI.IStorageProviderItemPropertiesStatics_Instance.SetAsync(item, itemProperties)
  }
}
