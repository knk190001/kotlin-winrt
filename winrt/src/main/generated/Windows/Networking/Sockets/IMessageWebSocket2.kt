package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.TypedEventHandler
import Windows.Networking.Sockets.IMessageWebSocket.ABI.IID
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

@ABIMarker(IMessageWebSocket2.ABI::class)
@Signature("{bed0cee7-f9c8-440a-9ad5-737281d9742e}")
@Guid("bed0cee7f9c8440a9ad5737281d9742e")
@WinRTInterface("bed0cee7f9c8440a9ad5737281d9742e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageWebSocket2.ByReference::class)
public interface IMessageWebSocket2 : NativeMapped, IWinRTInterface, IMessageWebSocket, IWebSocket,
    IClosable {
  @InterfaceMethod(0)
  public fun add_ServerCustomValidationRequested(eventHandler: TypedEventHandler<MessageWebSocket?,
      WebSocketServerCustomValidationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ServerCustomValidationRequested(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessageWebSocket2> {
    public override fun getValue() = ABI.makeIMessageWebSocket2(pointer.getPointer(0))

    public fun setValue(value: IMessageWebSocket2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageWebSocket2, IMessageWebSocket.WithDefault,
      IWebSocket.WithDefault, IClosable.WithDefault {
    public val __1705730266_Ptr: Pointer?

    public val _1705730266_VtblPtr: Pointer?
      get() = __1705730266_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ServerCustomValidationRequested(eventHandler: TypedEventHandler<MessageWebSocket?,
        WebSocketServerCustomValidationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1705730266_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1705730266_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun remove_ServerCustomValidationRequested(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1705730266_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1705730266_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMessageWebSocket2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMessageWebSocket, IWebSocket,
      IClosable {
    public override val __747760216_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1705730266_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1618117585_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IWebSocket.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1705730266_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1705730266_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1705730266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageWebSocket2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bed0cee7f9c8440a9ad5737281d9742e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageWebSocket2(ptr: Pointer?): WithDefault = IMessageWebSocket2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMessageWebSocket2 {
      val address = segment.toRawLongValue()
      return makeIMessageWebSocket2(Pointer(address))
    }

    public override fun toNative(obj: IMessageWebSocket2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1705730266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageWebSocket2): Array<IMessageWebSocket2?> =
        (elements as
        Array<IMessageWebSocket2?>).castToImpl<IMessageWebSocket2,IMessageWebSocket2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageWebSocket2?> =
        arrayOfNulls<IMessageWebSocket2_Impl>(size) as Array<IMessageWebSocket2?>
  }
}
