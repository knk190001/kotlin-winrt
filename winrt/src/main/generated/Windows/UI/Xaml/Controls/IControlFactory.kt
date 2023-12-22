package Windows.UI.Xaml.Controls

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

@ABIMarker(IControlFactory.ABI::class)
@Signature("{b12b1d5a-6419-4e16-b212-a45336b75778}")
@Guid("b12b1d5a64194e16b212a45336b75778")
@WinRTInterface("b12b1d5a64194e16b212a45336b75778")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlFactory.ByReference::class)
public interface IControlFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Control?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlFactory> {
    public override fun getValue() = ABI.makeIControlFactory(pointer.getPointer(0))

    public fun setValue(value: IControlFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlFactory {
    public val __1010502665_Ptr: Pointer?

    public val _1010502665_VtblPtr: Pointer?
      get() = __1010502665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Control? {
      val fnPtr = _1010502665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Control>()
      val hr = fn.invokeHR(arrayOf(__1010502665_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Control>(result.getValue())
      return resultValue
    }
  }

  public class IControlFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1010502665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b12b1d5a64194e16b212a45336b75778")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlFactory(ptr: Pointer?): WithDefault = IControlFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControlFactory {
      val address = segment.toRawLongValue()
      return makeIControlFactory(Pointer(address))
    }

    public override fun toNative(obj: IControlFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1010502665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlFactory): Array<IControlFactory?> = (elements as
        Array<IControlFactory?>).castToImpl<IControlFactory,IControlFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlFactory?> =
        arrayOfNulls<IControlFactory_Impl>(size) as Array<IControlFactory?>
  }
}
