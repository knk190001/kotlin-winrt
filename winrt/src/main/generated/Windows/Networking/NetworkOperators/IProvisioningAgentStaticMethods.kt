package Windows.Networking.NetworkOperators

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProvisioningAgentStaticMethods.ABI::class)
@Signature("{217700e0-8101-11df-adb9-f4ce462d9137}")
@Guid("217700e0810111dfadb9f4ce462d9137")
@WinRTInterface("217700e0810111dfadb9f4ce462d9137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProvisioningAgentStaticMethods.ByReference::class)
public interface IProvisioningAgentStaticMethods : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromNetworkAccountId(networkAccountId: String?): ProvisioningAgent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProvisioningAgentStaticMethods> {
    public override fun getValue() = ABI.makeIProvisioningAgentStaticMethods(pointer.getPointer(0))

    public fun setValue(value: IProvisioningAgentStaticMethods_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProvisioningAgentStaticMethods {
    public val __1436999781_Ptr: Pointer?

    public val _1436999781_VtblPtr: Pointer?
      get() = __1436999781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromNetworkAccountId(networkAccountId: String?): ProvisioningAgent? {
      val fnPtr = _1436999781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProvisioningAgent>()
      val hr = fn.invokeHR(arrayOf(__1436999781_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProvisioningAgent>(result.getValue())
      return resultValue
    }
  }

  public class IProvisioningAgentStaticMethods_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1436999781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProvisioningAgentStaticMethods, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217700e0810111dfadb9f4ce462d9137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProvisioningAgentStaticMethods(ptr: Pointer?): WithDefault =
        IProvisioningAgentStaticMethods_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProvisioningAgentStaticMethods {
      val address = segment.toRawLongValue()
      return makeIProvisioningAgentStaticMethods(Pointer(address))
    }

    public override fun toNative(obj: IProvisioningAgentStaticMethods): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1436999781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProvisioningAgentStaticMethods):
        Array<IProvisioningAgentStaticMethods?> = (elements as
        Array<IProvisioningAgentStaticMethods?>).castToImpl<IProvisioningAgentStaticMethods,IProvisioningAgentStaticMethods_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProvisioningAgentStaticMethods?> =
        arrayOfNulls<IProvisioningAgentStaticMethods_Impl>(size) as
        Array<IProvisioningAgentStaticMethods?>
  }
}
