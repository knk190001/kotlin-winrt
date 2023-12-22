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

@ABIMarker(IAltimeter2.ABI::class)
@Signature("{c9471bf9-2add-48f5-9f08-3d0c7660d938}")
@Guid("c9471bf92add48f59f083d0c7660d938")
@WinRTInterface("c9471bf92add48f59f083d0c7660d938")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAltimeter2.ByReference::class)
public interface IAltimeter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ReportLatency(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_ReportLatency(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_MaxBatchSize(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAltimeter2> {
    public override fun getValue() = ABI.makeIAltimeter2(pointer.getPointer(0))

    public fun setValue(value: IAltimeter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAltimeter2 {
    public val __1216017557_Ptr: Pointer?

    public val _1216017557_VtblPtr: Pointer?
      get() = __1216017557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ReportLatency(value: WinDef.UINT): Unit {
      val fnPtr = _1216017557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1216017557_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ReportLatency(): WinDef.UINT {
      val fnPtr = _1216017557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1216017557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxBatchSize(): WinDef.UINT {
      val fnPtr = _1216017557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1216017557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IAltimeter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216017557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAltimeter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9471bf92add48f59f083d0c7660d938")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAltimeter2(ptr: Pointer?): WithDefault = IAltimeter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAltimeter2 {
      val address = segment.toRawLongValue()
      return makeIAltimeter2(Pointer(address))
    }

    public override fun toNative(obj: IAltimeter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216017557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAltimeter2): Array<IAltimeter2?> = (elements as
        Array<IAltimeter2?>).castToImpl<IAltimeter2,IAltimeter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAltimeter2?> =
        arrayOfNulls<IAltimeter2_Impl>(size) as Array<IAltimeter2?>
  }
}
