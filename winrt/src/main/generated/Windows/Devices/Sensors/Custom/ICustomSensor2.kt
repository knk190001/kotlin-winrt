package Windows.Devices.Sensors.Custom

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

@ABIMarker(ICustomSensor2.ABI::class)
@Signature("{20db3111-ec58-4d9f-bfbd-e77825088510}")
@Guid("20db3111ec584d9fbfbde77825088510")
@WinRTInterface("20db3111ec584d9fbfbde77825088510")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomSensor2.ByReference::class)
public interface ICustomSensor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReportLatency(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_ReportLatency(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxBatchSize(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICustomSensor2>
      {
    public override fun getValue() = ABI.makeICustomSensor2(pointer.getPointer(0))

    public fun setValue(value: ICustomSensor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomSensor2 {
    public val __1826864704_Ptr: Pointer?

    public val _1826864704_VtblPtr: Pointer?
      get() = __1826864704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReportLatency(value: WinDef.UINT): Unit {
      val fnPtr = _1826864704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1826864704_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReportLatency(): WinDef.UINT {
      val fnPtr = _1826864704_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1826864704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxBatchSize(): WinDef.UINT {
      val fnPtr = _1826864704_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1826864704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ICustomSensor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1826864704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomSensor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20db3111ec584d9fbfbde77825088510")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomSensor2(ptr: Pointer?): WithDefault = ICustomSensor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomSensor2 {
      val address = segment.toRawLongValue()
      return makeICustomSensor2(Pointer(address))
    }

    public override fun toNative(obj: ICustomSensor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1826864704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomSensor2): Array<ICustomSensor2?> = (elements as
        Array<ICustomSensor2?>).castToImpl<ICustomSensor2,ICustomSensor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomSensor2?> =
        arrayOfNulls<ICustomSensor2_Impl>(size) as Array<ICustomSensor2?>
  }
}
