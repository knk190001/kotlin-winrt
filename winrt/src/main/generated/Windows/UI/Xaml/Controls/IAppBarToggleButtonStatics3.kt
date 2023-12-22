package Windows.UI.Xaml.Controls

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

@ABIMarker(IAppBarToggleButtonStatics3.ABI::class)
@Signature("{bd4c65bf-2edd-44d1-acd5-35c00e2f21bc}")
@Guid("bd4c65bf2edd44d1acd535c00e2f21bc")
@WinRTInterface("bd4c65bf2edd44d1acd535c00e2f21bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButtonStatics3.ByReference::class)
public interface IAppBarToggleButtonStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelPositionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsInOverflowProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DynamicOverflowOrderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButtonStatics3> {
    public override fun getValue() = ABI.makeIAppBarToggleButtonStatics3(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButtonStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButtonStatics3 {
    public val __795215550_Ptr: Pointer?

    public val _795215550_VtblPtr: Pointer?
      get() = __795215550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelPositionProperty(): DependencyProperty? {
      val fnPtr = _795215550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__795215550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsInOverflowProperty(): DependencyProperty? {
      val fnPtr = _795215550_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__795215550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DynamicOverflowOrderProperty(): DependencyProperty? {
      val fnPtr = _795215550_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__795215550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButtonStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __795215550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButtonStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd4c65bf2edd44d1acd535c00e2f21bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButtonStatics3(ptr: Pointer?): WithDefault =
        IAppBarToggleButtonStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButtonStatics3 {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButtonStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButtonStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__795215550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButtonStatics3):
        Array<IAppBarToggleButtonStatics3?> = (elements as
        Array<IAppBarToggleButtonStatics3?>).castToImpl<IAppBarToggleButtonStatics3,IAppBarToggleButtonStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButtonStatics3?> =
        arrayOfNulls<IAppBarToggleButtonStatics3_Impl>(size) as Array<IAppBarToggleButtonStatics3?>
  }
}
