package Windows.Networking.Connectivity

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkSecuritySettings.ABI::class)
@Signature("{7ca07e8d-917b-4b5f-b84d-28f7a5ac5402}")
@Guid("7ca07e8d917b4b5fb84d28f7a5ac5402")
@WinRTInterface("7ca07e8d917b4b5fb84d28f7a5ac5402")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkSecuritySettings.ByReference::class)
public interface INetworkSecuritySettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAuthenticationType(): NetworkAuthenticationType?

  @InterfaceMethod(1)
  public fun get_NetworkEncryptionType(): NetworkEncryptionType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkSecuritySettings> {
    public override fun getValue() = ABI.makeINetworkSecuritySettings(pointer.getPointer(0))

    public fun setValue(value: INetworkSecuritySettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkSecuritySettings {
    public val __867701038_Ptr: Pointer?

    public val _867701038_VtblPtr: Pointer?
      get() = __867701038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAuthenticationType(): NetworkAuthenticationType? {
      val fnPtr = _867701038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkAuthenticationType>()
      val hr = fn.invokeHR(arrayOf(__867701038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkAuthenticationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NetworkEncryptionType(): NetworkEncryptionType? {
      val fnPtr = _867701038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkEncryptionType>()
      val hr = fn.invokeHR(arrayOf(__867701038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkEncryptionType>(result.getValue())
      return resultValue
    }
  }

  public class INetworkSecuritySettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __867701038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkSecuritySettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ca07e8d917b4b5fb84d28f7a5ac5402")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkSecuritySettings(ptr: Pointer?): WithDefault =
        INetworkSecuritySettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkSecuritySettings {
      val address = segment.toRawLongValue()
      return makeINetworkSecuritySettings(Pointer(address))
    }

    public override fun toNative(obj: INetworkSecuritySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__867701038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkSecuritySettings):
        Array<INetworkSecuritySettings?> = (elements as
        Array<INetworkSecuritySettings?>).castToImpl<INetworkSecuritySettings,INetworkSecuritySettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkSecuritySettings?> =
        arrayOfNulls<INetworkSecuritySettings_Impl>(size) as Array<INetworkSecuritySettings?>
  }
}
