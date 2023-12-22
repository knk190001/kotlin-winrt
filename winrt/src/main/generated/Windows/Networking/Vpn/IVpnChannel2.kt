package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Networking.HostName
import Windows.Security.Cryptography.Certificates.Certificate
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnChannel2.ABI::class)
@Signature("{2255d165-993b-4629-ad60-f1c3f3537f50}")
@Guid("2255d165993b4629ad60f1c3f3537f50")
@WinRTInterface("2255d165993b4629ad60f1c3f3537f50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannel2.ByReference::class)
public interface IVpnChannel2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartWithMainTransport(
    assignedClientIPv4list: IVectorView<HostName?>?,
    assignedClientIPv6list: IVectorView<HostName?>?,
    vpnInterfaceId: VpnInterfaceId?,
    assignedRoutes: VpnRouteAssignment?,
    assignedDomainName: VpnDomainNameAssignment?,
    mtuSize: WinDef.UINT,
    maxFrameSize: WinDef.UINT,
    Reserved: Boolean,
    mainOuterTunnelTransport: IUnknown?
  ): Unit

  @InterfaceMethod(1)
  public fun StartExistingTransports(
    assignedClientIPv4list: IVectorView<HostName?>?,
    assignedClientIPv6list: IVectorView<HostName?>?,
    vpnInterfaceId: VpnInterfaceId?,
    assignedRoutes: VpnRouteAssignment?,
    assignedDomainName: VpnDomainNameAssignment?,
    mtuSize: WinDef.UINT,
    maxFrameSize: WinDef.UINT,
    Reserved: Boolean
  ): Unit

  @InterfaceMethod(2)
  public fun add_ActivityStateChange(handler: TypedEventHandler<VpnChannel?,
      VpnChannelActivityStateChangedArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ActivityStateChange(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun GetVpnSendPacketBuffer(): VpnPacketBuffer?

  @InterfaceMethod(5)
  public fun GetVpnReceivePacketBuffer(): VpnPacketBuffer?

  @InterfaceMethod(6)
  public fun RequestCustomPromptAsync(customPromptElement: IVectorView<IVpnCustomPromptElement?>?):
      IAsyncAction?

  @InterfaceMethod(7)
  public fun RequestCredentialsAsync(
    credType: VpnCredentialType?,
    credOptions: WinDef.UINT,
    certificate: Certificate?
  ): IAsyncOperation<VpnCredential?>?

  @InterfaceMethod(8)
  public fun RequestCredentialsAsync(credType: VpnCredentialType?, credOptions: WinDef.UINT):
      IAsyncOperation<VpnCredential?>?

  @InterfaceMethod(9)
  public fun RequestCredentialsAsync(credType: VpnCredentialType?): IAsyncOperation<VpnCredential?>?

  @InterfaceMethod(10)
  public fun TerminateConnection(message: String?): Unit

  @InterfaceMethod(11)
  public fun StartWithTrafficFilter(
    assignedClientIpv4List: IVectorView<HostName?>?,
    assignedClientIpv6List: IVectorView<HostName?>?,
    vpnInterfaceId: VpnInterfaceId?,
    assignedRoutes: VpnRouteAssignment?,
    assignedNamespace: VpnDomainNameAssignment?,
    mtuSize: WinDef.UINT,
    maxFrameSize: WinDef.UINT,
    reserved: Boolean,
    mainOuterTunnelTransport: IUnknown?,
    optionalOuterTunnelTransport: IUnknown?,
    assignedTrafficFilters: VpnTrafficFilterAssignment?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnChannel2> {
    public override fun getValue() = ABI.makeIVpnChannel2(pointer.getPointer(0))

    public fun setValue(value: IVpnChannel2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannel2 {
    public val __1566639361_Ptr: Pointer?

    public val _1566639361_VtblPtr: Pointer?
      get() = __1566639361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartWithMainTransport(
      assignedClientIPv4list: IVectorView<HostName?>?,
      assignedClientIPv6list: IVectorView<HostName?>?,
      vpnInterfaceId: VpnInterfaceId?,
      assignedRoutes: VpnRouteAssignment?,
      assignedDomainName: VpnDomainNameAssignment?,
      mtuSize: WinDef.UINT,
      maxFrameSize: WinDef.UINT,
      Reserved: Boolean,
      mainOuterTunnelTransport: IUnknown?
    ): Unit {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(assignedClientIPv4list),
          marshalToNative(assignedClientIPv6list), marshalToNative(vpnInterfaceId),
          marshalToNative(assignedRoutes), marshalToNative(assignedDomainName), mtuSize,
          maxFrameSize, Reserved, marshalToNative(mainOuterTunnelTransport),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StartExistingTransports(
      assignedClientIPv4list: IVectorView<HostName?>?,
      assignedClientIPv6list: IVectorView<HostName?>?,
      vpnInterfaceId: VpnInterfaceId?,
      assignedRoutes: VpnRouteAssignment?,
      assignedDomainName: VpnDomainNameAssignment?,
      mtuSize: WinDef.UINT,
      maxFrameSize: WinDef.UINT,
      Reserved: Boolean
    ): Unit {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(assignedClientIPv4list),
          marshalToNative(assignedClientIPv6list), marshalToNative(vpnInterfaceId),
          marshalToNative(assignedRoutes), marshalToNative(assignedDomainName), mtuSize,
          maxFrameSize, Reserved,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ActivityStateChange(handler: TypedEventHandler<VpnChannel?,
        VpnChannelActivityStateChangedArgs?>?): EventRegistrationToken? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ActivityStateChange(token: EventRegistrationToken?): Unit {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetVpnSendPacketBuffer(): VpnPacketBuffer? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnPacketBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetVpnReceivePacketBuffer(): VpnPacketBuffer? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnPacketBuffer>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnPacketBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun RequestCustomPromptAsync(customPromptElement: IVectorView<IVpnCustomPromptElement?>?):
        IAsyncAction? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(customPromptElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun RequestCredentialsAsync(
      credType: VpnCredentialType?,
      credOptions: WinDef.UINT,
      certificate: Certificate?
    ): IAsyncOperation<VpnCredential?>? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnCredential?>>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(credType), credOptions,
          marshalToNative(certificate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VpnCredential?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RequestCredentialsAsync(credType: VpnCredentialType?,
        credOptions: WinDef.UINT): IAsyncOperation<VpnCredential?>? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnCredential?>>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(credType), credOptions,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VpnCredential?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun RequestCredentialsAsync(credType: VpnCredentialType?):
        IAsyncOperation<VpnCredential?>? {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VpnCredential?>>()
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(credType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VpnCredential?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun TerminateConnection(message: String?): Unit {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(message),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun StartWithTrafficFilter(
      assignedClientIpv4List: IVectorView<HostName?>?,
      assignedClientIpv6List: IVectorView<HostName?>?,
      vpnInterfaceId: VpnInterfaceId?,
      assignedRoutes: VpnRouteAssignment?,
      assignedNamespace: VpnDomainNameAssignment?,
      mtuSize: WinDef.UINT,
      maxFrameSize: WinDef.UINT,
      reserved: Boolean,
      mainOuterTunnelTransport: IUnknown?,
      optionalOuterTunnelTransport: IUnknown?,
      assignedTrafficFilters: VpnTrafficFilterAssignment?
    ): Unit {
      val fnPtr = _1566639361_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1566639361_Ptr, marshalToNative(assignedClientIpv4List),
          marshalToNative(assignedClientIpv6List), marshalToNative(vpnInterfaceId),
          marshalToNative(assignedRoutes), marshalToNative(assignedNamespace), mtuSize,
          maxFrameSize, reserved, marshalToNative(mainOuterTunnelTransport),
          marshalToNative(optionalOuterTunnelTransport), marshalToNative(assignedTrafficFilters),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnChannel2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566639361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannel2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2255d165993b4629ad60f1c3f3537f50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannel2(ptr: Pointer?): WithDefault = IVpnChannel2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannel2 {
      val address = segment.toRawLongValue()
      return makeIVpnChannel2(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannel2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566639361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannel2): Array<IVpnChannel2?> = (elements as
        Array<IVpnChannel2?>).castToImpl<IVpnChannel2,IVpnChannel2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannel2?> =
        arrayOfNulls<IVpnChannel2_Impl>(size) as Array<IVpnChannel2?>
  }
}
