package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IAnnotatedScrollBarStatics.ABI::class)
@Signature("{daacd0f4-4912-5934-8d5b-f241c2e90e30}")
@Guid("daacd0f4491259348d5bf241c2e90e30")
@WinRTInterface("daacd0f4491259348d5bf241c2e90e30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotatedScrollBarStatics.ByReference::class)
public interface IAnnotatedScrollBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_LabelTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DetailLabelTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SmallChangeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotatedScrollBarStatics> {
    public override fun getValue() = ABI.makeIAnnotatedScrollBarStatics(pointer.getPointer(0))

    public fun setValue(value: IAnnotatedScrollBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotatedScrollBarStatics {
    public val __343338064_Ptr: Pointer?

    public val _343338064_VtblPtr: Pointer?
      get() = __343338064_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelsProperty(): DependencyProperty? {
      val fnPtr = _343338064_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__343338064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LabelTemplateProperty(): DependencyProperty? {
      val fnPtr = _343338064_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__343338064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DetailLabelTemplateProperty(): DependencyProperty? {
      val fnPtr = _343338064_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__343338064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SmallChangeProperty(): DependencyProperty? {
      val fnPtr = _343338064_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__343338064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAnnotatedScrollBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343338064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotatedScrollBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("daacd0f4491259348d5bf241c2e90e30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotatedScrollBarStatics(ptr: Pointer?): WithDefault =
        IAnnotatedScrollBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotatedScrollBarStatics {
      val address = segment.toRawLongValue()
      return makeIAnnotatedScrollBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnnotatedScrollBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343338064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotatedScrollBarStatics):
        Array<IAnnotatedScrollBarStatics?> = (elements as
        Array<IAnnotatedScrollBarStatics?>).castToImpl<IAnnotatedScrollBarStatics,IAnnotatedScrollBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotatedScrollBarStatics?> =
        arrayOfNulls<IAnnotatedScrollBarStatics_Impl>(size) as Array<IAnnotatedScrollBarStatics?>
  }
}
