package Windows.ApplicationModel.Store.Preview

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(StorePreviewPurchaseResults.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.StorePreviewPurchaseResults;{b0daaed1-d6c5-4e53-a043-fba0d8e61231})")
@WinRTByReference(brClass = StorePreviewPurchaseResults.ByReference::class)
public class StorePreviewPurchaseResults(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePreviewPurchaseResults.WithDefault, IWinRTObject {
  private val __1147521686_Interface: IStorePreviewPurchaseResults.WithDefault by lazy {
    as_1147521686()
  }


  public override val __1147521686_Ptr: JNAPointer? by lazy {
    __1147521686_Interface.__1147521686_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1147521686_Interface)

  private fun as_1147521686(): IStorePreviewPurchaseResults.WithDefault {
    if(pointer == NULL) {
      return(IStorePreviewPurchaseResults.ABI.makeIStorePreviewPurchaseResults(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePreviewPurchaseResults>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePreviewPurchaseResults.ABI.makeIStorePreviewPurchaseResults(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePreviewPurchaseResults> {
    public override fun getValue() = StorePreviewPurchaseResults(pointer.getPointer(0))

    public fun setValue(value: StorePreviewPurchaseResults): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePreviewPurchaseResults, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePreviewPurchaseResults {
      val address = segment.toRawLongValue()
      return StorePreviewPurchaseResults(Pointer(address))
    }

    public override fun toNative(obj: StorePreviewPurchaseResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
