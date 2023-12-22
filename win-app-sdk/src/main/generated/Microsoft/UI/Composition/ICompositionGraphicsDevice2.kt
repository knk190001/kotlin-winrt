package Microsoft.UI.Composition

import Microsoft.Graphics.DirectX.DirectXAlphaMode
import Microsoft.Graphics.DirectX.DirectXPixelFormat
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

@ABIMarker(ICompositionGraphicsDevice2.ABI::class)
@Signature("{ffd56707-1c7a-5da0-aa1a-49cb935b5dca}")
@Guid("ffd567071c7a5da0aa1a49cb935b5dca")
@WinRTInterface("ffd567071c7a5da0aa1a49cb935b5dca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionGraphicsDevice2.ByReference::class)
public interface ICompositionGraphicsDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateDrawingSurface2(
    sizePixels: SizeInt32?,
    pixelFormat: DirectXPixelFormat?,
    alphaMode: DirectXAlphaMode?
  ): CompositionDrawingSurface?

  @InterfaceMethod(1)
  public fun CreateVirtualDrawingSurface(
    sizePixels: SizeInt32?,
    pixelFormat: DirectXPixelFormat?,
    alphaMode: DirectXAlphaMode?
  ): CompositionVirtualDrawingSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionGraphicsDevice2> {
    public override fun getValue() = ABI.makeICompositionGraphicsDevice2(pointer.getPointer(0))

    public fun setValue(value: ICompositionGraphicsDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionGraphicsDevice2 {
    public val __1608775840_Ptr: Pointer?

    public val _1608775840_VtblPtr: Pointer?
      get() = __1608775840_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateDrawingSurface2(
      sizePixels: SizeInt32?,
      pixelFormat: DirectXPixelFormat?,
      alphaMode: DirectXAlphaMode?
    ): CompositionDrawingSurface? {
      val fnPtr = _1608775840_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionDrawingSurface>()
      val hr = fn.invokeHR(arrayOf(__1608775840_Ptr, marshalToNative(sizePixels),
          marshalToNative(pixelFormat), marshalToNative(alphaMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionDrawingSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateVirtualDrawingSurface(
      sizePixels: SizeInt32?,
      pixelFormat: DirectXPixelFormat?,
      alphaMode: DirectXAlphaMode?
    ): CompositionVirtualDrawingSurface? {
      val fnPtr = _1608775840_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionVirtualDrawingSurface>()
      val hr = fn.invokeHR(arrayOf(__1608775840_Ptr, marshalToNative(sizePixels),
          marshalToNative(pixelFormat), marshalToNative(alphaMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionVirtualDrawingSurface>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionGraphicsDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1608775840_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionGraphicsDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffd567071c7a5da0aa1a49cb935b5dca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionGraphicsDevice2(ptr: Pointer?): WithDefault =
        ICompositionGraphicsDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionGraphicsDevice2 {
      val address = segment.toRawLongValue()
      return makeICompositionGraphicsDevice2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionGraphicsDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1608775840_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionGraphicsDevice2):
        Array<ICompositionGraphicsDevice2?> = (elements as
        Array<ICompositionGraphicsDevice2?>).castToImpl<ICompositionGraphicsDevice2,ICompositionGraphicsDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionGraphicsDevice2?> =
        arrayOfNulls<ICompositionGraphicsDevice2_Impl>(size) as Array<ICompositionGraphicsDevice2?>
  }
}
