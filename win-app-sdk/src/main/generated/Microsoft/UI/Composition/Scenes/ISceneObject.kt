package Microsoft.UI.Composition.Scenes

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISceneObject.ABI::class)
@Signature("{4333e514-4fc7-521e-8bca-11c51fbcaf1e}")
@Guid("4333e5144fc7521e8bca11c51fbcaf1e")
@WinRTInterface("4333e5144fc7521e8bca11c51fbcaf1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneObject.ByReference::class)
public interface ISceneObject : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISceneObject> {
    public override fun getValue() = ABI.makeISceneObject(pointer.getPointer(0))

    public fun setValue(value: ISceneObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneObject {
    public val __438368839_Ptr: Pointer?

    public val _438368839_VtblPtr: Pointer?
      get() = __438368839_Ptr?.getPointer(0)
  }

  public class ISceneObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438368839_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4333e5144fc7521e8bca11c51fbcaf1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneObject(ptr: Pointer?): WithDefault = ISceneObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneObject {
      val address = segment.toRawLongValue()
      return makeISceneObject(Pointer(address))
    }

    public override fun toNative(obj: ISceneObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438368839_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneObject): Array<ISceneObject?> = (elements as
        Array<ISceneObject?>).castToImpl<ISceneObject,ISceneObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneObject?> =
        arrayOfNulls<ISceneObject_Impl>(size) as Array<ISceneObject?>
  }
}
