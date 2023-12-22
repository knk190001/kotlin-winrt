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

@ABIMarker(StoreAppLicense.ABI::class)
@Signature("rc(Windows.Services.Store.StoreAppLicense;{f389f9de-73c0-45ce-9bab-b2fe3e5eafd3})")
@WinRTByReference(brClass = StoreAppLicense.ByReference::class)
public class StoreAppLicense(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreAppLicense.WithDefault, IStoreAppLicense2.WithDefault, IWinRTObject {
  private val __395633324_Interface: IStoreAppLicense.WithDefault by lazy {
    as_395633324()
  }


  private val __620268894_Interface: IStoreAppLicense2.WithDefault by lazy {
    as_620268894()
  }


  public override val __395633324_Ptr: JNAPointer? by lazy {
    __395633324_Interface.__395633324_Ptr
  }


  public override val __620268894_Ptr: JNAPointer? by lazy {
    __620268894_Interface.__620268894_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__395633324_Interface, __620268894_Interface)

  private fun as_395633324(): IStoreAppLicense.WithDefault {
    if(pointer == NULL) {
      return(IStoreAppLicense.ABI.makeIStoreAppLicense(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreAppLicense>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreAppLicense.ABI.makeIStoreAppLicense(ref.value))
  }

  private fun as_620268894(): IStoreAppLicense2.WithDefault {
    if(pointer == NULL) {
      return(IStoreAppLicense2.ABI.makeIStoreAppLicense2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreAppLicense2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreAppLicense2.ABI.makeIStoreAppLicense2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreAppLicense> {
    public override fun getValue() = StoreAppLicense(pointer.getPointer(0))

    public fun setValue(value: StoreAppLicense): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreAppLicense, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreAppLicense {
      val address = segment.toRawLongValue()
      return StoreAppLicense(Pointer(address))
    }

    public override fun toNative(obj: StoreAppLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
