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

@ABIMarker(IAutoSuggestBoxStatics.ABI::class)
@Signature("{ee22c7f4-c15d-4ff3-8a94-f50dfdfbe89a}")
@Guid("ee22c7f4c15d4ff38a94f50dfdfbe89a")
@WinRTInterface("ee22c7f4c15d4ff38a94f50dfdfbe89a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxStatics.ByReference::class)
public interface IAutoSuggestBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxSuggestionListHeightProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsSuggestionListOpenProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TextMemberPathProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_UpdateTextOnSelectProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_AutoMaximizeSuggestionAreaProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_TextBoxStyleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxStatics> {
    public override fun getValue() = ABI.makeIAutoSuggestBoxStatics(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxStatics {
    public val __318957971_Ptr: Pointer?

    public val _318957971_VtblPtr: Pointer?
      get() = __318957971_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxSuggestionListHeightProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSuggestionListOpenProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TextMemberPathProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_UpdateTextOnSelectProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AutoMaximizeSuggestionAreaProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TextBoxStyleProperty(): DependencyProperty? {
      val fnPtr = _318957971_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__318957971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAutoSuggestBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __318957971_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee22c7f4c15d4ff38a94f50dfdfbe89a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxStatics(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxStatics {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__318957971_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxStatics): Array<IAutoSuggestBoxStatics?> =
        (elements as
        Array<IAutoSuggestBoxStatics?>).castToImpl<IAutoSuggestBoxStatics,IAutoSuggestBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxStatics?> =
        arrayOfNulls<IAutoSuggestBoxStatics_Impl>(size) as Array<IAutoSuggestBoxStatics?>
  }
}
