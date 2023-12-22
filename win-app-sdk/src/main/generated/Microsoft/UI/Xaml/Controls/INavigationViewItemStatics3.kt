package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(INavigationViewItemStatics3.ABI::class)
@Signature("{957beb66-d33a-53aa-a518-7d426bb9b177}")
@Guid("957beb66d33a53aaa5187d426bb9b177")
@WinRTInterface("957beb66d33a53aaa5187d426bb9b177")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemStatics3.ByReference::class)
public interface INavigationViewItemStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfoBadgeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemStatics3> {
    public override fun getValue() = ABI.makeINavigationViewItemStatics3(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemStatics3 {
    public val __589893057_Ptr: Pointer?

    public val _589893057_VtblPtr: Pointer?
      get() = __589893057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfoBadgeProperty(): DependencyProperty? {
      val fnPtr = _589893057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__589893057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589893057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("957beb66d33a53aaa5187d426bb9b177")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemStatics3(ptr: Pointer?): WithDefault =
        INavigationViewItemStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemStatics3 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemStatics3(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589893057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemStatics3):
        Array<INavigationViewItemStatics3?> = (elements as
        Array<INavigationViewItemStatics3?>).castToImpl<INavigationViewItemStatics3,INavigationViewItemStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemStatics3?> =
        arrayOfNulls<INavigationViewItemStatics3_Impl>(size) as Array<INavigationViewItemStatics3?>
  }
}
