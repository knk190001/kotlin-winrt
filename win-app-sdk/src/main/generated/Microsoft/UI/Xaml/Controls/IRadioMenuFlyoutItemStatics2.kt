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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadioMenuFlyoutItemStatics2.ABI::class)
@Signature("{2040ffbf-947f-58ed-969f-5d8d8967b9a0}")
@Guid("2040ffbf947f58ed969f5d8d8967b9a0")
@WinRTInterface("2040ffbf947f58ed969f5d8d8967b9a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioMenuFlyoutItemStatics2.ByReference::class)
public interface IRadioMenuFlyoutItemStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreCheckStatesEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun SetAreCheckStatesEnabled(`object`: MenuFlyoutSubItem?, value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetAreCheckStatesEnabled(`object`: MenuFlyoutSubItem?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioMenuFlyoutItemStatics2> {
    public override fun getValue() = ABI.makeIRadioMenuFlyoutItemStatics2(pointer.getPointer(0))

    public fun setValue(value: IRadioMenuFlyoutItemStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioMenuFlyoutItemStatics2 {
    public val __1436575154_Ptr: Pointer?

    public val _1436575154_VtblPtr: Pointer?
      get() = __1436575154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreCheckStatesEnabledProperty(): DependencyProperty? {
      val fnPtr = _1436575154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1436575154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetAreCheckStatesEnabled(`object`: MenuFlyoutSubItem?, value: Boolean):
        Unit {
      val fnPtr = _1436575154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1436575154_Ptr, marshalToNative(`object`), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetAreCheckStatesEnabled(`object`: MenuFlyoutSubItem?): Boolean {
      val fnPtr = _1436575154_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1436575154_Ptr, marshalToNative(`object`), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRadioMenuFlyoutItemStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1436575154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioMenuFlyoutItemStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2040ffbf947f58ed969f5d8d8967b9a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioMenuFlyoutItemStatics2(ptr: Pointer?): WithDefault =
        IRadioMenuFlyoutItemStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioMenuFlyoutItemStatics2 {
      val address = segment.toRawLongValue()
      return makeIRadioMenuFlyoutItemStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRadioMenuFlyoutItemStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1436575154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioMenuFlyoutItemStatics2):
        Array<IRadioMenuFlyoutItemStatics2?> = (elements as
        Array<IRadioMenuFlyoutItemStatics2?>).castToImpl<IRadioMenuFlyoutItemStatics2,IRadioMenuFlyoutItemStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioMenuFlyoutItemStatics2?> =
        arrayOfNulls<IRadioMenuFlyoutItemStatics2_Impl>(size) as
        Array<IRadioMenuFlyoutItemStatics2?>
  }
}
