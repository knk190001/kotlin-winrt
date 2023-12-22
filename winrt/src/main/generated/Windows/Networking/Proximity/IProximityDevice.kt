package Windows.Networking.Proximity

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProximityDevice.ABI::class)
@Signature("{efa8a552-f6e1-4329-a0fc-ab6b0fd28262}")
@Guid("efa8a552f6e14329a0fcab6b0fd28262")
@WinRTInterface("efa8a552f6e14329a0fcab6b0fd28262")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximityDevice.ByReference::class)
public interface IProximityDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SubscribeForMessage(messageType: String?,
      messageReceivedHandler: MessageReceivedHandler?): Long

  @InterfaceMethod(1)
  public fun PublishMessage(messageType: String?, message: String?): Long

  @InterfaceMethod(2)
  public fun PublishMessage(
    messageType: String?,
    message: String?,
    messageTransmittedHandler: MessageTransmittedHandler?
  ): Long

  @InterfaceMethod(3)
  public fun PublishBinaryMessage(messageType: String?, message: IBuffer?): Long

  @InterfaceMethod(4)
  public fun PublishBinaryMessage(
    messageType: String?,
    message: IBuffer?,
    messageTransmittedHandler: MessageTransmittedHandler?
  ): Long

  @InterfaceMethod(5)
  public fun PublishUriMessage(message: Uri?): Long

  @InterfaceMethod(6)
  public fun PublishUriMessage(message: Uri?,
      messageTransmittedHandler: MessageTransmittedHandler?): Long

  @InterfaceMethod(7)
  public fun StopSubscribingForMessage(subscriptionId: Long): Unit

  @InterfaceMethod(8)
  public fun StopPublishingMessage(messageId: Long): Unit

  @InterfaceMethod(9)
  public fun add_DeviceArrived(arrivedHandler: DeviceArrivedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_DeviceArrived(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_DeviceDeparted(departedHandler: DeviceDepartedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_DeviceDeparted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun get_MaxMessageBytes(): WinDef.UINT

  @InterfaceMethod(14)
  public fun get_BitsPerSecond(): WinDef.ULONG

  @InterfaceMethod(15)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximityDevice> {
    public override fun getValue() = ABI.makeIProximityDevice(pointer.getPointer(0))

    public fun setValue(value: IProximityDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximityDevice {
    public val __186312924_Ptr: Pointer?

    public val _186312924_VtblPtr: Pointer?
      get() = __186312924_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SubscribeForMessage(messageType: String?,
        messageReceivedHandler: MessageReceivedHandler?): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(messageType),
          marshalToNative(messageReceivedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun PublishMessage(messageType: String?, message: String?): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(messageType),
          marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun PublishMessage(
      messageType: String?,
      message: String?,
      messageTransmittedHandler: MessageTransmittedHandler?
    ): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(messageType),
          marshalToNative(message), marshalToNative(messageTransmittedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun PublishBinaryMessage(messageType: String?, message: IBuffer?): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(messageType),
          marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun PublishBinaryMessage(
      messageType: String?,
      message: IBuffer?,
      messageTransmittedHandler: MessageTransmittedHandler?
    ): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(messageType),
          marshalToNative(message), marshalToNative(messageTransmittedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun PublishUriMessage(message: Uri?): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun PublishUriMessage(message: Uri?,
        messageTransmittedHandler: MessageTransmittedHandler?): Long {
      val fnPtr = _186312924_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(message),
          marshalToNative(messageTransmittedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun StopSubscribingForMessage(subscriptionId: Long): Unit {
      val fnPtr = _186312924_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, subscriptionId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun StopPublishingMessage(messageId: Long): Unit {
      val fnPtr = _186312924_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, messageId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_DeviceArrived(arrivedHandler: DeviceArrivedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _186312924_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(arrivedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_DeviceArrived(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _186312924_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_DeviceDeparted(departedHandler: DeviceDepartedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _186312924_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(departedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_DeviceDeparted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _186312924_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_MaxMessageBytes(): WinDef.UINT {
      val fnPtr = _186312924_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_BitsPerSecond(): WinDef.ULONG {
      val fnPtr = _186312924_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_DeviceId(): String? {
      val fnPtr = _186312924_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__186312924_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProximityDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __186312924_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximityDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efa8a552f6e14329a0fcab6b0fd28262")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximityDevice(ptr: Pointer?): WithDefault = IProximityDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProximityDevice {
      val address = segment.toRawLongValue()
      return makeIProximityDevice(Pointer(address))
    }

    public override fun toNative(obj: IProximityDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__186312924_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximityDevice): Array<IProximityDevice?> = (elements as
        Array<IProximityDevice?>).castToImpl<IProximityDevice,IProximityDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximityDevice?> =
        arrayOfNulls<IProximityDevice_Impl>(size) as Array<IProximityDevice?>
  }
}
