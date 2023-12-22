package Windows.UI.Composition.Scenes

import Windows.Foundation.MemoryBuffer
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.DirectX.DirectXPrimitiveTopology
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

@ABIMarker(ISceneMesh.ABI::class)
@Signature("{ee9a1530-1155-4c0c-92bd-40020cf78347}")
@Guid("ee9a153011554c0c92bd40020cf78347")
@WinRTInterface("ee9a153011554c0c92bd40020cf78347")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMesh.ByReference::class)
public interface ISceneMesh : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bounds(): SceneBoundingBox?

  @InterfaceMethod(1)
  public fun get_PrimitiveTopology(): DirectXPrimitiveTopology?

  @InterfaceMethod(2)
  public fun put_PrimitiveTopology(value: DirectXPrimitiveTopology?): Unit

  @InterfaceMethod(3)
  public fun FillMeshAttribute(
    semantic: SceneAttributeSemantic?,
    format: DirectXPixelFormat?,
    memory: MemoryBuffer?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISceneMesh> {
    public override fun getValue() = ABI.makeISceneMesh(pointer.getPointer(0))

    public fun setValue(value: ISceneMesh_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMesh {
    public val __1299323766_Ptr: Pointer?

    public val _1299323766_VtblPtr: Pointer?
      get() = __1299323766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bounds(): SceneBoundingBox? {
      val fnPtr = _1299323766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneBoundingBox>()
      val hr = fn.invokeHR(arrayOf(__1299323766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneBoundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrimitiveTopology(): DirectXPrimitiveTopology? {
      val fnPtr = _1299323766_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPrimitiveTopology>()
      val hr = fn.invokeHR(arrayOf(__1299323766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPrimitiveTopology>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_PrimitiveTopology(value: DirectXPrimitiveTopology?): Unit {
      val fnPtr = _1299323766_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1299323766_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun FillMeshAttribute(
      semantic: SceneAttributeSemantic?,
      format: DirectXPixelFormat?,
      memory: MemoryBuffer?
    ): Unit {
      val fnPtr = _1299323766_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1299323766_Ptr, marshalToNative(semantic),
          marshalToNative(format), marshalToNative(memory),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISceneMesh_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1299323766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMesh, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee9a153011554c0c92bd40020cf78347")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMesh(ptr: Pointer?): WithDefault = ISceneMesh_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMesh {
      val address = segment.toRawLongValue()
      return makeISceneMesh(Pointer(address))
    }

    public override fun toNative(obj: ISceneMesh): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1299323766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMesh): Array<ISceneMesh?> = (elements as
        Array<ISceneMesh?>).castToImpl<ISceneMesh,ISceneMesh_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMesh?> = arrayOfNulls<ISceneMesh_Impl>(size)
        as Array<ISceneMesh?>
  }
}
