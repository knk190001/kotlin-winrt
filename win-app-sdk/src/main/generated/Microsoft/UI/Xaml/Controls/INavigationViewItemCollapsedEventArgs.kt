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

@ABIMarker(INavigationViewItemCollapsedEventArgs.ABI::class)
@Signature("{b546f6a1-c66f-5ded-b5d7-bed0a26197e3}")
@Guid("b546f6a1c66f5dedb5d7bed0a26197e3")
@WinRTInterface("b546f6a1c66f5dedb5d7bed0a26197e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemCollapsedEventArgs.ByReference::class)
public interface INavigationViewItemCollapsedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CollapsedItemContainer(): NavigationViewItemBase?

  @InterfaceMethod(1)
  public fun get_CollapsedItem(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemCollapsedEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewItemCollapsedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemCollapsedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemCollapsedEventArgs {
    public val __272733453_Ptr: Pointer?

    public val _272733453_VtblPtr: Pointer?
      get() = __272733453_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CollapsedItemContainer(): NavigationViewItemBase? {
      val fnPtr = _272733453_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemBase>()
      val hr = fn.invokeHR(arrayOf(__272733453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItemBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CollapsedItem(): IUnknown? {
      val fnPtr = _272733453_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__272733453_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemCollapsedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __272733453_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemCollapsedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b546f6a1c66f5dedb5d7bed0a26197e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemCollapsedEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewItemCollapsedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemCollapsedEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemCollapsedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemCollapsedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__272733453_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemCollapsedEventArgs):
        Array<INavigationViewItemCollapsedEventArgs?> = (elements as
        Array<INavigationViewItemCollapsedEventArgs?>).castToImpl<INavigationViewItemCollapsedEventArgs,INavigationViewItemCollapsedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemCollapsedEventArgs?> =
        arrayOfNulls<INavigationViewItemCollapsedEventArgs_Impl>(size) as
        Array<INavigationViewItemCollapsedEventArgs?>
  }
}
