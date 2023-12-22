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

@ABIMarker(ISceneVisualStatics.ABI::class)
@Signature("{b8347e9a-50aa-4527-8d34-de4cb8ea88b4}")
@Guid("b8347e9a50aa45278d34de4cb8ea88b4")
@WinRTInterface("b8347e9a50aa45278d34de4cb8ea88b4")
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
    public val __795362712_Ptr: Pointer?

    public val _795362712_VtblPtr: Pointer?
      get() = __795362712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneVisual? {
      val fnPtr = _795362712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneVisual>()
      val hr = fn.invokeHR(arrayOf(__795362712_Ptr, marshalToNative(compositor), result))
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
    public override val __795362712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneVisualStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8347e9a50aa45278d34de4cb8ea88b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneVisualStatics(ptr: Pointer?): WithDefault = ISceneVisualStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneVisualStatics {
      val address = segment.toRawLongValue()
      return makeISceneVisualStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneVisualStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__795362712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneVisualStatics): Array<ISceneVisualStatics?> =
        (elements as
        Array<ISceneVisualStatics?>).castToImpl<ISceneVisualStatics,ISceneVisualStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneVisualStatics?> =
        arrayOfNulls<ISceneVisualStatics_Impl>(size) as Array<ISceneVisualStatics?>
  }
}
