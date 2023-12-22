package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
import Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import Windows.Foundation.TimeSpan
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

@ABIMarker(IBluetoothLEAdvertisementWatcherTrigger.ABI::class)
@Signature("{1aab1819-bce1-48eb-a827-59fb7cee52a6}")
@Guid("1aab1819bce148eba82759fb7cee52a6")
@WinRTInterface("1aab1819bce148eba82759fb7cee52a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementWatcherTrigger.ByReference::class)
public interface IBluetoothLEAdvertisementWatcherTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_MinSamplingInterval(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_MaxSamplingInterval(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_MinOutOfRangeTimeout(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_MaxOutOfRangeTimeout(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_SignalStrengthFilter(): BluetoothSignalStrengthFilter?

  @InterfaceMethod(5)
  public fun put_SignalStrengthFilter(value: BluetoothSignalStrengthFilter?): Unit

  @InterfaceMethod(6)
  public fun get_AdvertisementFilter(): BluetoothLEAdvertisementFilter?

  @InterfaceMethod(7)
  public fun put_AdvertisementFilter(value: BluetoothLEAdvertisementFilter?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementWatcherTrigger> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementWatcherTrigger(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementWatcherTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementWatcherTrigger,
      IBackgroundTrigger.WithDefault {
    public val __1595589067_Ptr: Pointer?

    public val _1595589067_VtblPtr: Pointer?
      get() = __1595589067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinSamplingInterval(): TimeSpan? {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxSamplingInterval(): TimeSpan? {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinOutOfRangeTimeout(): TimeSpan? {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MaxOutOfRangeTimeout(): TimeSpan? {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SignalStrengthFilter(): BluetoothSignalStrengthFilter? {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothSignalStrengthFilter>()
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothSignalStrengthFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SignalStrengthFilter(value: BluetoothSignalStrengthFilter?): Unit {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AdvertisementFilter(): BluetoothLEAdvertisementFilter? {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementFilter>()
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementFilter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_AdvertisementFilter(value: BluetoothLEAdvertisementFilter?): Unit {
      val fnPtr = _1595589067_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1595589067_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBluetoothLEAdvertisementWatcherTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1595589067_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1595589067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementWatcherTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1aab1819bce148eba82759fb7cee52a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementWatcherTrigger(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementWatcherTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementWatcherTrigger {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementWatcherTrigger(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementWatcherTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1595589067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementWatcherTrigger):
        Array<IBluetoothLEAdvertisementWatcherTrigger?> = (elements as
        Array<IBluetoothLEAdvertisementWatcherTrigger?>).castToImpl<IBluetoothLEAdvertisementWatcherTrigger,IBluetoothLEAdvertisementWatcherTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementWatcherTrigger?> =
        arrayOfNulls<IBluetoothLEAdvertisementWatcherTrigger_Impl>(size) as
        Array<IBluetoothLEAdvertisementWatcherTrigger?>
  }
}
