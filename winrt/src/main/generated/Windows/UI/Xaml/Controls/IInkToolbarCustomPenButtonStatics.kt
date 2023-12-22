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

@ABIMarker(IInkToolbarCustomPenButtonStatics.ABI::class)
@Signature("{373c25f4-e555-4e85-a80d-da6b8433dbde}")
@Guid("373c25f4e5554e85a80dda6b8433dbde")
@WinRTInterface("373c25f4e5554e85a80dda6b8433dbde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomPenButtonStatics.ByReference::class)
public interface IInkToolbarCustomPenButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CustomPenProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ConfigurationContentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomPenButtonStatics> {
    public override fun getValue() =
        ABI.makeIInkToolbarCustomPenButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomPenButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomPenButtonStatics {
    public val __238690212_Ptr: Pointer?

    public val _238690212_VtblPtr: Pointer?
      get() = __238690212_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CustomPenProperty(): DependencyProperty? {
      val fnPtr = _238690212_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__238690212_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConfigurationContentProperty(): DependencyProperty? {
      val fnPtr = _238690212_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__238690212_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarCustomPenButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __238690212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomPenButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("373c25f4e5554e85a80dda6b8433dbde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomPenButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarCustomPenButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomPenButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomPenButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomPenButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__238690212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomPenButtonStatics):
        Array<IInkToolbarCustomPenButtonStatics?> = (elements as
        Array<IInkToolbarCustomPenButtonStatics?>).castToImpl<IInkToolbarCustomPenButtonStatics,IInkToolbarCustomPenButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomPenButtonStatics?> =
        arrayOfNulls<IInkToolbarCustomPenButtonStatics_Impl>(size) as
        Array<IInkToolbarCustomPenButtonStatics?>
  }
}
