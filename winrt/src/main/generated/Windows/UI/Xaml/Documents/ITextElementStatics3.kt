package Windows.UI.Xaml.Documents

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

@ABIMarker(ITextElementStatics3.ABI::class)
@Signature("{cfefcfaf-0fa1-45ec-9a4e-9b33664dc8b1}")
@Guid("cfefcfaf0fa145ec9a4e9b33664dc8b1")
@WinRTInterface("cfefcfaf0fa145ec9a4e9b33664dc8b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElementStatics3.ByReference::class)
public interface ITextElementStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowFocusOnInteractionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_AccessKeyProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ExitDisplayModeOnAccessKeyInvokedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextElementStatics3> {
    public override fun getValue() = ABI.makeITextElementStatics3(pointer.getPointer(0))

    public fun setValue(value: ITextElementStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElementStatics3 {
    public val __1124852715_Ptr: Pointer?

    public val _1124852715_VtblPtr: Pointer?
      get() = __1124852715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowFocusOnInteractionProperty(): DependencyProperty? {
      val fnPtr = _1124852715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AccessKeyProperty(): DependencyProperty? {
      val fnPtr = _1124852715_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExitDisplayModeOnAccessKeyInvokedProperty(): DependencyProperty? {
      val fnPtr = _1124852715_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextElementStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1124852715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElementStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfefcfaf0fa145ec9a4e9b33664dc8b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElementStatics3(ptr: Pointer?): WithDefault = ITextElementStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElementStatics3 {
      val address = segment.toRawLongValue()
      return makeITextElementStatics3(Pointer(address))
    }

    public override fun toNative(obj: ITextElementStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1124852715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElementStatics3): Array<ITextElementStatics3?> =
        (elements as
        Array<ITextElementStatics3?>).castToImpl<ITextElementStatics3,ITextElementStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElementStatics3?> =
        arrayOfNulls<ITextElementStatics3_Impl>(size) as Array<ITextElementStatics3?>
  }
}
