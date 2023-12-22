package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.TypedEventHandler
import Windows.Networking.Sockets.IStreamWebSocket.ABI.IID
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

@ABIMarker(IStreamWebSocket2.ABI::class)
@Signature("{aa4d08cb-93f5-4678-8236-57cce5417ed5}")
@Guid("aa4d08cb93f54678823657cce5417ed5")
@WinRTInterface("aa4d08cb93f54678823657cce5417ed5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamWebSocket2.ByReference::class)
public interface IStreamWebSocket2 : NativeMapped, IWinRTInterface, IStreamWebSocket, IWebSocket,
    IClosable {
  @InterfaceMethod(0)
  public fun add_ServerCustomValidationRequested(eventHandler: TypedEventHandler<StreamWebSocket?,
      WebSocketServerCustomValidationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ServerCustomValidationRequested(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamWebSocket2> {
    public override fun getValue() = ABI.makeIStreamWebSocket2(pointer.getPointer(0))

    public fun setValue(value: IStreamWebSocket2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamWebSocket2, IStreamWebSocket.WithDefault,
      IWebSocket.WithDefault, IClosable.WithDefault {
    public val __404264061_Ptr: Pointer?

    public val _404264061_VtblPtr: Pointer?
      get() = __404264061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ServerCustomValidationRequested(eventHandler: TypedEventHandler<StreamWebSocket?,
        WebSocketServerCustomValidationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _404264061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__404264061_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun remove_ServerCustomValidationRequested(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _404264061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__404264061_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamWebSocket2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStreamWebSocket, IWebSocket,
      IClosable {
    public override val __818243215_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_404264061_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1618117585_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IWebSocket.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_404264061_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_404264061_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __404264061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamWebSocket2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa4d08cb93f54678823657cce5417ed5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamWebSocket2(ptr: Pointer?): WithDefault = IStreamWebSocket2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamWebSocket2 {
      val address = segment.toRawLongValue()
      return makeIStreamWebSocket2(Pointer(address))
    }

    public override fun toNative(obj: IStreamWebSocket2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__404264061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamWebSocket2): Array<IStreamWebSocket2?> = (elements
        as Array<IStreamWebSocket2?>).castToImpl<IStreamWebSocket2,IStreamWebSocket2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamWebSocket2?> =
        arrayOfNulls<IStreamWebSocket2_Impl>(size) as Array<IStreamWebSocket2?>
  }
}
