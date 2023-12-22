package Windows.ApplicationModel.Holographic

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

@ABIMarker(IHolographicKeyboardStatics.ABI::class)
@Signature("{b676c624-63d7-58cf-b06b-08baa032a23f}")
@Guid("b676c62463d758cfb06b08baa032a23f")
@WinRTInterface("b676c62463d758cfb06b08baa032a23f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicKeyboardStatics.ByReference::class)
public interface IHolographicKeyboardStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): HolographicKeyboard?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicKeyboardStatics> {
    public override fun getValue() = ABI.makeIHolographicKeyboardStatics(pointer.getPointer(0))

    public fun setValue(value: IHolographicKeyboardStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicKeyboardStatics {
    public val __889355787_Ptr: Pointer?

    public val _889355787_VtblPtr: Pointer?
      get() = __889355787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): HolographicKeyboard? {
      val fnPtr = _889355787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicKeyboard>()
      val hr = fn.invokeHR(arrayOf(__889355787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicKeyboard>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicKeyboardStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __889355787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicKeyboardStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b676c62463d758cfb06b08baa032a23f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicKeyboardStatics(ptr: Pointer?): WithDefault =
        IHolographicKeyboardStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicKeyboardStatics {
      val address = segment.toRawLongValue()
      return makeIHolographicKeyboardStatics(Pointer(address))
    }

    public override fun toNative(obj: IHolographicKeyboardStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__889355787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicKeyboardStatics):
        Array<IHolographicKeyboardStatics?> = (elements as
        Array<IHolographicKeyboardStatics?>).castToImpl<IHolographicKeyboardStatics,IHolographicKeyboardStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicKeyboardStatics?> =
        arrayOfNulls<IHolographicKeyboardStatics_Impl>(size) as Array<IHolographicKeyboardStatics?>
  }
}
