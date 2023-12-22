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

@ABIMarker(IItemsRepeaterElementPreparedEventArgs.ABI::class)
@Signature("{612db572-c2e7-58fc-948a-b7dc0e1fc13a}")
@Guid("612db572c2e758fc948ab7dc0e1fc13a")
@WinRTInterface("612db572c2e758fc948ab7dc0e1fc13a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterElementPreparedEventArgs.ByReference::class)
public interface IItemsRepeaterElementPreparedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Element(): UIElement?

  @InterfaceMethod(1)
  public fun get_Index(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterElementPreparedEventArgs> {
    public override fun getValue() =
        ABI.makeIItemsRepeaterElementPreparedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterElementPreparedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterElementPreparedEventArgs {
    public val __2001494689_Ptr: Pointer?

    public val _2001494689_VtblPtr: Pointer?
      get() = __2001494689_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Element(): UIElement? {
      val fnPtr = _2001494689_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__2001494689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Index(): Int {
      val fnPtr = _2001494689_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2001494689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IItemsRepeaterElementPreparedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2001494689_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterElementPreparedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("612db572c2e758fc948ab7dc0e1fc13a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterElementPreparedEventArgs(ptr: Pointer?): WithDefault =
        IItemsRepeaterElementPreparedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsRepeaterElementPreparedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterElementPreparedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterElementPreparedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2001494689_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterElementPreparedEventArgs):
        Array<IItemsRepeaterElementPreparedEventArgs?> = (elements as
        Array<IItemsRepeaterElementPreparedEventArgs?>).castToImpl<IItemsRepeaterElementPreparedEventArgs,IItemsRepeaterElementPreparedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterElementPreparedEventArgs?> =
        arrayOfNulls<IItemsRepeaterElementPreparedEventArgs_Impl>(size) as
        Array<IItemsRepeaterElementPreparedEventArgs?>
  }
}
