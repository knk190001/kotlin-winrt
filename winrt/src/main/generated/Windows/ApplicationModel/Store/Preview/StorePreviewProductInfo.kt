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

@ABIMarker(StorePreviewProductInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.StorePreviewProductInfo;{1937dbb3-6c01-4c9d-85cd-5babaac2b351})")
@WinRTByReference(brClass = StorePreviewProductInfo.ByReference::class)
public class StorePreviewProductInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePreviewProductInfo.WithDefault, IWinRTObject {
  private val __1205822050_Interface: IStorePreviewProductInfo.WithDefault by lazy {
    as_1205822050()
  }


  public override val __1205822050_Ptr: JNAPointer? by lazy {
    __1205822050_Interface.__1205822050_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1205822050_Interface)

  private fun as_1205822050(): IStorePreviewProductInfo.WithDefault {
    if(pointer == NULL) {
      return(IStorePreviewProductInfo.ABI.makeIStorePreviewProductInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePreviewProductInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePreviewProductInfo.ABI.makeIStorePreviewProductInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePreviewProductInfo> {
    public override fun getValue() = StorePreviewProductInfo(pointer.getPointer(0))

    public fun setValue(value: StorePreviewProductInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePreviewProductInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePreviewProductInfo {
      val address = segment.toRawLongValue()
      return StorePreviewProductInfo(Pointer(address))
    }

    public override fun toNative(obj: StorePreviewProductInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
