package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.AnnotationType
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpreadsheetItemProvider.ABI::class)
@Signature("{ebde8f92-6015-4826-b719-47521a81c67e}")
@Guid("ebde8f9260154826b71947521a81c67e")
@WinRTInterface("ebde8f9260154826b71947521a81c67e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpreadsheetItemProvider.ByReference::class)
public interface ISpreadsheetItemProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Formula(): String?

  @InterfaceMethod(1)
  public fun GetAnnotationObjects(): Array<IRawElementProviderSimple?>?

  @InterfaceMethod(2)
  public fun GetAnnotationTypes(): Array<AnnotationType?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpreadsheetItemProvider> {
    public override fun getValue() = ABI.makeISpreadsheetItemProvider(pointer.getPointer(0))

    public fun setValue(value: ISpreadsheetItemProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpreadsheetItemProvider {
    public val __880126968_Ptr: Pointer?

    public val _880126968_VtblPtr: Pointer?
      get() = __880126968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Formula(): String? {
      val fnPtr = _880126968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__880126968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAnnotationObjects(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _880126968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__880126968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAnnotationTypes(): Array<AnnotationType?>? {
      val fnPtr = _880126968_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<AnnotationType>()
      val hr = fn.invokeHR(arrayOf(__880126968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class ISpreadsheetItemProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __880126968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpreadsheetItemProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebde8f9260154826b71947521a81c67e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpreadsheetItemProvider(ptr: Pointer?): WithDefault =
        ISpreadsheetItemProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpreadsheetItemProvider {
      val address = segment.toRawLongValue()
      return makeISpreadsheetItemProvider(Pointer(address))
    }

    public override fun toNative(obj: ISpreadsheetItemProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__880126968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpreadsheetItemProvider):
        Array<ISpreadsheetItemProvider?> = (elements as
        Array<ISpreadsheetItemProvider?>).castToImpl<ISpreadsheetItemProvider,ISpreadsheetItemProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpreadsheetItemProvider?> =
        arrayOfNulls<ISpreadsheetItemProvider_Impl>(size) as Array<ISpreadsheetItemProvider?>
  }
}
