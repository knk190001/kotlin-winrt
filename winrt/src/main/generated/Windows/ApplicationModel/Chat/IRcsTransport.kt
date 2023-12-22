package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IRcsTransport.ABI::class)
@Signature("{fea34759-f37c-4319-8546-ec84d21d30ff}")
@Guid("fea34759f37c43198546ec84d21d30ff")
@WinRTInterface("fea34759f37c43198546ec84d21d30ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsTransport.ByReference::class)
public interface IRcsTransport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedProperties(): IMapView<String?, IUnknown?>?

  @InterfaceMethod(1)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(2)
  public fun get_TransportFriendlyName(): String?

  @InterfaceMethod(3)
  public fun get_TransportId(): String?

  @InterfaceMethod(4)
  public fun get_Configuration(): RcsTransportConfiguration?

  @InterfaceMethod(5)
  public fun IsStoreAndForwardEnabled(serviceKind: RcsServiceKind?): Boolean

  @InterfaceMethod(6)
  public fun IsServiceKindSupported(serviceKind: RcsServiceKind?): Boolean

  @InterfaceMethod(7)
  public fun add_ServiceKindSupportedChanged(handler: TypedEventHandler<RcsTransport?,
      RcsServiceKindSupportedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ServiceKindSupportedChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRcsTransport>
      {
    public override fun getValue() = ABI.makeIRcsTransport(pointer.getPointer(0))

    public fun setValue(value: IRcsTransport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsTransport {
    public val __1400416274_Ptr: Pointer?

    public val _1400416274_VtblPtr: Pointer?
      get() = __1400416274_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedProperties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_TransportFriendlyName(): String? {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TransportId(): String? {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Configuration(): RcsTransportConfiguration? {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RcsTransportConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RcsTransportConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IsStoreAndForwardEnabled(serviceKind: RcsServiceKind?): Boolean {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr, marshalToNative(serviceKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun IsServiceKindSupported(serviceKind: RcsServiceKind?): Boolean {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr, marshalToNative(serviceKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun add_ServiceKindSupportedChanged(handler: TypedEventHandler<RcsTransport?,
        RcsServiceKindSupportedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ServiceKindSupportedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1400416274_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1400416274_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRcsTransport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1400416274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsTransport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fea34759f37c43198546ec84d21d30ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsTransport(ptr: Pointer?): WithDefault = IRcsTransport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsTransport {
      val address = segment.toRawLongValue()
      return makeIRcsTransport(Pointer(address))
    }

    public override fun toNative(obj: IRcsTransport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1400416274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsTransport): Array<IRcsTransport?> = (elements as
        Array<IRcsTransport?>).castToImpl<IRcsTransport,IRcsTransport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsTransport?> =
        arrayOfNulls<IRcsTransport_Impl>(size) as Array<IRcsTransport?>
  }
}
