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

@ABIMarker(ITabViewTabCloseRequestedEventArgs.ABI::class)
@Signature("{d56ab9b2-e264-5c7e-a1cb-e41a16a6c6c6}")
@Guid("d56ab9b2e2645c7ea1cbe41a16a6c6c6")
@WinRTInterface("d56ab9b2e2645c7ea1cbe41a16a6c6c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewTabCloseRequestedEventArgs.ByReference::class)
public interface ITabViewTabCloseRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(1)
  public fun get_Tab(): TabViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewTabCloseRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeITabViewTabCloseRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITabViewTabCloseRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewTabCloseRequestedEventArgs {
    public val __1639730719_Ptr: Pointer?

    public val _1639730719_VtblPtr: Pointer?
      get() = __1639730719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _1639730719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1639730719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Tab(): TabViewItem? {
      val fnPtr = _1639730719_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewItem>()
      val hr = fn.invokeHR(arrayOf(__1639730719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewItem>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewTabCloseRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1639730719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewTabCloseRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d56ab9b2e2645c7ea1cbe41a16a6c6c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewTabCloseRequestedEventArgs(ptr: Pointer?): WithDefault =
        ITabViewTabCloseRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewTabCloseRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeITabViewTabCloseRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITabViewTabCloseRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1639730719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewTabCloseRequestedEventArgs):
        Array<ITabViewTabCloseRequestedEventArgs?> = (elements as
        Array<ITabViewTabCloseRequestedEventArgs?>).castToImpl<ITabViewTabCloseRequestedEventArgs,ITabViewTabCloseRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewTabCloseRequestedEventArgs?> =
        arrayOfNulls<ITabViewTabCloseRequestedEventArgs_Impl>(size) as
        Array<ITabViewTabCloseRequestedEventArgs?>
  }
}
