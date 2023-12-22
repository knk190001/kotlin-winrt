package Windows.UI.Xaml.Media.Imaging

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISurfaceImageSourceFactory.ABI::class)
@Signature("{3ab2212a-ef65-4a5f-bfac-73993e8c12c9}")
@Guid("3ab2212aef654a5fbfac73993e8c12c9")
@WinRTInterface("3ab2212aef654a5fbfac73993e8c12c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISurfaceImageSourceFactory.ByReference::class)
public interface ISurfaceImageSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithDimensions(
    pixelWidth: Int,
    pixelHeight: Int,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SurfaceImageSource?

  @InterfaceMethod(1)
  public fun CreateInstanceWithDimensionsAndOpacity(
    pixelWidth: Int,
    pixelHeight: Int,
    isOpaque: Boolean,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SurfaceImageSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISurfaceImageSourceFactory> {
    public override fun getValue() = ABI.makeISurfaceImageSourceFactory(pointer.getPointer(0))

    public fun setValue(value: ISurfaceImageSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISurfaceImageSourceFactory {
    public val __1335231919_Ptr: Pointer?

    public val _1335231919_VtblPtr: Pointer?
      get() = __1335231919_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithDimensions(
      pixelWidth: Int,
      pixelHeight: Int,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SurfaceImageSource? {
      val fnPtr = _1335231919_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SurfaceImageSource>()
      val hr = fn.invokeHR(arrayOf(__1335231919_Ptr, pixelWidth, pixelHeight,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SurfaceImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithDimensionsAndOpacity(
      pixelWidth: Int,
      pixelHeight: Int,
      isOpaque: Boolean,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SurfaceImageSource? {
      val fnPtr = _1335231919_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SurfaceImageSource>()
      val hr = fn.invokeHR(arrayOf(__1335231919_Ptr, pixelWidth, pixelHeight, isOpaque,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SurfaceImageSource>(result.getValue())
      return resultValue
    }
  }

  public class ISurfaceImageSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1335231919_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISurfaceImageSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ab2212aef654a5fbfac73993e8c12c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISurfaceImageSourceFactory(ptr: Pointer?): WithDefault =
        ISurfaceImageSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISurfaceImageSourceFactory {
      val address = segment.toRawLongValue()
      return makeISurfaceImageSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: ISurfaceImageSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1335231919_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISurfaceImageSourceFactory):
        Array<ISurfaceImageSourceFactory?> = (elements as
        Array<ISurfaceImageSourceFactory?>).castToImpl<ISurfaceImageSourceFactory,ISurfaceImageSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISurfaceImageSourceFactory?> =
        arrayOfNulls<ISurfaceImageSourceFactory_Impl>(size) as Array<ISurfaceImageSourceFactory?>
  }
}
