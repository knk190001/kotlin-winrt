package Windows.Networking.Vpn

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IVpnDomainNameInfoFactory.ABI::class)
@Signature("{2507bb75-028f-4688-8d3a-c4531df37da8}")
@Guid("2507bb75028f46888d3ac4531df37da8")
@WinRTInterface("2507bb75028f46888d3ac4531df37da8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnDomainNameInfoFactory.ByReference::class)
public interface IVpnDomainNameInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateVpnDomainNameInfo(
    name: String?,
    nameType: VpnDomainNameType?,
    dnsServerList: IIterable<HostName?>?,
    proxyServerList: IIterable<HostName?>?
  ): VpnDomainNameInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnDomainNameInfoFactory> {
    public override fun getValue() = ABI.makeIVpnDomainNameInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IVpnDomainNameInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnDomainNameInfoFactory {
    public val __974003741_Ptr: Pointer?

    public val _974003741_VtblPtr: Pointer?
      get() = __974003741_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateVpnDomainNameInfo(
      name: String?,
      nameType: VpnDomainNameType?,
      dnsServerList: IIterable<HostName?>?,
      proxyServerList: IIterable<HostName?>?
    ): VpnDomainNameInfo? {
      val fnPtr = _974003741_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnDomainNameInfo>()
      val hr = fn.invokeHR(arrayOf(__974003741_Ptr, marshalToNative(name),
          marshalToNative(nameType), marshalToNative(dnsServerList),
          marshalToNative(proxyServerList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnDomainNameInfo>(result.getValue())
      return resultValue
    }
  }

  public class IVpnDomainNameInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __974003741_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnDomainNameInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2507bb75028f46888d3ac4531df37da8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnDomainNameInfoFactory(ptr: Pointer?): WithDefault =
        IVpnDomainNameInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnDomainNameInfoFactory {
      val address = segment.toRawLongValue()
      return makeIVpnDomainNameInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IVpnDomainNameInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__974003741_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnDomainNameInfoFactory):
        Array<IVpnDomainNameInfoFactory?> = (elements as
        Array<IVpnDomainNameInfoFactory?>).castToImpl<IVpnDomainNameInfoFactory,IVpnDomainNameInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnDomainNameInfoFactory?> =
        arrayOfNulls<IVpnDomainNameInfoFactory_Impl>(size) as Array<IVpnDomainNameInfoFactory?>
  }
}
