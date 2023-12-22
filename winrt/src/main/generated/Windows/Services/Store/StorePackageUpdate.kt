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

@ABIMarker(StorePackageUpdate.ABI::class)
@Signature("rc(Windows.Services.Store.StorePackageUpdate;{140fa150-3cbf-4a35-b91f-48271c31b072})")
@WinRTByReference(brClass = StorePackageUpdate.ByReference::class)
public class StorePackageUpdate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePackageUpdate.WithDefault, IWinRTObject {
  private val __656741819_Interface: IStorePackageUpdate.WithDefault by lazy {
    as_656741819()
  }


  public override val __656741819_Ptr: JNAPointer? by lazy {
    __656741819_Interface.__656741819_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__656741819_Interface)

  private fun as_656741819(): IStorePackageUpdate.WithDefault {
    if(pointer == NULL) {
      return(IStorePackageUpdate.ABI.makeIStorePackageUpdate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePackageUpdate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePackageUpdate.ABI.makeIStorePackageUpdate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePackageUpdate> {
    public override fun getValue() = StorePackageUpdate(pointer.getPointer(0))

    public fun setValue(value: StorePackageUpdate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePackageUpdate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePackageUpdate {
      val address = segment.toRawLongValue()
      return StorePackageUpdate(Pointer(address))
    }

    public override fun toNative(obj: StorePackageUpdate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
