package Windows.Services.Store

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

@ABIMarker(StoreProductResult.ABI::class)
@Signature("rc(Windows.Services.Store.StoreProductResult;{b7674f73-3c87-4ee1-8201-f428359bd3af})")
@WinRTByReference(brClass = StoreProductResult.ByReference::class)
public class StoreProductResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreProductResult.WithDefault, IWinRTObject {
  private val __4610808_Interface: IStoreProductResult.WithDefault by lazy {
    as_4610808()
  }


  public override val __4610808_Ptr: JNAPointer? by lazy {
    __4610808_Interface.__4610808_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__4610808_Interface)

  private fun as_4610808(): IStoreProductResult.WithDefault {
    if(pointer == NULL) {
      return(IStoreProductResult.ABI.makeIStoreProductResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreProductResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreProductResult.ABI.makeIStoreProductResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreProductResult> {
    public override fun getValue() = StoreProductResult(pointer.getPointer(0))

    public fun setValue(value: StoreProductResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreProductResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreProductResult {
      val address = segment.toRawLongValue()
      return StoreProductResult(Pointer(address))
    }

    public override fun toNative(obj: StoreProductResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
