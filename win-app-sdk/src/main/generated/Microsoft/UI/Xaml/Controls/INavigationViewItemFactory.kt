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

@ABIMarker(INavigationViewItemFactory.ABI::class)
@Signature("{de60a001-9385-5535-80e1-2b68f4bfde26}")
@Guid("de60a0019385553580e12b68f4bfde26")
@WinRTInterface("de60a0019385553580e12b68f4bfde26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemFactory.ByReference::class)
public interface INavigationViewItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NavigationViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemFactory> {
    public override fun getValue() = ABI.makeINavigationViewItemFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemFactory {
    public val __131545591_Ptr: Pointer?

    public val _131545591_VtblPtr: Pointer?
      get() = __131545591_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NavigationViewItem? {
      val fnPtr = _131545591_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItem>()
      val hr = fn.invokeHR(arrayOf(__131545591_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewItem>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __131545591_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de60a0019385553580e12b68f4bfde26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemFactory(ptr: Pointer?): WithDefault =
        INavigationViewItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__131545591_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemFactory):
        Array<INavigationViewItemFactory?> = (elements as
        Array<INavigationViewItemFactory?>).castToImpl<INavigationViewItemFactory,INavigationViewItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemFactory?> =
        arrayOfNulls<INavigationViewItemFactory_Impl>(size) as Array<INavigationViewItemFactory?>
  }
}
