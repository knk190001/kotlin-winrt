package Windows.Graphics.Imaging

import Windows.Foundation.IAsyncOperation
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISoftwareBitmapStatics.ABI::class)
@Signature("{df0385db-672f-4a9d-806e-c2442f343e86}")
@Guid("df0385db672f4a9d806ec2442f343e86")
@WinRTInterface("df0385db672f4a9d806ec2442f343e86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISoftwareBitmapStatics.ByReference::class)
public interface ISoftwareBitmapStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Copy(source: SoftwareBitmap?): SoftwareBitmap?

  @InterfaceMethod(1)
  public fun Convert(source: SoftwareBitmap?, format: BitmapPixelFormat?): SoftwareBitmap?

  @InterfaceMethod(2)
  public fun Convert(
    source: SoftwareBitmap?,
    format: BitmapPixelFormat?,
    alpha: BitmapAlphaMode?
  ): SoftwareBitmap?

  @InterfaceMethod(3)
  public fun CreateCopyFromBuffer(
    source: IBuffer?,
    format: BitmapPixelFormat?,
    width: Int,
    height: Int
  ): SoftwareBitmap?

  @InterfaceMethod(4)
  public fun CreateCopyFromBuffer(
    source: IBuffer?,
    format: BitmapPixelFormat?,
    width: Int,
    height: Int,
    alpha: BitmapAlphaMode?
  ): SoftwareBitmap?

  @InterfaceMethod(5)
  public fun CreateCopyFromSurfaceAsync(surface: IDirect3DSurface?):
      IAsyncOperation<SoftwareBitmap?>?

  @InterfaceMethod(6)
  public fun CreateCopyFromSurfaceAsync(surface: IDirect3DSurface?, alpha: BitmapAlphaMode?):
      IAsyncOperation<SoftwareBitmap?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISoftwareBitmapStatics> {
    public override fun getValue() = ABI.makeISoftwareBitmapStatics(pointer.getPointer(0))

    public fun setValue(value: ISoftwareBitmapStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISoftwareBitmapStatics {
    public val __778880122_Ptr: Pointer?

    public val _778880122_VtblPtr: Pointer?
      get() = __778880122_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Copy(source: SoftwareBitmap?): SoftwareBitmap? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Convert(source: SoftwareBitmap?, format: BitmapPixelFormat?):
        SoftwareBitmap? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(source),
          marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Convert(
      source: SoftwareBitmap?,
      format: BitmapPixelFormat?,
      alpha: BitmapAlphaMode?
    ): SoftwareBitmap? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(source),
          marshalToNative(format), marshalToNative(alpha), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateCopyFromBuffer(
      source: IBuffer?,
      format: BitmapPixelFormat?,
      width: Int,
      height: Int
    ): SoftwareBitmap? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(source),
          marshalToNative(format), width, height, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateCopyFromBuffer(
      source: IBuffer?,
      format: BitmapPixelFormat?,
      width: Int,
      height: Int,
      alpha: BitmapAlphaMode?
    ): SoftwareBitmap? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(source),
          marshalToNative(format), width, height, marshalToNative(alpha), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateCopyFromSurfaceAsync(surface: IDirect3DSurface?):
        IAsyncOperation<SoftwareBitmap?>? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SoftwareBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(surface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SoftwareBitmap?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateCopyFromSurfaceAsync(surface: IDirect3DSurface?,
        alpha: BitmapAlphaMode?): IAsyncOperation<SoftwareBitmap?>? {
      val fnPtr = _778880122_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SoftwareBitmap?>>()
      val hr = fn.invokeHR(arrayOf(__778880122_Ptr, marshalToNative(surface),
          marshalToNative(alpha), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SoftwareBitmap?>>(result.getValue())
      return resultValue
    }
  }

  public class ISoftwareBitmapStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __778880122_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISoftwareBitmapStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df0385db672f4a9d806ec2442f343e86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISoftwareBitmapStatics(ptr: Pointer?): WithDefault =
        ISoftwareBitmapStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISoftwareBitmapStatics {
      val address = segment.toRawLongValue()
      return makeISoftwareBitmapStatics(Pointer(address))
    }

    public override fun toNative(obj: ISoftwareBitmapStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__778880122_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISoftwareBitmapStatics): Array<ISoftwareBitmapStatics?> =
        (elements as
        Array<ISoftwareBitmapStatics?>).castToImpl<ISoftwareBitmapStatics,ISoftwareBitmapStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISoftwareBitmapStatics?> =
        arrayOfNulls<ISoftwareBitmapStatics_Impl>(size) as Array<ISoftwareBitmapStatics?>
  }
}
