package Windows.Devices.Lights

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

@ABIMarker(ILampAvailabilityChangedEventArgs.ABI::class)
@Signature("{4f6e3ded-07a2-499d-9260-67e304532ba4}")
@Guid("4f6e3ded07a2499d926067e304532ba4")
@WinRTInterface("4f6e3ded07a2499d926067e304532ba4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampAvailabilityChangedEventArgs.ByReference::class)
public interface ILampAvailabilityChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAvailable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampAvailabilityChangedEventArgs> {
    public override fun getValue() =
        ABI.makeILampAvailabilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILampAvailabilityChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampAvailabilityChangedEventArgs {
    public val __1197079610_Ptr: Pointer?

    public val _1197079610_VtblPtr: Pointer?
      get() = __1197079610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAvailable(): Boolean {
      val fnPtr = _1197079610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1197079610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILampAvailabilityChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1197079610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampAvailabilityChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f6e3ded07a2499d926067e304532ba4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampAvailabilityChangedEventArgs(ptr: Pointer?): WithDefault =
        ILampAvailabilityChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampAvailabilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeILampAvailabilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILampAvailabilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1197079610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampAvailabilityChangedEventArgs):
        Array<ILampAvailabilityChangedEventArgs?> = (elements as
        Array<ILampAvailabilityChangedEventArgs?>).castToImpl<ILampAvailabilityChangedEventArgs,ILampAvailabilityChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampAvailabilityChangedEventArgs?> =
        arrayOfNulls<ILampAvailabilityChangedEventArgs_Impl>(size) as
        Array<ILampAvailabilityChangedEventArgs?>
  }
}
