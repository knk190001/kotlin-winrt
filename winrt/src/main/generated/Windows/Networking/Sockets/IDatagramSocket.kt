package Windows.Networking.Sockets

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Networking.EndpointPair
import Windows.Networking.HostName
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

@ABIMarker(IDatagramSocket.ABI::class)
@Signature("{7fe25bbb-c3bc-4677-8446-ca28a465a3af}")
@Guid("7fe25bbbc3bc46778446ca28a465a3af")
@WinRTInterface("7fe25bbbc3bc46778446ca28a465a3af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocket.ByReference::class)
public interface IDatagramSocket : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Control(): DatagramSocketControl?

  @InterfaceMethod(1)
  public fun get_Information(): DatagramSocketInformation?

  @InterfaceMethod(2)
  public fun get_OutputStream(): IOutputStream?

  @InterfaceMethod(3)
  public fun ConnectAsync(remoteHostName: HostName?, remoteServiceName: String?): IAsyncAction?

  @InterfaceMethod(4)
  public fun ConnectAsync(endpointPair: EndpointPair?): IAsyncAction?

  @InterfaceMethod(5)
  public fun BindServiceNameAsync(localServiceName: String?): IAsyncAction?

  @InterfaceMethod(6)
  public fun BindEndpointAsync(localHostName: HostName?, localServiceName: String?): IAsyncAction?

  @InterfaceMethod(7)
  public fun JoinMulticastGroup(host: HostName?): Unit

  @InterfaceMethod(8)
  public fun GetOutputStreamAsync(remoteHostName: HostName?, remoteServiceName: String?):
      IAsyncOperation<IOutputStream?>?

  @InterfaceMethod(9)
  public fun GetOutputStreamAsync(endpointPair: EndpointPair?): IAsyncOperation<IOutputStream?>?

  @InterfaceMethod(10)
  public fun add_MessageReceived(eventHandler: TypedEventHandler<DatagramSocket?,
      DatagramSocketMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_MessageReceived(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocket> {
    public override fun getValue() = ABI.makeIDatagramSocket(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocket, IClosable.WithDefault {
    public val __1622600564_Ptr: Pointer?

    public val _1622600564_VtblPtr: Pointer?
      get() = __1622600564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Control(): DatagramSocketControl? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DatagramSocketControl>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DatagramSocketControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Information(): DatagramSocketInformation? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DatagramSocketInformation>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DatagramSocketInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ConnectAsync(remoteHostName: HostName?, remoteServiceName: String?):
        IAsyncAction? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ConnectAsync(endpointPair: EndpointPair?): IAsyncAction? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(endpointPair), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun BindServiceNameAsync(localServiceName: String?): IAsyncAction? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(localServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun BindEndpointAsync(localHostName: HostName?, localServiceName: String?):
        IAsyncAction? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(localHostName),
          marshalToNative(localServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun JoinMulticastGroup(host: HostName?): Unit {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(host),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun GetOutputStreamAsync(remoteHostName: HostName?, remoteServiceName: String?):
        IAsyncOperation<IOutputStream?>? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IOutputStream?>>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(remoteHostName),
          marshalToNative(remoteServiceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IOutputStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetOutputStreamAsync(endpointPair: EndpointPair?):
        IAsyncOperation<IOutputStream?>? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IOutputStream?>>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(endpointPair), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IOutputStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun add_MessageReceived(eventHandler: TypedEventHandler<DatagramSocket?,
        DatagramSocketMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_MessageReceived(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1622600564_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1622600564_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatagramSocket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1622600564_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1622600564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7fe25bbbc3bc46778446ca28a465a3af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocket(ptr: Pointer?): WithDefault = IDatagramSocket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocket {
      val address = segment.toRawLongValue()
      return makeIDatagramSocket(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1622600564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocket): Array<IDatagramSocket?> = (elements as
        Array<IDatagramSocket?>).castToImpl<IDatagramSocket,IDatagramSocket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocket?> =
        arrayOfNulls<IDatagramSocket_Impl>(size) as Array<IDatagramSocket?>
  }
}
