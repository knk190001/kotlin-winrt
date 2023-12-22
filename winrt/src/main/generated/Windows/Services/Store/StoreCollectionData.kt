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

@ABIMarker(StoreCollectionData.ABI::class)
@Signature("rc(Windows.Services.Store.StoreCollectionData;{8aa4c3b3-5bb3-441a-2ab4-4dab73d5ce67})")
@WinRTByReference(brClass = StoreCollectionData.ByReference::class)
public class StoreCollectionData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreCollectionData.WithDefault, IWinRTObject {
  private val __510317604_Interface: IStoreCollectionData.WithDefault by lazy {
    as_510317604()
  }


  public override val __510317604_Ptr: JNAPointer? by lazy {
    __510317604_Interface.__510317604_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__510317604_Interface)

  private fun as_510317604(): IStoreCollectionData.WithDefault {
    if(pointer == NULL) {
      return(IStoreCollectionData.ABI.makeIStoreCollectionData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreCollectionData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreCollectionData.ABI.makeIStoreCollectionData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreCollectionData> {
    public override fun getValue() = StoreCollectionData(pointer.getPointer(0))

    public fun setValue(value: StoreCollectionData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreCollectionData, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreCollectionData {
      val address = segment.toRawLongValue()
      return StoreCollectionData(Pointer(address))
    }

    public override fun toNative(obj: StoreCollectionData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
