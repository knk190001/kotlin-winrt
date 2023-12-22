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

@ABIMarker(ISceneNodeStatics.ABI::class)
@Signature("{579a0faa-be9d-4210-908c-93d15feed0b7}")
@Guid("579a0faabe9d4210908c93d15feed0b7")
@WinRTInterface("579a0faabe9d4210908c93d15feed0b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneNodeStatics.ByReference::class)
public interface ISceneNodeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): SceneNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneNodeStatics> {
    public override fun getValue() = ABI.makeISceneNodeStatics(pointer.getPointer(0))

    public fun setValue(value: ISceneNodeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneNodeStatics {
    public val __2053995046_Ptr: Pointer?

    public val _2053995046_VtblPtr: Pointer?
      get() = __2053995046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneNode? {
      val fnPtr = _2053995046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneNode>()
      val hr = fn.invokeHR(arrayOf(__2053995046_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneNode>(result.getValue())
      return resultValue
    }
  }

  public class ISceneNodeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2053995046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneNodeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("579a0faabe9d4210908c93d15feed0b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneNodeStatics(ptr: Pointer?): WithDefault = ISceneNodeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneNodeStatics {
      val address = segment.toRawLongValue()
      return makeISceneNodeStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneNodeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2053995046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneNodeStatics): Array<ISceneNodeStatics?> = (elements
        as Array<ISceneNodeStatics?>).castToImpl<ISceneNodeStatics,ISceneNodeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneNodeStatics?> =
        arrayOfNulls<ISceneNodeStatics_Impl>(size) as Array<ISceneNodeStatics?>
  }
}
