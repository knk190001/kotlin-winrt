package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(StoreHardwareManufacturerInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.StoreHardwareManufacturerInfo;{f292dc08-c654-43ac-a21f-34801c9d3388})")
@WinRTByReference(brClass = StoreHardwareManufacturerInfo.ByReference::class)
public class StoreHardwareManufacturerInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreHardwareManufacturerInfo.WithDefault, IWinRTObject {
  private val __1643043760_Interface: IStoreHardwareManufacturerInfo.WithDefault by lazy {
    as_1643043760()
  }


  public override val __1643043760_Ptr: JNAPointer? by lazy {
    __1643043760_Interface.__1643043760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1643043760_Interface)

  private fun as_1643043760(): IStoreHardwareManufacturerInfo.WithDefault {
    if(pointer == NULL) {
      return(IStoreHardwareManufacturerInfo.ABI.makeIStoreHardwareManufacturerInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreHardwareManufacturerInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreHardwareManufacturerInfo.ABI.makeIStoreHardwareManufacturerInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreHardwareManufacturerInfo> {
    public override fun getValue() = StoreHardwareManufacturerInfo(pointer.getPointer(0))

    public fun setValue(value: StoreHardwareManufacturerInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreHardwareManufacturerInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreHardwareManufacturerInfo {
      val address = segment.toRawLongValue()
      return StoreHardwareManufacturerInfo(Pointer(address))
    }

    public override fun toNative(obj: StoreHardwareManufacturerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
