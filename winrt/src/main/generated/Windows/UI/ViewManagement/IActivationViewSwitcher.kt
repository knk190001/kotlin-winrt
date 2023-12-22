package Windows.UI.ViewManagement

import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IActivationViewSwitcher.ABI::class)
@Signature("{dca71bb6-7350-492b-aac7-c8a13d7224ad}")
@Guid("dca71bb67350492baac7c8a13d7224ad")
@WinRTInterface("dca71bb67350492baac7c8a13d7224ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivationViewSwitcher.ByReference::class)
public interface IActivationViewSwitcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAsStandaloneAsync(viewId: Int): IAsyncAction?

  @InterfaceMethod(1)
  public fun ShowAsStandaloneAsync(viewId: Int, sizePreference: ViewSizePreference?): IAsyncAction?

  @InterfaceMethod(2)
  public fun IsViewPresentedOnActivationVirtualDesktop(viewId: Int): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationViewSwitcher> {
    public override fun getValue() = ABI.makeIActivationViewSwitcher(pointer.getPointer(0))

    public fun setValue(value: IActivationViewSwitcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationViewSwitcher {
    public val __647006702_Ptr: Pointer?

    public val _647006702_VtblPtr: Pointer?
      get() = __647006702_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAsStandaloneAsync(viewId: Int): IAsyncAction? {
      val fnPtr = _647006702_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__647006702_Ptr, viewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAsStandaloneAsync(viewId: Int, sizePreference: ViewSizePreference?):
        IAsyncAction? {
      val fnPtr = _647006702_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__647006702_Ptr, viewId, marshalToNative(sizePreference),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsViewPresentedOnActivationVirtualDesktop(viewId: Int): Boolean {
      val fnPtr = _647006702_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__647006702_Ptr, viewId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IActivationViewSwitcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __647006702_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationViewSwitcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dca71bb67350492baac7c8a13d7224ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationViewSwitcher(ptr: Pointer?): WithDefault =
        IActivationViewSwitcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivationViewSwitcher {
      val address = segment.toRawLongValue()
      return makeIActivationViewSwitcher(Pointer(address))
    }

    public override fun toNative(obj: IActivationViewSwitcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__647006702_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationViewSwitcher): Array<IActivationViewSwitcher?>
        = (elements as
        Array<IActivationViewSwitcher?>).castToImpl<IActivationViewSwitcher,IActivationViewSwitcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivationViewSwitcher?> =
        arrayOfNulls<IActivationViewSwitcher_Impl>(size) as Array<IActivationViewSwitcher?>
  }
}
