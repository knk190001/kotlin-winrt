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

@ABIMarker(ISceneMetallicRoughnessMaterialStatics.ABI::class)
@Signature("{dffd2043-ab3c-57a0-8e13-6f09725e970f}")
@Guid("dffd2043ab3c57a08e136f09725e970f")
@WinRTInterface("dffd2043ab3c57a08e136f09725e970f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMetallicRoughnessMaterialStatics.ByReference::class)
public interface ISceneMetallicRoughnessMaterialStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): SceneMetallicRoughnessMaterial?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMetallicRoughnessMaterialStatics> {
    public override fun getValue() =
        ABI.makeISceneMetallicRoughnessMaterialStatics(pointer.getPointer(0))

    public fun setValue(value: ISceneMetallicRoughnessMaterialStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMetallicRoughnessMaterialStatics {
    public val __318493237_Ptr: Pointer?

    public val _318493237_VtblPtr: Pointer?
      get() = __318493237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneMetallicRoughnessMaterial? {
      val fnPtr = _318493237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMetallicRoughnessMaterial>()
      val hr = fn.invokeHR(arrayOf(__318493237_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMetallicRoughnessMaterial>(result.getValue())
      return resultValue
    }
  }

  public class ISceneMetallicRoughnessMaterialStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __318493237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMetallicRoughnessMaterialStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dffd2043ab3c57a08e136f09725e970f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMetallicRoughnessMaterialStatics(ptr: Pointer?): WithDefault =
        ISceneMetallicRoughnessMaterialStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMetallicRoughnessMaterialStatics {
      val address = segment.toRawLongValue()
      return makeISceneMetallicRoughnessMaterialStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneMetallicRoughnessMaterialStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__318493237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMetallicRoughnessMaterialStatics):
        Array<ISceneMetallicRoughnessMaterialStatics?> = (elements as
        Array<ISceneMetallicRoughnessMaterialStatics?>).castToImpl<ISceneMetallicRoughnessMaterialStatics,ISceneMetallicRoughnessMaterialStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMetallicRoughnessMaterialStatics?> =
        arrayOfNulls<ISceneMetallicRoughnessMaterialStatics_Impl>(size) as
        Array<ISceneMetallicRoughnessMaterialStatics?>
  }
}
