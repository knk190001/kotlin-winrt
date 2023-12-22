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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardEmulator.ABI::class)
@Signature("{dfb906b2-875e-47e5-8077-e8bff1b1c6fb}")
@Guid("dfb906b2875e47e58077e8bff1b1c6fb")
@WinRTInterface("dfb906b2875e47e58077e8bff1b1c6fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulator.ByReference::class)
public interface ISmartCardEmulator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnablementPolicy(): SmartCardEmulatorEnablementPolicy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulator> {
    public override fun getValue() = ABI.makeISmartCardEmulator(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulator {
    public val __1061892699_Ptr: Pointer?

    public val _1061892699_VtblPtr: Pointer?
      get() = __1061892699_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnablementPolicy(): SmartCardEmulatorEnablementPolicy? {
      val fnPtr = _1061892699_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulatorEnablementPolicy>()
      val hr = fn.invokeHR(arrayOf(__1061892699_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulatorEnablementPolicy>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardEmulator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1061892699_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dfb906b2875e47e58077e8bff1b1c6fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulator(ptr: Pointer?): WithDefault = ISmartCardEmulator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardEmulator {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulator(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1061892699_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulator): Array<ISmartCardEmulator?> =
        (elements as
        Array<ISmartCardEmulator?>).castToImpl<ISmartCardEmulator,ISmartCardEmulator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulator?> =
        arrayOfNulls<ISmartCardEmulator_Impl>(size) as Array<ISmartCardEmulator?>
  }
}
