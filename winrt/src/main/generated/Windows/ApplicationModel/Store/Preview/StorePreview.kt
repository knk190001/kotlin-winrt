package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(StorePreview.ABI::class)
@WinRTByReference(brClass = StorePreview.ByReference::class)
public class StorePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StorePreview> {
    public override fun getValue() = StorePreview(pointer.getPointer(0))

    public fun setValue(value: StorePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePreview, MemoryAddress> {
    public val IStorePreview_Instance: IStorePreview by lazy {
      createIStorePreview()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorePreview(): IStorePreview {
      val refiid = Guid.REFIID(IStorePreview.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.StorePreview".toHandle(),refiid,interfacePtr)
      val result = IStorePreview.ABI.makeIStorePreview(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorePreview {
      val address = segment.toRawLongValue()
      return StorePreview(Pointer(address))
    }

    public override fun toNative(obj: StorePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestProductPurchaseByProductIdAndSkuIdAsync(productId: String, skuId: String) =
        ABI.IStorePreview_Instance.RequestProductPurchaseByProductIdAndSkuIdAsync(productId, skuId)

    public fun LoadAddOnProductInfosAsync() =
        ABI.IStorePreview_Instance.LoadAddOnProductInfosAsync()
  }
}
