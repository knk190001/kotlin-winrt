package Microsoft.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ITreeViewDragItemsCompletedEventArgs.ABI::class)
@Signature("{e5b8547e-f839-55db-9c26-2a95f57a60dc}")
@Guid("e5b8547ef83955db9c262a95f57a60dc")
@WinRTInterface("e5b8547ef83955db9c262a95f57a60dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewDragItemsCompletedEventArgs.ByReference::class)
public interface ITreeViewDragItemsCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropResult(): DataPackageOperation?

  @InterfaceMethod(1)
  public fun get_Items(): IVectorView<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewDragItemsCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeITreeViewDragItemsCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITreeViewDragItemsCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewDragItemsCompletedEventArgs {
    public val __779890674_Ptr: Pointer?

    public val _779890674_VtblPtr: Pointer?
      get() = __779890674_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropResult(): DataPackageOperation? {
      val fnPtr = _779890674_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackageOperation>()
      val hr = fn.invokeHR(arrayOf(__779890674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackageOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Items(): IVectorView<IUnknown?>? {
      val fnPtr = _779890674_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__779890674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewDragItemsCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __779890674_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewDragItemsCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5b8547ef83955db9c262a95f57a60dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewDragItemsCompletedEventArgs(ptr: Pointer?): WithDefault =
        ITreeViewDragItemsCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewDragItemsCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeITreeViewDragItemsCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewDragItemsCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__779890674_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewDragItemsCompletedEventArgs):
        Array<ITreeViewDragItemsCompletedEventArgs?> = (elements as
        Array<ITreeViewDragItemsCompletedEventArgs?>).castToImpl<ITreeViewDragItemsCompletedEventArgs,ITreeViewDragItemsCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewDragItemsCompletedEventArgs?> =
        arrayOfNulls<ITreeViewDragItemsCompletedEventArgs_Impl>(size) as
        Array<ITreeViewDragItemsCompletedEventArgs?>
  }
}
