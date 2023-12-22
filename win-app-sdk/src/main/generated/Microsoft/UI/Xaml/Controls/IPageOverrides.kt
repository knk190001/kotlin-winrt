package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Navigation.NavigatingCancelEventArgs
import Microsoft.UI.Xaml.Navigation.NavigationEventArgs
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

@ABIMarker(IPageOverrides.ABI::class)
@Signature("{9b8445f7-d938-5626-850a-86e91ca89e98}")
@Guid("9b8445f7d9385626850a86e91ca89e98")
@WinRTInterface("9b8445f7d9385626850a86e91ca89e98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPageOverrides.ByReference::class)
public interface IPageOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnNavigatedFrom(e: NavigationEventArgs?): Unit

  @InterfaceMethod(1)
  public fun OnNavigatedTo(e: NavigationEventArgs?): Unit

  @InterfaceMethod(2)
  public fun OnNavigatingFrom(e: NavigatingCancelEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPageOverrides>
      {
    public override fun getValue() = ABI.makeIPageOverrides(pointer.getPointer(0))

    public fun setValue(value: IPageOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPageOverrides {
    public val __961780209_Ptr: Pointer?

    public val _961780209_VtblPtr: Pointer?
      get() = __961780209_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnNavigatedFrom(e: NavigationEventArgs?): Unit {
      val fnPtr = _961780209_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__961780209_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnNavigatedTo(e: NavigationEventArgs?): Unit {
      val fnPtr = _961780209_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__961780209_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnNavigatingFrom(e: NavigatingCancelEventArgs?): Unit {
      val fnPtr = _961780209_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__961780209_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPageOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __961780209_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPageOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b8445f7d9385626850a86e91ca89e98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPageOverrides(ptr: Pointer?): WithDefault = IPageOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPageOverrides {
      val address = segment.toRawLongValue()
      return makeIPageOverrides(Pointer(address))
    }

    public override fun toNative(obj: IPageOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__961780209_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPageOverrides): Array<IPageOverrides?> = (elements as
        Array<IPageOverrides?>).castToImpl<IPageOverrides,IPageOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPageOverrides?> =
        arrayOfNulls<IPageOverrides_Impl>(size) as Array<IPageOverrides?>
  }
}
