package Microsoft.UI.Xaml

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

@ABIMarker(IDispatcherTimerFactory.ABI::class)
@Signature("{1bcb3166-22e4-50bf-a5a2-b78ca4377bd0}")
@Guid("1bcb316622e450bfa5a2b78ca4377bd0")
@WinRTInterface("1bcb316622e450bfa5a2b78ca4377bd0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherTimerFactory.ByReference::class)
public interface IDispatcherTimerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DispatcherTimer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherTimerFactory> {
    public override fun getValue() = ABI.makeIDispatcherTimerFactory(pointer.getPointer(0))

    public fun setValue(value: IDispatcherTimerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherTimerFactory {
    public val __1267409069_Ptr: Pointer?

    public val _1267409069_VtblPtr: Pointer?
      get() = __1267409069_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DispatcherTimer? {
      val fnPtr = _1267409069_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherTimer>()
      val hr = fn.invokeHR(arrayOf(__1267409069_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherTimer>(result.getValue())
      return resultValue
    }
  }

  public class IDispatcherTimerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1267409069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherTimerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bcb316622e450bfa5a2b78ca4377bd0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherTimerFactory(ptr: Pointer?): WithDefault =
        IDispatcherTimerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDispatcherTimerFactory {
      val address = segment.toRawLongValue()
      return makeIDispatcherTimerFactory(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherTimerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1267409069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherTimerFactory): Array<IDispatcherTimerFactory?>
        = (elements as
        Array<IDispatcherTimerFactory?>).castToImpl<IDispatcherTimerFactory,IDispatcherTimerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherTimerFactory?> =
        arrayOfNulls<IDispatcherTimerFactory_Impl>(size) as Array<IDispatcherTimerFactory?>
  }
}
