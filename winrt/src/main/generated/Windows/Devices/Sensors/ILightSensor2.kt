package Windows.Devices.Sensors

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

@ABIMarker(ILightSensor2.ABI::class)
@Signature("{486b24e8-a94c-4090-8f48-09f782a9f7d5}")
@Guid("486b24e8a94c40908f4809f782a9f7d5")
@WinRTInterface("486b24e8a94c40908f4809f782a9f7d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensor2.ByReference::class)
public interface ILightSensor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReportLatency(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_ReportLatency(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxBatchSize(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILightSensor2>
      {
    public override fun getValue() = ABI.makeILightSensor2(pointer.getPointer(0))

    public fun setValue(value: ILightSensor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensor2 {
    public val __1251700306_Ptr: Pointer?

    public val _1251700306_VtblPtr: Pointer?
      get() = __1251700306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReportLatency(value: WinDef.UINT): Unit {
      val fnPtr = _1251700306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1251700306_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReportLatency(): WinDef.UINT {
      val fnPtr = _1251700306_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1251700306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxBatchSize(): WinDef.UINT {
      val fnPtr = _1251700306_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1251700306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ILightSensor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1251700306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("486b24e8a94c40908f4809f782a9f7d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensor2(ptr: Pointer?): WithDefault = ILightSensor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensor2 {
      val address = segment.toRawLongValue()
      return makeILightSensor2(Pointer(address))
    }

    public override fun toNative(obj: ILightSensor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1251700306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensor2): Array<ILightSensor2?> = (elements as
        Array<ILightSensor2?>).castToImpl<ILightSensor2,ILightSensor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensor2?> =
        arrayOfNulls<ILightSensor2_Impl>(size) as Array<ILightSensor2?>
  }
}
