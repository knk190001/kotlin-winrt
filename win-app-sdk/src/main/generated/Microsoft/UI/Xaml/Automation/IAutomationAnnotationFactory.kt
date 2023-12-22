package Microsoft.UI.Xaml.Automation

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IAutomationAnnotationFactory.ABI::class)
@Signature("{95f82773-eac5-572e-87de-24d9514b9a89}")
@Guid("95f82773eac5572e87de24d9514b9a89")
@WinRTInterface("95f82773eac5572e87de24d9514b9a89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationAnnotationFactory.ByReference::class)
public interface IAutomationAnnotationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(type: AnnotationType?): AutomationAnnotation?

  @InterfaceMethod(1)
  public fun CreateWithElementParameter(type: AnnotationType?, element: UIElement?):
      AutomationAnnotation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationAnnotationFactory> {
    public override fun getValue() = ABI.makeIAutomationAnnotationFactory(pointer.getPointer(0))

    public fun setValue(value: IAutomationAnnotationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationAnnotationFactory {
    public val __1217997886_Ptr: Pointer?

    public val _1217997886_VtblPtr: Pointer?
      get() = __1217997886_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(type: AnnotationType?): AutomationAnnotation? {
      val fnPtr = _1217997886_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationAnnotation>()
      val hr = fn.invokeHR(arrayOf(__1217997886_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationAnnotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithElementParameter(type: AnnotationType?, element: UIElement?):
        AutomationAnnotation? {
      val fnPtr = _1217997886_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationAnnotation>()
      val hr = fn.invokeHR(arrayOf(__1217997886_Ptr, marshalToNative(type),
          marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationAnnotation>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationAnnotationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1217997886_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationAnnotationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95f82773eac5572e87de24d9514b9a89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationAnnotationFactory(ptr: Pointer?): WithDefault =
        IAutomationAnnotationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationAnnotationFactory {
      val address = segment.toRawLongValue()
      return makeIAutomationAnnotationFactory(Pointer(address))
    }

    public override fun toNative(obj: IAutomationAnnotationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1217997886_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationAnnotationFactory):
        Array<IAutomationAnnotationFactory?> = (elements as
        Array<IAutomationAnnotationFactory?>).castToImpl<IAutomationAnnotationFactory,IAutomationAnnotationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationAnnotationFactory?> =
        arrayOfNulls<IAutomationAnnotationFactory_Impl>(size) as
        Array<IAutomationAnnotationFactory?>
  }
}
