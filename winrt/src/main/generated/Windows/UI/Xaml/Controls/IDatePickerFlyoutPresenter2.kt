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

@ABIMarker(IDatePickerFlyoutPresenter2.ABI::class)
@Signature("{c5b2578f-96d8-55cc-97ee-3f88fc85e479}")
@Guid("c5b2578f96d855cc97ee3f88fc85e479")
@WinRTInterface("c5b2578f96d855cc97ee3f88fc85e479")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutPresenter2.ByReference::class)
public interface IDatePickerFlyoutPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsDefaultShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutPresenter2> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutPresenter2(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutPresenter2 {
    public val __501808643_Ptr: Pointer?

    public val _501808643_VtblPtr: Pointer?
      get() = __501808643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabled(): Boolean {
      val fnPtr = _501808643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__501808643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsDefaultShadowEnabled(value: Boolean): Unit {
      val fnPtr = _501808643_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__501808643_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatePickerFlyoutPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __501808643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5b2578f96d855cc97ee3f88fc85e479")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutPresenter2(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutPresenter2 {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__501808643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutPresenter2):
        Array<IDatePickerFlyoutPresenter2?> = (elements as
        Array<IDatePickerFlyoutPresenter2?>).castToImpl<IDatePickerFlyoutPresenter2,IDatePickerFlyoutPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutPresenter2?> =
        arrayOfNulls<IDatePickerFlyoutPresenter2_Impl>(size) as Array<IDatePickerFlyoutPresenter2?>
  }
}
