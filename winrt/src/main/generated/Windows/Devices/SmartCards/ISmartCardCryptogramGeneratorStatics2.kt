package Windows.Devices.SmartCards

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardCryptogramGeneratorStatics2.ABI::class)
@Signature("{09bdf5e5-b4bd-4e23-a588-74469204c128}")
@Guid("09bdf5e5b4bd4e23a58874469204c128")
@WinRTInterface("09bdf5e5b4bd4e23a58874469204c128")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramGeneratorStatics2.ByReference::class)
public interface ISmartCardCryptogramGeneratorStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramGeneratorStatics2> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramGeneratorStatics2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramGeneratorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramGeneratorStatics2 {
    public val __938490814_Ptr: Pointer?

    public val _938490814_VtblPtr: Pointer?
      get() = __938490814_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _938490814_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__938490814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmartCardCryptogramGeneratorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __938490814_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramGeneratorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09bdf5e5b4bd4e23a58874469204c128")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramGeneratorStatics2(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramGeneratorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardCryptogramGeneratorStatics2 {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramGeneratorStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramGeneratorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__938490814_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramGeneratorStatics2):
        Array<ISmartCardCryptogramGeneratorStatics2?> = (elements as
        Array<ISmartCardCryptogramGeneratorStatics2?>).castToImpl<ISmartCardCryptogramGeneratorStatics2,ISmartCardCryptogramGeneratorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramGeneratorStatics2?> =
        arrayOfNulls<ISmartCardCryptogramGeneratorStatics2_Impl>(size) as
        Array<ISmartCardCryptogramGeneratorStatics2?>
  }
}
