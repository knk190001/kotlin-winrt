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

@ABIMarker(StorePrice.ABI::class)
@Signature("rc(Windows.Services.Store.StorePrice;{55ba94c4-15f1-407c-8f06-006380f4df0b})")
@WinRTByReference(brClass = StorePrice.ByReference::class)
public class StorePrice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePrice.WithDefault, IWinRTObject {
  private val __68352427_Interface: IStorePrice.WithDefault by lazy {
    as_68352427()
  }


  public override val __68352427_Ptr: JNAPointer? by lazy {
    __68352427_Interface.__68352427_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__68352427_Interface)

  private fun as_68352427(): IStorePrice.WithDefault {
    if(pointer == NULL) {
      return(IStorePrice.ABI.makeIStorePrice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePrice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePrice.ABI.makeIStorePrice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StorePrice> {
    public override fun getValue() = StorePrice(pointer.getPointer(0))

    public fun setValue(value: StorePrice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePrice, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePrice {
      val address = segment.toRawLongValue()
      return StorePrice(Pointer(address))
    }

    public override fun toNative(obj: StorePrice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
