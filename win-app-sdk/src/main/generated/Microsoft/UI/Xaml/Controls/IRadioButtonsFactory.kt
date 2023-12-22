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

@ABIMarker(IRadioButtonsFactory.ABI::class)
@Signature("{2cf95efb-a7a2-5d85-8ead-ea222baa3c55}")
@Guid("2cf95efba7a25d858eadea222baa3c55")
@WinRTInterface("2cf95efba7a25d858eadea222baa3c55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonsFactory.ByReference::class)
public interface IRadioButtonsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RadioButtons?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonsFactory> {
    public override fun getValue() = ABI.makeIRadioButtonsFactory(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonsFactory {
    public val __1375947261_Ptr: Pointer?

    public val _1375947261_VtblPtr: Pointer?
      get() = __1375947261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RadioButtons? {
      val fnPtr = _1375947261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadioButtons>()
      val hr = fn.invokeHR(arrayOf(__1375947261_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadioButtons>(result.getValue())
      return resultValue
    }
  }

  public class IRadioButtonsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1375947261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cf95efba7a25d858eadea222baa3c55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonsFactory(ptr: Pointer?): WithDefault = IRadioButtonsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonsFactory {
      val address = segment.toRawLongValue()
      return makeIRadioButtonsFactory(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1375947261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonsFactory): Array<IRadioButtonsFactory?> =
        (elements as
        Array<IRadioButtonsFactory?>).castToImpl<IRadioButtonsFactory,IRadioButtonsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonsFactory?> =
        arrayOfNulls<IRadioButtonsFactory_Impl>(size) as Array<IRadioButtonsFactory?>
  }
}
