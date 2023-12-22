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

@ABIMarker(ITimePickerFlyoutPresenter2.ABI::class)
@Signature("{a13b5b68-7ee9-59f7-aad6-6532a8a8c3bf}")
@Guid("a13b5b687ee959f7aad66532a8a8c3bf")
@WinRTInterface("a13b5b687ee959f7aad66532a8a8c3bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerFlyoutPresenter2.ByReference::class)
public interface ITimePickerFlyoutPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsDefaultShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerFlyoutPresenter2> {
    public override fun getValue() = ABI.makeITimePickerFlyoutPresenter2(pointer.getPointer(0))

    public fun setValue(value: ITimePickerFlyoutPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerFlyoutPresenter2 {
    public val __1025749980_Ptr: Pointer?

    public val _1025749980_VtblPtr: Pointer?
      get() = __1025749980_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabled(): Boolean {
      val fnPtr = _1025749980_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1025749980_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDefaultShadowEnabled(value: Boolean): Unit {
      val fnPtr = _1025749980_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1025749980_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITimePickerFlyoutPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1025749980_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerFlyoutPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a13b5b687ee959f7aad66532a8a8c3bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerFlyoutPresenter2(ptr: Pointer?): WithDefault =
        ITimePickerFlyoutPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerFlyoutPresenter2 {
      val address = segment.toRawLongValue()
      return makeITimePickerFlyoutPresenter2(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerFlyoutPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1025749980_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerFlyoutPresenter2):
        Array<ITimePickerFlyoutPresenter2?> = (elements as
        Array<ITimePickerFlyoutPresenter2?>).castToImpl<ITimePickerFlyoutPresenter2,ITimePickerFlyoutPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerFlyoutPresenter2?> =
        arrayOfNulls<ITimePickerFlyoutPresenter2_Impl>(size) as Array<ITimePickerFlyoutPresenter2?>
  }
}
