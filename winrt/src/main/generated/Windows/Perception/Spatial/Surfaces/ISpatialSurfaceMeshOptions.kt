package Windows.Perception.Spatial.Surfaces

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialSurfaceMeshOptions.ABI::class)
@Signature("{d2759f89-3572-3d2d-a10d-5fee9394aa37}")
@Guid("d2759f8935723d2da10d5fee9394aa37")
@WinRTInterface("d2759f8935723d2da10d5fee9394aa37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialSurfaceMeshOptions.ByReference::class)
public interface ISpatialSurfaceMeshOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VertexPositionFormat(): DirectXPixelFormat?

  @InterfaceMethod(1)
  public fun put_VertexPositionFormat(value: DirectXPixelFormat?): Unit

  @InterfaceMethod(2)
  public fun get_TriangleIndexFormat(): DirectXPixelFormat?

  @InterfaceMethod(3)
  public fun put_TriangleIndexFormat(value: DirectXPixelFormat?): Unit

  @InterfaceMethod(4)
  public fun get_VertexNormalFormat(): DirectXPixelFormat?

  @InterfaceMethod(5)
  public fun put_VertexNormalFormat(value: DirectXPixelFormat?): Unit

  @InterfaceMethod(6)
  public fun get_IncludeVertexNormals(): Boolean

  @InterfaceMethod(7)
  public fun put_IncludeVertexNormals(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialSurfaceMeshOptions> {
    public override fun getValue() = ABI.makeISpatialSurfaceMeshOptions(pointer.getPointer(0))

    public fun setValue(value: ISpatialSurfaceMeshOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialSurfaceMeshOptions {
    public val __1278017619_Ptr: Pointer?

    public val _1278017619_VtblPtr: Pointer?
      get() = __1278017619_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VertexPositionFormat(): DirectXPixelFormat? {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_VertexPositionFormat(value: DirectXPixelFormat?): Unit {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TriangleIndexFormat(): DirectXPixelFormat? {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TriangleIndexFormat(value: DirectXPixelFormat?): Unit {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_VertexNormalFormat(): DirectXPixelFormat? {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_VertexNormalFormat(value: DirectXPixelFormat?): Unit {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IncludeVertexNormals(): Boolean {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IncludeVertexNormals(value: Boolean): Unit {
      val fnPtr = _1278017619_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1278017619_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialSurfaceMeshOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1278017619_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialSurfaceMeshOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2759f8935723d2da10d5fee9394aa37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialSurfaceMeshOptions(ptr: Pointer?): WithDefault =
        ISpatialSurfaceMeshOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialSurfaceMeshOptions {
      val address = segment.toRawLongValue()
      return makeISpatialSurfaceMeshOptions(Pointer(address))
    }

    public override fun toNative(obj: ISpatialSurfaceMeshOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1278017619_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialSurfaceMeshOptions):
        Array<ISpatialSurfaceMeshOptions?> = (elements as
        Array<ISpatialSurfaceMeshOptions?>).castToImpl<ISpatialSurfaceMeshOptions,ISpatialSurfaceMeshOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialSurfaceMeshOptions?> =
        arrayOfNulls<ISpatialSurfaceMeshOptions_Impl>(size) as Array<ISpatialSurfaceMeshOptions?>
  }
}
