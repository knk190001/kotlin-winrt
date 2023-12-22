package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceDisconnectButtonClickedEventArgs.ABI::class)
@Signature("{8e44b56d-f902-4a00-b536-f37992e6a2a7}")
@Guid("8e44b56df9024a00b536f37992e6a2a7")
@WinRTInterface("8e44b56df9024a00b536f37992e6a2a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceDisconnectButtonClickedEventArgs.ByReference::class)
public interface IDeviceDisconnectButtonClickedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Device(): DeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceDisconnectButtonClickedEventArgs> {
    public override fun getValue() =
        ABI.makeIDeviceDisconnectButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDeviceDisconnectButtonClickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceDisconnectButtonClickedEventArgs {
    public val __881414290_Ptr: Pointer?

    public val _881414290_VtblPtr: Pointer?
      get() = __881414290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Device(): DeviceInformation? {
      val fnPtr = _881414290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__881414290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceDisconnectButtonClickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __881414290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceDisconnectButtonClickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e44b56df9024a00b536f37992e6a2a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceDisconnectButtonClickedEventArgs(ptr: Pointer?): WithDefault =
        IDeviceDisconnectButtonClickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDeviceDisconnectButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDeviceDisconnectButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDeviceDisconnectButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__881414290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceDisconnectButtonClickedEventArgs):
        Array<IDeviceDisconnectButtonClickedEventArgs?> = (elements as
        Array<IDeviceDisconnectButtonClickedEventArgs?>).castToImpl<IDeviceDisconnectButtonClickedEventArgs,IDeviceDisconnectButtonClickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceDisconnectButtonClickedEventArgs?> =
        arrayOfNulls<IDeviceDisconnectButtonClickedEventArgs_Impl>(size) as
        Array<IDeviceDisconnectButtonClickedEventArgs?>
  }
}
