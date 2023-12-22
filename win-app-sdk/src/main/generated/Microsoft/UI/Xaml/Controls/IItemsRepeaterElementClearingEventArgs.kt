package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IItemsRepeaterElementClearingEventArgs.ABI::class)
@Signature("{8f394a59-07c6-54ce-80d1-bb0b71daefa0}")
@Guid("8f394a5907c654ce80d1bb0b71daefa0")
@WinRTInterface("8f394a5907c654ce80d1bb0b71daefa0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterElementClearingEventArgs.ByReference::class)
public interface IItemsRepeaterElementClearingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Element(): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterElementClearingEventArgs> {
    public override fun getValue() =
        ABI.makeIItemsRepeaterElementClearingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterElementClearingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterElementClearingEventArgs {
    public val __1794863577_Ptr: Pointer?

    public val _1794863577_VtblPtr: Pointer?
      get() = __1794863577_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Element(): UIElement? {
      val fnPtr = _1794863577_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1794863577_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IItemsRepeaterElementClearingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794863577_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterElementClearingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f394a5907c654ce80d1bb0b71daefa0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterElementClearingEventArgs(ptr: Pointer?): WithDefault =
        IItemsRepeaterElementClearingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeaterElementClearingEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterElementClearingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterElementClearingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794863577_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterElementClearingEventArgs):
        Array<IItemsRepeaterElementClearingEventArgs?> = (elements as
        Array<IItemsRepeaterElementClearingEventArgs?>).castToImpl<IItemsRepeaterElementClearingEventArgs,IItemsRepeaterElementClearingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterElementClearingEventArgs?> =
        arrayOfNulls<IItemsRepeaterElementClearingEventArgs_Impl>(size) as
        Array<IItemsRepeaterElementClearingEventArgs?>
  }
}
