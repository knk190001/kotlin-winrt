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

@ABIMarker(IHubFactory.ABI::class)
@Signature("{dca6b2ba-c6f5-4961-9953-c51873db5424}")
@Guid("dca6b2bac6f549619953c51873db5424")
@WinRTInterface("dca6b2bac6f549619953c51873db5424")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubFactory.ByReference::class)
public interface IHubFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Hub?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHubFactory> {
    public override fun getValue() = ABI.makeIHubFactory(pointer.getPointer(0))

    public fun setValue(value: IHubFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubFactory {
    public val __1934454927_Ptr: Pointer?

    public val _1934454927_VtblPtr: Pointer?
      get() = __1934454927_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Hub? {
      val fnPtr = _1934454927_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Hub>()
      val hr = fn.invokeHR(arrayOf(__1934454927_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Hub>(result.getValue())
      return resultValue
    }
  }

  public class IHubFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1934454927_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dca6b2bac6f549619953c51873db5424")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubFactory(ptr: Pointer?): WithDefault = IHubFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubFactory {
      val address = segment.toRawLongValue()
      return makeIHubFactory(Pointer(address))
    }

    public override fun toNative(obj: IHubFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1934454927_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubFactory): Array<IHubFactory?> = (elements as
        Array<IHubFactory?>).castToImpl<IHubFactory,IHubFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubFactory?> =
        arrayOfNulls<IHubFactory_Impl>(size) as Array<IHubFactory?>
  }
}
