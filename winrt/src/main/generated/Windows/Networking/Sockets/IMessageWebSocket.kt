package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.TypedEventHandler
import Windows.Networking.Sockets.IWebSocket.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMessageWebSocket.ABI::class)
@Signature("{33727d08-34d5-4746-ad7b-8dde5bc2ef88}")
@Guid("33727d0834d54746ad7b8dde5bc2ef88")
@WinRTInterface("33727d0834d54746ad7b8dde5bc2ef88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageWebSocket.ByReference::class)
public interface IMessageWebSocket : NativeMapped, IWinRTInterface, IWebSocket, IClosable {
  @InterfaceMethod(0)
  public fun get_Control(): MessageWebSocketControl?

  @InterfaceMethod(1)
  public fun get_Information(): MessageWebSocketInformation?

  @InterfaceMethod(2)
  public fun add_MessageReceived(eventHandler: TypedEventHandler<MessageWebSocket?,
      MessageWebSocketMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_MessageReceived(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessageWebSocket> {
    public override fun getValue() = ABI.makeIMessageWebSocket(pointer.getPointer(0))

    public fun setValue(value: IMessageWebSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageWebSocket, IWebSocket.WithDefault, IClosable.WithDefault {
    public val __747760216_Ptr: Pointer?

    public val _747760216_VtblPtr: Pointer?
      get() = __747760216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Control(): MessageWebSocketControl? {
      val fnPtr = _747760216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessageWebSocketControl>()
      val hr = fn.invokeHR(arrayOf(__747760216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessageWebSocketControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Information(): MessageWebSocketInformation? {
      val fnPtr = _747760216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessageWebSocketInformation>()
      val hr = fn.invokeHR(arrayOf(__747760216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessageWebSocketInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_MessageReceived(eventHandler: TypedEventHandler<MessageWebSocket?,
        MessageWebSocketMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _747760216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__747760216_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_MessageReceived(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _747760216_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__747760216_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMessageWebSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebSocket, IClosable {
    public override val __1618117585_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_747760216_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_747760216_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __747760216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageWebSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33727d0834d54746ad7b8dde5bc2ef88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageWebSocket(ptr: Pointer?): WithDefault = IMessageWebSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMessageWebSocket {
      val address = segment.toRawLongValue()
      return makeIMessageWebSocket(Pointer(address))
    }

    public override fun toNative(obj: IMessageWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__747760216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageWebSocket): Array<IMessageWebSocket?> = (elements
        as Array<IMessageWebSocket?>).castToImpl<IMessageWebSocket,IMessageWebSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageWebSocket?> =
        arrayOfNulls<IMessageWebSocket_Impl>(size) as Array<IMessageWebSocket?>
  }
}
