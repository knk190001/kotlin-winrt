package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(ILoopingSelectorItem.ABI::class)
@Signature("{c69714b9-27c6-4433-9d7c-0dbfb2f4344f}")
@Guid("c69714b927c644339d7c0dbfb2f4344f")
@WinRTInterface("c69714b927c644339d7c0dbfb2f4344f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorItem.ByReference::class)
public interface ILoopingSelectorItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorItem> {
    public override fun getValue() = ABI.makeILoopingSelectorItem(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorItem {
    public val __1639764244_Ptr: Pointer?

    public val _1639764244_VtblPtr: Pointer?
      get() = __1639764244_Ptr?.getPointer(0)
  }

  public class ILoopingSelectorItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1639764244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c69714b927c644339d7c0dbfb2f4344f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorItem(ptr: Pointer?): WithDefault = ILoopingSelectorItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorItem {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorItem(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1639764244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorItem): Array<ILoopingSelectorItem?> =
        (elements as
        Array<ILoopingSelectorItem?>).castToImpl<ILoopingSelectorItem,ILoopingSelectorItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorItem?> =
        arrayOfNulls<ILoopingSelectorItem_Impl>(size) as Array<ILoopingSelectorItem?>
  }
}
