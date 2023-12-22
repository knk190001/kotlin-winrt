package Windows.Devices.SmartCards

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SmartCardProvisioning.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardProvisioning;{19eeedbd-1fab-477c-b712-1a2c5af1fd6e})")
@WinRTByReference(brClass = SmartCardProvisioning.ByReference::class)
public class SmartCardProvisioning(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardProvisioning.WithDefault, ISmartCardProvisioning2.WithDefault,
    IWinRTObject {
  private val __1251918029_Interface: ISmartCardProvisioning.WithDefault by lazy {
    as_1251918029()
  }


  private val __154753185_Interface: ISmartCardProvisioning2.WithDefault by lazy {
    as_154753185()
  }


  public override val __1251918029_Ptr: JNAPointer? by lazy {
    __1251918029_Interface.__1251918029_Ptr
  }


  public override val __154753185_Ptr: JNAPointer? by lazy {
    __154753185_Interface.__154753185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1251918029_Interface, __154753185_Interface)

  private fun as_1251918029(): ISmartCardProvisioning.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardProvisioning.ABI.makeISmartCardProvisioning(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardProvisioning>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardProvisioning.ABI.makeISmartCardProvisioning(ref.value))
  }

  private fun as_154753185(): ISmartCardProvisioning2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardProvisioning2.ABI.makeISmartCardProvisioning2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardProvisioning2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardProvisioning2.ABI.makeISmartCardProvisioning2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardProvisioning> {
    public override fun getValue() = SmartCardProvisioning(pointer.getPointer(0))

    public fun setValue(value: SmartCardProvisioning): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardProvisioning, MemoryAddress> {
    public val ISmartCardProvisioningStatics_Instance: ISmartCardProvisioningStatics by lazy {
      createISmartCardProvisioningStatics()
    }


    public val ISmartCardProvisioningStatics2_Instance: ISmartCardProvisioningStatics2 by lazy {
      createISmartCardProvisioningStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmartCardProvisioningStatics(): ISmartCardProvisioningStatics {
      val refiid = Guid.REFIID(ISmartCardProvisioningStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardProvisioning".toHandle(),refiid,interfacePtr)
      val result =
          ISmartCardProvisioningStatics.ABI.makeISmartCardProvisioningStatics(interfacePtr.value)
      return result
    }

    public fun createISmartCardProvisioningStatics2(): ISmartCardProvisioningStatics2 {
      val refiid = Guid.REFIID(ISmartCardProvisioningStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardProvisioning".toHandle(),refiid,interfacePtr)
      val result =
          ISmartCardProvisioningStatics2.ABI.makeISmartCardProvisioningStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmartCardProvisioning {
      val address = segment.toRawLongValue()
      return SmartCardProvisioning(Pointer(address))
    }

    public override fun toNative(obj: SmartCardProvisioning): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromSmartCardAsync(card: SmartCard) =
        ABI.ISmartCardProvisioningStatics_Instance.FromSmartCardAsync(card)

    public fun RequestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: SmartCardPinPolicy
    ) =
        ABI.ISmartCardProvisioningStatics_Instance.RequestVirtualSmartCardCreationAsync(friendlyName,
        administrativeKey, pinPolicy)

    public fun RequestVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: SmartCardPinPolicy,
      cardId: Guid.GUID
    ) =
        ABI.ISmartCardProvisioningStatics_Instance.RequestVirtualSmartCardCreationAsync(friendlyName,
        administrativeKey, pinPolicy, cardId)

    public fun RequestVirtualSmartCardDeletionAsync(card: SmartCard) =
        ABI.ISmartCardProvisioningStatics_Instance.RequestVirtualSmartCardDeletionAsync(card)

    public fun RequestAttestedVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: SmartCardPinPolicy
    ) =
        ABI.ISmartCardProvisioningStatics2_Instance.RequestAttestedVirtualSmartCardCreationAsync(friendlyName,
        administrativeKey, pinPolicy)

    public fun RequestAttestedVirtualSmartCardCreationAsync(
      friendlyName: String,
      administrativeKey: IBuffer,
      pinPolicy: SmartCardPinPolicy,
      cardId: Guid.GUID
    ) =
        ABI.ISmartCardProvisioningStatics2_Instance.RequestAttestedVirtualSmartCardCreationAsync(friendlyName,
        administrativeKey, pinPolicy, cardId)
  }
}
