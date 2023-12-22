package Windows.UI.Core

import Windows.UI.Composition.IVisualElement
import Windows.UI.Composition.Visual
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

@ABIMarker(ICoreIndependentInputSourceControllerStatics.ABI::class)
@Signature("{3edc4e20-9a8a-5691-8586-fca4cb57526d}")
@Guid("3edc4e209a8a56918586fca4cb57526d")
@WinRTInterface("3edc4e209a8a56918586fca4cb57526d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreIndependentInputSourceControllerStatics.ByReference::class)
public interface ICoreIndependentInputSourceControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForVisual(visual: Visual?): CoreIndependentInputSourceController?

  @InterfaceMethod(1)
  public fun CreateForIVisualElement(visualElement: IVisualElement?):
      CoreIndependentInputSourceController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreIndependentInputSourceControllerStatics> {
    public override fun getValue() =
        ABI.makeICoreIndependentInputSourceControllerStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreIndependentInputSourceControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreIndependentInputSourceControllerStatics {
    public val __269497404_Ptr: Pointer?

    public val _269497404_VtblPtr: Pointer?
      get() = __269497404_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForVisual(visual: Visual?): CoreIndependentInputSourceController? {
      val fnPtr = _269497404_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreIndependentInputSourceController>()
      val hr = fn.invokeHR(arrayOf(__269497404_Ptr, marshalToNative(visual), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreIndependentInputSourceController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateForIVisualElement(visualElement: IVisualElement?):
        CoreIndependentInputSourceController? {
      val fnPtr = _269497404_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreIndependentInputSourceController>()
      val hr = fn.invokeHR(arrayOf(__269497404_Ptr, marshalToNative(visualElement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreIndependentInputSourceController>(result.getValue())
      return resultValue
    }
  }

  public class ICoreIndependentInputSourceControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __269497404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreIndependentInputSourceControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3edc4e209a8a56918586fca4cb57526d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreIndependentInputSourceControllerStatics(ptr: Pointer?): WithDefault =
        ICoreIndependentInputSourceControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreIndependentInputSourceControllerStatics {
      val address = segment.toRawLongValue()
      return makeICoreIndependentInputSourceControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreIndependentInputSourceControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__269497404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreIndependentInputSourceControllerStatics):
        Array<ICoreIndependentInputSourceControllerStatics?> = (elements as
        Array<ICoreIndependentInputSourceControllerStatics?>).castToImpl<ICoreIndependentInputSourceControllerStatics,ICoreIndependentInputSourceControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreIndependentInputSourceControllerStatics?> =
        arrayOfNulls<ICoreIndependentInputSourceControllerStatics_Impl>(size) as
        Array<ICoreIndependentInputSourceControllerStatics?>
  }
}
