package Windows.UI.Composition.Scenes

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

@ABIMarker(ISceneVisual.ABI::class)
@Signature("{8e672c1e-d734-47b1-be14-3d694ffa4301}")
@Guid("8e672c1ed73447b1be143d694ffa4301")
@WinRTInterface("8e672c1ed73447b1be143d694ffa4301")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneVisual.ByReference::class)
public interface ISceneVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Root(): SceneNode?

  @InterfaceMethod(1)
  public fun put_Root(value: SceneNode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISceneVisual> {
    public override fun getValue() = ABI.makeISceneVisual(pointer.getPointer(0))

    public fun setValue(value: ISceneVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneVisual {
    public val __1446716061_Ptr: Pointer?

    public val _1446716061_VtblPtr: Pointer?
      get() = __1446716061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Root(): SceneNode? {
      val fnPtr = _1446716061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneNode>()
      val hr = fn.invokeHR(arrayOf(__1446716061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Root(value: SceneNode?): Unit {
      val fnPtr = _1446716061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1446716061_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISceneVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1446716061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e672c1ed73447b1be143d694ffa4301")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneVisual(ptr: Pointer?): WithDefault = ISceneVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneVisual {
      val address = segment.toRawLongValue()
      return makeISceneVisual(Pointer(address))
    }

    public override fun toNative(obj: ISceneVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1446716061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneVisual): Array<ISceneVisual?> = (elements as
        Array<ISceneVisual?>).castToImpl<ISceneVisual,ISceneVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneVisual?> =
        arrayOfNulls<ISceneVisual_Impl>(size) as Array<ISceneVisual?>
  }
}
