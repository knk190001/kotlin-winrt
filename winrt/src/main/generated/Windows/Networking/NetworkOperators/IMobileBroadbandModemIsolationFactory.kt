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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandModemIsolationFactory.ABI::class)
@Signature("{21d7ec58-c2b1-4c2f-a030-72820a24ecd9}")
@Guid("21d7ec58c2b14c2fa03072820a24ecd9")
@WinRTInterface("21d7ec58c2b14c2fa03072820a24ecd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModemIsolationFactory.ByReference::class)
public interface IMobileBroadbandModemIsolationFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(modemDeviceId: String?, ruleGroupId: String?): MobileBroadbandModemIsolation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModemIsolationFactory> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandModemIsolationFactory(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModemIsolationFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModemIsolationFactory {
    public val __1182272278_Ptr: Pointer?

    public val _1182272278_VtblPtr: Pointer?
      get() = __1182272278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(modemDeviceId: String?, ruleGroupId: String?):
        MobileBroadbandModemIsolation? {
      val fnPtr = _1182272278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandModemIsolation>()
      val hr = fn.invokeHR(arrayOf(__1182272278_Ptr, marshalToNative(modemDeviceId),
          marshalToNative(ruleGroupId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandModemIsolation>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModemIsolationFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1182272278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModemIsolationFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21d7ec58c2b14c2fa03072820a24ecd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModemIsolationFactory(ptr: Pointer?): WithDefault =
        IMobileBroadbandModemIsolationFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModemIsolationFactory {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModemIsolationFactory(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModemIsolationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1182272278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModemIsolationFactory):
        Array<IMobileBroadbandModemIsolationFactory?> = (elements as
        Array<IMobileBroadbandModemIsolationFactory?>).castToImpl<IMobileBroadbandModemIsolationFactory,IMobileBroadbandModemIsolationFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModemIsolationFactory?> =
        arrayOfNulls<IMobileBroadbandModemIsolationFactory_Impl>(size) as
        Array<IMobileBroadbandModemIsolationFactory?>
  }
}
