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

@ABIMarker(StoreQueueItem.ABI::class)
@Signature("rc(Windows.Services.Store.StoreQueueItem;{56d5c32b-f830-4293-9188-cad2dcde7357})")
@WinRTByReference(brClass = StoreQueueItem.ByReference::class)
public class StoreQueueItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreQueueItem.WithDefault, IStoreQueueItem2.WithDefault, IWinRTObject {
  private val __1378810160_Interface: IStoreQueueItem.WithDefault by lazy {
    as_1378810160()
  }


  private val __206558050_Interface: IStoreQueueItem2.WithDefault by lazy {
    as_206558050()
  }


  public override val __1378810160_Ptr: JNAPointer? by lazy {
    __1378810160_Interface.__1378810160_Ptr
  }


  public override val __206558050_Ptr: JNAPointer? by lazy {
    __206558050_Interface.__206558050_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1378810160_Interface, __206558050_Interface)

  private fun as_1378810160(): IStoreQueueItem.WithDefault {
    if(pointer == NULL) {
      return(IStoreQueueItem.ABI.makeIStoreQueueItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreQueueItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreQueueItem.ABI.makeIStoreQueueItem(ref.value))
  }

  private fun as_206558050(): IStoreQueueItem2.WithDefault {
    if(pointer == NULL) {
      return(IStoreQueueItem2.ABI.makeIStoreQueueItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreQueueItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreQueueItem2.ABI.makeIStoreQueueItem2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StoreQueueItem>
      {
    public override fun getValue() = StoreQueueItem(pointer.getPointer(0))

    public fun setValue(value: StoreQueueItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreQueueItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreQueueItem {
      val address = segment.toRawLongValue()
      return StoreQueueItem(Pointer(address))
    }

    public override fun toNative(obj: StoreQueueItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
