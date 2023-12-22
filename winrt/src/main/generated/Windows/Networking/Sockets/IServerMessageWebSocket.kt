package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IOutputStream
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IServerMessageWebSocket.ABI::class)
@Signature("{e3ac9240-813b-5efd-7e11-ae2305fc77f1}")
@Guid("e3ac9240813b5efd7e11ae2305fc77f1")
@WinRTInterface("e3ac9240813b5efd7e11ae2305fc77f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServerMessageWebSocket.ByReference::class)
public interface IServerMessageWebSocket : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun add_MessageReceived(value: TypedEventHandler<ServerMessageWebSocket?,
      MessageWebSocketMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MessageReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_Control(): ServerMessageWebSocketControl?

  @InterfaceMethod(3)
  public fun get_Information(): ServerMessageWebSocketInformation?

  @InterfaceMethod(4)
  public fun get_OutputStream(): IOutputStream?

  @InterfaceMethod(5)
  public fun add_Closed(value: TypedEventHandler<ServerMessageWebSocket?,
      WebSocketClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun Close(code: WinDef.USHORT, reason: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServerMessageWebSocket> {
    public override fun getValue() = ABI.makeIServerMessageWebSocket(pointer.getPointer(0))

    public fun setValue(value: IServerMessageWebSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServerMessageWebSocket, IClosable.WithDefault {
    public val __2011336123_Ptr: Pointer?

    public val _2011336123_VtblPtr: Pointer?
      get() = __2011336123_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_MessageReceived(value: TypedEventHandler<ServerMessageWebSocket?,
        MessageWebSocketMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MessageReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Control(): ServerMessageWebSocketControl? {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerMessageWebSocketControl>()
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerMessageWebSocketControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Information(): ServerMessageWebSocketInformation? {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerMessageWebSocketInformation>()
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerMessageWebSocketInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_Closed(value: TypedEventHandler<ServerMessageWebSocket?,
        WebSocketClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Close(code: WinDef.USHORT, reason: String?): Unit {
      val fnPtr = _2011336123_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2011336123_Ptr, code, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IServerMessageWebSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2011336123_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2011336123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServerMessageWebSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3ac9240813b5efd7e11ae2305fc77f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServerMessageWebSocket(ptr: Pointer?): WithDefault =
        IServerMessageWebSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServerMessageWebSocket {
      val address = segment.toRawLongValue()
      return makeIServerMessageWebSocket(Pointer(address))
    }

    public override fun toNative(obj: IServerMessageWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2011336123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServerMessageWebSocket): Array<IServerMessageWebSocket?>
        = (elements as
        Array<IServerMessageWebSocket?>).castToImpl<IServerMessageWebSocket,IServerMessageWebSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServerMessageWebSocket?> =
        arrayOfNulls<IServerMessageWebSocket_Impl>(size) as Array<IServerMessageWebSocket?>
  }
}
