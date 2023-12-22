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

@ABIMarker(StorePreviewSkuInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.StorePreviewSkuInfo;{81fd76e2-0b26-48d9-98ce-27461c669d6c})")
@WinRTByReference(brClass = StorePreviewSkuInfo.ByReference::class)
public class StorePreviewSkuInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePreviewSkuInfo.WithDefault, IWinRTObject {
  private val __667524940_Interface: IStorePreviewSkuInfo.WithDefault by lazy {
    as_667524940()
  }


  public override val __667524940_Ptr: JNAPointer? by lazy {
    __667524940_Interface.__667524940_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__667524940_Interface)

  private fun as_667524940(): IStorePreviewSkuInfo.WithDefault {
    if(pointer == NULL) {
      return(IStorePreviewSkuInfo.ABI.makeIStorePreviewSkuInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePreviewSkuInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePreviewSkuInfo.ABI.makeIStorePreviewSkuInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePreviewSkuInfo> {
    public override fun getValue() = StorePreviewSkuInfo(pointer.getPointer(0))

    public fun setValue(value: StorePreviewSkuInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePreviewSkuInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePreviewSkuInfo {
      val address = segment.toRawLongValue()
      return StorePreviewSkuInfo(Pointer(address))
    }

    public override fun toNative(obj: StorePreviewSkuInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
