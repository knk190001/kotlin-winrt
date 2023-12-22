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

@ABIMarker(IMobileBroadbandSlotInfoChangedEventArgs.ABI::class)
@Signature("{3158839f-950c-54ce-a48d-ba4529b48f0f}")
@Guid("3158839f950c54cea48dba4529b48f0f")
@WinRTInterface("3158839f950c54cea48dba4529b48f0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandSlotInfoChangedEventArgs.ByReference::class)
public interface IMobileBroadbandSlotInfoChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SlotInfo(): MobileBroadbandSlotInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandSlotInfoChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandSlotInfoChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandSlotInfoChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandSlotInfoChangedEventArgs {
    public val __237369237_Ptr: Pointer?

    public val _237369237_VtblPtr: Pointer?
      get() = __237369237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SlotInfo(): MobileBroadbandSlotInfo? {
      val fnPtr = _237369237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandSlotInfo>()
      val hr = fn.invokeHR(arrayOf(__237369237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandSlotInfo>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandSlotInfoChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __237369237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandSlotInfoChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3158839f950c54cea48dba4529b48f0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandSlotInfoChangedEventArgs(ptr: Pointer?): WithDefault =
        IMobileBroadbandSlotInfoChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandSlotInfoChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandSlotInfoChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandSlotInfoChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__237369237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandSlotInfoChangedEventArgs):
        Array<IMobileBroadbandSlotInfoChangedEventArgs?> = (elements as
        Array<IMobileBroadbandSlotInfoChangedEventArgs?>).castToImpl<IMobileBroadbandSlotInfoChangedEventArgs,IMobileBroadbandSlotInfoChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandSlotInfoChangedEventArgs?> =
        arrayOfNulls<IMobileBroadbandSlotInfoChangedEventArgs_Impl>(size) as
        Array<IMobileBroadbandSlotInfoChangedEventArgs?>
  }
}
