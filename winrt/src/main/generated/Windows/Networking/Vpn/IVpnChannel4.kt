package Windows.Networking.Vpn

import Windows.Foundation.Collections.IIterable
import Windows.Networking.HostName
import Windows.Networking.Sockets.ControlChannelTriggerStatus
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnChannel4.ABI::class)
@Signature("{d7266ede-2937-419d-9570-486aebb81803}")
@Guid("d7266ede2937419d9570486aebb81803")
@WinRTInterface("d7266ede2937419d9570486aebb81803")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannel4.ByReference::class)
public interface IVpnChannel4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddAndAssociateTransport(transport: IUnknown?, context: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun StartWithTrafficFilter(
    assignedClientIpv4Addresses: IIterable<HostName?>?,
    assignedClientIpv6Addresses: IIterable<HostName?>?,
    vpninterfaceId: VpnInterfaceId?,
    assignedRoutes: VpnRouteAssignment?,
    assignedNamespace: VpnDomainNameAssignment?,
    mtuSize: WinDef.UINT,
    maxFrameSize: WinDef.UINT,
    reserved: Boolean,
    transports: IIterable<IUnknown?>?,
    assignedTrafficFilters: VpnTrafficFilterAssignment?
  ): Unit

  @InterfaceMethod(2)
  public fun ReplaceAndAssociateTransport(transport: IUnknown?, context: IUnknown?): Unit

  @InterfaceMethod(3)
  public fun StartReconnectingTransport(transport: IUnknown?, context: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun GetSlotTypeForTransportContext(context: IUnknown?): ControlChannelTriggerStatus?

  @InterfaceMethod(5)
  public fun get_CurrentRequestTransportContext(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnChannel4> {
    public override fun getValue() = ABI.makeIVpnChannel4(pointer.getPointer(0))

    public fun setValue(value: IVpnChannel4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannel4 {
    public val __1566639359_Ptr: Pointer?

    public val _1566639359_VtblPtr: Pointer?
      get() = __1566639359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddAndAssociateTransport(transport: IUnknown?, context: IUnknown?): Unit {
      val fnPtr = _1566639359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639359_Ptr, marshalToNative(transport),
          marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StartWithTrafficFilter(
      assignedClientIpv4Addresses: IIterable<HostName?>?,
      assignedClientIpv6Addresses: IIterable<HostName?>?,
      vpninterfaceId: VpnInterfaceId?,
      assignedRoutes: VpnRouteAssignment?,
      assignedNamespace: VpnDomainNameAssignment?,
      mtuSize: WinDef.UINT,
      maxFrameSize: WinDef.UINT,
      reserved: Boolean,
      transports: IIterable<IUnknown?>?,
      assignedTrafficFilters: VpnTrafficFilterAssignment?
    ): Unit {
      val fnPtr = _1566639359_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639359_Ptr, marshalToNative(assignedClientIpv4Addresses),
          marshalToNative(assignedClientIpv6Addresses), marshalToNative(vpninterfaceId),
          marshalToNative(assignedRoutes), marshalToNative(assignedNamespace), mtuSize,
          maxFrameSize, reserved, marshalToNative(transports),
          marshalToNative(assignedTrafficFilters),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReplaceAndAssociateTransport(transport: IUnknown?, context: IUnknown?):
        Unit {
      val fnPtr = _1566639359_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639359_Ptr, marshalToNative(transport),
          marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun StartReconnectingTransport(transport: IUnknown?, context: IUnknown?): Unit {
      val fnPtr = _1566639359_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639359_Ptr, marshalToNative(transport),
          marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetSlotTypeForTransportContext(context: IUnknown?):
        ControlChannelTriggerStatus? {
      val fnPtr = _1566639359_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlChannelTriggerStatus>()
      val hr = fn.invokeHR(arrayOf(__1566639359_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlChannelTriggerStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CurrentRequestTransportContext(): IUnknown? {
      val fnPtr = _1566639359_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1566639359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IVpnChannel4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566639359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannel4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7266ede2937419d9570486aebb81803")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannel4(ptr: Pointer?): WithDefault = IVpnChannel4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannel4 {
      val address = segment.toRawLongValue()
      return makeIVpnChannel4(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannel4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566639359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannel4): Array<IVpnChannel4?> = (elements as
        Array<IVpnChannel4?>).castToImpl<IVpnChannel4,IVpnChannel4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannel4?> =
        arrayOfNulls<IVpnChannel4_Impl>(size) as Array<IVpnChannel4?>
  }
}
