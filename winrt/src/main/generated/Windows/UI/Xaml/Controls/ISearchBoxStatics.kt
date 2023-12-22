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

@ABIMarker(ISearchBoxStatics.ABI::class)
@Signature("{b123634f-6871-48cd-92df-4cff22459082}")
@Guid("b123634f687148cd92df4cff22459082")
@WinRTInterface("b123634f687148cd92df4cff22459082")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxStatics.ByReference::class)
public interface ISearchBoxStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SearchHistoryEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SearchHistoryContextProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PlaceholderTextProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_QueryTextProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FocusOnKeyboardInputProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ChooseSuggestionOnEnterProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxStatics> {
    public override fun getValue() = ABI.makeISearchBoxStatics(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxStatics {
    public val __2042821794_Ptr: Pointer?

    public val _2042821794_VtblPtr: Pointer?
      get() = __2042821794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SearchHistoryEnabledProperty(): DependencyProperty? {
      val fnPtr = _2042821794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042821794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SearchHistoryContextProperty(): DependencyProperty? {
      val fnPtr = _2042821794_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042821794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlaceholderTextProperty(): DependencyProperty? {
      val fnPtr = _2042821794_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042821794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_QueryTextProperty(): DependencyProperty? {
      val fnPtr = _2042821794_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042821794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FocusOnKeyboardInputProperty(): DependencyProperty? {
      val fnPtr = _2042821794_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042821794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ChooseSuggestionOnEnterProperty(): DependencyProperty? {
      val fnPtr = _2042821794_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042821794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISearchBoxStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042821794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b123634f687148cd92df4cff22459082")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxStatics(ptr: Pointer?): WithDefault = ISearchBoxStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBoxStatics {
      val address = segment.toRawLongValue()
      return makeISearchBoxStatics(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042821794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxStatics): Array<ISearchBoxStatics?> = (elements
        as Array<ISearchBoxStatics?>).castToImpl<ISearchBoxStatics,ISearchBoxStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxStatics?> =
        arrayOfNulls<ISearchBoxStatics_Impl>(size) as Array<ISearchBoxStatics?>
  }
}
