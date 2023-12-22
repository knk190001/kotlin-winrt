package Windows.Media.Devices

import Windows.Media.Devices.Core.VariablePhotoSequenceController
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

@ABIMarker(IAdvancedVideoCaptureDeviceController3.ABI::class)
@Signature("{a98b8f34-ee0d-470c-b9f0-4229c4bbd089}")
@Guid("a98b8f34ee0d470cb9f04229c4bbd089")
@WinRTInterface("a98b8f34ee0d470cb9f04229c4bbd089")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController3.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VariablePhotoSequenceController(): VariablePhotoSequenceController?

  @InterfaceMethod(1)
  public fun get_PhotoConfirmationControl(): PhotoConfirmationControl?

  @InterfaceMethod(2)
  public fun get_ZoomControl(): ZoomControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController3> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController3(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController3 {
    public val __71515987_Ptr: Pointer?

    public val _71515987_VtblPtr: Pointer?
      get() = __71515987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VariablePhotoSequenceController(): VariablePhotoSequenceController? {
      val fnPtr = _71515987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VariablePhotoSequenceController>()
      val hr = fn.invokeHR(arrayOf(__71515987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VariablePhotoSequenceController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PhotoConfirmationControl(): PhotoConfirmationControl? {
      val fnPtr = _71515987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoConfirmationControl>()
      val hr = fn.invokeHR(arrayOf(__71515987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoConfirmationControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ZoomControl(): ZoomControl? {
      val fnPtr = _71515987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ZoomControl>()
      val hr = fn.invokeHR(arrayOf(__71515987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ZoomControl>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a98b8f34ee0d470cb9f04229c4bbd089")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController3(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController3 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController3(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController3):
        Array<IAdvancedVideoCaptureDeviceController3?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController3?>).castToImpl<IAdvancedVideoCaptureDeviceController3,IAdvancedVideoCaptureDeviceController3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController3?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController3_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController3?>
  }
}
