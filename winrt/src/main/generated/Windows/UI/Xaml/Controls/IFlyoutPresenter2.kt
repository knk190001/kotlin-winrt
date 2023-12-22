package Windows.UI.Xaml.Controls

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

@ABIMarker(IFlyoutPresenter2.ABI::class)
@Signature("{4f857e92-36b4-5048-9051-a992b43e8a1d}")
@Guid("4f857e9236b450489051a992b43e8a1d")
@WinRTInterface("4f857e9236b450489051a992b43e8a1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenter2.ByReference::class)
public interface IFlyoutPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsDefaultShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenter2> {
    public override fun getValue() = ABI.makeIFlyoutPresenter2(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenter2 {
    public val __1414364929_Ptr: Pointer?

    public val _1414364929_VtblPtr: Pointer?
      get() = __1414364929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabled(): Boolean {
      val fnPtr = _1414364929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1414364929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDefaultShadowEnabled(value: Boolean): Unit {
      val fnPtr = _1414364929_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1414364929_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414364929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f857e9236b450489051a992b43e8a1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenter2(ptr: Pointer?): WithDefault = IFlyoutPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenter2 {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414364929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenter2): Array<IFlyoutPresenter2?> = (elements
        as Array<IFlyoutPresenter2?>).castToImpl<IFlyoutPresenter2,IFlyoutPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenter2?> =
        arrayOfNulls<IFlyoutPresenter2_Impl>(size) as Array<IFlyoutPresenter2?>
  }
}
