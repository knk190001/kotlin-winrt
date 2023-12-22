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

@ABIMarker(StoreProductPagedQueryResult.ABI::class)
@Signature("rc(Windows.Services.Store.StoreProductPagedQueryResult;{c92718c5-4dd5-4869-a462-ecc6872e43c5})")
@WinRTByReference(brClass = StoreProductPagedQueryResult.ByReference::class)
public class StoreProductPagedQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreProductPagedQueryResult.WithDefault, IWinRTObject {
  private val __1015896363_Interface: IStoreProductPagedQueryResult.WithDefault by lazy {
    as_1015896363()
  }


  public override val __1015896363_Ptr: JNAPointer? by lazy {
    __1015896363_Interface.__1015896363_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1015896363_Interface)

  private fun as_1015896363(): IStoreProductPagedQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IStoreProductPagedQueryResult.ABI.makeIStoreProductPagedQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreProductPagedQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreProductPagedQueryResult.ABI.makeIStoreProductPagedQueryResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreProductPagedQueryResult> {
    public override fun getValue() = StoreProductPagedQueryResult(pointer.getPointer(0))

    public fun setValue(value: StoreProductPagedQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreProductPagedQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreProductPagedQueryResult {
      val address = segment.toRawLongValue()
      return StoreProductPagedQueryResult(Pointer(address))
    }

    public override fun toNative(obj: StoreProductPagedQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
