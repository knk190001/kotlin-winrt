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

@ABIMarker(StorePackageUpdateResult.ABI::class)
@Signature("rc(Windows.Services.Store.StorePackageUpdateResult;{e79142ed-61f9-4893-b4fe-cf191603af7b})")
@WinRTByReference(brClass = StorePackageUpdateResult.ByReference::class)
public class StorePackageUpdateResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePackageUpdateResult.WithDefault, IStorePackageUpdateResult2.WithDefault,
    IWinRTObject {
  private val __1876864584_Interface: IStorePackageUpdateResult.WithDefault by lazy {
    as_1876864584()
  }


  private val __1946740090_Interface: IStorePackageUpdateResult2.WithDefault by lazy {
    as_1946740090()
  }


  public override val __1876864584_Ptr: JNAPointer? by lazy {
    __1876864584_Interface.__1876864584_Ptr
  }


  public override val __1946740090_Ptr: JNAPointer? by lazy {
    __1946740090_Interface.__1946740090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1876864584_Interface, __1946740090_Interface)

  private fun as_1876864584(): IStorePackageUpdateResult.WithDefault {
    if(pointer == NULL) {
      return(IStorePackageUpdateResult.ABI.makeIStorePackageUpdateResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePackageUpdateResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePackageUpdateResult.ABI.makeIStorePackageUpdateResult(ref.value))
  }

  private fun as_1946740090(): IStorePackageUpdateResult2.WithDefault {
    if(pointer == NULL) {
      return(IStorePackageUpdateResult2.ABI.makeIStorePackageUpdateResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePackageUpdateResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePackageUpdateResult2.ABI.makeIStorePackageUpdateResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePackageUpdateResult> {
    public override fun getValue() = StorePackageUpdateResult(pointer.getPointer(0))

    public fun setValue(value: StorePackageUpdateResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePackageUpdateResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePackageUpdateResult {
      val address = segment.toRawLongValue()
      return StorePackageUpdateResult(Pointer(address))
    }

    public override fun toNative(obj: StorePackageUpdateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
