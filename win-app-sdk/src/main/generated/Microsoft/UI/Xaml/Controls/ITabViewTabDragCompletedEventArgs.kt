package Microsoft.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ITabViewTabDragCompletedEventArgs.ABI::class)
@Signature("{791fc623-c8f6-5102-81bd-1869cde82284}")
@Guid("791fc623c8f6510281bd1869cde82284")
@WinRTInterface("791fc623c8f6510281bd1869cde82284")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewTabDragCompletedEventArgs.ByReference::class)
public interface ITabViewTabDragCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropResult(): DataPackageOperation?

  @InterfaceMethod(1)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(2)
  public fun get_Tab(): TabViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewTabDragCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeITabViewTabDragCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITabViewTabDragCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewTabDragCompletedEventArgs {
    public val __1025092066_Ptr: Pointer?

    public val _1025092066_VtblPtr: Pointer?
      get() = __1025092066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropResult(): DataPackageOperation? {
      val fnPtr = _1025092066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__1025092066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _1025092066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1025092066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Tab(): TabViewItem? {
      val fnPtr = _1025092066_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewItem>()
      val hr = fn.invokeHR(arrayOf(__1025092066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewItem>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewTabDragCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1025092066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewTabDragCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("791fc623c8f6510281bd1869cde82284")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewTabDragCompletedEventArgs(ptr: Pointer?): WithDefault =
        ITabViewTabDragCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewTabDragCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeITabViewTabDragCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITabViewTabDragCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1025092066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewTabDragCompletedEventArgs):
        Array<ITabViewTabDragCompletedEventArgs?> = (elements as
        Array<ITabViewTabDragCompletedEventArgs?>).castToImpl<ITabViewTabDragCompletedEventArgs,ITabViewTabDragCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewTabDragCompletedEventArgs?> =
        arrayOfNulls<ITabViewTabDragCompletedEventArgs_Impl>(size) as
        Array<ITabViewTabDragCompletedEventArgs?>
  }
}
