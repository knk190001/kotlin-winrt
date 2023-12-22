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

@ABIMarker(StoreAvailability.ABI::class)
@Signature("rc(Windows.Services.Store.StoreAvailability;{fa060325-0ffd-4493-ad43-f1f9918f69fa})")
@WinRTByReference(brClass = StoreAvailability.ByReference::class)
public class StoreAvailability(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreAvailability.WithDefault, IWinRTObject {
  private val __995572431_Interface: IStoreAvailability.WithDefault by lazy {
    as_995572431()
  }


  public override val __995572431_Ptr: JNAPointer? by lazy {
    __995572431_Interface.__995572431_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__995572431_Interface)

  private fun as_995572431(): IStoreAvailability.WithDefault {
    if(pointer == NULL) {
      return(IStoreAvailability.ABI.makeIStoreAvailability(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreAvailability>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreAvailability.ABI.makeIStoreAvailability(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreAvailability> {
    public override fun getValue() = StoreAvailability(pointer.getPointer(0))

    public fun setValue(value: StoreAvailability): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreAvailability, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreAvailability {
      val address = segment.toRawLongValue()
      return StoreAvailability(Pointer(address))
    }

    public override fun toNative(obj: StoreAvailability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
