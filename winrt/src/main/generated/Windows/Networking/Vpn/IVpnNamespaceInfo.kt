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

@ABIMarker(IVpnNamespaceInfo.ABI::class)
@Signature("{30edfb43-444f-44c5-8167-a35a91f1af94}")
@Guid("30edfb43444f44c58167a35a91f1af94")
@WinRTInterface("30edfb43444f44c58167a35a91f1af94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnNamespaceInfo.ByReference::class)
public interface IVpnNamespaceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Namespace(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_Namespace(): String?

  @InterfaceMethod(2)
  public fun put_DnsServers(value: IVector<HostName?>?): Unit

  @InterfaceMethod(3)
  public fun get_DnsServers(): IVector<HostName?>?

  @InterfaceMethod(4)
  public fun put_WebProxyServers(value: IVector<HostName?>?): Unit

  @InterfaceMethod(5)
  public fun get_WebProxyServers(): IVector<HostName?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnNamespaceInfo> {
    public override fun getValue() = ABI.makeIVpnNamespaceInfo(pointer.getPointer(0))

    public fun setValue(value: IVpnNamespaceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnNamespaceInfo {
    public val __2083018553_Ptr: Pointer?

    public val _2083018553_VtblPtr: Pointer?
      get() = __2083018553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Namespace(value: String?): Unit {
      val fnPtr = _2083018553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2083018553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Namespace(): String? {
      val fnPtr = _2083018553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2083018553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DnsServers(value: IVector<HostName?>?): Unit {
      val fnPtr = _2083018553_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2083018553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_DnsServers(): IVector<HostName?>? {
      val fnPtr = _2083018553_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__2083018553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HostName?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_WebProxyServers(value: IVector<HostName?>?): Unit {
      val fnPtr = _2083018553_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2083018553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_WebProxyServers(): IVector<HostName?>? {
      val fnPtr = _2083018553_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HostName?>>()
      val hr = fn.invokeHR(arrayOf(__2083018553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HostName?>>(result.getValue())
      return resultValue
    }
  }

  public class IVpnNamespaceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2083018553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnNamespaceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30edfb43444f44c58167a35a91f1af94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnNamespaceInfo(ptr: Pointer?): WithDefault = IVpnNamespaceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnNamespaceInfo {
      val address = segment.toRawLongValue()
      return makeIVpnNamespaceInfo(Pointer(address))
    }

    public override fun toNative(obj: IVpnNamespaceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2083018553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnNamespaceInfo): Array<IVpnNamespaceInfo?> = (elements
        as Array<IVpnNamespaceInfo?>).castToImpl<IVpnNamespaceInfo,IVpnNamespaceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnNamespaceInfo?> =
        arrayOfNulls<IVpnNamespaceInfo_Impl>(size) as Array<IVpnNamespaceInfo?>
  }
}
