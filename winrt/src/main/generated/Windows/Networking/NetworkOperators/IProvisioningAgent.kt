package Windows.Networking.NetworkOperators

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IProvisioningAgent.ABI::class)
@Signature("{217700e0-8201-11df-adb9-f4ce462d9137}")
@Guid("217700e0820111dfadb9f4ce462d9137")
@WinRTInterface("217700e0820111dfadb9f4ce462d9137")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProvisioningAgent.ByReference::class)
public interface IProvisioningAgent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProvisionFromXmlDocumentAsync(provisioningXmlDocument: String?):
      IAsyncOperation<ProvisionFromXmlDocumentResults?>?

  @InterfaceMethod(1)
  public fun GetProvisionedProfile(mediaType: ProfileMediaType?, profileName: String?):
      ProvisionedProfile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProvisioningAgent> {
    public override fun getValue() = ABI.makeIProvisioningAgent(pointer.getPointer(0))

    public fun setValue(value: IProvisioningAgent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProvisioningAgent {
    public val __2133890241_Ptr: Pointer?

    public val _2133890241_VtblPtr: Pointer?
      get() = __2133890241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProvisionFromXmlDocumentAsync(provisioningXmlDocument: String?):
        IAsyncOperation<ProvisionFromXmlDocumentResults?>? {
      val fnPtr = _2133890241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProvisionFromXmlDocumentResults?>>()
      val hr = fn.invokeHR(arrayOf(__2133890241_Ptr, marshalToNative(provisioningXmlDocument),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProvisionFromXmlDocumentResults?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetProvisionedProfile(mediaType: ProfileMediaType?, profileName: String?):
        ProvisionedProfile? {
      val fnPtr = _2133890241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProvisionedProfile>()
      val hr = fn.invokeHR(arrayOf(__2133890241_Ptr, marshalToNative(mediaType),
          marshalToNative(profileName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProvisionedProfile>(result.getValue())
      return resultValue
    }
  }

  public class IProvisioningAgent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2133890241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProvisioningAgent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217700e0820111dfadb9f4ce462d9137")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProvisioningAgent(ptr: Pointer?): WithDefault = IProvisioningAgent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProvisioningAgent {
      val address = segment.toRawLongValue()
      return makeIProvisioningAgent(Pointer(address))
    }

    public override fun toNative(obj: IProvisioningAgent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2133890241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProvisioningAgent): Array<IProvisioningAgent?> =
        (elements as
        Array<IProvisioningAgent?>).castToImpl<IProvisioningAgent,IProvisioningAgent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProvisioningAgent?> =
        arrayOfNulls<IProvisioningAgent_Impl>(size) as Array<IProvisioningAgent?>
  }
}
