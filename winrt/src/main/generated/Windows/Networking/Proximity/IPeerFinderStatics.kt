package Windows.Networking.Proximity

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Networking.Sockets.StreamSocket
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPeerFinderStatics.ABI::class)
@Signature("{914b3b61-f6e1-47c4-a14c-148a1903d0c6}")
@Guid("914b3b61f6e147c4a14c148a1903d0c6")
@WinRTInterface("914b3b61f6e147c4a14c148a1903d0c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPeerFinderStatics.ByReference::class)
public interface IPeerFinderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowBluetooth(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowBluetooth(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AllowInfrastructure(): Boolean

  @InterfaceMethod(3)
  public fun put_AllowInfrastructure(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_AllowWiFiDirect(): Boolean

  @InterfaceMethod(5)
  public fun put_AllowWiFiDirect(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_DisplayName(): String?

  @InterfaceMethod(7)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_SupportedDiscoveryTypes(): PeerDiscoveryTypes?

  @InterfaceMethod(9)
  public fun get_AlternateIdentities(): IMap<String?, String?>?

  @InterfaceMethod(10)
  public fun Start(): Unit

  @InterfaceMethod(11)
  public fun Start(peerMessage: String?): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  @InterfaceMethod(13)
  public fun add_TriggeredConnectionStateChanged(handler: TypedEventHandler<IUnknown?,
      TriggeredConnectionStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_TriggeredConnectionStateChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_ConnectionRequested(handler: TypedEventHandler<IUnknown?,
      ConnectionRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_ConnectionRequested(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun FindAllPeersAsync(): IAsyncOperation<IVectorView<PeerInformation?>?>?

  @InterfaceMethod(18)
  public fun ConnectAsync(peerInformation: PeerInformation?): IAsyncOperation<StreamSocket?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPeerFinderStatics> {
    public override fun getValue() = ABI.makeIPeerFinderStatics(pointer.getPointer(0))

    public fun setValue(value: IPeerFinderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPeerFinderStatics {
    public val __1339977244_Ptr: Pointer?

    public val _1339977244_VtblPtr: Pointer?
      get() = __1339977244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowBluetooth(): Boolean {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowBluetooth(value: Boolean): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AllowInfrastructure(): Boolean {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AllowInfrastructure(value: Boolean): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AllowWiFiDirect(): Boolean {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AllowWiFiDirect(value: Boolean): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SupportedDiscoveryTypes(): PeerDiscoveryTypes? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PeerDiscoveryTypes>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PeerDiscoveryTypes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_AlternateIdentities(): IMap<String?, String?>? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun Start(): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Start(peerMessage: String?): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(peerMessage),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_TriggeredConnectionStateChanged(handler: TypedEventHandler<IUnknown?,
        TriggeredConnectionStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_TriggeredConnectionStateChanged(cookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_ConnectionRequested(handler: TypedEventHandler<IUnknown?,
        ConnectionRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_ConnectionRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun FindAllPeersAsync(): IAsyncOperation<IVectorView<PeerInformation?>?>? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PeerInformation?>?>>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PeerInformation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun ConnectAsync(peerInformation: PeerInformation?):
        IAsyncOperation<StreamSocket?>? {
      val fnPtr = _1339977244_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StreamSocket?>>()
      val hr = fn.invokeHR(arrayOf(__1339977244_Ptr, marshalToNative(peerInformation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StreamSocket?>>(result.getValue())
      return resultValue
    }
  }

  public class IPeerFinderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1339977244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPeerFinderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("914b3b61f6e147c4a14c148a1903d0c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPeerFinderStatics(ptr: Pointer?): WithDefault = IPeerFinderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPeerFinderStatics {
      val address = segment.toRawLongValue()
      return makeIPeerFinderStatics(Pointer(address))
    }

    public override fun toNative(obj: IPeerFinderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1339977244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPeerFinderStatics): Array<IPeerFinderStatics?> =
        (elements as
        Array<IPeerFinderStatics?>).castToImpl<IPeerFinderStatics,IPeerFinderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPeerFinderStatics?> =
        arrayOfNulls<IPeerFinderStatics_Impl>(size) as Array<IPeerFinderStatics?>
  }
}
