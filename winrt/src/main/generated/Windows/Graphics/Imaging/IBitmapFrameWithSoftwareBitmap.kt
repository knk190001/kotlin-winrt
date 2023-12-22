package Windows.Graphics.Imaging

import Windows.Foundation.IAsyncOperation
import Windows.Graphics.Imaging.IBitmapFrame.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IBitmapFrameWithSoftwareBitmap.ABI::class)
@Signature("{fe287c9a-420c-4963-87ad-691436e08383}")
@Guid("fe287c9a420c496387ad691436e08383")
@WinRTInterface("fe287c9a420c496387ad691436e08383")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapFrameWithSoftwareBitmap.ByReference::class)
public interface IBitmapFrameWithSoftwareBitmap : NativeMapped, IWinRTInterface, IBitmapFrame {
  @InterfaceMethod(0)
  public fun GetSoftwareBitmapAsync(): IAsyncOperation<SoftwareBitmap?>?

  @InterfaceMethod(1)
  public fun GetSoftwareBitmapAsync(pixelFormat: BitmapPixelFormat?, alphaMode: BitmapAlphaMode?):
      IAsyncOperation<SoftwareBitmap?>?

  @InterfaceMethod(2)
  public fun GetSoftwareBitmapAsync(
    pixelFormat: BitmapPixelFormat?,
    alphaMode: BitmapAlphaMode?,
    transform: BitmapTransform?,
    exifOrientationMode: ExifOrientationMode?,
    colorManagementMode: ColorManagementMode?
  ): IAsyncOperation<SoftwareBitmap?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapFrameWithSoftwareBitmap> {
    public override fun getValue() = ABI.makeIBitmapFrameWithSoftwareBitmap(pointer.getPointer(0))

    public fun setValue(value: IBitmapFrameWithSoftwareBitmap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapFrameWithSoftwareBitmap, IBitmapFrame.WithDefault {
    public val __454241903_Ptr: Pointer?

    public val _454241903_VtblPtr: Pointer?
      get() = __454241903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSoftwareBitmapAsync(): IAsyncOperation<SoftwareBitmap?>? {
      val fnPtr = _454241903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SoftwareBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__454241903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SoftwareBitmap?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSoftwareBitmapAsync(pixelFormat: BitmapPixelFormat?,
        alphaMode: BitmapAlphaMode?): IAsyncOperation<SoftwareBitmap?>? {
      val fnPtr = _454241903_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SoftwareBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__454241903_Ptr, marshalToNative(pixelFormat),
          marshalToNative(alphaMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SoftwareBitmap?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetSoftwareBitmapAsync(
      pixelFormat: BitmapPixelFormat?,
      alphaMode: BitmapAlphaMode?,
      transform: BitmapTransform?,
      exifOrientationMode: ExifOrientationMode?,
      colorManagementMode: ColorManagementMode?
    ): IAsyncOperation<SoftwareBitmap?>? {
      val fnPtr = _454241903_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SoftwareBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__454241903_Ptr, marshalToNative(pixelFormat),
          marshalToNative(alphaMode), marshalToNative(transform),
          marshalToNative(exifOrientationMode), marshalToNative(colorManagementMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SoftwareBitmap?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapFrameWithSoftwareBitmap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBitmapFrame {
    public override val __405954709_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_454241903_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __454241903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapFrameWithSoftwareBitmap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe287c9a420c496387ad691436e08383")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapFrameWithSoftwareBitmap(ptr: Pointer?): WithDefault =
        IBitmapFrameWithSoftwareBitmap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapFrameWithSoftwareBitmap {
      val address = segment.toRawLongValue()
      return makeIBitmapFrameWithSoftwareBitmap(Pointer(address))
    }

    public override fun toNative(obj: IBitmapFrameWithSoftwareBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__454241903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapFrameWithSoftwareBitmap):
        Array<IBitmapFrameWithSoftwareBitmap?> = (elements as
        Array<IBitmapFrameWithSoftwareBitmap?>).castToImpl<IBitmapFrameWithSoftwareBitmap,IBitmapFrameWithSoftwareBitmap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapFrameWithSoftwareBitmap?> =
        arrayOfNulls<IBitmapFrameWithSoftwareBitmap_Impl>(size) as
        Array<IBitmapFrameWithSoftwareBitmap?>
  }
}
