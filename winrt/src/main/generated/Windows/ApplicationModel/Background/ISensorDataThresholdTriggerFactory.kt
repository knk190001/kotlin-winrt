package Windows.ApplicationModel.Background

import Windows.Devices.Sensors.ISensorDataThreshold
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

@ABIMarker(ISensorDataThresholdTriggerFactory.ABI::class)
@Signature("{921fe675-7df0-4da3-97b3-e544ee857fe6}")
@Guid("921fe6757df04da397b3e544ee857fe6")
@WinRTInterface("921fe6757df04da397b3e544ee857fe6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISensorDataThresholdTriggerFactory.ByReference::class)
public interface ISensorDataThresholdTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(threshold: ISensorDataThreshold?): SensorDataThresholdTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISensorDataThresholdTriggerFactory> {
    public override fun getValue() =
        ABI.makeISensorDataThresholdTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: ISensorDataThresholdTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISensorDataThresholdTriggerFactory {
    public val __1414111880_Ptr: Pointer?

    public val _1414111880_VtblPtr: Pointer?
      get() = __1414111880_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(threshold: ISensorDataThreshold?): SensorDataThresholdTrigger? {
      val fnPtr = _1414111880_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SensorDataThresholdTrigger>()
      val hr = fn.invokeHR(arrayOf(__1414111880_Ptr, marshalToNative(threshold), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SensorDataThresholdTrigger>(result.getValue())
      return resultValue
    }
  }

  public class ISensorDataThresholdTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414111880_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISensorDataThresholdTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("921fe6757df04da397b3e544ee857fe6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISensorDataThresholdTriggerFactory(ptr: Pointer?): WithDefault =
        ISensorDataThresholdTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISensorDataThresholdTriggerFactory {
      val address = segment.toRawLongValue()
      return makeISensorDataThresholdTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISensorDataThresholdTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414111880_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISensorDataThresholdTriggerFactory):
        Array<ISensorDataThresholdTriggerFactory?> = (elements as
        Array<ISensorDataThresholdTriggerFactory?>).castToImpl<ISensorDataThresholdTriggerFactory,ISensorDataThresholdTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISensorDataThresholdTriggerFactory?> =
        arrayOfNulls<ISensorDataThresholdTriggerFactory_Impl>(size) as
        Array<ISensorDataThresholdTriggerFactory?>
  }
}
