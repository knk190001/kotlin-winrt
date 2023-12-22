package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IVpnChannel.ABI::class)
@Signature("{4ac78d07-d1a8-4303-a091-c8d2e0915bc3}")
@Guid("4ac78d07d1a84303a091c8d2e0915bc3")
@WinRTInterface("4ac78d07d1a84303a091c8d2e0915bc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnChannel.ByReference::class)
public interface IVpnChannel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AssociateTransport(mainOuterTunnelTransport: IUnknown?,
      optionalOuterTunnelTransport: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun Start(
    assignedClientIPv4list: IVectorView<HostName?>?,
    assignedClientIPv6list: IVectorView<HostName?>?,
    vpnInterfaceId: VpnInterfaceId?,
    routeScope: VpnRouteAssignment?,
    namespaceScope: VpnNamespaceAssignment?,
    mtuSize: WinDef.UINT,
    maxFrameSize: WinDef.UINT,
    optimizeForLowCostNetwork: Boolean,
    mainOuterTunnelTransport: IUnknown?,
    optionalOuterTunnelTransport: IUnknown?
  ): Unit

  @InterfaceMethod(2)
  public fun Stop(): Unit

  @InterfaceMethod(3)
  public fun RequestCredentials(
    credType: VpnCredentialType?,
    isRetry: Boolean,
    isSingleSignOnCredential: Boolean,
    certificate: Certificate?
  ): VpnPickedCredential?

  @InterfaceMethod(4)
  public fun RequestVpnPacketBuffer(type: VpnDataPathType?,
      vpnPacketBuffer: Windows.Networking.Vpn.VpnPacketBuffer.ByReference?): Unit

  @InterfaceMethod(5)
  public fun LogDiagnosticMessage(message: String?): Unit

  @InterfaceMethod(6)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_Configuration(): VpnChannelConfiguration?

  @InterfaceMethod(8)
  public fun add_ActivityChange(handler: TypedEventHandler<VpnChannel?,
      VpnChannelActivityEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_ActivityChange(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun put_PlugInContext(value: IUnknown?): Unit

  @InterfaceMethod(11)
  public fun get_PlugInContext(): IUnknown?

  @InterfaceMethod(12)
  public fun get_SystemHealth(): VpnSystemHealth?

  @InterfaceMethod(13)
  public fun RequestCustomPrompt(customPrompt: IVectorView<IVpnCustomPrompt?>?): Unit

  @InterfaceMethod(14)
  public fun SetErrorMessage(message: String?): Unit

  @InterfaceMethod(15)
  public fun SetAllowedSslTlsVersions(tunnelTransport: IUnknown?, useTls12: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVpnChannel> {
    public override fun getValue() = ABI.makeIVpnChannel(pointer.getPointer(0))

    public fun setValue(value: IVpnChannel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnChannel {
    public val __1990199405_Ptr: Pointer?

    public val _1990199405_VtblPtr: Pointer?
      get() = __1990199405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AssociateTransport(mainOuterTunnelTransport: IUnknown?,
        optionalOuterTunnelTransport: IUnknown?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(mainOuterTunnelTransport),
          marshalToNative(optionalOuterTunnelTransport),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Start(
      assignedClientIPv4list: IVectorView<HostName?>?,
      assignedClientIPv6list: IVectorView<HostName?>?,
      vpnInterfaceId: VpnInterfaceId?,
      routeScope: VpnRouteAssignment?,
      namespaceScope: VpnNamespaceAssignment?,
      mtuSize: WinDef.UINT,
      maxFrameSize: WinDef.UINT,
      optimizeForLowCostNetwork: Boolean,
      mainOuterTunnelTransport: IUnknown?,
      optionalOuterTunnelTransport: IUnknown?
    ): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(assignedClientIPv4list),
          marshalToNative(assignedClientIPv6list), marshalToNative(vpnInterfaceId),
          marshalToNative(routeScope), marshalToNative(namespaceScope), mtuSize, maxFrameSize,
          optimizeForLowCostNetwork, marshalToNative(mainOuterTunnelTransport),
          marshalToNative(optionalOuterTunnelTransport),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Stop(): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RequestCredentials(
      credType: VpnCredentialType?,
      isRetry: Boolean,
      isSingleSignOnCredential: Boolean,
      certificate: Certificate?
    ): VpnPickedCredential? {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnPickedCredential>()
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(credType), isRetry,
          isSingleSignOnCredential, marshalToNative(certificate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnPickedCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestVpnPacketBuffer(type: VpnDataPathType?,
        vpnPacketBuffer: Windows.Networking.Vpn.VpnPacketBuffer.ByReference?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(type),
          marshalToNative(vpnPacketBuffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun LogDiagnosticMessage(message: String?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(message),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Configuration(): VpnChannelConfiguration? {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnChannelConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnChannelConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun add_ActivityChange(handler: TypedEventHandler<VpnChannel?,
        VpnChannelActivityEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_ActivityChange(token: EventRegistrationToken?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun put_PlugInContext(value: IUnknown?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_PlugInContext(): IUnknown? {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SystemHealth(): VpnSystemHealth? {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VpnSystemHealth>()
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VpnSystemHealth>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun RequestCustomPrompt(customPrompt: IVectorView<IVpnCustomPrompt?>?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(customPrompt),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun SetErrorMessage(message: String?): Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(message),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun SetAllowedSslTlsVersions(tunnelTransport: IUnknown?, useTls12: Boolean):
        Unit {
      val fnPtr = _1990199405_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990199405_Ptr, marshalToNative(tunnelTransport), useTls12,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnChannel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990199405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnChannel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ac78d07d1a84303a091c8d2e0915bc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnChannel(ptr: Pointer?): WithDefault = IVpnChannel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnChannel {
      val address = segment.toRawLongValue()
      return makeIVpnChannel(Pointer(address))
    }

    public override fun toNative(obj: IVpnChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990199405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnChannel): Array<IVpnChannel?> = (elements as
        Array<IVpnChannel?>).castToImpl<IVpnChannel,IVpnChannel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnChannel?> =
        arrayOfNulls<IVpnChannel_Impl>(size) as Array<IVpnChannel?>
  }
}
