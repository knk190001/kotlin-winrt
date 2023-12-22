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

@ABIMarker(IMobileBroadbandCurrentSlotIndexChangedEventArgs.ABI::class)
@Signature("{f718b184-c370-5fd4-a670-1846cb9bce47}")
@Guid("f718b184c3705fd4a6701846cb9bce47")
@WinRTInterface("f718b184c3705fd4a6701846cb9bce47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandCurrentSlotIndexChangedEventArgs.ByReference::class)
public interface IMobileBroadbandCurrentSlotIndexChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentSlotIndex(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandCurrentSlotIndexChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandCurrentSlotIndexChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandCurrentSlotIndexChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandCurrentSlotIndexChangedEventArgs {
    public val __137007770_Ptr: Pointer?

    public val _137007770_VtblPtr: Pointer?
      get() = __137007770_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentSlotIndex(): Int {
      val fnPtr = _137007770_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__137007770_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IMobileBroadbandCurrentSlotIndexChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __137007770_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandCurrentSlotIndexChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f718b184c3705fd4a6701846cb9bce47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandCurrentSlotIndexChangedEventArgs(ptr: Pointer?): WithDefault =
        IMobileBroadbandCurrentSlotIndexChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandCurrentSlotIndexChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandCurrentSlotIndexChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandCurrentSlotIndexChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__137007770_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandCurrentSlotIndexChangedEventArgs):
        Array<IMobileBroadbandCurrentSlotIndexChangedEventArgs?> = (elements as
        Array<IMobileBroadbandCurrentSlotIndexChangedEventArgs?>).castToImpl<IMobileBroadbandCurrentSlotIndexChangedEventArgs,IMobileBroadbandCurrentSlotIndexChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandCurrentSlotIndexChangedEventArgs?>
        = arrayOfNulls<IMobileBroadbandCurrentSlotIndexChangedEventArgs_Impl>(size) as
        Array<IMobileBroadbandCurrentSlotIndexChangedEventArgs?>
  }
}
