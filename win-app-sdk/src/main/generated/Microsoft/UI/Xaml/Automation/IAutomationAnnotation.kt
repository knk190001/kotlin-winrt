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

@ABIMarker(IAutomationAnnotation.ABI::class)
@Signature("{c2cc46ad-1414-5f1b-808a-89e5d53d82fe}")
@Guid("c2cc46ad14145f1b808a89e5d53d82fe")
@WinRTInterface("c2cc46ad14145f1b808a89e5d53d82fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationAnnotation.ByReference::class)
public interface IAutomationAnnotation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): AnnotationType?

  @InterfaceMethod(1)
  public fun put_Type(value: AnnotationType?): Unit

  @InterfaceMethod(2)
  public fun get_Element(): UIElement?

  @InterfaceMethod(3)
  public fun put_Element(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationAnnotation> {
    public override fun getValue() = ABI.makeIAutomationAnnotation(pointer.getPointer(0))

    public fun setValue(value: IAutomationAnnotation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationAnnotation {
    public val __1391004884_Ptr: Pointer?

    public val _1391004884_VtblPtr: Pointer?
      get() = __1391004884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): AnnotationType? {
      val fnPtr = _1391004884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnnotationType>()
      val hr = fn.invokeHR(arrayOf(__1391004884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnnotationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: AnnotationType?): Unit {
      val fnPtr = _1391004884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391004884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Element(): UIElement? {
      val fnPtr = _1391004884_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1391004884_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Element(value: UIElement?): Unit {
      val fnPtr = _1391004884_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1391004884_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutomationAnnotation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1391004884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationAnnotation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2cc46ad14145f1b808a89e5d53d82fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationAnnotation(ptr: Pointer?): WithDefault =
        IAutomationAnnotation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationAnnotation {
      val address = segment.toRawLongValue()
      return makeIAutomationAnnotation(Pointer(address))
    }

    public override fun toNative(obj: IAutomationAnnotation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1391004884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationAnnotation): Array<IAutomationAnnotation?> =
        (elements as
        Array<IAutomationAnnotation?>).castToImpl<IAutomationAnnotation,IAutomationAnnotation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationAnnotation?> =
        arrayOfNulls<IAutomationAnnotation_Impl>(size) as Array<IAutomationAnnotation?>
  }
}
