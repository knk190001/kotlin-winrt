package Windows.ApplicationModel.Background

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IActivitySensorTriggerFactory.ABI::class)
@Signature("{a72691c3-3837-44f7-831b-0132cc872bc3}")
@Guid("a72691c3383744f7831b0132cc872bc3")
@WinRTInterface("a72691c3383744f7831b0132cc872bc3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivitySensorTriggerFactory.ByReference::class)
public interface IActivitySensorTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(reportIntervalInMilliseconds: WinDef.UINT): ActivitySensorTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivitySensorTriggerFactory> {
    public override fun getValue() = ABI.makeIActivitySensorTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IActivitySensorTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivitySensorTriggerFactory {
    public val __810249556_Ptr: Pointer?

    public val _810249556_VtblPtr: Pointer?
      get() = __810249556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(reportIntervalInMilliseconds: WinDef.UINT): ActivitySensorTrigger? {
      val fnPtr = _810249556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivitySensorTrigger>()
      val hr = fn.invokeHR(arrayOf(__810249556_Ptr, reportIntervalInMilliseconds, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivitySensorTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IActivitySensorTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810249556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivitySensorTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a72691c3383744f7831b0132cc872bc3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivitySensorTriggerFactory(ptr: Pointer?): WithDefault =
        IActivitySensorTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivitySensorTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIActivitySensorTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IActivitySensorTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810249556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivitySensorTriggerFactory):
        Array<IActivitySensorTriggerFactory?> = (elements as
        Array<IActivitySensorTriggerFactory?>).castToImpl<IActivitySensorTriggerFactory,IActivitySensorTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivitySensorTriggerFactory?> =
        arrayOfNulls<IActivitySensorTriggerFactory_Impl>(size) as
        Array<IActivitySensorTriggerFactory?>
  }
}
