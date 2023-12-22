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

@ABIMarker(IPickerFlyoutBase.ABI::class)
@Signature("{e33574ea-1076-44d1-9383-dc24ac5cff2a}")
@Guid("e33574ea107644d19383dc24ac5cff2a")
@WinRTInterface("e33574ea107644d19383dc24ac5cff2a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutBase.ByReference::class)
public interface IPickerFlyoutBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutBase> {
    public override fun getValue() = ABI.makeIPickerFlyoutBase(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutBase {
    public val __1211003530_Ptr: Pointer?

    public val _1211003530_VtblPtr: Pointer?
      get() = __1211003530_Ptr?.getPointer(0)
  }

  public class IPickerFlyoutBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1211003530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e33574ea107644d19383dc24ac5cff2a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutBase(ptr: Pointer?): WithDefault = IPickerFlyoutBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutBase {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutBase(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1211003530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutBase): Array<IPickerFlyoutBase?> = (elements
        as Array<IPickerFlyoutBase?>).castToImpl<IPickerFlyoutBase,IPickerFlyoutBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutBase?> =
        arrayOfNulls<IPickerFlyoutBase_Impl>(size) as Array<IPickerFlyoutBase?>
  }
}
