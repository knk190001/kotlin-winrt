package Windows.Perception.People

import Windows.UI.Input.Spatial.SpatialInteractionSource
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

@ABIMarker(IHandMeshObserver.ABI::class)
@Signature("{85ae30cb-6fc3-55c4-a7b4-29e33896ca69}")
@Guid("85ae30cb6fc355c4a7b429e33896ca69")
@WinRTInterface("85ae30cb6fc355c4a7b429e33896ca69")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandMeshObserver.ByReference::class)
public interface IHandMeshObserver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): SpatialInteractionSource?

  @InterfaceMethod(1)
  public fun get_TriangleIndexCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_VertexCount(): WinDef.UINT

  @InterfaceMethod(3)
  public fun GetTriangleIndices(indices: Array<WinDef.USHORT>): Unit

  @InterfaceMethod(4)
  public fun GetVertexStateForPose(handPose: HandPose?): HandMeshVertexState?

  @InterfaceMethod(5)
  public fun get_NeutralPose(): HandPose?

  @InterfaceMethod(6)
  public fun get_NeutralPoseVersion(): Int

  @InterfaceMethod(7)
  public fun get_ModelId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandMeshObserver> {
    public override fun getValue() = ABI.makeIHandMeshObserver(pointer.getPointer(0))

    public fun setValue(value: IHandMeshObserver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandMeshObserver {
    public val __1168437554_Ptr: Pointer?

    public val _1168437554_VtblPtr: Pointer?
      get() = __1168437554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): SpatialInteractionSource? {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSource>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TriangleIndexCount(): WinDef.UINT {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_VertexCount(): WinDef.UINT {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetTriangleIndices(indices: Array<WinDef.USHORT>): Unit {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr, indices.size,marshalToNative(indices),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetVertexStateForPose(handPose: HandPose?): HandMeshVertexState? {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandMeshVertexState>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr, marshalToNative(handPose), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandMeshVertexState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NeutralPose(): HandPose? {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandPose>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_NeutralPoseVersion(): Int {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ModelId(): Int {
      val fnPtr = _1168437554_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1168437554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IHandMeshObserver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1168437554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandMeshObserver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85ae30cb6fc355c4a7b429e33896ca69")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandMeshObserver(ptr: Pointer?): WithDefault = IHandMeshObserver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandMeshObserver {
      val address = segment.toRawLongValue()
      return makeIHandMeshObserver(Pointer(address))
    }

    public override fun toNative(obj: IHandMeshObserver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1168437554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandMeshObserver): Array<IHandMeshObserver?> = (elements
        as Array<IHandMeshObserver?>).castToImpl<IHandMeshObserver,IHandMeshObserver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandMeshObserver?> =
        arrayOfNulls<IHandMeshObserver_Impl>(size) as Array<IHandMeshObserver?>
  }
}
