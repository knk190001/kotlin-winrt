package Windows.Devices.Bluetooth.Rfcomm

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

@ABIMarker(RfcommServiceProvider.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider;{eadbfdc4-b1f6-44ff-9f7c-e7a82ab86821})")
@WinRTByReference(brClass = RfcommServiceProvider.ByReference::class)
public class RfcommServiceProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRfcommServiceProvider.WithDefault, IRfcommServiceProvider2.WithDefault,
    IWinRTObject {
  private val __1692746649_Interface: IRfcommServiceProvider.WithDefault by lazy {
    as_1692746649()
  }


  private val __935538617_Interface: IRfcommServiceProvider2.WithDefault by lazy {
    as_935538617()
  }


  public override val __1692746649_Ptr: JNAPointer? by lazy {
    __1692746649_Interface.__1692746649_Ptr
  }


  public override val __935538617_Ptr: JNAPointer? by lazy {
    __935538617_Interface.__935538617_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1692746649_Interface, __935538617_Interface)

  private fun as_1692746649(): IRfcommServiceProvider.WithDefault {
    if(pointer == NULL) {
      return(IRfcommServiceProvider.ABI.makeIRfcommServiceProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommServiceProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommServiceProvider.ABI.makeIRfcommServiceProvider(ref.value))
  }

  private fun as_935538617(): IRfcommServiceProvider2.WithDefault {
    if(pointer == NULL) {
      return(IRfcommServiceProvider2.ABI.makeIRfcommServiceProvider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRfcommServiceProvider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRfcommServiceProvider2.ABI.makeIRfcommServiceProvider2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RfcommServiceProvider> {
    public override fun getValue() = RfcommServiceProvider(pointer.getPointer(0))

    public fun setValue(value: RfcommServiceProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RfcommServiceProvider, MemoryAddress> {
    public val IRfcommServiceProviderStatics_Instance: IRfcommServiceProviderStatics by lazy {
      createIRfcommServiceProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRfcommServiceProviderStatics(): IRfcommServiceProviderStatics {
      val refiid = Guid.REFIID(IRfcommServiceProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider".toHandle(),refiid,interfacePtr)
      val result =
          IRfcommServiceProviderStatics.ABI.makeIRfcommServiceProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RfcommServiceProvider {
      val address = segment.toRawLongValue()
      return RfcommServiceProvider(Pointer(address))
    }

    public override fun toNative(obj: RfcommServiceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync(serviceId: RfcommServiceId) =
        ABI.IRfcommServiceProviderStatics_Instance.CreateAsync(serviceId)
  }
}
