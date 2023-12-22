package Windows.Devices.Bluetooth

import Windows.Devices.Radios.Radio
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothAdapter.ABI::class)
@Signature("{7974f04c-5f7a-4a34-9225-a855f84b1a8b}")
@Guid("7974f04c5f7a4a349225a855f84b1a8b")
@WinRTInterface("7974f04c5f7a4a349225a855f84b1a8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothAdapter.ByReference::class)
public interface IBluetoothAdapter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_BluetoothAddress(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_IsClassicSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsLowEnergySupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsPeripheralRoleSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsCentralRoleSupported(): Boolean

  @InterfaceMethod(6)
  public fun get_IsAdvertisementOffloadSupported(): Boolean

  @InterfaceMethod(7)
  public fun GetRadioAsync(): IAsyncOperation<Radio?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothAdapter> {
    public override fun getValue() = ABI.makeIBluetoothAdapter(pointer.getPointer(0))

    public fun setValue(value: IBluetoothAdapter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothAdapter {
    public val __401175144_Ptr: Pointer?

    public val _401175144_VtblPtr: Pointer?
      get() = __401175144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _401175144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BluetoothAddress(): WinDef.ULONG {
      val fnPtr = _401175144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsClassicSupported(): Boolean {
      val fnPtr = _401175144_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsLowEnergySupported(): Boolean {
      val fnPtr = _401175144_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsPeripheralRoleSupported(): Boolean {
      val fnPtr = _401175144_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsCentralRoleSupported(): Boolean {
      val fnPtr = _401175144_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsAdvertisementOffloadSupported(): Boolean {
      val fnPtr = _401175144_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetRadioAsync(): IAsyncOperation<Radio?>? {
      val fnPtr = _401175144_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Radio?>>()
      val hr = fn.invokeHR(arrayOf(__401175144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Radio?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothAdapter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __401175144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothAdapter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7974f04c5f7a4a349225a855f84b1a8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothAdapter(ptr: Pointer?): WithDefault = IBluetoothAdapter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothAdapter {
      val address = segment.toRawLongValue()
      return makeIBluetoothAdapter(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__401175144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothAdapter): Array<IBluetoothAdapter?> = (elements
        as Array<IBluetoothAdapter?>).castToImpl<IBluetoothAdapter,IBluetoothAdapter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothAdapter?> =
        arrayOfNulls<IBluetoothAdapter_Impl>(size) as Array<IBluetoothAdapter?>
  }
}
