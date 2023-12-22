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

@ABIMarker(IItemsRepeaterElementIndexChangedEventArgs.ABI::class)
@Signature("{38e3d613-48fb-5906-bf18-f7130301fcc3}")
@Guid("38e3d61348fb5906bf18f7130301fcc3")
@WinRTInterface("38e3d61348fb5906bf18f7130301fcc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsRepeaterElementIndexChangedEventArgs.ByReference::class)
public interface IItemsRepeaterElementIndexChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Element(): UIElement?

  @InterfaceMethod(1)
  public fun get_OldIndex(): Int

  @InterfaceMethod(2)
  public fun get_NewIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsRepeaterElementIndexChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIItemsRepeaterElementIndexChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemsRepeaterElementIndexChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsRepeaterElementIndexChangedEventArgs {
    public val __2116558022_Ptr: Pointer?

    public val _2116558022_VtblPtr: Pointer?
      get() = __2116558022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Element(): UIElement? {
      val fnPtr = _2116558022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__2116558022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OldIndex(): Int {
      val fnPtr = _2116558022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116558022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_NewIndex(): Int {
      val fnPtr = _2116558022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2116558022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IItemsRepeaterElementIndexChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2116558022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsRepeaterElementIndexChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38e3d61348fb5906bf18f7130301fcc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsRepeaterElementIndexChangedEventArgs(ptr: Pointer?): WithDefault =
        IItemsRepeaterElementIndexChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IItemsRepeaterElementIndexChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemsRepeaterElementIndexChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemsRepeaterElementIndexChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2116558022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsRepeaterElementIndexChangedEventArgs):
        Array<IItemsRepeaterElementIndexChangedEventArgs?> = (elements as
        Array<IItemsRepeaterElementIndexChangedEventArgs?>).castToImpl<IItemsRepeaterElementIndexChangedEventArgs,IItemsRepeaterElementIndexChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsRepeaterElementIndexChangedEventArgs?> =
        arrayOfNulls<IItemsRepeaterElementIndexChangedEventArgs_Impl>(size) as
        Array<IItemsRepeaterElementIndexChangedEventArgs?>
  }
}
