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

@ABIMarker(INavigationViewItemExpandingEventArgs.ABI::class)
@Signature("{6f0941be-e991-52f8-8315-f08389497976}")
@Guid("6f0941bee99152f88315f08389497976")
@WinRTInterface("6f0941bee99152f88315f08389497976")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemExpandingEventArgs.ByReference::class)
public interface INavigationViewItemExpandingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpandingItemContainer(): NavigationViewItemBase?

  @InterfaceMethod(1)
  public fun get_ExpandingItem(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemExpandingEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewItemExpandingEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemExpandingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemExpandingEventArgs {
    public val __248117602_Ptr: Pointer?

    public val _248117602_VtblPtr: Pointer?
      get() = __248117602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpandingItemContainer(): NavigationViewItemBase? {
      val fnPtr = _248117602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemBase>()
      val hr = fn.invokeHR(arrayOf(__248117602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExpandingItem(): IUnknown? {
      val fnPtr = _248117602_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__248117602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemExpandingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __248117602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemExpandingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f0941bee99152f88315f08389497976")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemExpandingEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewItemExpandingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemExpandingEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemExpandingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemExpandingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__248117602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemExpandingEventArgs):
        Array<INavigationViewItemExpandingEventArgs?> = (elements as
        Array<INavigationViewItemExpandingEventArgs?>).castToImpl<INavigationViewItemExpandingEventArgs,INavigationViewItemExpandingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemExpandingEventArgs?> =
        arrayOfNulls<INavigationViewItemExpandingEventArgs_Impl>(size) as
        Array<INavigationViewItemExpandingEventArgs?>
  }
}
