package Microsoft.UI.Composition.Scenes

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

@ABIMarker(ISceneMeshRendererComponent.ABI::class)
@Signature("{d2be85a0-70a8-5c62-84d8-8ba55e4c64a9}")
@Guid("d2be85a070a85c6284d88ba55e4c64a9")
@WinRTInterface("d2be85a070a85c6284d88ba55e4c64a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMeshRendererComponent.ByReference::class)
public interface ISceneMeshRendererComponent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Material(): SceneMaterial?

  @InterfaceMethod(1)
  public fun put_Material(value: SceneMaterial?): Unit

  @InterfaceMethod(2)
  public fun get_Mesh(): SceneMesh?

  @InterfaceMethod(3)
  public fun put_Mesh(value: SceneMesh?): Unit

  @InterfaceMethod(4)
  public fun get_UVMappings(): SceneMeshMaterialAttributeMap?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMeshRendererComponent> {
    public override fun getValue() = ABI.makeISceneMeshRendererComponent(pointer.getPointer(0))

    public fun setValue(value: ISceneMeshRendererComponent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMeshRendererComponent {
    public val __3866885_Ptr: Pointer?

    public val _3866885_VtblPtr: Pointer?
      get() = __3866885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Material(): SceneMaterial? {
      val fnPtr = _3866885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMaterial>()
      val hr = fn.invokeHR(arrayOf(__3866885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMaterial>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Material(value: SceneMaterial?): Unit {
      val fnPtr = _3866885_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3866885_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Mesh(): SceneMesh? {
      val fnPtr = _3866885_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMesh>()
      val hr = fn.invokeHR(arrayOf(__3866885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMesh>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mesh(value: SceneMesh?): Unit {
      val fnPtr = _3866885_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__3866885_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UVMappings(): SceneMeshMaterialAttributeMap? {
      val fnPtr = _3866885_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMeshMaterialAttributeMap>()
      val hr = fn.invokeHR(arrayOf(__3866885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMeshMaterialAttributeMap>(result.getValue())
      return resultValue
    }
  }

  public class ISceneMeshRendererComponent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __3866885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMeshRendererComponent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2be85a070a85c6284d88ba55e4c64a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMeshRendererComponent(ptr: Pointer?): WithDefault =
        ISceneMeshRendererComponent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMeshRendererComponent {
      val address = segment.toRawLongValue()
      return makeISceneMeshRendererComponent(Pointer(address))
    }

    public override fun toNative(obj: ISceneMeshRendererComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__3866885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMeshRendererComponent):
        Array<ISceneMeshRendererComponent?> = (elements as
        Array<ISceneMeshRendererComponent?>).castToImpl<ISceneMeshRendererComponent,ISceneMeshRendererComponent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMeshRendererComponent?> =
        arrayOfNulls<ISceneMeshRendererComponent_Impl>(size) as Array<ISceneMeshRendererComponent?>
  }
}
