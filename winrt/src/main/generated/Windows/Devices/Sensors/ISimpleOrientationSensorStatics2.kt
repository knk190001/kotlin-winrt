package Windows.Devices.Sensors

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

@ABIMarker(ISimpleOrientationSensorStatics2.ABI::class)
@Signature("{848f9c7f-b138-4e11-8910-a2a2a3b56d83}")
@Guid("848f9c7fb1384e118910a2a2a3b56d83")
@WinRTInterface("848f9c7fb1384e118910a2a2a3b56d83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleOrientationSensorStatics2.ByReference::class)
public interface ISimpleOrientationSensorStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<SimpleOrientationSensor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleOrientationSensorStatics2> {
    public override fun getValue() = ABI.makeISimpleOrientationSensorStatics2(pointer.getPointer(0))

    public fun setValue(value: ISimpleOrientationSensorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleOrientationSensorStatics2 {
    public val __1503709223_Ptr: Pointer?

    public val _1503709223_VtblPtr: Pointer?
      get() = __1503709223_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1503709223_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1503709223_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<SimpleOrientationSensor?>? {
      val fnPtr = _1503709223_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SimpleOrientationSensor?>>()
      val hr = fn.invokeHR(arrayOf(__1503709223_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SimpleOrientationSensor?>>(result.getValue())
      return resultValue
    }
  }

  public class ISimpleOrientationSensorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1503709223_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleOrientationSensorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("848f9c7fb1384e118910a2a2a3b56d83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleOrientationSensorStatics2(ptr: Pointer?): WithDefault =
        ISimpleOrientationSensorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISimpleOrientationSensorStatics2 {
      val address = segment.toRawLongValue()
      return makeISimpleOrientationSensorStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISimpleOrientationSensorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1503709223_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleOrientationSensorStatics2):
        Array<ISimpleOrientationSensorStatics2?> = (elements as
        Array<ISimpleOrientationSensorStatics2?>).castToImpl<ISimpleOrientationSensorStatics2,ISimpleOrientationSensorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISimpleOrientationSensorStatics2?> =
        arrayOfNulls<ISimpleOrientationSensorStatics2_Impl>(size) as
        Array<ISimpleOrientationSensorStatics2?>
  }
}
