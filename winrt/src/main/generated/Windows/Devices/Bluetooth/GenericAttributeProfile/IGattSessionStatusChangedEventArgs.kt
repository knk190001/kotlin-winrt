package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothError
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

@ABIMarker(IGattSessionStatusChangedEventArgs.ABI::class)
@Signature("{7605b72e-837f-404c-ab34-3163f39ddf32}")
@Guid("7605b72e837f404cab343163f39ddf32")
@WinRTInterface("7605b72e837f404cab343163f39ddf32")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattSessionStatusChangedEventArgs.ByReference::class)
public interface IGattSessionStatusChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): BluetoothError?

  @InterfaceMethod(1)
  public fun get_Status(): GattSessionStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattSessionStatusChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIGattSessionStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGattSessionStatusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattSessionStatusChangedEventArgs {
    public val __866734512_Ptr: Pointer?

    public val _866734512_VtblPtr: Pointer?
      get() = __866734512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _866734512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__866734512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): GattSessionStatus? {
      val fnPtr = _866734512_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__866734512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSessionStatus>(result.getValue())
      return resultValue
    }
  }

  public class IGattSessionStatusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __866734512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattSessionStatusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7605b72e837f404cab343163f39ddf32")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattSessionStatusChangedEventArgs(ptr: Pointer?): WithDefault =
        IGattSessionStatusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattSessionStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGattSessionStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGattSessionStatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__866734512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattSessionStatusChangedEventArgs):
        Array<IGattSessionStatusChangedEventArgs?> = (elements as
        Array<IGattSessionStatusChangedEventArgs?>).castToImpl<IGattSessionStatusChangedEventArgs,IGattSessionStatusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattSessionStatusChangedEventArgs?> =
        arrayOfNulls<IGattSessionStatusChangedEventArgs_Impl>(size) as
        Array<IGattSessionStatusChangedEventArgs?>
  }
}
