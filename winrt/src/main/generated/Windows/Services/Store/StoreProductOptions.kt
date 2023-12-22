package Windows.Services.Store

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(StoreProductOptions.ABI::class)
@Signature("rc(Windows.Services.Store.StoreProductOptions;{5b34a0f9-a113-4811-8326-16199c927f31})")
@WinRTByReference(brClass = StoreProductOptions.ByReference::class)
public class StoreProductOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreProductOptions.WithDefault, IWinRTObject {
  private val __2090880803_Interface: IStoreProductOptions.WithDefault by lazy {
    as_2090880803()
  }


  public override val __2090880803_Ptr: JNAPointer? by lazy {
    __2090880803_Interface.__2090880803_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2090880803_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2090880803(): IStoreProductOptions.WithDefault {
    if(pointer == NULL) {
      return(IStoreProductOptions.ABI.makeIStoreProductOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreProductOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreProductOptions.ABI.makeIStoreProductOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreProductOptions> {
    public override fun getValue() = StoreProductOptions(pointer.getPointer(0))

    public fun setValue(value: StoreProductOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreProductOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Store.StoreProductOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): StoreProductOptions {
      val address = segment.toRawLongValue()
      return StoreProductOptions(Pointer(address))
    }

    public override fun toNative(obj: StoreProductOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
