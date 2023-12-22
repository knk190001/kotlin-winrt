package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
import Windows.Networking.HostName
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

@ABIMarker(IVpnNamespaceInfoFactory.ABI::class)
@Signature("{cb3e951a-b0ce-442b-acbb-5f99b202c31c}")
@Guid("cb3e951ab0ce442bacbb5f99b202c31c")
@WinRTInterface("cb3e951ab0ce442bacbb5f99b202c31c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnNamespaceInfoFactory.ByReference::class)
public interface IVpnNamespaceInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVpnNamespaceInfo(
    name: String?,
    dnsServerList: IVector<HostName?>?,
    proxyServerList: IVector<HostName?>?
  ): VpnNamespaceInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnNamespaceInfoFactory> {
    public override fun getValue() = ABI.makeIVpnNamespaceInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnNamespaceInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnNamespaceInfoFactory {
    public val __799109231_Ptr: Pointer?

    public val _799109231_VtblPtr: Pointer?
      get() = __799109231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVpnNamespaceInfo(
      name: String?,
      dnsServerList: IVector<HostName?>?,
      proxyServerList: IVector<HostName?>?
    ): VpnNamespaceInfo? {
      val fnPtr = _799109231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnNamespaceInfo>()
      val hr = fn.invokeHR(arrayOf(__799109231_Ptr, marshalToNative(name),
          marshalToNative(dnsServerList), marshalToNative(proxyServerList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnNamespaceInfo>(result.getValue())
      return resultValue
    }
  }

  public class IVpnNamespaceInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __799109231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnNamespaceInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb3e951ab0ce442bacbb5f99b202c31c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnNamespaceInfoFactory(ptr: Pointer?): WithDefault =
        IVpnNamespaceInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnNamespaceInfoFactory {
      val address = segment.toRawLongValue()
      return makeIVpnNamespaceInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnNamespaceInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__799109231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnNamespaceInfoFactory):
        Array<IVpnNamespaceInfoFactory?> = (elements as
        Array<IVpnNamespaceInfoFactory?>).castToImpl<IVpnNamespaceInfoFactory,IVpnNamespaceInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnNamespaceInfoFactory?> =
        arrayOfNulls<IVpnNamespaceInfoFactory_Impl>(size) as Array<IVpnNamespaceInfoFactory?>
  }
}
