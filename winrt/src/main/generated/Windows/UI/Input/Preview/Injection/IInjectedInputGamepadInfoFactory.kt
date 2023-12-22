package Windows.UI.Input.Preview.Injection

import Windows.Gaming.Input.GamepadReading
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

@ABIMarker(IInjectedInputGamepadInfoFactory.ABI::class)
@Signature("{59596876-6c39-4ec4-8b2a-29ef7de18aca}")
@Guid("595968766c394ec48b2a29ef7de18aca")
@WinRTInterface("595968766c394ec48b2a29ef7de18aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInjectedInputGamepadInfoFactory.ByReference::class)
public interface IInjectedInputGamepadInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(reading: GamepadReading?): InjectedInputGamepadInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInjectedInputGamepadInfoFactory> {
    public override fun getValue() = ABI.makeIInjectedInputGamepadInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IInjectedInputGamepadInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInjectedInputGamepadInfoFactory {
    public val __814486506_Ptr: Pointer?

    public val _814486506_VtblPtr: Pointer?
      get() = __814486506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(reading: GamepadReading?): InjectedInputGamepadInfo? {
      val fnPtr = _814486506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InjectedInputGamepadInfo>()
      val hr = fn.invokeHR(arrayOf(__814486506_Ptr, marshalToNative(reading), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InjectedInputGamepadInfo>(result.getValue())
      return resultValue
    }
  }

  public class IInjectedInputGamepadInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __814486506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInjectedInputGamepadInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("595968766c394ec48b2a29ef7de18aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInjectedInputGamepadInfoFactory(ptr: Pointer?): WithDefault =
        IInjectedInputGamepadInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInjectedInputGamepadInfoFactory {
      val address = segment.toRawLongValue()
      return makeIInjectedInputGamepadInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IInjectedInputGamepadInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__814486506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInjectedInputGamepadInfoFactory):
        Array<IInjectedInputGamepadInfoFactory?> = (elements as
        Array<IInjectedInputGamepadInfoFactory?>).castToImpl<IInjectedInputGamepadInfoFactory,IInjectedInputGamepadInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInjectedInputGamepadInfoFactory?> =
        arrayOfNulls<IInjectedInputGamepadInfoFactory_Impl>(size) as
        Array<IInjectedInputGamepadInfoFactory?>
  }
}
