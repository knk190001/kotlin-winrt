package Windows.Media.FaceAnalysis

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Graphics.Imaging.BitmapPixelFormat
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFaceDetectorStatics.ABI::class)
@Signature("{bc042d67-9047-33f6-881b-6746c1b218b8}")
@Guid("bc042d67904733f6881b6746c1b218b8")
@WinRTInterface("bc042d67904733f6881b6746c1b218b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceDetectorStatics.ByReference::class)
public interface IFaceDetectorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(): IAsyncOperation<FaceDetector?>?

  @InterfaceMethod(1)
  public fun GetSupportedBitmapPixelFormats(): IVectorView<BitmapPixelFormat?>?

  @InterfaceMethod(2)
  public fun IsBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat?): Boolean

  @InterfaceMethod(3)
  public fun get_IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFaceDetectorStatics> {
    public override fun getValue() = ABI.makeIFaceDetectorStatics(pointer.getPointer(0))

    public fun setValue(value: IFaceDetectorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceDetectorStatics {
    public val __139756231_Ptr: Pointer?

    public val _139756231_VtblPtr: Pointer?
      get() = __139756231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(): IAsyncOperation<FaceDetector?>? {
      val fnPtr = _139756231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FaceDetector?>>()
      val hr = fn.invokeHR(arrayOf(__139756231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FaceDetector?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSupportedBitmapPixelFormats(): IVectorView<BitmapPixelFormat?>? {
      val fnPtr = _139756231_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BitmapPixelFormat?>>()
      val hr = fn.invokeHR(arrayOf(__139756231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<BitmapPixelFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat?):
        Boolean {
      val fnPtr = _139756231_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139756231_Ptr, marshalToNative(bitmapPixelFormat), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _139756231_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__139756231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFaceDetectorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139756231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceDetectorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc042d67904733f6881b6746c1b218b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceDetectorStatics(ptr: Pointer?): WithDefault = IFaceDetectorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceDetectorStatics {
      val address = segment.toRawLongValue()
      return makeIFaceDetectorStatics(Pointer(address))
    }

    public override fun toNative(obj: IFaceDetectorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139756231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceDetectorStatics): Array<IFaceDetectorStatics?> =
        (elements as
        Array<IFaceDetectorStatics?>).castToImpl<IFaceDetectorStatics,IFaceDetectorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceDetectorStatics?> =
        arrayOfNulls<IFaceDetectorStatics_Impl>(size) as Array<IFaceDetectorStatics?>
  }
}
