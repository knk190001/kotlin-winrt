package Windows.Media.FaceAnalysis

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncOperation
import Windows.Graphics.Imaging.BitmapBounds
import Windows.Graphics.Imaging.BitmapSize
import Windows.Graphics.Imaging.SoftwareBitmap
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

@ABIMarker(IFaceDetector.ABI::class)
@Signature("{16b672dc-fe6f-3117-8d95-c3f04d51630c}")
@Guid("16b672dcfe6f31178d95c3f04d51630c")
@WinRTInterface("16b672dcfe6f31178d95c3f04d51630c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceDetector.ByReference::class)
public interface IFaceDetector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DetectFacesAsync(image: SoftwareBitmap?): IAsyncOperation<IVector<DetectedFace?>?>?

  @InterfaceMethod(1)
  public fun DetectFacesAsync(image: SoftwareBitmap?, searchArea: BitmapBounds?):
      IAsyncOperation<IVector<DetectedFace?>?>?

  @InterfaceMethod(2)
  public fun get_MinDetectableFaceSize(): BitmapSize?

  @InterfaceMethod(3)
  public fun put_MinDetectableFaceSize(value: BitmapSize?): Unit

  @InterfaceMethod(4)
  public fun get_MaxDetectableFaceSize(): BitmapSize?

  @InterfaceMethod(5)
  public fun put_MaxDetectableFaceSize(value: BitmapSize?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFaceDetector>
      {
    public override fun getValue() = ABI.makeIFaceDetector(pointer.getPointer(0))

    public fun setValue(value: IFaceDetector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceDetector {
    public val __523204382_Ptr: Pointer?

    public val _523204382_VtblPtr: Pointer?
      get() = __523204382_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DetectFacesAsync(image: SoftwareBitmap?):
        IAsyncOperation<IVector<DetectedFace?>?>? {
      val fnPtr = _523204382_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<DetectedFace?>?>>()
      val hr = fn.invokeHR(arrayOf(__523204382_Ptr, marshalToNative(image), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<DetectedFace?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DetectFacesAsync(image: SoftwareBitmap?, searchArea: BitmapBounds?):
        IAsyncOperation<IVector<DetectedFace?>?>? {
      val fnPtr = _523204382_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<DetectedFace?>?>>()
      val hr = fn.invokeHR(arrayOf(__523204382_Ptr, marshalToNative(image),
          marshalToNative(searchArea), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<DetectedFace?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinDetectableFaceSize(): BitmapSize? {
      val fnPtr = _523204382_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapSize>()
      val hr = fn.invokeHR(arrayOf(__523204382_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MinDetectableFaceSize(value: BitmapSize?): Unit {
      val fnPtr = _523204382_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__523204382_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxDetectableFaceSize(): BitmapSize? {
      val fnPtr = _523204382_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapSize>()
      val hr = fn.invokeHR(arrayOf(__523204382_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_MaxDetectableFaceSize(value: BitmapSize?): Unit {
      val fnPtr = _523204382_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__523204382_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFaceDetector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __523204382_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceDetector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16b672dcfe6f31178d95c3f04d51630c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceDetector(ptr: Pointer?): WithDefault = IFaceDetector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceDetector {
      val address = segment.toRawLongValue()
      return makeIFaceDetector(Pointer(address))
    }

    public override fun toNative(obj: IFaceDetector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__523204382_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceDetector): Array<IFaceDetector?> = (elements as
        Array<IFaceDetector?>).castToImpl<IFaceDetector,IFaceDetector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceDetector?> =
        arrayOfNulls<IFaceDetector_Impl>(size) as Array<IFaceDetector?>
  }
}
