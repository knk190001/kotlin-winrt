package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ISmartCardCryptogramGeneratorStatics.ABI::class)
@Signature("{09933910-cb9c-4015-967d-5234f3b02900}")
@Guid("09933910cb9c4015967d5234f3b02900")
@WinRTInterface("09933910cb9c4015967d5234f3b02900")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardCryptogramGeneratorStatics.ByReference::class)
public interface ISmartCardCryptogramGeneratorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSmartCardCryptogramGeneratorAsync(): IAsyncOperation<SmartCardCryptogramGenerator?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardCryptogramGeneratorStatics> {
    public override fun getValue() =
        ABI.makeISmartCardCryptogramGeneratorStatics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardCryptogramGeneratorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardCryptogramGeneratorStatics {
    public val __1277199888_Ptr: Pointer?

    public val _1277199888_VtblPtr: Pointer?
      get() = __1277199888_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSmartCardCryptogramGeneratorAsync():
        IAsyncOperation<SmartCardCryptogramGenerator?>? {
      val fnPtr = _1277199888_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardCryptogramGenerator?>>()
      val hr = fn.invokeHR(arrayOf(__1277199888_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardCryptogramGenerator?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardCryptogramGeneratorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1277199888_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardCryptogramGeneratorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09933910cb9c4015967d5234f3b02900")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardCryptogramGeneratorStatics(ptr: Pointer?): WithDefault =
        ISmartCardCryptogramGeneratorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardCryptogramGeneratorStatics {
      val address = segment.toRawLongValue()
      return makeISmartCardCryptogramGeneratorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardCryptogramGeneratorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1277199888_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardCryptogramGeneratorStatics):
        Array<ISmartCardCryptogramGeneratorStatics?> = (elements as
        Array<ISmartCardCryptogramGeneratorStatics?>).castToImpl<ISmartCardCryptogramGeneratorStatics,ISmartCardCryptogramGeneratorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardCryptogramGeneratorStatics?> =
        arrayOfNulls<ISmartCardCryptogramGeneratorStatics_Impl>(size) as
        Array<ISmartCardCryptogramGeneratorStatics?>
  }
}
