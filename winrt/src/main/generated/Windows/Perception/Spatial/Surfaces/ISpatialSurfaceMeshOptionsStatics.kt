package Windows.Perception.Spatial.Surfaces

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISpatialSurfaceMeshOptionsStatics.ABI::class)
@Signature("{9b340abf-9781-4505-8935-013575caae5e}")
@Guid("9b340abf978145058935013575caae5e")
@WinRTInterface("9b340abf978145058935013575caae5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialSurfaceMeshOptionsStatics.ByReference::class)
public interface ISpatialSurfaceMeshOptionsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedVertexPositionFormats(): IVectorView<DirectXPixelFormat?>?

  @InterfaceMethod(1)
  public fun get_SupportedTriangleIndexFormats(): IVectorView<DirectXPixelFormat?>?

  @InterfaceMethod(2)
  public fun get_SupportedVertexNormalFormats(): IVectorView<DirectXPixelFormat?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialSurfaceMeshOptionsStatics> {
    public override fun getValue() =
        ABI.makeISpatialSurfaceMeshOptionsStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialSurfaceMeshOptionsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialSurfaceMeshOptionsStatics {
    public val __753929048_Ptr: Pointer?

    public val _753929048_VtblPtr: Pointer?
      get() = __753929048_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedVertexPositionFormats(): IVectorView<DirectXPixelFormat?>? {
      val fnPtr = _753929048_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DirectXPixelFormat?>>()
      val hr = fn.invokeHR(arrayOf(__753929048_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DirectXPixelFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedTriangleIndexFormats(): IVectorView<DirectXPixelFormat?>? {
      val fnPtr = _753929048_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DirectXPixelFormat?>>()
      val hr = fn.invokeHR(arrayOf(__753929048_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DirectXPixelFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportedVertexNormalFormats(): IVectorView<DirectXPixelFormat?>? {
      val fnPtr = _753929048_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DirectXPixelFormat?>>()
      val hr = fn.invokeHR(arrayOf(__753929048_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DirectXPixelFormat?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialSurfaceMeshOptionsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __753929048_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialSurfaceMeshOptionsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b340abf978145058935013575caae5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialSurfaceMeshOptionsStatics(ptr: Pointer?): WithDefault =
        ISpatialSurfaceMeshOptionsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialSurfaceMeshOptionsStatics {
      val address = segment.toRawLongValue()
      return makeISpatialSurfaceMeshOptionsStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialSurfaceMeshOptionsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__753929048_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialSurfaceMeshOptionsStatics):
        Array<ISpatialSurfaceMeshOptionsStatics?> = (elements as
        Array<ISpatialSurfaceMeshOptionsStatics?>).castToImpl<ISpatialSurfaceMeshOptionsStatics,ISpatialSurfaceMeshOptionsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialSurfaceMeshOptionsStatics?> =
        arrayOfNulls<ISpatialSurfaceMeshOptionsStatics_Impl>(size) as
        Array<ISpatialSurfaceMeshOptionsStatics?>
  }
}
