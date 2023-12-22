package Microsoft.UI.Composition

import Microsoft.Graphics.DirectX.DirectXAlphaMode
import Microsoft.Graphics.DirectX.DirectXPixelFormat
import Windows.Foundation.IAsyncOperation
import Windows.Graphics.SizeInt32
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionGraphicsDevice4.ABI::class)
@Signature("{2b295c04-7b2e-5b0e-9762-2992313b700c}")
@Guid("2b295c047b2e5b0e97622992313b700c")
@WinRTInterface("2b295c047b2e5b0e97622992313b700c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGraphicsDevice4.ByReference::class)
public interface ICompositionGraphicsDevice4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CaptureAsync(
    captureVisual: Visual?,
    size: SizeInt32?,
    pixelFormat: DirectXPixelFormat?,
    alphaMode: DirectXAlphaMode?,
    sdrBoost: Float
  ): IAsyncOperation<ICompositionSurface?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGraphicsDevice4> {
    public override fun getValue() = ABI.makeICompositionGraphicsDevice4(pointer.getPointer(0))

    public fun setValue(value: ICompositionGraphicsDevice4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGraphicsDevice4 {
    public val __1608775838_Ptr: Pointer?

    public val _1608775838_VtblPtr: Pointer?
      get() = __1608775838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CaptureAsync(
      captureVisual: Visual?,
      size: SizeInt32?,
      pixelFormat: DirectXPixelFormat?,
      alphaMode: DirectXAlphaMode?,
      sdrBoost: Float
    ): IAsyncOperation<ICompositionSurface?>? {
      val fnPtr = _1608775838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ICompositionSurface?>>()
      val hr = fn.invokeHR(arrayOf(__1608775838_Ptr, marshalToNative(captureVisual),
          marshalToNative(size), marshalToNative(pixelFormat), marshalToNative(alphaMode), sdrBoost,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ICompositionSurface?>>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionGraphicsDevice4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1608775838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGraphicsDevice4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b295c047b2e5b0e97622992313b700c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGraphicsDevice4(ptr: Pointer?): WithDefault =
        ICompositionGraphicsDevice4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGraphicsDevice4 {
      val address = segment.toRawLongValue()
      return makeICompositionGraphicsDevice4(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGraphicsDevice4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1608775838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGraphicsDevice4):
        Array<ICompositionGraphicsDevice4?> = (elements as
        Array<ICompositionGraphicsDevice4?>).castToImpl<ICompositionGraphicsDevice4,ICompositionGraphicsDevice4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGraphicsDevice4?> =
        arrayOfNulls<ICompositionGraphicsDevice4_Impl>(size) as Array<ICompositionGraphicsDevice4?>
  }
}
