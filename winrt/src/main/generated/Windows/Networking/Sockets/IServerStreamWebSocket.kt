package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IServerStreamWebSocket.ABI::class)
@Signature("{2ced5bbf-74f6-55e4-79df-9132680dfee8}")
@Guid("2ced5bbf74f655e479df9132680dfee8")
@WinRTInterface("2ced5bbf74f655e479df9132680dfee8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IServerStreamWebSocket.ByReference::class)
public interface IServerStreamWebSocket : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Information(): ServerStreamWebSocketInformation?

  @InterfaceMethod(1)
  public fun get_InputStream(): IInputStream?

  @InterfaceMethod(2)
  public fun get_OutputStream(): IOutputStream?

  @InterfaceMethod(3)
  public fun add_Closed(value: TypedEventHandler<ServerStreamWebSocket?,
      WebSocketClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Close(code: WinDef.USHORT, reason: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IServerStreamWebSocket> {
    public override fun getValue() = ABI.makeIServerStreamWebSocket(pointer.getPointer(0))

    public fun setValue(value: IServerStreamWebSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IServerStreamWebSocket, IClosable.WithDefault {
    public val __720456396_Ptr: Pointer?

    public val _720456396_VtblPtr: Pointer?
      get() = __720456396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Information(): ServerStreamWebSocketInformation? {
      val fnPtr = _720456396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ServerStreamWebSocketInformation>()
      val hr = fn.invokeHR(arrayOf(__720456396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ServerStreamWebSocketInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InputStream(): IInputStream? {
      val fnPtr = _720456396_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__720456396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _720456396_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__720456396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Closed(value: TypedEventHandler<ServerStreamWebSocket?,
        WebSocketClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _720456396_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__720456396_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _720456396_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__720456396_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Close(code: WinDef.USHORT, reason: String?): Unit {
      val fnPtr = _720456396_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__720456396_Ptr, code, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IServerStreamWebSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_720456396_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __720456396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IServerStreamWebSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ced5bbf74f655e479df9132680dfee8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIServerStreamWebSocket(ptr: Pointer?): WithDefault =
        IServerStreamWebSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IServerStreamWebSocket {
      val address = segment.toRawLongValue()
      return makeIServerStreamWebSocket(Pointer(address))
    }

    public override fun toNative(obj: IServerStreamWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__720456396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IServerStreamWebSocket): Array<IServerStreamWebSocket?> =
        (elements as
        Array<IServerStreamWebSocket?>).castToImpl<IServerStreamWebSocket,IServerStreamWebSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IServerStreamWebSocket?> =
        arrayOfNulls<IServerStreamWebSocket_Impl>(size) as Array<IServerStreamWebSocket?>
  }
}
