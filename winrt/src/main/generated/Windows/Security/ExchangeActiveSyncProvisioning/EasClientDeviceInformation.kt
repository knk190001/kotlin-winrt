package Windows.Security.ExchangeActiveSyncProvisioning

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

@ABIMarker(EasClientDeviceInformation.ABI::class)
@Signature("rc(Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation;{54dfd981-1968-4ca3-b958-e595d16505eb})")
@WinRTByReference(brClass = EasClientDeviceInformation.ByReference::class)
public class EasClientDeviceInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEasClientDeviceInformation.WithDefault,
    IEasClientDeviceInformation2.WithDefault, IWinRTObject {
  private val __1255329911_Interface: IEasClientDeviceInformation.WithDefault by lazy {
    as_1255329911()
  }


  private val __260521527_Interface: IEasClientDeviceInformation2.WithDefault by lazy {
    as_260521527()
  }


  public override val __1255329911_Ptr: JNAPointer? by lazy {
    __1255329911_Interface.__1255329911_Ptr
  }


  public override val __260521527_Ptr: JNAPointer? by lazy {
    __260521527_Interface.__260521527_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1255329911_Interface, __260521527_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1255329911(): IEasClientDeviceInformation.WithDefault {
    if(pointer == NULL) {
      return(IEasClientDeviceInformation.ABI.makeIEasClientDeviceInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasClientDeviceInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasClientDeviceInformation.ABI.makeIEasClientDeviceInformation(ref.value))
  }

  private fun as_260521527(): IEasClientDeviceInformation2.WithDefault {
    if(pointer == NULL) {
      return(IEasClientDeviceInformation2.ABI.makeIEasClientDeviceInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasClientDeviceInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasClientDeviceInformation2.ABI.makeIEasClientDeviceInformation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EasClientDeviceInformation> {
    public override fun getValue() = EasClientDeviceInformation(pointer.getPointer(0))

    public fun setValue(value: EasClientDeviceInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EasClientDeviceInformation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.ExchangeActiveSyncProvisioning.EasClientDeviceInformation".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): EasClientDeviceInformation {
      val address = segment.toRawLongValue()
      return EasClientDeviceInformation(Pointer(address))
    }

    public override fun toNative(obj: EasClientDeviceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
