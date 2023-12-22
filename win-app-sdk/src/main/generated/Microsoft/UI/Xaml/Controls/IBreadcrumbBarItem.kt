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

@ABIMarker(IBreadcrumbBarItem.ABI::class)
@Signature("{34582de4-6bef-5ba0-86ca-7cc1a3db37ee}")
@Guid("34582de46bef5ba086ca7cc1a3db37ee")
@WinRTInterface("34582de46bef5ba086ca7cc1a3db37ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBarItem.ByReference::class)
public interface IBreadcrumbBarItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBreadcrumbBarItem> {
    public override fun getValue() = ABI.makeIBreadcrumbBarItem(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBarItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBarItem {
    public val __929844900_Ptr: Pointer?

    public val _929844900_VtblPtr: Pointer?
      get() = __929844900_Ptr?.getPointer(0)
  }

  public class IBreadcrumbBarItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __929844900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBarItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34582de46bef5ba086ca7cc1a3db37ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBarItem(ptr: Pointer?): WithDefault = IBreadcrumbBarItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBreadcrumbBarItem {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBarItem(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBarItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__929844900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBarItem): Array<IBreadcrumbBarItem?> =
        (elements as
        Array<IBreadcrumbBarItem?>).castToImpl<IBreadcrumbBarItem,IBreadcrumbBarItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBarItem?> =
        arrayOfNulls<IBreadcrumbBarItem_Impl>(size) as Array<IBreadcrumbBarItem?>
  }
}
