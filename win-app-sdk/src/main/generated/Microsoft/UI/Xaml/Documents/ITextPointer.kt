package Microsoft.UI.Xaml.Documents

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.FrameworkElement
import Windows.Foundation.Rect
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

@ABIMarker(ITextPointer.ABI::class)
@Signature("{842eb385-ee41-5930-979b-438fa7525a51}")
@Guid("842eb385ee415930979b438fa7525a51")
@WinRTInterface("842eb385ee415930979b438fa7525a51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextPointer.ByReference::class)
public interface ITextPointer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parent(): DependencyObject?

  @InterfaceMethod(1)
  public fun get_VisualParent(): FrameworkElement?

  @InterfaceMethod(2)
  public fun get_LogicalDirection(): LogicalDirection?

  @InterfaceMethod(3)
  public fun get_Offset(): Int

  @InterfaceMethod(4)
  public fun GetCharacterRect(direction: LogicalDirection?): Rect?

  @InterfaceMethod(5)
  public fun GetPositionAtOffset(offset: Int, direction: LogicalDirection?): TextPointer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextPointer> {
    public override fun getValue() = ABI.makeITextPointer(pointer.getPointer(0))

    public fun setValue(value: ITextPointer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextPointer {
    public val __1226047059_Ptr: Pointer?

    public val _1226047059_VtblPtr: Pointer?
      get() = __1226047059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parent(): DependencyObject? {
      val fnPtr = _1226047059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1226047059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VisualParent(): FrameworkElement? {
      val fnPtr = _1226047059_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FrameworkElement>()
      val hr = fn.invokeHR(arrayOf(__1226047059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FrameworkElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LogicalDirection(): LogicalDirection? {
      val fnPtr = _1226047059_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LogicalDirection>()
      val hr = fn.invokeHR(arrayOf(__1226047059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LogicalDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Offset(): Int {
      val fnPtr = _1226047059_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1226047059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetCharacterRect(direction: LogicalDirection?): Rect? {
      val fnPtr = _1226047059_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1226047059_Ptr, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetPositionAtOffset(offset: Int, direction: LogicalDirection?):
        TextPointer? {
      val fnPtr = _1226047059_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextPointer>()
      val hr = fn.invokeHR(arrayOf(__1226047059_Ptr, offset, marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextPointer>(result.getValue())
      return resultValue
    }
  }

  public class ITextPointer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1226047059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextPointer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("842eb385ee415930979b438fa7525a51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextPointer(ptr: Pointer?): WithDefault = ITextPointer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextPointer {
      val address = segment.toRawLongValue()
      return makeITextPointer(Pointer(address))
    }

    public override fun toNative(obj: ITextPointer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1226047059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextPointer): Array<ITextPointer?> = (elements as
        Array<ITextPointer?>).castToImpl<ITextPointer,ITextPointer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextPointer?> =
        arrayOfNulls<ITextPointer_Impl>(size) as Array<ITextPointer?>
  }
}
