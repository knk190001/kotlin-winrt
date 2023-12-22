package Microsoft.UI.Windowing

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

@ABIMarker(IAppWindowPresenter.ABI::class)
@Signature("{bc3042c2-c6c6-5632-8989-ff0ec6d3b40d}")
@Guid("bc3042c2c6c656328989ff0ec6d3b40d")
@WinRTInterface("bc3042c2c6c656328989ff0ec6d3b40d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowPresenter.ByReference::class)
public interface IAppWindowPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): AppWindowPresenterKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowPresenter> {
    public override fun getValue() = ABI.makeIAppWindowPresenter(pointer.getPointer(0))

    public fun setValue(value: IAppWindowPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowPresenter {
    public val __1149739704_Ptr: Pointer?

    public val _1149739704_VtblPtr: Pointer?
      get() = __1149739704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): AppWindowPresenterKind? {
      val fnPtr = _1149739704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowPresenterKind>()
      val hr = fn.invokeHR(arrayOf(__1149739704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowPresenterKind>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149739704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc3042c2c6c656328989ff0ec6d3b40d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowPresenter(ptr: Pointer?): WithDefault = IAppWindowPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowPresenter {
      val address = segment.toRawLongValue()
      return makeIAppWindowPresenter(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149739704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowPresenter): Array<IAppWindowPresenter?> =
        (elements as
        Array<IAppWindowPresenter?>).castToImpl<IAppWindowPresenter,IAppWindowPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowPresenter?> =
        arrayOfNulls<IAppWindowPresenter_Impl>(size) as Array<IAppWindowPresenter?>
  }
}
