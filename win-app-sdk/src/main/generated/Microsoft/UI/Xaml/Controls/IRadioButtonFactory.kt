package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRadioButtonFactory.ABI::class)
@Signature("{5772c79a-b3eb-5719-8005-2a513429495a}")
@Guid("5772c79ab3eb571980052a513429495a")
@WinRTInterface("5772c79ab3eb571980052a513429495a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonFactory.ByReference::class)
public interface IRadioButtonFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RadioButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonFactory> {
    public override fun getValue() = ABI.makeIRadioButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonFactory {
    public val __47596732_Ptr: Pointer?

    public val _47596732_VtblPtr: Pointer?
      get() = __47596732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RadioButton? {
      val fnPtr = _47596732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioButton>()
      val hr = fn.invokeHR(arrayOf(__47596732_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioButton>(result.getValue())
      return resultValue
    }
  }

  public class IRadioButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47596732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5772c79ab3eb571980052a513429495a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonFactory(ptr: Pointer?): WithDefault = IRadioButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonFactory {
      val address = segment.toRawLongValue()
      return makeIRadioButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47596732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonFactory): Array<IRadioButtonFactory?> =
        (elements as
        Array<IRadioButtonFactory?>).castToImpl<IRadioButtonFactory,IRadioButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonFactory?> =
        arrayOfNulls<IRadioButtonFactory_Impl>(size) as Array<IRadioButtonFactory?>
  }
}
