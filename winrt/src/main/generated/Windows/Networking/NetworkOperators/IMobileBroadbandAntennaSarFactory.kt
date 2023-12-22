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

@ABIMarker(IMobileBroadbandAntennaSarFactory.ABI::class)
@Signature("{a91e1716-c04d-4a21-8698-1459dc672c6e}")
@Guid("a91e1716c04d4a2186981459dc672c6e")
@WinRTInterface("a91e1716c04d4a2186981459dc672c6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAntennaSarFactory.ByReference::class)
public interface IMobileBroadbandAntennaSarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithIndex(antennaIndex: Int, sarBackoffIndex: Int): MobileBroadbandAntennaSar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAntennaSarFactory> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandAntennaSarFactory(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAntennaSarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAntennaSarFactory {
    public val __1359699795_Ptr: Pointer?

    public val _1359699795_VtblPtr: Pointer?
      get() = __1359699795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithIndex(antennaIndex: Int, sarBackoffIndex: Int):
        MobileBroadbandAntennaSar? {
      val fnPtr = _1359699795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandAntennaSar>()
      val hr = fn.invokeHR(arrayOf(__1359699795_Ptr, antennaIndex, sarBackoffIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandAntennaSar>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandAntennaSarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359699795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAntennaSarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a91e1716c04d4a2186981459dc672c6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAntennaSarFactory(ptr: Pointer?): WithDefault =
        IMobileBroadbandAntennaSarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAntennaSarFactory {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAntennaSarFactory(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAntennaSarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359699795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAntennaSarFactory):
        Array<IMobileBroadbandAntennaSarFactory?> = (elements as
        Array<IMobileBroadbandAntennaSarFactory?>).castToImpl<IMobileBroadbandAntennaSarFactory,IMobileBroadbandAntennaSarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAntennaSarFactory?> =
        arrayOfNulls<IMobileBroadbandAntennaSarFactory_Impl>(size) as
        Array<IMobileBroadbandAntennaSarFactory?>
  }
}
