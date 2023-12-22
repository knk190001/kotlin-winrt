package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(KnownUserProperties.ABI::class)
@WinRTByReference(brClass = KnownUserProperties.ByReference::class)
public class KnownUserProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownUserProperties> {
    public override fun getValue() = KnownUserProperties(pointer.getPointer(0))

    public fun setValue(value: KnownUserProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownUserProperties, MemoryAddress> {
    public val IKnownUserPropertiesStatics2_Instance: IKnownUserPropertiesStatics2 by lazy {
      createIKnownUserPropertiesStatics2()
    }


    public val IKnownUserPropertiesStatics_Instance: IKnownUserPropertiesStatics by lazy {
      createIKnownUserPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownUserPropertiesStatics2(): IKnownUserPropertiesStatics2 {
      val refiid = Guid.REFIID(IKnownUserPropertiesStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.KnownUserProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownUserPropertiesStatics2.ABI.makeIKnownUserPropertiesStatics2(interfacePtr.value)
      return result
    }

    public fun createIKnownUserPropertiesStatics(): IKnownUserPropertiesStatics {
      val refiid = Guid.REFIID(IKnownUserPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.KnownUserProperties".toHandle(),refiid,interfacePtr)
      val result =
          IKnownUserPropertiesStatics.ABI.makeIKnownUserPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownUserProperties {
      val address = segment.toRawLongValue()
      return KnownUserProperties(Pointer(address))
    }

    public override fun toNative(obj: KnownUserProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AgeEnforcementRegion() =
        ABI.IKnownUserPropertiesStatics2_Instance.get_AgeEnforcementRegion()

    public fun get_DisplayName() = ABI.IKnownUserPropertiesStatics_Instance.get_DisplayName()

    public fun get_FirstName() = ABI.IKnownUserPropertiesStatics_Instance.get_FirstName()

    public fun get_LastName() = ABI.IKnownUserPropertiesStatics_Instance.get_LastName()

    public fun get_ProviderName() = ABI.IKnownUserPropertiesStatics_Instance.get_ProviderName()

    public fun get_AccountName() = ABI.IKnownUserPropertiesStatics_Instance.get_AccountName()

    public fun get_GuestHost() = ABI.IKnownUserPropertiesStatics_Instance.get_GuestHost()

    public fun get_PrincipalName() = ABI.IKnownUserPropertiesStatics_Instance.get_PrincipalName()

    public fun get_DomainName() = ABI.IKnownUserPropertiesStatics_Instance.get_DomainName()

    public fun get_SessionInitiationProtocolUri() =
        ABI.IKnownUserPropertiesStatics_Instance.get_SessionInitiationProtocolUri()
  }
}
