package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ISnapPointBase.ABI::class)
@Signature("{14ed1089-fb97-5211-8c45-c352cd8b96a1}")
@Guid("14ed1089fb9752118c45c352cd8b96a1")
@WinRTInterface("14ed1089fb9752118c45c352cd8b96a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISnapPointBase.ByReference::class)
public interface ISnapPointBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISnapPointBase>
      {
    public override fun getValue() = ABI.makeISnapPointBase(pointer.getPointer(0))

    public fun setValue(value: ISnapPointBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISnapPointBase {
    public val __1283094310_Ptr: Pointer?

    public val _1283094310_VtblPtr: Pointer?
      get() = __1283094310_Ptr?.getPointer(0)
  }

  public class ISnapPointBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1283094310_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISnapPointBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("14ed1089fb9752118c45c352cd8b96a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISnapPointBase(ptr: Pointer?): WithDefault = ISnapPointBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISnapPointBase {
      val address = segment.toRawLongValue()
      return makeISnapPointBase(Pointer(address))
    }

    public override fun toNative(obj: ISnapPointBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1283094310_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISnapPointBase): Array<ISnapPointBase?> = (elements as
        Array<ISnapPointBase?>).castToImpl<ISnapPointBase,ISnapPointBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISnapPointBase?> =
        arrayOfNulls<ISnapPointBase_Impl>(size) as Array<ISnapPointBase?>
  }
}
