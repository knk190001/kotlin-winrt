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

@ABIMarker(INavigationViewItemStatics.ABI::class)
@Signature("{7b6198e5-0714-531c-a056-21b3ca40ec1a}")
@Guid("7b6198e50714531ca05621b3ca40ec1a")
@WinRTInterface("7b6198e50714531ca05621b3ca40ec1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemStatics.ByReference::class)
public interface INavigationViewItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CompactPaneLengthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemStatics> {
    public override fun getValue() = ABI.makeINavigationViewItemStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemStatics {
    public val __673707854_Ptr: Pointer?

    public val _673707854_VtblPtr: Pointer?
      get() = __673707854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconProperty(): DependencyProperty? {
      val fnPtr = _673707854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__673707854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CompactPaneLengthProperty(): DependencyProperty? {
      val fnPtr = _673707854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__673707854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __673707854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b6198e50714531ca05621b3ca40ec1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemStatics(ptr: Pointer?): WithDefault =
        INavigationViewItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemStatics {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__673707854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemStatics):
        Array<INavigationViewItemStatics?> = (elements as
        Array<INavigationViewItemStatics?>).castToImpl<INavigationViewItemStatics,INavigationViewItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemStatics?> =
        arrayOfNulls<INavigationViewItemStatics_Impl>(size) as Array<INavigationViewItemStatics?>
  }
}
