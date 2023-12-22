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

@ABIMarker(IAdvancedVideoCaptureDeviceController4.ABI::class)
@Signature("{ea9fbfaf-d371-41c3-9a17-824a87ebdfd2}")
@Guid("ea9fbfafd37141c39a17824a87ebdfd2")
@WinRTInterface("ea9fbfafd37141c39a17824a87ebdfd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController4.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExposurePriorityVideoControl(): ExposurePriorityVideoControl?

  @InterfaceMethod(1)
  public fun get_DesiredOptimization(): MediaCaptureOptimization?

  @InterfaceMethod(2)
  public fun put_DesiredOptimization(value: MediaCaptureOptimization?): Unit

  @InterfaceMethod(3)
  public fun get_HdrVideoControl(): HdrVideoControl?

  @InterfaceMethod(4)
  public fun get_OpticalImageStabilizationControl(): OpticalImageStabilizationControl?

  @InterfaceMethod(5)
  public fun get_AdvancedPhotoControl(): AdvancedPhotoControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController4> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController4(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController4 {
    public val __71515988_Ptr: Pointer?

    public val _71515988_VtblPtr: Pointer?
      get() = __71515988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExposurePriorityVideoControl(): ExposurePriorityVideoControl? {
      val fnPtr = _71515988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExposurePriorityVideoControl>()
      val hr = fn.invokeHR(arrayOf(__71515988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExposurePriorityVideoControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DesiredOptimization(): MediaCaptureOptimization? {
      val fnPtr = _71515988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureOptimization>()
      val hr = fn.invokeHR(arrayOf(__71515988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureOptimization>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DesiredOptimization(value: MediaCaptureOptimization?): Unit {
      val fnPtr = _71515988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__71515988_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_HdrVideoControl(): HdrVideoControl? {
      val fnPtr = _71515988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HdrVideoControl>()
      val hr = fn.invokeHR(arrayOf(__71515988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HdrVideoControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_OpticalImageStabilizationControl(): OpticalImageStabilizationControl? {
      val fnPtr = _71515988_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OpticalImageStabilizationControl>()
      val hr = fn.invokeHR(arrayOf(__71515988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OpticalImageStabilizationControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AdvancedPhotoControl(): AdvancedPhotoControl? {
      val fnPtr = _71515988_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdvancedPhotoControl>()
      val hr = fn.invokeHR(arrayOf(__71515988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdvancedPhotoControl>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea9fbfafd37141c39a17824a87ebdfd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController4(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController4 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController4(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController4):
        Array<IAdvancedVideoCaptureDeviceController4?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController4?>).castToImpl<IAdvancedVideoCaptureDeviceController4,IAdvancedVideoCaptureDeviceController4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController4?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController4_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController4?>
  }
}
