package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.Animation.NavigationTransitionInfo
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

@ABIMarker(INavigationViewSelectionChangedEventArgs2.ABI::class)
@Signature("{e9b5191f-1ad1-5366-bc1a-90b96076d49e}")
@Guid("e9b5191f1ad15366bc1a90b96076d49e")
@WinRTInterface("e9b5191f1ad15366bc1a90b96076d49e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewSelectionChangedEventArgs2.ByReference::class)
public interface INavigationViewSelectionChangedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedItemContainer(): NavigationViewItemBase?

  @InterfaceMethod(1)
  public fun get_RecommendedNavigationTransitionInfo(): NavigationTransitionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewSelectionChangedEventArgs2> {
    public override fun getValue() =
        ABI.makeINavigationViewSelectionChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewSelectionChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewSelectionChangedEventArgs2 {
    public val __1837340323_Ptr: Pointer?

    public val _1837340323_VtblPtr: Pointer?
      get() = __1837340323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItemContainer(): NavigationViewItemBase? {
      val fnPtr = _1837340323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemBase>()
      val hr = fn.invokeHR(arrayOf(__1837340323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RecommendedNavigationTransitionInfo(): NavigationTransitionInfo? {
      val fnPtr = _1837340323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__1837340323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewSelectionChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1837340323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewSelectionChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9b5191f1ad15366bc1a90b96076d49e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewSelectionChangedEventArgs2(ptr: Pointer?): WithDefault =
        INavigationViewSelectionChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewSelectionChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewSelectionChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewSelectionChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1837340323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewSelectionChangedEventArgs2):
        Array<INavigationViewSelectionChangedEventArgs2?> = (elements as
        Array<INavigationViewSelectionChangedEventArgs2?>).castToImpl<INavigationViewSelectionChangedEventArgs2,INavigationViewSelectionChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewSelectionChangedEventArgs2?> =
        arrayOfNulls<INavigationViewSelectionChangedEventArgs2_Impl>(size) as
        Array<INavigationViewSelectionChangedEventArgs2?>
  }
}
