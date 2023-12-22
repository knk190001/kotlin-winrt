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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnDomainNameInfo.ABI::class)
@Signature("{ad2eb82f-ea8e-4f7a-843e-1a87e32e1b9a}")
@Guid("ad2eb82fea8e4f7a843e1a87e32e1b9a")
@WinRTInterface("ad2eb82fea8e4f7a843e1a87e32e1b9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnDomainNameInfo.ByReference::class)
public interface IVpnDomainNameInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_DomainName(value: HostName?): Unit

  @InterfaceMethod(1)
  public fun get_DomainName(): HostName?

  @InterfaceMethod(2)
  public fun put_DomainNameType(value: VpnDomainNameType?): Unit

  @InterfaceMethod(3)
  public fun get_DomainNameType(): VpnDomainNameType?

  @InterfaceMethod(4)
  public fun get_DnsServers(): IVector<HostName?>?

  @InterfaceMethod(5)
  public fun get_WebProxyServers(): IVector<HostName?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnDomainNameInfo> {
    public override fun getValue() = ABI.makeIVpnDomainNameInfo(pointer.getPointer(0))

    public fun setValue(value: IVpnDomainNameInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnDomainNameInfo {
    public val __705089069_Ptr: Pointer?

    public val _705089069_VtblPtr: Pointer?
      get() = __705089069_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_DomainName(value: HostName?): Unit {
      val fnPtr = _705089069_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__705089069_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_DomainName(): HostName? {
      val fnPtr = _705089069_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__705089069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DomainNameType(value: VpnDomainNameType?): Unit {
      val fnPtr = _705089069_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__705089069_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DomainNameType(): VpnDomainNameType? {
      val fnPtr = _705089069_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnDomainNameType>()
      val hr = fn.invokeHR(arrayOf(__705089069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnDomainNameType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DnsServers(): IVector<HostName?>? {
      val fnPtr = _705089069_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__705089069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HostName?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_WebProxyServers(): IVector<HostName?>? {
      val fnPtr = _705089069_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__705089069_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HostName?>>(result.getValue())
      return resultValue
    }
  }

  public class IVpnDomainNameInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705089069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnDomainNameInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad2eb82fea8e4f7a843e1a87e32e1b9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnDomainNameInfo(ptr: Pointer?): WithDefault = IVpnDomainNameInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnDomainNameInfo {
      val address = segment.toRawLongValue()
      return makeIVpnDomainNameInfo(Pointer(address))
    }

    public override fun toNative(obj: IVpnDomainNameInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705089069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnDomainNameInfo): Array<IVpnDomainNameInfo?> =
        (elements as
        Array<IVpnDomainNameInfo?>).castToImpl<IVpnDomainNameInfo,IVpnDomainNameInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnDomainNameInfo?> =
        arrayOfNulls<IVpnDomainNameInfo_Impl>(size) as Array<IVpnDomainNameInfo?>
  }
}
