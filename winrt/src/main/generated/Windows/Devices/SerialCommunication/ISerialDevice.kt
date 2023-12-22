package Windows.Devices.SerialCommunication

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISerialDevice.ABI::class)
@Signature("{e187ccc6-2210-414f-b65a-f5553a03372a}")
@Guid("e187ccc62210414fb65af5553a03372a")
@WinRTInterface("e187ccc62210414fb65af5553a03372a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISerialDevice.ByReference::class)
public interface ISerialDevice : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_BaudRate(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_BaudRate(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_BreakSignalState(): Boolean

  @InterfaceMethod(3)
  public fun put_BreakSignalState(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_BytesReceived(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_CarrierDetectState(): Boolean

  @InterfaceMethod(6)
  public fun get_ClearToSendState(): Boolean

  @InterfaceMethod(7)
  public fun get_DataBits(): WinDef.USHORT

  @InterfaceMethod(8)
  public fun put_DataBits(value: WinDef.USHORT): Unit

  @InterfaceMethod(9)
  public fun get_DataSetReadyState(): Boolean

  @InterfaceMethod(10)
  public fun get_Handshake(): SerialHandshake?

  @InterfaceMethod(11)
  public fun put_Handshake(value: SerialHandshake?): Unit

  @InterfaceMethod(12)
  public fun get_IsDataTerminalReadyEnabled(): Boolean

  @InterfaceMethod(13)
  public fun put_IsDataTerminalReadyEnabled(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsRequestToSendEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsRequestToSendEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_Parity(): SerialParity?

  @InterfaceMethod(17)
  public fun put_Parity(value: SerialParity?): Unit

  @InterfaceMethod(18)
  public fun get_PortName(): String?

  @InterfaceMethod(19)
  public fun get_ReadTimeout(): TimeSpan?

  @InterfaceMethod(20)
  public fun put_ReadTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(21)
  public fun get_StopBits(): SerialStopBitCount?

  @InterfaceMethod(22)
  public fun put_StopBits(value: SerialStopBitCount?): Unit

  @InterfaceMethod(23)
  public fun get_UsbVendorId(): WinDef.USHORT

  @InterfaceMethod(24)
  public fun get_UsbProductId(): WinDef.USHORT

  @InterfaceMethod(25)
  public fun get_WriteTimeout(): TimeSpan?

  @InterfaceMethod(26)
  public fun put_WriteTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(27)
  public fun get_InputStream(): IInputStream?

  @InterfaceMethod(28)
  public fun get_OutputStream(): IOutputStream?

  @InterfaceMethod(29)
  public fun add_ErrorReceived(reportHandler: TypedEventHandler<SerialDevice?,
      ErrorReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(30)
  public fun remove_ErrorReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(31)
  public fun add_PinChanged(reportHandler: TypedEventHandler<SerialDevice?, PinChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(32)
  public fun remove_PinChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISerialDevice>
      {
    public override fun getValue() = ABI.makeISerialDevice(pointer.getPointer(0))

    public fun setValue(value: ISerialDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISerialDevice, IClosable.WithDefault {
    public val __1401519021_Ptr: Pointer?

    public val _1401519021_VtblPtr: Pointer?
      get() = __1401519021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BaudRate(): WinDef.UINT {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BaudRate(value: WinDef.UINT): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BreakSignalState(): Boolean {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_BreakSignalState(value: Boolean): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BytesReceived(): WinDef.UINT {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CarrierDetectState(): Boolean {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ClearToSendState(): Boolean {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_DataBits(): WinDef.USHORT {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_DataBits(value: WinDef.USHORT): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_DataSetReadyState(): Boolean {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_Handshake(): SerialHandshake? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SerialHandshake>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SerialHandshake>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Handshake(value: SerialHandshake?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsDataTerminalReadyEnabled(): Boolean {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsDataTerminalReadyEnabled(value: Boolean): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsRequestToSendEnabled(): Boolean {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsRequestToSendEnabled(value: Boolean): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Parity(): SerialParity? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SerialParity>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SerialParity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Parity(value: SerialParity?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_PortName(): String? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_ReadTimeout(): TimeSpan? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_ReadTimeout(value: TimeSpan?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_StopBits(): SerialStopBitCount? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SerialStopBitCount>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SerialStopBitCount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_StopBits(value: SerialStopBitCount?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_UsbVendorId(): WinDef.USHORT {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun get_UsbProductId(): WinDef.USHORT {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_WriteTimeout(): TimeSpan? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_WriteTimeout(value: TimeSpan?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_InputStream(): IInputStream? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun add_ErrorReceived(reportHandler: TypedEventHandler<SerialDevice?,
        ErrorReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(reportHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun remove_ErrorReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(31)
    public override fun add_PinChanged(reportHandler: TypedEventHandler<SerialDevice?,
        PinChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(reportHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun remove_PinChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1401519021_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1401519021_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISerialDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1401519021_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1401519021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISerialDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e187ccc62210414fb65af5553a03372a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISerialDevice(ptr: Pointer?): WithDefault = ISerialDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISerialDevice {
      val address = segment.toRawLongValue()
      return makeISerialDevice(Pointer(address))
    }

    public override fun toNative(obj: ISerialDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1401519021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISerialDevice): Array<ISerialDevice?> = (elements as
        Array<ISerialDevice?>).castToImpl<ISerialDevice,ISerialDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISerialDevice?> =
        arrayOfNulls<ISerialDevice_Impl>(size) as Array<ISerialDevice?>
  }
}
