package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.InfoBadge
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

@ABIMarker(INavigationViewItemPresenter2.ABI::class)
@Signature("{3f775730-3713-5b3b-9600-53b79fff2e35}")
@Guid("3f77573037135b3b960053b79fff2e35")
@WinRTInterface("3f77573037135b3b960053b79fff2e35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenter2.ByReference::class)
public interface INavigationViewItemPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfoBadge(): InfoBadge?

  @InterfaceMethod(1)
  public fun put_InfoBadge(value: InfoBadge?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenter2> {
    public override fun getValue() = ABI.makeINavigationViewItemPresenter2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenter2 {
    public val __47819257_Ptr: Pointer?

    public val _47819257_VtblPtr: Pointer?
      get() = __47819257_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfoBadge(): InfoBadge? {
      val fnPtr = _47819257_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBadge>()
      val hr = fn.invokeHR(arrayOf(__47819257_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBadge>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InfoBadge(value: InfoBadge?): Unit {
      val fnPtr = _47819257_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__47819257_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationViewItemPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47819257_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f77573037135b3b960053b79fff2e35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenter2(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemPresenter2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenter2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47819257_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenter2):
        Array<INavigationViewItemPresenter2?> = (elements as
        Array<INavigationViewItemPresenter2?>).castToImpl<INavigationViewItemPresenter2,INavigationViewItemPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemPresenter2?> =
        arrayOfNulls<INavigationViewItemPresenter2_Impl>(size) as
        Array<INavigationViewItemPresenter2?>
  }
}
