package Windows.UI.Xaml.Data

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

@ABIMarker(IBindingBase.ABI::class)
@Signature("{1589a2ab-3d15-49bc-a447-8a5448e58870}")
@Guid("1589a2ab3d1549bca4478a5448e58870")
@WinRTInterface("1589a2ab3d1549bca4478a5448e58870")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingBase.ByReference::class)
public interface IBindingBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBindingBase> {
    public override fun getValue() = ABI.makeIBindingBase(pointer.getPointer(0))

    public fun setValue(value: IBindingBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingBase {
    public val __942303182_Ptr: Pointer?

    public val _942303182_VtblPtr: Pointer?
      get() = __942303182_Ptr?.getPointer(0)
  }

  public class IBindingBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __942303182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1589a2ab3d1549bca4478a5448e58870")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingBase(ptr: Pointer?): WithDefault = IBindingBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingBase {
      val address = segment.toRawLongValue()
      return makeIBindingBase(Pointer(address))
    }

    public override fun toNative(obj: IBindingBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__942303182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingBase): Array<IBindingBase?> = (elements as
        Array<IBindingBase?>).castToImpl<IBindingBase,IBindingBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingBase?> =
        arrayOfNulls<IBindingBase_Impl>(size) as Array<IBindingBase?>
  }
}
