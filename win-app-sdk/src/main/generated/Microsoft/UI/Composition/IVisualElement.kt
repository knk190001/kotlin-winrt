package Microsoft.UI.Composition

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

@ABIMarker(IVisualElement.ABI::class)
@Signature("{2180f1f5-b5d8-4bf6-920a-12006e63efef}")
@Guid("2180f1f5b5d84bf6920a12006e63efef")
@WinRTInterface("2180f1f5b5d84bf6920a12006e63efef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualElement.ByReference::class)
public interface IVisualElement : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisualElement>
      {
    public override fun getValue() = ABI.makeIVisualElement(pointer.getPointer(0))

    public fun setValue(value: IVisualElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualElement {
    public val __674729949_Ptr: Pointer?

    public val _674729949_VtblPtr: Pointer?
      get() = __674729949_Ptr?.getPointer(0)
  }

  public class IVisualElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __674729949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2180f1f5b5d84bf6920a12006e63efef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualElement(ptr: Pointer?): WithDefault = IVisualElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualElement {
      val address = segment.toRawLongValue()
      return makeIVisualElement(Pointer(address))
    }

    public override fun toNative(obj: IVisualElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__674729949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualElement): Array<IVisualElement?> = (elements as
        Array<IVisualElement?>).castToImpl<IVisualElement,IVisualElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualElement?> =
        arrayOfNulls<IVisualElement_Impl>(size) as Array<IVisualElement?>
  }
}
