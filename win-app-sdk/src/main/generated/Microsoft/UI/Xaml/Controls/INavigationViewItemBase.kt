package Microsoft.UI.Xaml.Controls

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

@ABIMarker(INavigationViewItemBase.ABI::class)
@Signature("{33586494-af48-513f-be4d-f645e8c89005}")
@Guid("33586494af48513fbe4df645e8c89005")
@WinRTInterface("33586494af48513fbe4df645e8c89005")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemBase.ByReference::class)
public interface INavigationViewItemBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemBase> {
    public override fun getValue() = ABI.makeINavigationViewItemBase(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemBase {
    public val __786993916_Ptr: Pointer?

    public val _786993916_VtblPtr: Pointer?
      get() = __786993916_Ptr?.getPointer(0)
  }

  public class INavigationViewItemBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __786993916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33586494af48513fbe4df645e8c89005")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemBase(ptr: Pointer?): WithDefault =
        INavigationViewItemBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemBase {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemBase(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__786993916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemBase): Array<INavigationViewItemBase?>
        = (elements as
        Array<INavigationViewItemBase?>).castToImpl<INavigationViewItemBase,INavigationViewItemBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemBase?> =
        arrayOfNulls<INavigationViewItemBase_Impl>(size) as Array<INavigationViewItemBase?>
  }
}
