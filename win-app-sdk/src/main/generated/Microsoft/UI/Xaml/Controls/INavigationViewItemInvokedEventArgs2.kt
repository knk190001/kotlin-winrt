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

@ABIMarker(INavigationViewItemInvokedEventArgs2.ABI::class)
@Signature("{e1cbb99f-19eb-5c7b-b982-854bb08d5eb7}")
@Guid("e1cbb99f19eb5c7bb982854bb08d5eb7")
@WinRTInterface("e1cbb99f19eb5c7bb982854bb08d5eb7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemInvokedEventArgs2.ByReference::class)
public interface INavigationViewItemInvokedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InvokedItemContainer(): NavigationViewItemBase?

  @InterfaceMethod(1)
  public fun get_RecommendedNavigationTransitionInfo(): NavigationTransitionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemInvokedEventArgs2> {
    public override fun getValue() =
        ABI.makeINavigationViewItemInvokedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemInvokedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemInvokedEventArgs2 {
    public val __18322124_Ptr: Pointer?

    public val _18322124_VtblPtr: Pointer?
      get() = __18322124_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InvokedItemContainer(): NavigationViewItemBase? {
      val fnPtr = _18322124_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemBase>()
      val hr = fn.invokeHR(arrayOf(__18322124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RecommendedNavigationTransitionInfo(): NavigationTransitionInfo? {
      val fnPtr = _18322124_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationTransitionInfo>()
      val hr = fn.invokeHR(arrayOf(__18322124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationTransitionInfo>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemInvokedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __18322124_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemInvokedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1cbb99f19eb5c7bb982854bb08d5eb7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemInvokedEventArgs2(ptr: Pointer?): WithDefault =
        INavigationViewItemInvokedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemInvokedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemInvokedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemInvokedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__18322124_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemInvokedEventArgs2):
        Array<INavigationViewItemInvokedEventArgs2?> = (elements as
        Array<INavigationViewItemInvokedEventArgs2?>).castToImpl<INavigationViewItemInvokedEventArgs2,INavigationViewItemInvokedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemInvokedEventArgs2?> =
        arrayOfNulls<INavigationViewItemInvokedEventArgs2_Impl>(size) as
        Array<INavigationViewItemInvokedEventArgs2?>
  }
}
