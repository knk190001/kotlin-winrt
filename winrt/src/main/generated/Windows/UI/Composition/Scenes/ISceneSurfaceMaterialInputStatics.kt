package Windows.UI.Composition.Scenes

import Windows.UI.Composition.Compositor
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

@ABIMarker(ISceneSurfaceMaterialInputStatics.ABI::class)
@Signature("{5a2394d3-6429-4589-bbcf-b84f4f3cfbfe}")
@Guid("5a2394d364294589bbcfb84f4f3cfbfe")
@WinRTInterface("5a2394d364294589bbcfb84f4f3cfbfe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneSurfaceMaterialInputStatics.ByReference::class)
public interface ISceneSurfaceMaterialInputStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): SceneSurfaceMaterialInput?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneSurfaceMaterialInputStatics> {
    public override fun getValue() =
        ABI.makeISceneSurfaceMaterialInputStatics(pointer.getPointer(0))

    public fun setValue(value: ISceneSurfaceMaterialInputStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneSurfaceMaterialInputStatics {
    public val __483583886_Ptr: Pointer?

    public val _483583886_VtblPtr: Pointer?
      get() = __483583886_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneSurfaceMaterialInput? {
      val fnPtr = _483583886_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneSurfaceMaterialInput>()
      val hr = fn.invokeHR(arrayOf(__483583886_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneSurfaceMaterialInput>(result.getValue())
      return resultValue
    }
  }

  public class ISceneSurfaceMaterialInputStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __483583886_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneSurfaceMaterialInputStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a2394d364294589bbcfb84f4f3cfbfe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneSurfaceMaterialInputStatics(ptr: Pointer?): WithDefault =
        ISceneSurfaceMaterialInputStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneSurfaceMaterialInputStatics {
      val address = segment.toRawLongValue()
      return makeISceneSurfaceMaterialInputStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneSurfaceMaterialInputStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__483583886_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneSurfaceMaterialInputStatics):
        Array<ISceneSurfaceMaterialInputStatics?> = (elements as
        Array<ISceneSurfaceMaterialInputStatics?>).castToImpl<ISceneSurfaceMaterialInputStatics,ISceneSurfaceMaterialInputStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneSurfaceMaterialInputStatics?> =
        arrayOfNulls<ISceneSurfaceMaterialInputStatics_Impl>(size) as
        Array<ISceneSurfaceMaterialInputStatics?>
  }
}
