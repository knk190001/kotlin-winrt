package Windows.UI.Composition.Scenes

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

@ABIMarker(ISceneMeshMaterialAttributeMap.ABI::class)
@Signature("{ce843171-3d43-4855-aa69-31ff988d049d}")
@Guid("ce8431713d434855aa6931ff988d049d")
@WinRTInterface("ce8431713d434855aa6931ff988d049d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMeshMaterialAttributeMap.ByReference::class)
public interface ISceneMeshMaterialAttributeMap : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMeshMaterialAttributeMap> {
    public override fun getValue() = ABI.makeISceneMeshMaterialAttributeMap(pointer.getPointer(0))

    public fun setValue(value: ISceneMeshMaterialAttributeMap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMeshMaterialAttributeMap {
    public val __1124412527_Ptr: Pointer?

    public val _1124412527_VtblPtr: Pointer?
      get() = __1124412527_Ptr?.getPointer(0)
  }

  public class ISceneMeshMaterialAttributeMap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1124412527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMeshMaterialAttributeMap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce8431713d434855aa6931ff988d049d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMeshMaterialAttributeMap(ptr: Pointer?): WithDefault =
        ISceneMeshMaterialAttributeMap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMeshMaterialAttributeMap {
      val address = segment.toRawLongValue()
      return makeISceneMeshMaterialAttributeMap(Pointer(address))
    }

    public override fun toNative(obj: ISceneMeshMaterialAttributeMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1124412527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMeshMaterialAttributeMap):
        Array<ISceneMeshMaterialAttributeMap?> = (elements as
        Array<ISceneMeshMaterialAttributeMap?>).castToImpl<ISceneMeshMaterialAttributeMap,ISceneMeshMaterialAttributeMap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMeshMaterialAttributeMap?> =
        arrayOfNulls<ISceneMeshMaterialAttributeMap_Impl>(size) as
        Array<ISceneMeshMaterialAttributeMap?>
  }
}
