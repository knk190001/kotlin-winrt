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

@ABIMarker(IPasswordBoxStatics5.ABI::class)
@Signature("{4bdac1ac-6b42-55f3-bfa4-65c7235078d6}")
@Guid("4bdac1ac6b4255f3bfa465c7235078d6")
@WinRTInterface("4bdac1ac6b4255f3bfa465c7235078d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBoxStatics5.ByReference::class)
public interface IPasswordBoxStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanPasteClipboardContentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SelectionFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPasswordBoxStatics5> {
    public override fun getValue() = ABI.makeIPasswordBoxStatics5(pointer.getPointer(0))

    public fun setValue(value: IPasswordBoxStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBoxStatics5 {
    public val __73221316_Ptr: Pointer?

    public val _73221316_VtblPtr: Pointer?
      get() = __73221316_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanPasteClipboardContentProperty(): DependencyProperty? {
      val fnPtr = _73221316_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__73221316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectionFlyoutProperty(): DependencyProperty? {
      val fnPtr = _73221316_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__73221316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _73221316_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__73221316_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPasswordBoxStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __73221316_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBoxStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bdac1ac6b4255f3bfa465c7235078d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBoxStatics5(ptr: Pointer?): WithDefault = IPasswordBoxStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBoxStatics5 {
      val address = segment.toRawLongValue()
      return makeIPasswordBoxStatics5(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBoxStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__73221316_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBoxStatics5): Array<IPasswordBoxStatics5?> =
        (elements as
        Array<IPasswordBoxStatics5?>).castToImpl<IPasswordBoxStatics5,IPasswordBoxStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBoxStatics5?> =
        arrayOfNulls<IPasswordBoxStatics5_Impl>(size) as Array<IPasswordBoxStatics5?>
  }
}
