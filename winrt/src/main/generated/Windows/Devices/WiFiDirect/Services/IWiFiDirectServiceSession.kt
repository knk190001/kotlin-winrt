package Windows.Devices.WiFiDirect.Services

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Networking.EndpointPair
import Windows.Networking.Sockets.DatagramSocket
import Windows.Networking.Sockets.StreamSocketListener
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IWiFiDirectServiceSession.ABI::class)
@Signature("{81142163-e426-47cb-8640-e1b3588bf26f}")
@Guid("81142163e42647cb8640e1b3588bf26f")
@WinRTInterface("81142163e42647cb8640e1b3588bf26f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectServiceSession.ByReference::class)
public interface IWiFiDirectServiceSession : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_ServiceName(): String?

  @InterfaceMethod(1)
  public fun get_Status(): WiFiDirectServiceSessionStatus?

  @InterfaceMethod(2)
  public fun get_ErrorStatus(): WiFiDirectServiceSessionErrorStatus?

  @InterfaceMethod(3)
  public fun get_SessionId(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_AdvertisementId(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_ServiceAddress(): String?

  @InterfaceMethod(6)
  public fun get_SessionAddress(): String?

  @InterfaceMethod(7)
  public fun GetConnectionEndpointPairs(): IVectorView<EndpointPair?>?

  @InterfaceMethod(8)
  public fun add_SessionStatusChanged(handler: TypedEventHandler<WiFiDirectServiceSession?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SessionStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun AddStreamSocketListenerAsync(value: StreamSocketListener?): IAsyncAction?

  @InterfaceMethod(11)
  public fun AddDatagramSocketAsync(value: DatagramSocket?): IAsyncAction?

  @InterfaceMethod(12)
  public fun add_RemotePortAdded(handler: TypedEventHandler<WiFiDirectServiceSession?,
      WiFiDirectServiceRemotePortAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_RemotePortAdded(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectServiceSession> {
    public override fun getValue() = ABI.makeIWiFiDirectServiceSession(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectServiceSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectServiceSession, IClosable.WithDefault {
    public val __1389950422_Ptr: Pointer?

    public val _1389950422_VtblPtr: Pointer?
      get() = __1389950422_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServiceName(): String? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): WiFiDirectServiceSessionStatus? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceSessionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorStatus(): WiFiDirectServiceSessionErrorStatus? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectServiceSessionErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectServiceSessionErrorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SessionId(): WinDef.UINT {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_AdvertisementId(): WinDef.UINT {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ServiceAddress(): String? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SessionAddress(): String? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetConnectionEndpointPairs(): IVectorView<EndpointPair?>? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EndpointPair?>>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EndpointPair?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun add_SessionStatusChanged(handler: TypedEventHandler<WiFiDirectServiceSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SessionStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun AddStreamSocketListenerAsync(value: StreamSocketListener?): IAsyncAction? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun AddDatagramSocketAsync(value: DatagramSocket?): IAsyncAction? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun add_RemotePortAdded(handler: TypedEventHandler<WiFiDirectServiceSession?,
        WiFiDirectServiceRemotePortAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_RemotePortAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1389950422_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1389950422_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectServiceSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1389950422_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1389950422_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectServiceSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81142163e42647cb8640e1b3588bf26f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectServiceSession(ptr: Pointer?): WithDefault =
        IWiFiDirectServiceSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectServiceSession {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectServiceSession(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectServiceSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1389950422_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectServiceSession):
        Array<IWiFiDirectServiceSession?> = (elements as
        Array<IWiFiDirectServiceSession?>).castToImpl<IWiFiDirectServiceSession,IWiFiDirectServiceSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectServiceSession?> =
        arrayOfNulls<IWiFiDirectServiceSession_Impl>(size) as Array<IWiFiDirectServiceSession?>
  }
}
