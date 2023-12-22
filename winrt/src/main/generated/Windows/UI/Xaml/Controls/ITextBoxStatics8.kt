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

@ABIMarker(ITextBoxStatics8.ABI::class)
@Signature("{7f93d7c4-7d88-5f4d-8955-a5ad3848bcb6}")
@Guid("7f93d7c47d885f4d8955a5ad3848bcb6")
@WinRTInterface("7f93d7c47d885f4d8955a5ad3848bcb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxStatics8.ByReference::class)
public interface ITextBoxStatics8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanPasteClipboardContentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CanUndoProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CanRedoProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SelectionFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ProofingMenuFlyoutProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_DescriptionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxStatics8> {
    public override fun getValue() = ABI.makeITextBoxStatics8(pointer.getPointer(0))

    public fun setValue(value: ITextBoxStatics8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxStatics8 {
    public val __107373323_Ptr: Pointer?

    public val _107373323_VtblPtr: Pointer?
      get() = __107373323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanPasteClipboardContentProperty(): DependencyProperty? {
      val fnPtr = _107373323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanUndoProperty(): DependencyProperty? {
      val fnPtr = _107373323_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanRedoProperty(): DependencyProperty? {
      val fnPtr = _107373323_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SelectionFlyoutProperty(): DependencyProperty? {
      val fnPtr = _107373323_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ProofingMenuFlyoutProperty(): DependencyProperty? {
      val fnPtr = _107373323_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DescriptionProperty(): DependencyProperty? {
      val fnPtr = _107373323_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373323_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxStatics8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __107373323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxStatics8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f93d7c47d885f4d8955a5ad3848bcb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxStatics8(ptr: Pointer?): WithDefault = ITextBoxStatics8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxStatics8 {
      val address = segment.toRawLongValue()
      return makeITextBoxStatics8(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxStatics8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__107373323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxStatics8): Array<ITextBoxStatics8?> = (elements as
        Array<ITextBoxStatics8?>).castToImpl<ITextBoxStatics8,ITextBoxStatics8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxStatics8?> =
        arrayOfNulls<ITextBoxStatics8_Impl>(size) as Array<ITextBoxStatics8?>
  }
}
