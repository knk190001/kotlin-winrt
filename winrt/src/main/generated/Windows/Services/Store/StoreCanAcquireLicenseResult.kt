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

@ABIMarker(StoreCanAcquireLicenseResult.ABI::class)
@Signature("rc(Windows.Services.Store.StoreCanAcquireLicenseResult;{3a693db3-0088-482f-86d5-bd46522663ad})")
@WinRTByReference(brClass = StoreCanAcquireLicenseResult.ByReference::class)
public class StoreCanAcquireLicenseResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreCanAcquireLicenseResult.WithDefault, IWinRTObject {
  private val __849540228_Interface: IStoreCanAcquireLicenseResult.WithDefault by lazy {
    as_849540228()
  }


  public override val __849540228_Ptr: JNAPointer? by lazy {
    __849540228_Interface.__849540228_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__849540228_Interface)

  private fun as_849540228(): IStoreCanAcquireLicenseResult.WithDefault {
    if(pointer == NULL) {
      return(IStoreCanAcquireLicenseResult.ABI.makeIStoreCanAcquireLicenseResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreCanAcquireLicenseResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreCanAcquireLicenseResult.ABI.makeIStoreCanAcquireLicenseResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreCanAcquireLicenseResult> {
    public override fun getValue() = StoreCanAcquireLicenseResult(pointer.getPointer(0))

    public fun setValue(value: StoreCanAcquireLicenseResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreCanAcquireLicenseResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreCanAcquireLicenseResult {
      val address = segment.toRawLongValue()
      return StoreCanAcquireLicenseResult(Pointer(address))
    }

    public override fun toNative(obj: StoreCanAcquireLicenseResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
