package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandAntennaSar.ABI::class)
@Signature("{b9af4b7e-cbf9-4109-90be-5c06bfd513b6}")
@Guid("b9af4b7ecbf9410990be5c06bfd513b6")
@WinRTInterface("b9af4b7ecbf9410990be5c06bfd513b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAntennaSar.ByReference::class)
public interface IMobileBroadbandAntennaSar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AntennaIndex(): Int

  @InterfaceMethod(1)
  public fun get_SarBackoffIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAntennaSar> {
    public override fun getValue() = ABI.makeIMobileBroadbandAntennaSar(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAntennaSar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAntennaSar {
    public val __995160675_Ptr: Pointer?

    public val _995160675_VtblPtr: Pointer?
      get() = __995160675_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AntennaIndex(): Int {
      val fnPtr = _995160675_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__995160675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SarBackoffIndex(): Int {
      val fnPtr = _995160675_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__995160675_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IMobileBroadbandAntennaSar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __995160675_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAntennaSar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9af4b7ecbf9410990be5c06bfd513b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAntennaSar(ptr: Pointer?): WithDefault =
        IMobileBroadbandAntennaSar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAntennaSar {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAntennaSar(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAntennaSar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__995160675_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAntennaSar):
        Array<IMobileBroadbandAntennaSar?> = (elements as
        Array<IMobileBroadbandAntennaSar?>).castToImpl<IMobileBroadbandAntennaSar,IMobileBroadbandAntennaSar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAntennaSar?> =
        arrayOfNulls<IMobileBroadbandAntennaSar_Impl>(size) as Array<IMobileBroadbandAntennaSar?>
  }
}
