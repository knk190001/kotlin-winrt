package Windows.UI.Composition

import Windows.Foundation.Size
import Windows.Graphics.DirectX.DirectXAlphaMode
import Windows.Graphics.DirectX.DirectXPixelFormat
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

@ABIMarker(ICompositionDrawingSurface.ABI::class)
@Signature("{a166c300-fad0-4d11-9e67-e433162ff49e}")
@Guid("a166c300fad04d119e67e433162ff49e")
@WinRTInterface("a166c300fad04d119e67e433162ff49e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionDrawingSurface.ByReference::class)
public interface ICompositionDrawingSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlphaMode(): DirectXAlphaMode?

  @InterfaceMethod(1)
  public fun get_PixelFormat(): DirectXPixelFormat?

  @InterfaceMethod(2)
  public fun get_Size(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionDrawingSurface> {
    public override fun getValue() = ABI.makeICompositionDrawingSurface(pointer.getPointer(0))

    public fun setValue(value: ICompositionDrawingSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionDrawingSurface {
    public val __1240411915_Ptr: Pointer?

    public val _1240411915_VtblPtr: Pointer?
      get() = __1240411915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlphaMode(): DirectXAlphaMode? {
      val fnPtr = _1240411915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__1240411915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PixelFormat(): DirectXPixelFormat? {
      val fnPtr = _1240411915_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1240411915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Size(): Size? {
      val fnPtr = _1240411915_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1240411915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionDrawingSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1240411915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionDrawingSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a166c300fad04d119e67e433162ff49e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionDrawingSurface(ptr: Pointer?): WithDefault =
        ICompositionDrawingSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionDrawingSurface {
      val address = segment.toRawLongValue()
      return makeICompositionDrawingSurface(Pointer(address))
    }

    public override fun toNative(obj: ICompositionDrawingSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1240411915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionDrawingSurface):
        Array<ICompositionDrawingSurface?> = (elements as
        Array<ICompositionDrawingSurface?>).castToImpl<ICompositionDrawingSurface,ICompositionDrawingSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionDrawingSurface?> =
        arrayOfNulls<ICompositionDrawingSurface_Impl>(size) as Array<ICompositionDrawingSurface?>
  }
}
