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

@ABIMarker(IItemCollectionTransitionCompletedEventArgs.ABI::class)
@Signature("{b43ca4f6-7ae5-576f-b74d-ec70b1c58488}")
@Guid("b43ca4f67ae5576fb74dec70b1c58488")
@WinRTInterface("b43ca4f67ae5576fb74dec70b1c58488")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemCollectionTransitionCompletedEventArgs.ByReference::class)
public interface IItemCollectionTransitionCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Transition(): ItemCollectionTransition?

  @InterfaceMethod(1)
  public fun get_Element(): UIElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemCollectionTransitionCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIItemCollectionTransitionCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IItemCollectionTransitionCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemCollectionTransitionCompletedEventArgs {
    public val __824920455_Ptr: Pointer?

    public val _824920455_VtblPtr: Pointer?
      get() = __824920455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Transition(): ItemCollectionTransition? {
      val fnPtr = _824920455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ItemCollectionTransition>()
      val hr = fn.invokeHR(arrayOf(__824920455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ItemCollectionTransition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Element(): UIElement? {
      val fnPtr = _824920455_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__824920455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }
  }

  public class IItemCollectionTransitionCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __824920455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemCollectionTransitionCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b43ca4f67ae5576fb74dec70b1c58488")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemCollectionTransitionCompletedEventArgs(ptr: Pointer?): WithDefault =
        IItemCollectionTransitionCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IItemCollectionTransitionCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIItemCollectionTransitionCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IItemCollectionTransitionCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__824920455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemCollectionTransitionCompletedEventArgs):
        Array<IItemCollectionTransitionCompletedEventArgs?> = (elements as
        Array<IItemCollectionTransitionCompletedEventArgs?>).castToImpl<IItemCollectionTransitionCompletedEventArgs,IItemCollectionTransitionCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemCollectionTransitionCompletedEventArgs?> =
        arrayOfNulls<IItemCollectionTransitionCompletedEventArgs_Impl>(size) as
        Array<IItemCollectionTransitionCompletedEventArgs?>
  }
}
