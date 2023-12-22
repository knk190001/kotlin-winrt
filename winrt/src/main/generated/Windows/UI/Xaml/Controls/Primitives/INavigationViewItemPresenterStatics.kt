package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(INavigationViewItemPresenterStatics.ABI::class)
@Signature("{52814604-cfc1-5ad5-a3aa-fa355be6bd76}")
@Guid("52814604cfc15ad5a3aafa355be6bd76")
@WinRTInterface("52814604cfc15ad5a3aafa355be6bd76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenterStatics.ByReference::class)
public interface INavigationViewItemPresenterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenterStatics> {
    public override fun getValue() =
        ABI.makeINavigationViewItemPresenterStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenterStatics {
    public val __449884549_Ptr: Pointer?

    public val _449884549_VtblPtr: Pointer?
      get() = __449884549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconProperty(): DependencyProperty? {
      val fnPtr = _449884549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__449884549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemPresenterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449884549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52814604cfc15ad5a3aafa355be6bd76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenterStatics(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemPresenterStatics {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenterStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449884549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenterStatics):
        Array<INavigationViewItemPresenterStatics?> = (elements as
        Array<INavigationViewItemPresenterStatics?>).castToImpl<INavigationViewItemPresenterStatics,INavigationViewItemPresenterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemPresenterStatics?> =
        arrayOfNulls<INavigationViewItemPresenterStatics_Impl>(size) as
        Array<INavigationViewItemPresenterStatics?>
  }
}
