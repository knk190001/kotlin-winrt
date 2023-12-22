package Windows.Graphics.Printing3D

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IPrinting3DMesh.ABI::class)
@Signature("{192e90dc-0228-2e01-bc20-c5290cbf32c4}")
@Guid("192e90dc02282e01bc20c5290cbf32c4")
@WinRTInterface("192e90dc02282e01bc20c5290cbf32c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3DMesh.ByReference::class)
public interface IPrinting3DMesh : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VertexCount(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_VertexCount(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_IndexCount(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_IndexCount(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_VertexPositionsDescription(): Printing3DBufferDescription?

  @InterfaceMethod(5)
  public fun put_VertexPositionsDescription(value: Printing3DBufferDescription?): Unit

  @InterfaceMethod(6)
  public fun get_VertexNormalsDescription(): Printing3DBufferDescription?

  @InterfaceMethod(7)
  public fun put_VertexNormalsDescription(value: Printing3DBufferDescription?): Unit

  @InterfaceMethod(8)
  public fun get_TriangleIndicesDescription(): Printing3DBufferDescription?

  @InterfaceMethod(9)
  public fun put_TriangleIndicesDescription(value: Printing3DBufferDescription?): Unit

  @InterfaceMethod(10)
  public fun get_TriangleMaterialIndicesDescription(): Printing3DBufferDescription?

  @InterfaceMethod(11)
  public fun put_TriangleMaterialIndicesDescription(value: Printing3DBufferDescription?): Unit

  @InterfaceMethod(12)
  public fun GetVertexPositions(): IBuffer?

  @InterfaceMethod(13)
  public fun CreateVertexPositions(value: WinDef.UINT): Unit

  @InterfaceMethod(14)
  public fun GetVertexNormals(): IBuffer?

  @InterfaceMethod(15)
  public fun CreateVertexNormals(value: WinDef.UINT): Unit

  @InterfaceMethod(16)
  public fun GetTriangleIndices(): IBuffer?

  @InterfaceMethod(17)
  public fun CreateTriangleIndices(value: WinDef.UINT): Unit

  @InterfaceMethod(18)
  public fun GetTriangleMaterialIndices(): IBuffer?

  @InterfaceMethod(19)
  public fun CreateTriangleMaterialIndices(value: WinDef.UINT): Unit

  @InterfaceMethod(20)
  public fun get_BufferDescriptionSet(): IPropertySet?

  @InterfaceMethod(21)
  public fun get_BufferSet(): IPropertySet?

  @InterfaceMethod(22)
  public fun VerifyAsync(value: Printing3DMeshVerificationMode?):
      IAsyncOperation<Printing3DMeshVerificationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3DMesh> {
    public override fun getValue() = ABI.makeIPrinting3DMesh(pointer.getPointer(0))

    public fun setValue(value: IPrinting3DMesh_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3DMesh {
    public val __1702743874_Ptr: Pointer?

    public val _1702743874_VtblPtr: Pointer?
      get() = __1702743874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VertexCount(): WinDef.UINT {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_VertexCount(value: WinDef.UINT): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IndexCount(): WinDef.UINT {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IndexCount(value: WinDef.UINT): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_VertexPositionsDescription(): Printing3DBufferDescription? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DBufferDescription>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DBufferDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_VertexPositionsDescription(value: Printing3DBufferDescription?): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_VertexNormalsDescription(): Printing3DBufferDescription? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DBufferDescription>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DBufferDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_VertexNormalsDescription(value: Printing3DBufferDescription?): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TriangleIndicesDescription(): Printing3DBufferDescription? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DBufferDescription>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DBufferDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TriangleIndicesDescription(value: Printing3DBufferDescription?): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_TriangleMaterialIndicesDescription(): Printing3DBufferDescription? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DBufferDescription>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DBufferDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_TriangleMaterialIndicesDescription(value: Printing3DBufferDescription?):
        Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun GetVertexPositions(): IBuffer? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateVertexPositions(value: WinDef.UINT): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun GetVertexNormals(): IBuffer? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun CreateVertexNormals(value: WinDef.UINT): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun GetTriangleIndices(): IBuffer? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun CreateTriangleIndices(value: WinDef.UINT): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun GetTriangleMaterialIndices(): IBuffer? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun CreateTriangleMaterialIndices(value: WinDef.UINT): Unit {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_BufferDescriptionSet(): IPropertySet? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_BufferSet(): IPropertySet? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun VerifyAsync(value: Printing3DMeshVerificationMode?):
        IAsyncOperation<Printing3DMeshVerificationResult?>? {
      val fnPtr = _1702743874_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Printing3DMeshVerificationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1702743874_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<Printing3DMeshVerificationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3DMesh_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1702743874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3DMesh, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("192e90dc02282e01bc20c5290cbf32c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3DMesh(ptr: Pointer?): WithDefault = IPrinting3DMesh_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3DMesh {
      val address = segment.toRawLongValue()
      return makeIPrinting3DMesh(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3DMesh): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1702743874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3DMesh): Array<IPrinting3DMesh?> = (elements as
        Array<IPrinting3DMesh?>).castToImpl<IPrinting3DMesh,IPrinting3DMesh_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3DMesh?> =
        arrayOfNulls<IPrinting3DMesh_Impl>(size) as Array<IPrinting3DMesh?>
  }
}
