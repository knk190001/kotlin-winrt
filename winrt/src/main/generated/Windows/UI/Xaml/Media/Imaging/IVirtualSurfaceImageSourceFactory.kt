package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(IVirtualSurfaceImageSourceFactory.ABI::class)
@Signature("{3ab2212a-bfac-11e0-8a92-69e44724019b}")
@Guid("3ab2212abfac11e08a9269e44724019b")
@WinRTInterface("3ab2212abfac11e08a9269e44724019b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualSurfaceImageSourceFactory.ByReference::class)
public interface IVirtualSurfaceImageSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithDimensions(pixelWidth: Int, pixelHeight: Int):
      VirtualSurfaceImageSource?

  @InterfaceMethod(1)
  public fun CreateInstanceWithDimensionsAndOpacity(
    pixelWidth: Int,
    pixelHeight: Int,
    isOpaque: Boolean
  ): VirtualSurfaceImageSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualSurfaceImageSourceFactory> {
    public override fun getValue() =
        ABI.makeIVirtualSurfaceImageSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IVirtualSurfaceImageSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualSurfaceImageSourceFactory {
    public val __2073639288_Ptr: Pointer?

    public val _2073639288_VtblPtr: Pointer?
      get() = __2073639288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithDimensions(pixelWidth: Int, pixelHeight: Int):
        VirtualSurfaceImageSource? {
      val fnPtr = _2073639288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualSurfaceImageSource>()
      val hr = fn.invokeHR(arrayOf(__2073639288_Ptr, pixelWidth, pixelHeight, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualSurfaceImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithDimensionsAndOpacity(
      pixelWidth: Int,
      pixelHeight: Int,
      isOpaque: Boolean
    ): VirtualSurfaceImageSource? {
      val fnPtr = _2073639288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualSurfaceImageSource>()
      val hr = fn.invokeHR(arrayOf(__2073639288_Ptr, pixelWidth, pixelHeight, isOpaque, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualSurfaceImageSource>(result.getValue())
      return resultValue
    }
  }

  public class IVirtualSurfaceImageSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2073639288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualSurfaceImageSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ab2212abfac11e08a9269e44724019b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualSurfaceImageSourceFactory(ptr: Pointer?): WithDefault =
        IVirtualSurfaceImageSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualSurfaceImageSourceFactory {
      val address = segment.toRawLongValue()
      return makeIVirtualSurfaceImageSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IVirtualSurfaceImageSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2073639288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualSurfaceImageSourceFactory):
        Array<IVirtualSurfaceImageSourceFactory?> = (elements as
        Array<IVirtualSurfaceImageSourceFactory?>).castToImpl<IVirtualSurfaceImageSourceFactory,IVirtualSurfaceImageSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualSurfaceImageSourceFactory?> =
        arrayOfNulls<IVirtualSurfaceImageSourceFactory_Impl>(size) as
        Array<IVirtualSurfaceImageSourceFactory?>
  }
}
