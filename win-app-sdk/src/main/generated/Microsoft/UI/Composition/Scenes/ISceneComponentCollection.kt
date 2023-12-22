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

@ABIMarker(ISceneComponentCollection.ABI::class)
@Signature("{e4b21c71-87e2-5aeb-85be-884e8302273e}")
@Guid("e4b21c7187e25aeb85be884e8302273e")
@WinRTInterface("e4b21c7187e25aeb85be884e8302273e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneComponentCollection.ByReference::class)
public interface ISceneComponentCollection : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneComponentCollection> {
    public override fun getValue() = ABI.makeISceneComponentCollection(pointer.getPointer(0))

    public fun setValue(value: ISceneComponentCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneComponentCollection {
    public val __1773905267_Ptr: Pointer?

    public val _1773905267_VtblPtr: Pointer?
      get() = __1773905267_Ptr?.getPointer(0)
  }

  public class ISceneComponentCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1773905267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneComponentCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4b21c7187e25aeb85be884e8302273e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneComponentCollection(ptr: Pointer?): WithDefault =
        ISceneComponentCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneComponentCollection {
      val address = segment.toRawLongValue()
      return makeISceneComponentCollection(Pointer(address))
    }

    public override fun toNative(obj: ISceneComponentCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1773905267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneComponentCollection):
        Array<ISceneComponentCollection?> = (elements as
        Array<ISceneComponentCollection?>).castToImpl<ISceneComponentCollection,ISceneComponentCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneComponentCollection?> =
        arrayOfNulls<ISceneComponentCollection_Impl>(size) as Array<ISceneComponentCollection?>
  }
}
