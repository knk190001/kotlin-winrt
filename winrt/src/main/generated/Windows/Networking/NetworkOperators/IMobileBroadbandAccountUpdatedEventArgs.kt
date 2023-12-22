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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandAccountUpdatedEventArgs.ABI::class)
@Signature("{7bc31d88-a6bd-49e1-80ab-6b91354a57d4}")
@Guid("7bc31d88a6bd49e180ab6b91354a57d4")
@WinRTInterface("7bc31d88a6bd49e180ab6b91354a57d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccountUpdatedEventArgs.ByReference::class)
public interface IMobileBroadbandAccountUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAccountId(): String?

  @InterfaceMethod(1)
  public fun get_HasDeviceInformationChanged(): Boolean

  @InterfaceMethod(2)
  public fun get_HasNetworkChanged(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccountUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandAccountUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccountUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccountUpdatedEventArgs {
    public val __1881673043_Ptr: Pointer?

    public val _1881673043_VtblPtr: Pointer?
      get() = __1881673043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _1881673043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1881673043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasDeviceInformationChanged(): Boolean {
      val fnPtr = _1881673043_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1881673043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HasNetworkChanged(): Boolean {
      val fnPtr = _1881673043_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1881673043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMobileBroadbandAccountUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1881673043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccountUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bc31d88a6bd49e180ab6b91354a57d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccountUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccountUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandAccountUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccountUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccountUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1881673043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccountUpdatedEventArgs):
        Array<IMobileBroadbandAccountUpdatedEventArgs?> = (elements as
        Array<IMobileBroadbandAccountUpdatedEventArgs?>).castToImpl<IMobileBroadbandAccountUpdatedEventArgs,IMobileBroadbandAccountUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccountUpdatedEventArgs?> =
        arrayOfNulls<IMobileBroadbandAccountUpdatedEventArgs_Impl>(size) as
        Array<IMobileBroadbandAccountUpdatedEventArgs?>
  }
}
