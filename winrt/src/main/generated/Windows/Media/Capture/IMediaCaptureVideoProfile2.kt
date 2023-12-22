package Windows.Media.Capture

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Media.Capture.Frames.MediaFrameSourceInfo
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMediaCaptureVideoProfile2.ABI::class)
@Signature("{97ddc95f-94ce-468f-9316-fc5bc2638f6b}")
@Guid("97ddc95f94ce468f9316fc5bc2638f6b")
@WinRTInterface("97ddc95f94ce468f9316fc5bc2638f6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureVideoProfile2.ByReference::class)
public interface IMediaCaptureVideoProfile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSourceInfos(): IVectorView<MediaFrameSourceInfo?>?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureVideoProfile2> {
    public override fun getValue() = ABI.makeIMediaCaptureVideoProfile2(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureVideoProfile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureVideoProfile2 {
    public val __63943478_Ptr: Pointer?

    public val _63943478_VtblPtr: Pointer?
      get() = __63943478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSourceInfos(): IVectorView<MediaFrameSourceInfo?>? {
      val fnPtr = _63943478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaFrameSourceInfo?>>()
      val hr = fn.invokeHR(arrayOf(__63943478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaFrameSourceInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _63943478_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__63943478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureVideoProfile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __63943478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureVideoProfile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97ddc95f94ce468f9316fc5bc2638f6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureVideoProfile2(ptr: Pointer?): WithDefault =
        IMediaCaptureVideoProfile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureVideoProfile2 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureVideoProfile2(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureVideoProfile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__63943478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureVideoProfile2):
        Array<IMediaCaptureVideoProfile2?> = (elements as
        Array<IMediaCaptureVideoProfile2?>).castToImpl<IMediaCaptureVideoProfile2,IMediaCaptureVideoProfile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureVideoProfile2?> =
        arrayOfNulls<IMediaCaptureVideoProfile2_Impl>(size) as Array<IMediaCaptureVideoProfile2?>
  }
}
