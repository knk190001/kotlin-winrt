package Windows.Devices.Bluetooth.Advertisement

import Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
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

@ABIMarker(IBluetoothLEAdvertisementWatcher.ABI::class)
@Signature("{a6ac336f-f3d3-4297-8d6c-c81ea6623f40}")
@Guid("a6ac336ff3d342978d6cc81ea6623f40")
@WinRTInterface("a6ac336ff3d342978d6cc81ea6623f40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementWatcher.ByReference::class)
public interface IBluetoothLEAdvertisementWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MinSamplingInterval(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_MaxSamplingInterval(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_MinOutOfRangeTimeout(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_MaxOutOfRangeTimeout(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_Status(): BluetoothLEAdvertisementWatcherStatus?

  @InterfaceMethod(5)
  public fun get_ScanningMode(): BluetoothLEScanningMode?

  @InterfaceMethod(6)
  public fun put_ScanningMode(value: BluetoothLEScanningMode?): Unit

  @InterfaceMethod(7)
  public fun get_SignalStrengthFilter(): BluetoothSignalStrengthFilter?

  @InterfaceMethod(8)
  public fun put_SignalStrengthFilter(value: BluetoothSignalStrengthFilter?): Unit

  @InterfaceMethod(9)
  public fun get_AdvertisementFilter(): BluetoothLEAdvertisementFilter?

  @InterfaceMethod(10)
  public fun put_AdvertisementFilter(value: BluetoothLEAdvertisementFilter?): Unit

  @InterfaceMethod(11)
  public fun Start(): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  @InterfaceMethod(13)
  public fun add_Received(handler: TypedEventHandler<BluetoothLEAdvertisementWatcher?,
      BluetoothLEAdvertisementReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_Received(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_Stopped(handler: TypedEventHandler<BluetoothLEAdvertisementWatcher?,
      BluetoothLEAdvertisementWatcherStoppedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementWatcher> {
    public override fun getValue() = ABI.makeIBluetoothLEAdvertisementWatcher(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementWatcher {
    public val __1645477502_Ptr: Pointer?

    public val _1645477502_VtblPtr: Pointer?
      get() = __1645477502_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinSamplingInterval(): TimeSpan? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxSamplingInterval(): TimeSpan? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinOutOfRangeTimeout(): TimeSpan? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxOutOfRangeTimeout(): TimeSpan? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Status(): BluetoothLEAdvertisementWatcherStatus? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ScanningMode(): BluetoothLEScanningMode? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEScanningMode>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEScanningMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ScanningMode(value: BluetoothLEScanningMode?): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SignalStrengthFilter(): BluetoothSignalStrengthFilter? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothSignalStrengthFilter>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothSignalStrengthFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_SignalStrengthFilter(value: BluetoothSignalStrengthFilter?): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_AdvertisementFilter(): BluetoothLEAdvertisementFilter? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementFilter>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_AdvertisementFilter(value: BluetoothLEAdvertisementFilter?): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Start(): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_Received(handler: TypedEventHandler<BluetoothLEAdvertisementWatcher?,
        BluetoothLEAdvertisementReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_Received(token: EventRegistrationToken?): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_Stopped(handler: TypedEventHandler<BluetoothLEAdvertisementWatcher?,
        BluetoothLEAdvertisementWatcherStoppedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1645477502_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1645477502_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1645477502_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6ac336ff3d342978d6cc81ea6623f40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementWatcher(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAdvertisementWatcher {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementWatcher(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1645477502_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementWatcher):
        Array<IBluetoothLEAdvertisementWatcher?> = (elements as
        Array<IBluetoothLEAdvertisementWatcher?>).castToImpl<IBluetoothLEAdvertisementWatcher,IBluetoothLEAdvertisementWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementWatcher?> =
        arrayOfNulls<IBluetoothLEAdvertisementWatcher_Impl>(size) as
        Array<IBluetoothLEAdvertisementWatcher?>
  }
}
