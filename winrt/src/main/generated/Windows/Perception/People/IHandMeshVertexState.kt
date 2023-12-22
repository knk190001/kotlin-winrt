package Windows.Perception.People

import Windows.Perception.PerceptionTimestamp
import Windows.Perception.Spatial.SpatialCoordinateSystem
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

@ABIMarker(IHandMeshVertexState.ABI::class)
@Signature("{046c5fef-1d8b-55de-ab2c-1cd424886d8f}")
@Guid("046c5fef1d8b55deab2c1cd424886d8f")
@WinRTInterface("046c5fef1d8b55deab2c1cd424886d8f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandMeshVertexState.ByReference::class)
public interface IHandMeshVertexState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CoordinateSystem(): SpatialCoordinateSystem?

  @InterfaceMethod(1)
  public fun GetVertices(vertices: Array<HandMeshVertex?>): Unit

  @InterfaceMethod(2)
  public fun get_UpdateTimestamp(): PerceptionTimestamp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandMeshVertexState> {
    public override fun getValue() = ABI.makeIHandMeshVertexState(pointer.getPointer(0))

    public fun setValue(value: IHandMeshVertexState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandMeshVertexState {
    public val __776448597_Ptr: Pointer?

    public val _776448597_VtblPtr: Pointer?
      get() = __776448597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CoordinateSystem(): SpatialCoordinateSystem? {
      val fnPtr = _776448597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__776448597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetVertices(vertices: Array<HandMeshVertex?>): Unit {
      val fnPtr = _776448597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__776448597_Ptr, vertices.size,marshalToNative(vertices),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UpdateTimestamp(): PerceptionTimestamp? {
      val fnPtr = _776448597_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__776448597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }
  }

  public class IHandMeshVertexState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __776448597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandMeshVertexState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("046c5fef1d8b55deab2c1cd424886d8f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandMeshVertexState(ptr: Pointer?): WithDefault = IHandMeshVertexState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandMeshVertexState {
      val address = segment.toRawLongValue()
      return makeIHandMeshVertexState(Pointer(address))
    }

    public override fun toNative(obj: IHandMeshVertexState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__776448597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandMeshVertexState): Array<IHandMeshVertexState?> =
        (elements as
        Array<IHandMeshVertexState?>).castToImpl<IHandMeshVertexState,IHandMeshVertexState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandMeshVertexState?> =
        arrayOfNulls<IHandMeshVertexState_Impl>(size) as Array<IHandMeshVertexState?>
  }
}
