package Windows.UI.Composition

import Windows.Graphics.DirectX.DirectXAlphaMode
import Windows.Graphics.DirectX.DirectXPixelFormat
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionGraphicsDevice3.ABI::class)
@Signature("{37f67514-d3ef-49d1-b69d-0d8eabeb3626}")
@Guid("37f67514d3ef49d1b69d0d8eabeb3626")
@WinRTInterface("37f67514d3ef49d1b69d0d8eabeb3626")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGraphicsDevice3.ByReference::class)
public interface ICompositionGraphicsDevice3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMipmapSurface(
    sizePixels: SizeInt32?,
    pixelFormat: DirectXPixelFormat?,
    alphaMode: DirectXAlphaMode?
  ): CompositionMipmapSurface?

  @InterfaceMethod(1)
  public fun Trim(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGraphicsDevice3> {
    public override fun getValue() = ABI.makeICompositionGraphicsDevice3(pointer.getPointer(0))

    public fun setValue(value: ICompositionGraphicsDevice3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGraphicsDevice3 {
    public val __418240842_Ptr: Pointer?

    public val _418240842_VtblPtr: Pointer?
      get() = __418240842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMipmapSurface(
      sizePixels: SizeInt32?,
      pixelFormat: DirectXPixelFormat?,
      alphaMode: DirectXAlphaMode?
    ): CompositionMipmapSurface? {
      val fnPtr = _418240842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionMipmapSurface>()
      val hr = fn.invokeHR(arrayOf(__418240842_Ptr, marshalToNative(sizePixels),
          marshalToNative(pixelFormat), marshalToNative(alphaMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionMipmapSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Trim(): Unit {
      val fnPtr = _418240842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__418240842_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionGraphicsDevice3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __418240842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGraphicsDevice3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37f67514d3ef49d1b69d0d8eabeb3626")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGraphicsDevice3(ptr: Pointer?): WithDefault =
        ICompositionGraphicsDevice3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGraphicsDevice3 {
      val address = segment.toRawLongValue()
      return makeICompositionGraphicsDevice3(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGraphicsDevice3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__418240842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGraphicsDevice3):
        Array<ICompositionGraphicsDevice3?> = (elements as
        Array<ICompositionGraphicsDevice3?>).castToImpl<ICompositionGraphicsDevice3,ICompositionGraphicsDevice3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGraphicsDevice3?> =
        arrayOfNulls<ICompositionGraphicsDevice3_Impl>(size) as Array<ICompositionGraphicsDevice3?>
  }
}
