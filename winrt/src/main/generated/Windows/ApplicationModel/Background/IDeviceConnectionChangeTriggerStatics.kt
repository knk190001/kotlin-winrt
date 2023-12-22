package Windows.ApplicationModel.Background

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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceConnectionChangeTriggerStatics.ABI::class)
@Signature("{c3ea246a-4efd-4498-aa60-a4e4e3b17ab9}")
@Guid("c3ea246a4efd4498aa60a4e4e3b17ab9")
@WinRTInterface("c3ea246a4efd4498aa60a4e4e3b17ab9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceConnectionChangeTriggerStatics.ByReference::class)
public interface IDeviceConnectionChangeTriggerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<DeviceConnectionChangeTrigger?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceConnectionChangeTriggerStatics> {
    public override fun getValue() =
        ABI.makeIDeviceConnectionChangeTriggerStatics(pointer.getPointer(0))

    public fun setValue(value: IDeviceConnectionChangeTriggerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceConnectionChangeTriggerStatics {
    public val __661587934_Ptr: Pointer?

    public val _661587934_VtblPtr: Pointer?
      get() = __661587934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?):
        IAsyncOperation<DeviceConnectionChangeTrigger?>? {
      val fnPtr = _661587934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceConnectionChangeTrigger?>>()
      val hr = fn.invokeHR(arrayOf(__661587934_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceConnectionChangeTrigger?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceConnectionChangeTriggerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __661587934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceConnectionChangeTriggerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3ea246a4efd4498aa60a4e4e3b17ab9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceConnectionChangeTriggerStatics(ptr: Pointer?): WithDefault =
        IDeviceConnectionChangeTriggerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceConnectionChangeTriggerStatics {
      val address = segment.toRawLongValue()
      return makeIDeviceConnectionChangeTriggerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeviceConnectionChangeTriggerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__661587934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceConnectionChangeTriggerStatics):
        Array<IDeviceConnectionChangeTriggerStatics?> = (elements as
        Array<IDeviceConnectionChangeTriggerStatics?>).castToImpl<IDeviceConnectionChangeTriggerStatics,IDeviceConnectionChangeTriggerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceConnectionChangeTriggerStatics?> =
        arrayOfNulls<IDeviceConnectionChangeTriggerStatics_Impl>(size) as
        Array<IDeviceConnectionChangeTriggerStatics?>
  }
}
