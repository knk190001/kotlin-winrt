package Windows.System.Diagnostics.DevicePortal

import Windows.Networking.Sockets.MessageWebSocketReceiveMode
import Windows.Networking.Sockets.ServerMessageWebSocket
import Windows.Networking.Sockets.ServerStreamWebSocket
import Windows.Networking.Sockets.SocketMessageType
import Windows.Web.Http.HttpRequestMessage
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

@ABIMarker(IDevicePortalWebSocketConnection.ABI::class)
@Signature("{67657920-d65a-42f0-aef4-787808098b7b}")
@Guid("67657920d65a42f0aef4787808098b7b")
@WinRTInterface("67657920d65a42f0aef4787808098b7b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePortalWebSocketConnection.ByReference::class)
public interface IDevicePortalWebSocketConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetServerMessageWebSocketForRequest(request: HttpRequestMessage?):
      ServerMessageWebSocket?

  @InterfaceMethod(1)
  public fun GetServerMessageWebSocketForRequest(
    request: HttpRequestMessage?,
    messageType: SocketMessageType?,
    protocol: String?
  ): ServerMessageWebSocket?

  @InterfaceMethod(2)
  public fun GetServerMessageWebSocketForRequest(
    request: HttpRequestMessage?,
    messageType: SocketMessageType?,
    protocol: String?,
    outboundBufferSizeInBytes: WinDef.UINT,
    maxMessageSize: WinDef.UINT,
    receiveMode: MessageWebSocketReceiveMode?
  ): ServerMessageWebSocket?

  @InterfaceMethod(3)
  public fun GetServerStreamWebSocketForRequest(request: HttpRequestMessage?):
      ServerStreamWebSocket?

  @InterfaceMethod(4)
  public fun GetServerStreamWebSocketForRequest(
    request: HttpRequestMessage?,
    protocol: String?,
    outboundBufferSizeInBytes: WinDef.UINT,
    noDelay: Boolean
  ): ServerStreamWebSocket?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePortalWebSocketConnection> {
    public override fun getValue() = ABI.makeIDevicePortalWebSocketConnection(pointer.getPointer(0))

    public fun setValue(value: IDevicePortalWebSocketConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePortalWebSocketConnection {
    public val __1847804494_Ptr: Pointer?

    public val _1847804494_VtblPtr: Pointer?
      get() = __1847804494_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetServerMessageWebSocketForRequest(request: HttpRequestMessage?):
        ServerMessageWebSocket? {
      val fnPtr = _1847804494_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerMessageWebSocket>()
      val hr = fn.invokeHR(arrayOf(__1847804494_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerMessageWebSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetServerMessageWebSocketForRequest(
      request: HttpRequestMessage?,
      messageType: SocketMessageType?,
      protocol: String?
    ): ServerMessageWebSocket? {
      val fnPtr = _1847804494_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerMessageWebSocket>()
      val hr = fn.invokeHR(arrayOf(__1847804494_Ptr, marshalToNative(request),
          marshalToNative(messageType), marshalToNative(protocol), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerMessageWebSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetServerMessageWebSocketForRequest(
      request: HttpRequestMessage?,
      messageType: SocketMessageType?,
      protocol: String?,
      outboundBufferSizeInBytes: WinDef.UINT,
      maxMessageSize: WinDef.UINT,
      receiveMode: MessageWebSocketReceiveMode?
    ): ServerMessageWebSocket? {
      val fnPtr = _1847804494_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerMessageWebSocket>()
      val hr = fn.invokeHR(arrayOf(__1847804494_Ptr, marshalToNative(request),
          marshalToNative(messageType), marshalToNative(protocol), outboundBufferSizeInBytes,
          maxMessageSize, marshalToNative(receiveMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerMessageWebSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetServerStreamWebSocketForRequest(request: HttpRequestMessage?):
        ServerStreamWebSocket? {
      val fnPtr = _1847804494_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerStreamWebSocket>()
      val hr = fn.invokeHR(arrayOf(__1847804494_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerStreamWebSocket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetServerStreamWebSocketForRequest(
      request: HttpRequestMessage?,
      protocol: String?,
      outboundBufferSizeInBytes: WinDef.UINT,
      noDelay: Boolean
    ): ServerStreamWebSocket? {
      val fnPtr = _1847804494_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerStreamWebSocket>()
      val hr = fn.invokeHR(arrayOf(__1847804494_Ptr, marshalToNative(request),
          marshalToNative(protocol), outboundBufferSizeInBytes, noDelay, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerStreamWebSocket>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePortalWebSocketConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1847804494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePortalWebSocketConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67657920d65a42f0aef4787808098b7b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePortalWebSocketConnection(ptr: Pointer?): WithDefault =
        IDevicePortalWebSocketConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePortalWebSocketConnection {
      val address = segment.toRawLongValue()
      return makeIDevicePortalWebSocketConnection(Pointer(address))
    }

    public override fun toNative(obj: IDevicePortalWebSocketConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1847804494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePortalWebSocketConnection):
        Array<IDevicePortalWebSocketConnection?> = (elements as
        Array<IDevicePortalWebSocketConnection?>).castToImpl<IDevicePortalWebSocketConnection,IDevicePortalWebSocketConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePortalWebSocketConnection?> =
        arrayOfNulls<IDevicePortalWebSocketConnection_Impl>(size) as
        Array<IDevicePortalWebSocketConnection?>
  }
}
