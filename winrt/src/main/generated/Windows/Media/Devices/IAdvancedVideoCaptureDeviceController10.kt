package Windows.Media.Devices

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

@ABIMarker(IAdvancedVideoCaptureDeviceController10.ABI::class)
@Signature("{c621b82d-d6f0-5c1b-a388-a6e938407146}")
@Guid("c621b82dd6f05c1ba388a6e938407146")
@WinRTInterface("c621b82dd6f05c1ba388a6e938407146")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController10.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController10 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CameraOcclusionInfo(): CameraOcclusionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController10> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController10(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController10_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController10 {
    public val __2077971713_Ptr: Pointer?

    public val _2077971713_VtblPtr: Pointer?
      get() = __2077971713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CameraOcclusionInfo(): CameraOcclusionInfo? {
      val fnPtr = _2077971713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraOcclusionInfo>()
      val hr = fn.invokeHR(arrayOf(__2077971713_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraOcclusionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController10_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2077971713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController10, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c621b82dd6f05c1ba388a6e938407146")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController10(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController10_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdvancedVideoCaptureDeviceController10 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController10(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController10): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2077971713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController10):
        Array<IAdvancedVideoCaptureDeviceController10?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController10?>).castToImpl<IAdvancedVideoCaptureDeviceController10,IAdvancedVideoCaptureDeviceController10_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController10?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController10_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController10?>
  }
}
