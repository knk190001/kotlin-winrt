package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(INavigationViewItemStatics2.ABI::class)
@Signature("{f4f2f77c-54b4-541d-b747-3a96e9ff3d55}")
@Guid("f4f2f77c54b4541db7473a96e9ff3d55")
@WinRTInterface("f4f2f77c54b4541db7473a96e9ff3d55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemStatics2.ByReference::class)
public interface INavigationViewItemStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectsOnInvokedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemStatics2> {
    public override fun getValue() = ABI.makeINavigationViewItemStatics2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemStatics2 {
    public val __2062242859_Ptr: Pointer?

    public val _2062242859_VtblPtr: Pointer?
      get() = __2062242859_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectsOnInvokedProperty(): DependencyProperty? {
      val fnPtr = _2062242859_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2062242859_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2062242859_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f4f2f77c54b4541db7473a96e9ff3d55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemStatics2(ptr: Pointer?): WithDefault =
        INavigationViewItemStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemStatics2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemStatics2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2062242859_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemStatics2):
        Array<INavigationViewItemStatics2?> = (elements as
        Array<INavigationViewItemStatics2?>).castToImpl<INavigationViewItemStatics2,INavigationViewItemStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemStatics2?> =
        arrayOfNulls<INavigationViewItemStatics2_Impl>(size) as Array<INavigationViewItemStatics2?>
  }
}
