package Windows.Networking.NetworkOperators

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

@ABIMarker(ProvisioningAgent.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ProvisioningAgent;{217700e0-8201-11df-adb9-f4ce462d9137})")
@WinRTByReference(brClass = ProvisioningAgent.ByReference::class)
public class ProvisioningAgent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProvisioningAgent.WithDefault, IWinRTObject {
  private val __2133890241_Interface: IProvisioningAgent.WithDefault by lazy {
    as_2133890241()
  }


  public override val __2133890241_Ptr: JNAPointer? by lazy {
    __2133890241_Interface.__2133890241_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2133890241_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2133890241(): IProvisioningAgent.WithDefault {
    if(pointer == NULL) {
      return(IProvisioningAgent.ABI.makeIProvisioningAgent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProvisioningAgent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProvisioningAgent.ABI.makeIProvisioningAgent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProvisioningAgent> {
    public override fun getValue() = ProvisioningAgent(pointer.getPointer(0))

    public fun setValue(value: ProvisioningAgent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProvisioningAgent, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IProvisioningAgentStaticMethods_Instance: IProvisioningAgentStaticMethods by lazy {
      createIProvisioningAgentStaticMethods()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.ProvisioningAgent".toHandle(),
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

    public fun createIProvisioningAgentStaticMethods(): IProvisioningAgentStaticMethods {
      val refiid = Guid.REFIID(IProvisioningAgentStaticMethods.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.ProvisioningAgent".toHandle(),refiid,interfacePtr)
      val result =
          IProvisioningAgentStaticMethods.ABI.makeIProvisioningAgentStaticMethods(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProvisioningAgent {
      val address = segment.toRawLongValue()
      return ProvisioningAgent(Pointer(address))
    }

    public override fun toNative(obj: ProvisioningAgent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromNetworkAccountId(networkAccountId: String) =
        ABI.IProvisioningAgentStaticMethods_Instance.CreateFromNetworkAccountId(networkAccountId)
  }
}
