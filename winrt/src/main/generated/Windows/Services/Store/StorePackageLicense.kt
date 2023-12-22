package Windows.Services.Store

import Windows.Foundation.IClosable
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

@ABIMarker(StorePackageLicense.ABI::class)
@Signature("rc(Windows.Services.Store.StorePackageLicense;{0c465714-14e1-4973-bd14-f77724271e99})")
@WinRTByReference(brClass = StorePackageLicense.ByReference::class)
public class StorePackageLicense(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorePackageLicense.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __714652273_Interface: IStorePackageLicense.WithDefault by lazy {
    as_714652273()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __714652273_Ptr: JNAPointer? by lazy {
    __714652273_Interface.__714652273_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__714652273_Interface, __1260617006_Interface)

  private fun as_714652273(): IStorePackageLicense.WithDefault {
    if(pointer == NULL) {
      return(IStorePackageLicense.ABI.makeIStorePackageLicense(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorePackageLicense>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorePackageLicense.ABI.makeIStorePackageLicense(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorePackageLicense> {
    public override fun getValue() = StorePackageLicense(pointer.getPointer(0))

    public fun setValue(value: StorePackageLicense): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorePackageLicense, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorePackageLicense {
      val address = segment.toRawLongValue()
      return StorePackageLicense(Pointer(address))
    }

    public override fun toNative(obj: StorePackageLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
