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

@ABIMarker(StoreConsumableResult.ABI::class)
@Signature("rc(Windows.Services.Store.StoreConsumableResult;{ea5dab72-6a00-4052-be5b-bfdab4433352})")
@WinRTByReference(brClass = StoreConsumableResult.ByReference::class)
public class StoreConsumableResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreConsumableResult.WithDefault, IWinRTObject {
  private val __996263892_Interface: IStoreConsumableResult.WithDefault by lazy {
    as_996263892()
  }


  public override val __996263892_Ptr: JNAPointer? by lazy {
    __996263892_Interface.__996263892_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__996263892_Interface)

  private fun as_996263892(): IStoreConsumableResult.WithDefault {
    if(pointer == NULL) {
      return(IStoreConsumableResult.ABI.makeIStoreConsumableResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreConsumableResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreConsumableResult.ABI.makeIStoreConsumableResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreConsumableResult> {
    public override fun getValue() = StoreConsumableResult(pointer.getPointer(0))

    public fun setValue(value: StoreConsumableResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreConsumableResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreConsumableResult {
      val address = segment.toRawLongValue()
      return StoreConsumableResult(Pointer(address))
    }

    public override fun toNative(obj: StoreConsumableResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
