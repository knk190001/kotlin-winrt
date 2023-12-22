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

@ABIMarker(IInclinometer3.ABI::class)
@Signature("{3a095004-d765-4384-a3d7-0283f3abe6ae}")
@Guid("3a095004d7654384a3d70283f3abe6ae")
@WinRTInterface("3a095004d7654384a3d70283f3abe6ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometer3.ByReference::class)
public interface IInclinometer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReportLatency(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_ReportLatency(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxBatchSize(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInclinometer3>
      {
    public override fun getValue() = ABI.makeIInclinometer3(pointer.getPointer(0))

    public fun setValue(value: IInclinometer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometer3 {
    public val __1946486586_Ptr: Pointer?

    public val _1946486586_VtblPtr: Pointer?
      get() = __1946486586_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReportLatency(value: WinDef.UINT): Unit {
      val fnPtr = _1946486586_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946486586_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReportLatency(): WinDef.UINT {
      val fnPtr = _1946486586_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946486586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxBatchSize(): WinDef.UINT {
      val fnPtr = _1946486586_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1946486586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IInclinometer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946486586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a095004d7654384a3d70283f3abe6ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometer3(ptr: Pointer?): WithDefault = IInclinometer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometer3 {
      val address = segment.toRawLongValue()
      return makeIInclinometer3(Pointer(address))
    }

    public override fun toNative(obj: IInclinometer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946486586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometer3): Array<IInclinometer3?> = (elements as
        Array<IInclinometer3?>).castToImpl<IInclinometer3,IInclinometer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometer3?> =
        arrayOfNulls<IInclinometer3_Impl>(size) as Array<IInclinometer3?>
  }
}
