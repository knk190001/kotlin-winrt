package Windows.ApplicationModel.Calls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneCallHistoryEntryAddress.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress;{30f159da-3955-4042-84e6-66eebf82e67f})")
@WinRTByReference(brClass = PhoneCallHistoryEntryAddress.ByReference::class)
public class PhoneCallHistoryEntryAddress(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallHistoryEntryAddress.WithDefault, IWinRTObject {
  private val __1016231624_Interface: IPhoneCallHistoryEntryAddress.WithDefault by lazy {
    as_1016231624()
  }


  public override val __1016231624_Ptr: JNAPointer? by lazy {
    __1016231624_Interface.__1016231624_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1016231624_Interface)

  public constructor() : this(ABI.activate())

  public constructor(rawAddress: String, rawAddressKind: PhoneCallHistoryEntryRawAddressKind) :
      this(ABI.activate(rawAddress, rawAddressKind))

  private fun as_1016231624(): IPhoneCallHistoryEntryAddress.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallHistoryEntryAddress.ABI.makeIPhoneCallHistoryEntryAddress(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallHistoryEntryAddress>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallHistoryEntryAddress.ABI.makeIPhoneCallHistoryEntryAddress(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryEntryAddress> {
    public override fun getValue() = PhoneCallHistoryEntryAddress(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryEntryAddress): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryEntryAddress, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPhoneCallHistoryEntryAddressFactory_Instance: IPhoneCallHistoryEntryAddressFactory
        by lazy {
      createIPhoneCallHistoryEntryAddressFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress".toHandle(),
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

    public fun createIPhoneCallHistoryEntryAddressFactory(): IPhoneCallHistoryEntryAddressFactory {
      val refiid = Guid.REFIID(IPhoneCallHistoryEntryAddressFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPhoneCallHistoryEntryAddressFactory.ABI.makeIPhoneCallHistoryEntryAddressFactory(factoryActivatorPtr.value))
    }

    public fun activate(rawAddress: String, rawAddressKind: PhoneCallHistoryEntryRawAddressKind):
        JNAPointer? = IPhoneCallHistoryEntryAddressFactory_Instance.Create(rawAddress,
        rawAddressKind)?.pointer

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryEntryAddress {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryEntryAddress(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryEntryAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
