package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
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

@ABIMarker(IWebSocket.ABI::class)
@Signature("{f877396f-99b1-4e18-bc08-850c9adf156e}")
@Guid("f877396f99b14e18bc08850c9adf156e")
@WinRTInterface("f877396f99b14e18bc08850c9adf156e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebSocket.ByReference::class)
public interface IWebSocket : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_OutputStream(): IOutputStream?

  @InterfaceMethod(1)
  public fun ConnectAsync(uri: Uri?): IAsyncAction?

  @InterfaceMethod(2)
  public fun SetRequestHeader(headerName: String?, headerValue: String?): Unit

  @InterfaceMethod(3)
  public fun add_Closed(eventHandler: TypedEventHandler<IWebSocket?, WebSocketClosedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Closed(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Close(code: WinDef.USHORT, reason: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebSocket> {
    public override fun getValue() = ABI.makeIWebSocket(pointer.getPointer(0))

    public fun setValue(value: IWebSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebSocket, IClosable.WithDefault {
    public val __1618117585_Ptr: Pointer?

    public val _1618117585_VtblPtr: Pointer?
      get() = __1618117585_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _1618117585_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1618117585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConnectAsync(uri: Uri?): IAsyncAction? {
      val fnPtr = _1618117585_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1618117585_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetRequestHeader(headerName: String?, headerValue: String?): Unit {
      val fnPtr = _1618117585_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1618117585_Ptr, marshalToNative(headerName),
          marshalToNative(headerValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Closed(eventHandler: TypedEventHandler<IWebSocket?,
        WebSocketClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1618117585_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1618117585_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Closed(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1618117585_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1618117585_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Close(code: WinDef.USHORT, reason: String?): Unit {
      val fnPtr = _1618117585_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1618117585_Ptr, code, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1618117585_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1618117585_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f877396f99b14e18bc08850c9adf156e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebSocket(ptr: Pointer?): WithDefault = IWebSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebSocket {
      val address = segment.toRawLongValue()
      return makeIWebSocket(Pointer(address))
    }

    public override fun toNative(obj: IWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1618117585_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebSocket): Array<IWebSocket?> = (elements as
        Array<IWebSocket?>).castToImpl<IWebSocket,IWebSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebSocket?> = arrayOfNulls<IWebSocket_Impl>(size)
        as Array<IWebSocket?>
  }
}
