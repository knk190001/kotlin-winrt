package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITreeViewDragItemsCompletedEventArgs2.ABI::class)
@Signature("{060d3921-57a0-5bc5-be26-320bd9c1a6e8}")
@Guid("060d392157a05bc5be26320bd9c1a6e8")
@WinRTInterface("060d392157a05bc5be26320bd9c1a6e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewDragItemsCompletedEventArgs2.ByReference::class)
public interface ITreeViewDragItemsCompletedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewParentItem(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewDragItemsCompletedEventArgs2> {
    public override fun getValue() =
        ABI.makeITreeViewDragItemsCompletedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ITreeViewDragItemsCompletedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewDragItemsCompletedEventArgs2 {
    public val __1593192932_Ptr: Pointer?

    public val _1593192932_VtblPtr: Pointer?
      get() = __1593192932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewParentItem(): IUnknown? {
      val fnPtr = _1593192932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1593192932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewDragItemsCompletedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1593192932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewDragItemsCompletedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("060d392157a05bc5be26320bd9c1a6e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewDragItemsCompletedEventArgs2(ptr: Pointer?): WithDefault =
        ITreeViewDragItemsCompletedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewDragItemsCompletedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeITreeViewDragItemsCompletedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewDragItemsCompletedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1593192932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewDragItemsCompletedEventArgs2):
        Array<ITreeViewDragItemsCompletedEventArgs2?> = (elements as
        Array<ITreeViewDragItemsCompletedEventArgs2?>).castToImpl<ITreeViewDragItemsCompletedEventArgs2,ITreeViewDragItemsCompletedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewDragItemsCompletedEventArgs2?> =
        arrayOfNulls<ITreeViewDragItemsCompletedEventArgs2_Impl>(size) as
        Array<ITreeViewDragItemsCompletedEventArgs2?>
  }
}
