package Windows.Media.FaceAnalysis

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncOperation
import Windows.Graphics.Imaging.BitmapSize
import Windows.Media.VideoFrame
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

@ABIMarker(IFaceTracker.ABI::class)
@Signature("{6ba67d8c-a841-4420-93e6-2420a1884fcf}")
@Guid("6ba67d8ca841442093e62420a1884fcf")
@WinRTInterface("6ba67d8ca841442093e62420a1884fcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceTracker.ByReference::class)
public interface IFaceTracker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProcessNextFrameAsync(videoFrame: VideoFrame?):
      IAsyncOperation<IVector<DetectedFace?>?>?

  @InterfaceMethod(1)
  public fun get_MinDetectableFaceSize(): BitmapSize?

  @InterfaceMethod(2)
  public fun put_MinDetectableFaceSize(value: BitmapSize?): Unit

  @InterfaceMethod(3)
  public fun get_MaxDetectableFaceSize(): BitmapSize?

  @InterfaceMethod(4)
  public fun put_MaxDetectableFaceSize(value: BitmapSize?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFaceTracker> {
    public override fun getValue() = ABI.makeIFaceTracker(pointer.getPointer(0))

    public fun setValue(value: IFaceTracker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceTracker {
    public val __578235616_Ptr: Pointer?

    public val _578235616_VtblPtr: Pointer?
      get() = __578235616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProcessNextFrameAsync(videoFrame: VideoFrame?):
        IAsyncOperation<IVector<DetectedFace?>?>? {
      val fnPtr = _578235616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<DetectedFace?>?>>()
      val hr = fn.invokeHR(arrayOf(__578235616_Ptr, marshalToNative(videoFrame), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<DetectedFace?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinDetectableFaceSize(): BitmapSize? {
      val fnPtr = _578235616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapSize>()
      val hr = fn.invokeHR(arrayOf(__578235616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_MinDetectableFaceSize(value: BitmapSize?): Unit {
      val fnPtr = _578235616_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__578235616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_MaxDetectableFaceSize(): BitmapSize? {
      val fnPtr = _578235616_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapSize>()
      val hr = fn.invokeHR(arrayOf(__578235616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_MaxDetectableFaceSize(value: BitmapSize?): Unit {
      val fnPtr = _578235616_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__578235616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFaceTracker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __578235616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceTracker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ba67d8ca841442093e62420a1884fcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceTracker(ptr: Pointer?): WithDefault = IFaceTracker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceTracker {
      val address = segment.toRawLongValue()
      return makeIFaceTracker(Pointer(address))
    }

    public override fun toNative(obj: IFaceTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__578235616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceTracker): Array<IFaceTracker?> = (elements as
        Array<IFaceTracker?>).castToImpl<IFaceTracker,IFaceTracker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceTracker?> =
        arrayOfNulls<IFaceTracker_Impl>(size) as Array<IFaceTracker?>
  }
}
