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

@ABIMarker(ISmartCardTriggerDetails3.ABI::class)
@Signature("{b3e2c27d-18c6-4ba8-8376-ef03d4912666}")
@Guid("b3e2c27d18c64ba88376ef03d4912666")
@WinRTInterface("b3e2c27d18c64ba88376ef03d4912666")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardTriggerDetails3.ByReference::class)
public interface ISmartCardTriggerDetails3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SmartCard(): SmartCard?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardTriggerDetails3> {
    public override fun getValue() = ABI.makeISmartCardTriggerDetails3(pointer.getPointer(0))

    public fun setValue(value: ISmartCardTriggerDetails3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardTriggerDetails3 {
    public val __812432899_Ptr: Pointer?

    public val _812432899_VtblPtr: Pointer?
      get() = __812432899_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SmartCard(): SmartCard? {
      val fnPtr = _812432899_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCard>()
      val hr = fn.invokeHR(arrayOf(__812432899_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCard>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardTriggerDetails3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __812432899_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardTriggerDetails3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3e2c27d18c64ba88376ef03d4912666")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardTriggerDetails3(ptr: Pointer?): WithDefault =
        ISmartCardTriggerDetails3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardTriggerDetails3 {
      val address = segment.toRawLongValue()
      return makeISmartCardTriggerDetails3(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardTriggerDetails3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__812432899_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardTriggerDetails3):
        Array<ISmartCardTriggerDetails3?> = (elements as
        Array<ISmartCardTriggerDetails3?>).castToImpl<ISmartCardTriggerDetails3,ISmartCardTriggerDetails3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardTriggerDetails3?> =
        arrayOfNulls<ISmartCardTriggerDetails3_Impl>(size) as Array<ISmartCardTriggerDetails3?>
  }
}
