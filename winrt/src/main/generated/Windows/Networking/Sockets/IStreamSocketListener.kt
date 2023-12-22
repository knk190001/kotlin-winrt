package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Networking.HostName
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStreamSocketListener.ABI::class)
@Signature("{ff513437-df9f-4df0-bf82-0ec5d7b35aae}")
@Guid("ff513437df9f4df0bf820ec5d7b35aae")
@WinRTInterface("ff513437df9f4df0bf820ec5d7b35aae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketListener.ByReference::class)
public interface IStreamSocketListener : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Control(): StreamSocketListenerControl?

  @InterfaceMethod(1)
  public fun get_Information(): StreamSocketListenerInformation?

  @InterfaceMethod(2)
  public fun BindServiceNameAsync(localServiceName: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun BindEndpointAsync(localHostName: HostName?, localServiceName: String?): IAsyncAction?

  @InterfaceMethod(4)
  public fun add_ConnectionReceived(eventHandler: TypedEventHandler<StreamSocketListener?,
      StreamSocketListenerConnectionReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ConnectionReceived(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketListener> {
    public override fun getValue() = ABI.makeIStreamSocketListener(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketListener, IClosable.WithDefault {
    public val __581455969_Ptr: Pointer?

    public val _581455969_VtblPtr: Pointer?
      get() = __581455969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Control(): StreamSocketListenerControl? {
      val fnPtr = _581455969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocketListenerControl>()
      val hr = fn.invokeHR(arrayOf(__581455969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocketListenerControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Information(): StreamSocketListenerInformation? {
      val fnPtr = _581455969_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocketListenerInformation>()
      val hr = fn.invokeHR(arrayOf(__581455969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocketListenerInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun BindServiceNameAsync(localServiceName: String?): IAsyncAction? {
      val fnPtr = _581455969_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__581455969_Ptr, marshalToNative(localServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun BindEndpointAsync(localHostName: HostName?, localServiceName: String?):
        IAsyncAction? {
      val fnPtr = _581455969_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__581455969_Ptr, marshalToNative(localHostName),
          marshalToNative(localServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun add_ConnectionReceived(eventHandler: TypedEventHandler<StreamSocketListener?,
        StreamSocketListenerConnectionReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _581455969_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__581455969_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ConnectionReceived(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _581455969_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__581455969_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamSocketListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_581455969_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __581455969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff513437df9f4df0bf820ec5d7b35aae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketListener(ptr: Pointer?): WithDefault =
        IStreamSocketListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketListener {
      val address = segment.toRawLongValue()
      return makeIStreamSocketListener(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__581455969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketListener): Array<IStreamSocketListener?> =
        (elements as
        Array<IStreamSocketListener?>).castToImpl<IStreamSocketListener,IStreamSocketListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketListener?> =
        arrayOfNulls<IStreamSocketListener_Impl>(size) as Array<IStreamSocketListener?>
  }
}
