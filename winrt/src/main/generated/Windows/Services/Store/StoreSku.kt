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

@ABIMarker(StoreSku.ABI::class)
@Signature("rc(Windows.Services.Store.StoreSku;{397e6f55-4440-4f03-863c-91f3fec83d79})")
@WinRTByReference(brClass = StoreSku.ByReference::class)
public class StoreSku(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreSku.WithDefault, IWinRTObject {
  private val __960961239_Interface: IStoreSku.WithDefault by lazy {
    as_960961239()
  }


  public override val __960961239_Ptr: JNAPointer? by lazy {
    __960961239_Interface.__960961239_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__960961239_Interface)

  private fun as_960961239(): IStoreSku.WithDefault {
    if(pointer == NULL) {
      return(IStoreSku.ABI.makeIStoreSku(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreSku>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreSku.ABI.makeIStoreSku(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StoreSku> {
    public override fun getValue() = StoreSku(pointer.getPointer(0))

    public fun setValue(value: StoreSku): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreSku, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreSku {
      val address = segment.toRawLongValue()
      return StoreSku(Pointer(address))
    }

    public override fun toNative(obj: StoreSku): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
