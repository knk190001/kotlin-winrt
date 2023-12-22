package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IVpnTrafficFilter.ABI::class)
@Signature("{2f691b60-6c9f-47f5-ac36-bb1b042e2c50}")
@Guid("2f691b606c9f47f5ac36bb1b042e2c50")
@WinRTInterface("2f691b606c9f47f5ac36bb1b042e2c50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnTrafficFilter.ByReference::class)
public interface IVpnTrafficFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppId(): VpnAppId?

  @InterfaceMethod(1)
  public fun put_AppId(value: VpnAppId?): Unit

  @InterfaceMethod(2)
  public fun get_AppClaims(): IVector<String?>?

  @InterfaceMethod(3)
  public fun get_Protocol(): VpnIPProtocol?

  @InterfaceMethod(4)
  public fun put_Protocol(value: VpnIPProtocol?): Unit

  @InterfaceMethod(5)
  public fun get_LocalPortRanges(): IVector<String?>?

  @InterfaceMethod(6)
  public fun get_RemotePortRanges(): IVector<String?>?

  @InterfaceMethod(7)
  public fun get_LocalAddressRanges(): IVector<String?>?

  @InterfaceMethod(8)
  public fun get_RemoteAddressRanges(): IVector<String?>?

  @InterfaceMethod(9)
  public fun get_RoutingPolicyType(): VpnRoutingPolicyType?

  @InterfaceMethod(10)
  public fun put_RoutingPolicyType(value: VpnRoutingPolicyType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnTrafficFilter> {
    public override fun getValue() = ABI.makeIVpnTrafficFilter(pointer.getPointer(0))

    public fun setValue(value: IVpnTrafficFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnTrafficFilter {
    public val __1770911333_Ptr: Pointer?

    public val _1770911333_VtblPtr: Pointer?
      get() = __1770911333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppId(): VpnAppId? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnAppId>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnAppId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AppId(value: VpnAppId?): Unit {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppClaims(): IVector<String?>? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Protocol(): VpnIPProtocol? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnIPProtocol>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnIPProtocol>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Protocol(value: VpnIPProtocol?): Unit {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_LocalPortRanges(): IVector<String?>? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RemotePortRanges(): IVector<String?>? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_LocalAddressRanges(): IVector<String?>? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_RemoteAddressRanges(): IVector<String?>? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_RoutingPolicyType(): VpnRoutingPolicyType? {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnRoutingPolicyType>()
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnRoutingPolicyType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_RoutingPolicyType(value: VpnRoutingPolicyType?): Unit {
      val fnPtr = _1770911333_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770911333_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnTrafficFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770911333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnTrafficFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f691b606c9f47f5ac36bb1b042e2c50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnTrafficFilter(ptr: Pointer?): WithDefault = IVpnTrafficFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnTrafficFilter {
      val address = segment.toRawLongValue()
      return makeIVpnTrafficFilter(Pointer(address))
    }

    public override fun toNative(obj: IVpnTrafficFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1770911333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnTrafficFilter): Array<IVpnTrafficFilter?> = (elements
        as Array<IVpnTrafficFilter?>).castToImpl<IVpnTrafficFilter,IVpnTrafficFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnTrafficFilter?> =
        arrayOfNulls<IVpnTrafficFilter_Impl>(size) as Array<IVpnTrafficFilter?>
  }
}
