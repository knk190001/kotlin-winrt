package Windows.Devices.Bluetooth.Advertisement

import Windows.Foundation.DateTime
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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementReceivedEventArgs.ABI::class)
@Signature("{27987ddf-e596-41be-8d43-9e6731d4a913}")
@Guid("27987ddfe59641be8d439e6731d4a913")
@WinRTInterface("27987ddfe59641be8d439e6731d4a913")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementReceivedEventArgs.ByReference::class)
public interface IBluetoothLEAdvertisementReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RawSignalStrengthInDBm(): Short

  @InterfaceMethod(1)
  public fun get_BluetoothAddress(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_AdvertisementType(): BluetoothLEAdvertisementType?

  @InterfaceMethod(3)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(4)
  public fun get_Advertisement(): BluetoothLEAdvertisement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementReceivedEventArgs {
    public val __553043976_Ptr: Pointer?

    public val _553043976_VtblPtr: Pointer?
      get() = __553043976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RawSignalStrengthInDBm(): Short {
      val fnPtr = _553043976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Short>()
      val hr = fn.invokeHR(arrayOf(__553043976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Short>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BluetoothAddress(): WinDef.ULONG {
      val fnPtr = _553043976_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__553043976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AdvertisementType(): BluetoothLEAdvertisementType? {
      val fnPtr = _553043976_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementType>()
      val hr = fn.invokeHR(arrayOf(__553043976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisementType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _553043976_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__553043976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Advertisement(): BluetoothLEAdvertisement? {
      val fnPtr = _553043976_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisement>()
      val hr = fn.invokeHR(arrayOf(__553043976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisement>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __553043976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27987ddfe59641be8d439e6731d4a913")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementReceivedEventArgs(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__553043976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementReceivedEventArgs):
        Array<IBluetoothLEAdvertisementReceivedEventArgs?> = (elements as
        Array<IBluetoothLEAdvertisementReceivedEventArgs?>).castToImpl<IBluetoothLEAdvertisementReceivedEventArgs,IBluetoothLEAdvertisementReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementReceivedEventArgs?> =
        arrayOfNulls<IBluetoothLEAdvertisementReceivedEventArgs_Impl>(size) as
        Array<IBluetoothLEAdvertisementReceivedEventArgs?>
  }
}
