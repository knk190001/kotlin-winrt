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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICompositionMipmapSurface.ABI::class)
@Signature("{681f1e47-6e43-5b55-be3a-e5c858a2d5fa}")
@Guid("681f1e476e435b55be3ae5c858a2d5fa")
@WinRTInterface("681f1e476e435b55be3ae5c858a2d5fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionMipmapSurface.ByReference::class)
public interface ICompositionMipmapSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LevelCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_AlphaMode(): DirectXAlphaMode?

  @InterfaceMethod(2)
  public fun get_PixelFormat(): DirectXPixelFormat?

  @InterfaceMethod(3)
  public fun get_SizeInt32(): SizeInt32?

  @InterfaceMethod(4)
  public fun GetDrawingSurfaceForLevel(level: WinDef.UINT): CompositionDrawingSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionMipmapSurface> {
    public override fun getValue() = ABI.makeICompositionMipmapSurface(pointer.getPointer(0))

    public fun setValue(value: ICompositionMipmapSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionMipmapSurface {
    public val __1410784108_Ptr: Pointer?

    public val _1410784108_VtblPtr: Pointer?
      get() = __1410784108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LevelCount(): WinDef.UINT {
      val fnPtr = _1410784108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1410784108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AlphaMode(): DirectXAlphaMode? {
      val fnPtr = _1410784108_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__1410784108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PixelFormat(): DirectXPixelFormat? {
      val fnPtr = _1410784108_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1410784108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SizeInt32(): SizeInt32? {
      val fnPtr = _1410784108_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1410784108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDrawingSurfaceForLevel(level: WinDef.UINT): CompositionDrawingSurface? {
      val fnPtr = _1410784108_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionDrawingSurface>()
      val hr = fn.invokeHR(arrayOf(__1410784108_Ptr, level, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionDrawingSurface>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionMipmapSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1410784108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionMipmapSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("681f1e476e435b55be3ae5c858a2d5fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionMipmapSurface(ptr: Pointer?): WithDefault =
        ICompositionMipmapSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionMipmapSurface {
      val address = segment.toRawLongValue()
      return makeICompositionMipmapSurface(Pointer(address))
    }

    public override fun toNative(obj: ICompositionMipmapSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1410784108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionMipmapSurface):
        Array<ICompositionMipmapSurface?> = (elements as
        Array<ICompositionMipmapSurface?>).castToImpl<ICompositionMipmapSurface,ICompositionMipmapSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionMipmapSurface?> =
        arrayOfNulls<ICompositionMipmapSurface_Impl>(size) as Array<ICompositionMipmapSurface?>
  }
}
