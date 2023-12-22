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

@ABIMarker(StoreProductQueryResult.ABI::class)
@Signature("rc(Windows.Services.Store.StoreProductQueryResult;{d805e6c5-d456-4ff6-8049-9076d5165f73})")
@WinRTByReference(brClass = StoreProductQueryResult.ByReference::class)
public class StoreProductQueryResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreProductQueryResult.WithDefault, IWinRTObject {
  private val __1318458634_Interface: IStoreProductQueryResult.WithDefault by lazy {
    as_1318458634()
  }


  public override val __1318458634_Ptr: JNAPointer? by lazy {
    __1318458634_Interface.__1318458634_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1318458634_Interface)

  private fun as_1318458634(): IStoreProductQueryResult.WithDefault {
    if(pointer == NULL) {
      return(IStoreProductQueryResult.ABI.makeIStoreProductQueryResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreProductQueryResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreProductQueryResult.ABI.makeIStoreProductQueryResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreProductQueryResult> {
    public override fun getValue() = StoreProductQueryResult(pointer.getPointer(0))

    public fun setValue(value: StoreProductQueryResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreProductQueryResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreProductQueryResult {
      val address = segment.toRawLongValue()
      return StoreProductQueryResult(Pointer(address))
    }

    public override fun toNative(obj: StoreProductQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
