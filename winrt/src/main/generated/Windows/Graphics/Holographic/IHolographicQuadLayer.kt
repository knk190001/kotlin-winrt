package Windows.Graphics.Holographic

import Windows.Foundation.Size
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

@ABIMarker(IHolographicQuadLayer.ABI::class)
@Signature("{903460c9-c9d9-5d5c-41ac-a2d5ab0fd331}")
@Guid("903460c9c9d95d5c41aca2d5ab0fd331")
@WinRTInterface("903460c9c9d95d5c41aca2d5ab0fd331")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicQuadLayer.ByReference::class)
public interface IHolographicQuadLayer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelFormat(): DirectXPixelFormat?

  @InterfaceMethod(1)
  public fun get_Size(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicQuadLayer> {
    public override fun getValue() = ABI.makeIHolographicQuadLayer(pointer.getPointer(0))

    public fun setValue(value: IHolographicQuadLayer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicQuadLayer {
    public val __569936399_Ptr: Pointer?

    public val _569936399_VtblPtr: Pointer?
      get() = __569936399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelFormat(): DirectXPixelFormat? {
      val fnPtr = _569936399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__569936399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Size(): Size? {
      val fnPtr = _569936399_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__569936399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicQuadLayer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __569936399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicQuadLayer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("903460c9c9d95d5c41aca2d5ab0fd331")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicQuadLayer(ptr: Pointer?): WithDefault =
        IHolographicQuadLayer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicQuadLayer {
      val address = segment.toRawLongValue()
      return makeIHolographicQuadLayer(Pointer(address))
    }

    public override fun toNative(obj: IHolographicQuadLayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__569936399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicQuadLayer): Array<IHolographicQuadLayer?> =
        (elements as
        Array<IHolographicQuadLayer?>).castToImpl<IHolographicQuadLayer,IHolographicQuadLayer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicQuadLayer?> =
        arrayOfNulls<IHolographicQuadLayer_Impl>(size) as Array<IHolographicQuadLayer?>
  }
}
