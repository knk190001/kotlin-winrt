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

@ABIMarker(ITextBoxStatics.ABI::class)
@Signature("{7e37f4fb-a4bc-4625-8838-8eb2a9091283}")
@Guid("7e37f4fba4bc462588388eb2a9091283")
@WinRTInterface("7e37f4fba4bc462588388eb2a9091283")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxStatics.ByReference::class)
public interface ITextBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MaxLengthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsReadOnlyProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AcceptsReturnProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TextAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_TextWrappingProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_IsSpellCheckEnabledProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_IsTextPredictionEnabledProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_InputScopeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxStatics> {
    public override fun getValue() = ABI.makeITextBoxStatics(pointer.getPointer(0))

    public fun setValue(value: ITextBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxStatics {
    public val __412178339_Ptr: Pointer?

    public val _412178339_VtblPtr: Pointer?
      get() = __412178339_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxLengthProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsReadOnlyProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AcceptsReturnProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TextWrappingProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsSpellCheckEnabledProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_IsTextPredictionEnabledProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_InputScopeProperty(): DependencyProperty? {
      val fnPtr = _412178339_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__412178339_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __412178339_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e37f4fba4bc462588388eb2a9091283")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxStatics(ptr: Pointer?): WithDefault = ITextBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxStatics {
      val address = segment.toRawLongValue()
      return makeITextBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__412178339_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxStatics): Array<ITextBoxStatics?> = (elements as
        Array<ITextBoxStatics?>).castToImpl<ITextBoxStatics,ITextBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxStatics?> =
        arrayOfNulls<ITextBoxStatics_Impl>(size) as Array<ITextBoxStatics?>
  }
}
