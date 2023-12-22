package Windows.Networking.Connectivity

import Windows.Foundation.DateTime
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

@ABIMarker(IDataPlanUsage.ABI::class)
@Signature("{b921492d-3b44-47ff-b361-be59e69ed1b0}")
@Guid("b921492d3b4447ffb361be59e69ed1b0")
@WinRTInterface("b921492d3b4447ffb361be59e69ed1b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPlanUsage.ByReference::class)
public interface IDataPlanUsage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MegabytesUsed(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_LastSyncTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDataPlanUsage>
      {
    public override fun getValue() = ABI.makeIDataPlanUsage(pointer.getPointer(0))

    public fun setValue(value: IDataPlanUsage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPlanUsage {
    public val __1891965707_Ptr: Pointer?

    public val _1891965707_VtblPtr: Pointer?
      get() = __1891965707_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MegabytesUsed(): WinDef.UINT {
      val fnPtr = _1891965707_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1891965707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_LastSyncTime(): DateTime? {
      val fnPtr = _1891965707_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1891965707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IDataPlanUsage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1891965707_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPlanUsage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b921492d3b4447ffb361be59e69ed1b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPlanUsage(ptr: Pointer?): WithDefault = IDataPlanUsage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPlanUsage {
      val address = segment.toRawLongValue()
      return makeIDataPlanUsage(Pointer(address))
    }

    public override fun toNative(obj: IDataPlanUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1891965707_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPlanUsage): Array<IDataPlanUsage?> = (elements as
        Array<IDataPlanUsage?>).castToImpl<IDataPlanUsage,IDataPlanUsage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPlanUsage?> =
        arrayOfNulls<IDataPlanUsage_Impl>(size) as Array<IDataPlanUsage?>
  }
}
