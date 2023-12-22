package Windows.Devices.WiFiDirect

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWiFiDirectAdvertisementPublisher.ABI::class)
@Signature("{b35a2d1a-9b1f-45d9-925a-694d66df68ef}")
@Guid("b35a2d1a9b1f45d9925a694d66df68ef")
@WinRTInterface("b35a2d1a9b1f45d9925a694d66df68ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWiFiDirectAdvertisementPublisher.ByReference::class)
public interface IWiFiDirectAdvertisementPublisher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Advertisement(): WiFiDirectAdvertisement?

  @InterfaceMethod(1)
  public fun get_Status(): WiFiDirectAdvertisementPublisherStatus?

  @InterfaceMethod(2)
  public fun add_StatusChanged(handler: TypedEventHandler<WiFiDirectAdvertisementPublisher?,
      WiFiDirectAdvertisementPublisherStatusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun Start(): Unit

  @InterfaceMethod(5)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWiFiDirectAdvertisementPublisher> {
    public override fun getValue() =
        ABI.makeIWiFiDirectAdvertisementPublisher(pointer.getPointer(0))

    public fun setValue(value: IWiFiDirectAdvertisementPublisher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWiFiDirectAdvertisementPublisher {
    public val __1049897116_Ptr: Pointer?

    public val _1049897116_VtblPtr: Pointer?
      get() = __1049897116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Advertisement(): WiFiDirectAdvertisement? {
      val fnPtr = _1049897116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectAdvertisement>()
      val hr = fn.invokeHR(arrayOf(__1049897116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectAdvertisement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): WiFiDirectAdvertisementPublisherStatus? {
      val fnPtr = _1049897116_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WiFiDirectAdvertisementPublisherStatus>()
      val hr = fn.invokeHR(arrayOf(__1049897116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WiFiDirectAdvertisementPublisherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_StatusChanged(handler: TypedEventHandler<WiFiDirectAdvertisementPublisher?,
        WiFiDirectAdvertisementPublisherStatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1049897116_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1049897116_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1049897116_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1049897116_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Start(): Unit {
      val fnPtr = _1049897116_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1049897116_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Stop(): Unit {
      val fnPtr = _1049897116_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1049897116_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWiFiDirectAdvertisementPublisher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1049897116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWiFiDirectAdvertisementPublisher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b35a2d1a9b1f45d9925a694d66df68ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWiFiDirectAdvertisementPublisher(ptr: Pointer?): WithDefault =
        IWiFiDirectAdvertisementPublisher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWiFiDirectAdvertisementPublisher {
      val address = segment.toRawLongValue()
      return makeIWiFiDirectAdvertisementPublisher(Pointer(address))
    }

    public override fun toNative(obj: IWiFiDirectAdvertisementPublisher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1049897116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWiFiDirectAdvertisementPublisher):
        Array<IWiFiDirectAdvertisementPublisher?> = (elements as
        Array<IWiFiDirectAdvertisementPublisher?>).castToImpl<IWiFiDirectAdvertisementPublisher,IWiFiDirectAdvertisementPublisher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWiFiDirectAdvertisementPublisher?> =
        arrayOfNulls<IWiFiDirectAdvertisementPublisher_Impl>(size) as
        Array<IWiFiDirectAdvertisementPublisher?>
  }
}
