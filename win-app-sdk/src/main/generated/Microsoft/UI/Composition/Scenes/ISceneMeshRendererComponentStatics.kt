package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.Compositor
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

@ABIMarker(ISceneMeshRendererComponentStatics.ABI::class)
@Signature("{c54f8c5a-a104-5cfa-89dc-13edaa6e3d88}")
@Guid("c54f8c5aa1045cfa89dc13edaa6e3d88")
@WinRTInterface("c54f8c5aa1045cfa89dc13edaa6e3d88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMeshRendererComponentStatics.ByReference::class)
public interface ISceneMeshRendererComponentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): SceneMeshRendererComponent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMeshRendererComponentStatics> {
    public override fun getValue() =
        ABI.makeISceneMeshRendererComponentStatics(pointer.getPointer(0))

    public fun setValue(value: ISceneMeshRendererComponentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMeshRendererComponentStatics {
    public val __840718080_Ptr: Pointer?

    public val _840718080_VtblPtr: Pointer?
      get() = __840718080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneMeshRendererComponent? {
      val fnPtr = _840718080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMeshRendererComponent>()
      val hr = fn.invokeHR(arrayOf(__840718080_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMeshRendererComponent>(result.getValue())
      return resultValue
    }
  }

  public class ISceneMeshRendererComponentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __840718080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMeshRendererComponentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c54f8c5aa1045cfa89dc13edaa6e3d88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMeshRendererComponentStatics(ptr: Pointer?): WithDefault =
        ISceneMeshRendererComponentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMeshRendererComponentStatics {
      val address = segment.toRawLongValue()
      return makeISceneMeshRendererComponentStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneMeshRendererComponentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__840718080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMeshRendererComponentStatics):
        Array<ISceneMeshRendererComponentStatics?> = (elements as
        Array<ISceneMeshRendererComponentStatics?>).castToImpl<ISceneMeshRendererComponentStatics,ISceneMeshRendererComponentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMeshRendererComponentStatics?> =
        arrayOfNulls<ISceneMeshRendererComponentStatics_Impl>(size) as
        Array<ISceneMeshRendererComponentStatics?>
  }
}
