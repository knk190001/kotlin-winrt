package Windows.Graphics.Holographic

import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
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

@ABIMarker(IHolographicQuadLayerUpdateParameters2.ABI::class)
@Signature("{4f33d32d-82c1-46c1-8980-3cb70d98182b}")
@Guid("4f33d32d82c146c189803cb70d98182b")
@WinRTInterface("4f33d32d82c146c189803cb70d98182b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicQuadLayerUpdateParameters2.ByReference::class)
public interface IHolographicQuadLayerUpdateParameters2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanAcquireWithHardwareProtection(): Boolean

  @InterfaceMethod(1)
  public fun AcquireBufferToUpdateContentWithHardwareProtection(): IDirect3DSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicQuadLayerUpdateParameters2> {
    public override fun getValue() =
        ABI.makeIHolographicQuadLayerUpdateParameters2(pointer.getPointer(0))

    public fun setValue(value: IHolographicQuadLayerUpdateParameters2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicQuadLayerUpdateParameters2 {
    public val __737081520_Ptr: Pointer?

    public val _737081520_VtblPtr: Pointer?
      get() = __737081520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanAcquireWithHardwareProtection(): Boolean {
      val fnPtr = _737081520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__737081520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun AcquireBufferToUpdateContentWithHardwareProtection(): IDirect3DSurface? {
      val fnPtr = _737081520_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__737081520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicQuadLayerUpdateParameters2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __737081520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicQuadLayerUpdateParameters2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f33d32d82c146c189803cb70d98182b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicQuadLayerUpdateParameters2(ptr: Pointer?): WithDefault =
        IHolographicQuadLayerUpdateParameters2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicQuadLayerUpdateParameters2 {
      val address = segment.toRawLongValue()
      return makeIHolographicQuadLayerUpdateParameters2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicQuadLayerUpdateParameters2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__737081520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicQuadLayerUpdateParameters2):
        Array<IHolographicQuadLayerUpdateParameters2?> = (elements as
        Array<IHolographicQuadLayerUpdateParameters2?>).castToImpl<IHolographicQuadLayerUpdateParameters2,IHolographicQuadLayerUpdateParameters2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicQuadLayerUpdateParameters2?> =
        arrayOfNulls<IHolographicQuadLayerUpdateParameters2_Impl>(size) as
        Array<IHolographicQuadLayerUpdateParameters2?>
  }
}
