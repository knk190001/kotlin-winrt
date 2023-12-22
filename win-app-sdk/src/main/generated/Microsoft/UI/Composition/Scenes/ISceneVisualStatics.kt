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

@ABIMarker(ISceneVisualStatics.ABI::class)
@Signature("{7b8da6d1-5bd8-5095-9264-e5572653ea07}")
@Guid("7b8da6d15bd850959264e5572653ea07")
@WinRTInterface("7b8da6d15bd850959264e5572653ea07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneVisualStatics.ByReference::class)
public interface ISceneVisualStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): SceneVisual?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneVisualStatics> {
    public override fun getValue() = ABI.makeISceneVisualStatics(pointer.getPointer(0))

    public fun setValue(value: ISceneVisualStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneVisualStatics {
    public val __1110861731_Ptr: Pointer?

    public val _1110861731_VtblPtr: Pointer?
      get() = __1110861731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneVisual? {
      val fnPtr = _1110861731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneVisual>()
      val hr = fn.invokeHR(arrayOf(__1110861731_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneVisual>(result.getValue())
      return resultValue
    }
  }

  public class ISceneVisualStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1110861731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneVisualStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b8da6d15bd850959264e5572653ea07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneVisualStatics(ptr: Pointer?): WithDefault = ISceneVisualStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneVisualStatics {
      val address = segment.toRawLongValue()
      return makeISceneVisualStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneVisualStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1110861731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneVisualStatics): Array<ISceneVisualStatics?> =
        (elements as
        Array<ISceneVisualStatics?>).castToImpl<ISceneVisualStatics,ISceneVisualStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneVisualStatics?> =
        arrayOfNulls<ISceneVisualStatics_Impl>(size) as Array<ISceneVisualStatics?>
  }
}
