package Windows.Services.Store

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(StoreContext.ABI::class)
@Signature("rc(Windows.Services.Store.StoreContext;{ac98b6be-f4fd-4912-babd-5035e5e8bcab})")
@WinRTByReference(brClass = StoreContext.ByReference::class)
public class StoreContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreContext.WithDefault, IStoreContext2.WithDefault,
    IStoreContext3.WithDefault, IStoreContext4.WithDefault, IWinRTObject {
  private val __4421563_Interface: IStoreContext.WithDefault by lazy {
    as_4421563()
  }


  private val __137068503_Interface: IStoreContext2.WithDefault by lazy {
    as_137068503()
  }


  private val __137068504_Interface: IStoreContext3.WithDefault by lazy {
    as_137068504()
  }


  private val __137068505_Interface: IStoreContext4.WithDefault by lazy {
    as_137068505()
  }


  public override val __4421563_Ptr: JNAPointer? by lazy {
    __4421563_Interface.__4421563_Ptr
  }


  public override val __137068503_Ptr: JNAPointer? by lazy {
    __137068503_Interface.__137068503_Ptr
  }


  public override val __137068504_Ptr: JNAPointer? by lazy {
    __137068504_Interface.__137068504_Ptr
  }


  public override val __137068505_Ptr: JNAPointer? by lazy {
    __137068505_Interface.__137068505_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__4421563_Interface, __137068503_Interface, __137068504_Interface,
        __137068505_Interface)

  private fun as_4421563(): IStoreContext.WithDefault {
    if(pointer == NULL) {
      return(IStoreContext.ABI.makeIStoreContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreContext.ABI.makeIStoreContext(ref.value))
  }

  private fun as_137068503(): IStoreContext2.WithDefault {
    if(pointer == NULL) {
      return(IStoreContext2.ABI.makeIStoreContext2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreContext2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreContext2.ABI.makeIStoreContext2(ref.value))
  }

  private fun as_137068504(): IStoreContext3.WithDefault {
    if(pointer == NULL) {
      return(IStoreContext3.ABI.makeIStoreContext3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreContext3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreContext3.ABI.makeIStoreContext3(ref.value))
  }

  private fun as_137068505(): IStoreContext4.WithDefault {
    if(pointer == NULL) {
      return(IStoreContext4.ABI.makeIStoreContext4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreContext4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreContext4.ABI.makeIStoreContext4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StoreContext> {
    public override fun getValue() = StoreContext(pointer.getPointer(0))

    public fun setValue(value: StoreContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreContext, MemoryAddress> {
    public val IStoreContextStatics_Instance: IStoreContextStatics by lazy {
      createIStoreContextStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStoreContextStatics(): IStoreContextStatics {
      val refiid = Guid.REFIID(IStoreContextStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Store.StoreContext".toHandle(),refiid,interfacePtr)
      val result = IStoreContextStatics.ABI.makeIStoreContextStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StoreContext {
      val address = segment.toRawLongValue()
      return StoreContext(Pointer(address))
    }

    public override fun toNative(obj: StoreContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IStoreContextStatics_Instance.GetDefault()

    public fun GetForUser(user: User) = ABI.IStoreContextStatics_Instance.GetForUser(user)
  }
}
