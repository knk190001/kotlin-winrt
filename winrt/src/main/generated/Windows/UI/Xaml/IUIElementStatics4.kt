package Windows.UI.Xaml

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

@ABIMarker(IUIElementStatics4.ABI::class)
@Signature("{1d157d61-16af-411f-b774-272375a4ac2c}")
@Guid("1d157d6116af411fb774272375a4ac2c")
@WinRTInterface("1d157d6116af411fb774272375a4ac2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementStatics4.ByReference::class)
public interface IUIElementStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContextFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ExitDisplayModeOnAccessKeyInvokedProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsAccessKeyScopeProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AccessKeyScopeOwnerProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_AccessKeyProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementStatics4> {
    public override fun getValue() = ABI.makeIUIElementStatics4(pointer.getPointer(0))

    public fun setValue(value: IUIElementStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementStatics4 {
    public val __1915643131_Ptr: Pointer?

    public val _1915643131_VtblPtr: Pointer?
      get() = __1915643131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContextFlyoutProperty(): DependencyProperty? {
      val fnPtr = _1915643131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExitDisplayModeOnAccessKeyInvokedProperty(): DependencyProperty? {
      val fnPtr = _1915643131_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsAccessKeyScopeProperty(): DependencyProperty? {
      val fnPtr = _1915643131_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AccessKeyScopeOwnerProperty(): DependencyProperty? {
      val fnPtr = _1915643131_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AccessKeyProperty(): DependencyProperty? {
      val fnPtr = _1915643131_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1915643131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUIElementStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1915643131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d157d6116af411fb774272375a4ac2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementStatics4(ptr: Pointer?): WithDefault = IUIElementStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementStatics4 {
      val address = segment.toRawLongValue()
      return makeIUIElementStatics4(Pointer(address))
    }

    public override fun toNative(obj: IUIElementStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1915643131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementStatics4): Array<IUIElementStatics4?> =
        (elements as
        Array<IUIElementStatics4?>).castToImpl<IUIElementStatics4,IUIElementStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementStatics4?> =
        arrayOfNulls<IUIElementStatics4_Impl>(size) as Array<IUIElementStatics4?>
  }
}
