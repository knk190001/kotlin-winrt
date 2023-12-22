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

@ABIMarker(IRadioButtonStatics.ABI::class)
@Signature("{a8bce4d4-68fe-53d9-a317-74ab409cd4ee}")
@Guid("a8bce4d468fe53d9a31774ab409cd4ee")
@WinRTInterface("a8bce4d468fe53d9a31774ab409cd4ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioButtonStatics.ByReference::class)
public interface IRadioButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GroupNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioButtonStatics> {
    public override fun getValue() = ABI.makeIRadioButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IRadioButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioButtonStatics {
    public val __852850177_Ptr: Pointer?

    public val _852850177_VtblPtr: Pointer?
      get() = __852850177_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GroupNameProperty(): DependencyProperty? {
      val fnPtr = _852850177_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__852850177_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRadioButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __852850177_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8bce4d468fe53d9a31774ab409cd4ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioButtonStatics(ptr: Pointer?): WithDefault = IRadioButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioButtonStatics {
      val address = segment.toRawLongValue()
      return makeIRadioButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadioButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__852850177_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioButtonStatics): Array<IRadioButtonStatics?> =
        (elements as
        Array<IRadioButtonStatics?>).castToImpl<IRadioButtonStatics,IRadioButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioButtonStatics?> =
        arrayOfNulls<IRadioButtonStatics_Impl>(size) as Array<IRadioButtonStatics?>
  }
}
