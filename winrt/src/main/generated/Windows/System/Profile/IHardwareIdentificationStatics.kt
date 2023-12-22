package Windows.System.Profile

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IHardwareIdentificationStatics.ABI::class)
@Signature("{971260e0-f170-4a42-bd55-a900b212dae2}")
@Guid("971260e0f1704a42bd55a900b212dae2")
@WinRTInterface("971260e0f1704a42bd55a900b212dae2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHardwareIdentificationStatics.ByReference::class)
public interface IHardwareIdentificationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPackageSpecificToken(nonce: IBuffer?): HardwareToken?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHardwareIdentificationStatics> {
    public override fun getValue() = ABI.makeIHardwareIdentificationStatics(pointer.getPointer(0))

    public fun setValue(value: IHardwareIdentificationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHardwareIdentificationStatics {
    public val __657260987_Ptr: Pointer?

    public val _657260987_VtblPtr: Pointer?
      get() = __657260987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPackageSpecificToken(nonce: IBuffer?): HardwareToken? {
      val fnPtr = _657260987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HardwareToken>()
      val hr = fn.invokeHR(arrayOf(__657260987_Ptr, marshalToNative(nonce), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HardwareToken>(result.getValue())
      return resultValue
    }
  }

  public class IHardwareIdentificationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __657260987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHardwareIdentificationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("971260e0f1704a42bd55a900b212dae2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHardwareIdentificationStatics(ptr: Pointer?): WithDefault =
        IHardwareIdentificationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHardwareIdentificationStatics {
      val address = segment.toRawLongValue()
      return makeIHardwareIdentificationStatics(Pointer(address))
    }

    public override fun toNative(obj: IHardwareIdentificationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__657260987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHardwareIdentificationStatics):
        Array<IHardwareIdentificationStatics?> = (elements as
        Array<IHardwareIdentificationStatics?>).castToImpl<IHardwareIdentificationStatics,IHardwareIdentificationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHardwareIdentificationStatics?> =
        arrayOfNulls<IHardwareIdentificationStatics_Impl>(size) as
        Array<IHardwareIdentificationStatics?>
  }
}
