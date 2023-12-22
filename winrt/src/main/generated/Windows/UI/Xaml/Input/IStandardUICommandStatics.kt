package Windows.UI.Xaml.Input

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

@ABIMarker(IStandardUICommandStatics.ABI::class)
@Signature("{7ea87ed9-2978-5533-9b2e-6759ce88569f}")
@Guid("7ea87ed9297855339b2e6759ce88569f")
@WinRTInterface("7ea87ed9297855339b2e6759ce88569f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardUICommandStatics.ByReference::class)
public interface IStandardUICommandStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KindProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardUICommandStatics> {
    public override fun getValue() = ABI.makeIStandardUICommandStatics(pointer.getPointer(0))

    public fun setValue(value: IStandardUICommandStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardUICommandStatics {
    public val __1759726401_Ptr: Pointer?

    public val _1759726401_VtblPtr: Pointer?
      get() = __1759726401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KindProperty(): DependencyProperty? {
      val fnPtr = _1759726401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1759726401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IStandardUICommandStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1759726401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardUICommandStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ea87ed9297855339b2e6759ce88569f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardUICommandStatics(ptr: Pointer?): WithDefault =
        IStandardUICommandStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardUICommandStatics {
      val address = segment.toRawLongValue()
      return makeIStandardUICommandStatics(Pointer(address))
    }

    public override fun toNative(obj: IStandardUICommandStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1759726401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardUICommandStatics):
        Array<IStandardUICommandStatics?> = (elements as
        Array<IStandardUICommandStatics?>).castToImpl<IStandardUICommandStatics,IStandardUICommandStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardUICommandStatics?> =
        arrayOfNulls<IStandardUICommandStatics_Impl>(size) as Array<IStandardUICommandStatics?>
  }
}
