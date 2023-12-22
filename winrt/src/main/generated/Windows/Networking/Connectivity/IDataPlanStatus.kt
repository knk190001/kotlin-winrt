package Windows.Networking.Connectivity

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IDataPlanStatus.ABI::class)
@Signature("{977a8b8c-3885-40f3-8851-42cd2bd568bb}")
@Guid("977a8b8c388540f3885142cd2bd568bb")
@WinRTInterface("977a8b8c388540f3885142cd2bd568bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPlanStatus.ByReference::class)
public interface IDataPlanStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataPlanUsage(): DataPlanUsage?

  @InterfaceMethod(1)
  public fun get_DataLimitInMegabytes(): IReference<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun get_InboundBitsPerSecond(): IReference<WinDef.ULONG>?

  @InterfaceMethod(3)
  public fun get_OutboundBitsPerSecond(): IReference<WinDef.ULONG>?

  @InterfaceMethod(4)
  public fun get_NextBillingCycle(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun get_MaxTransferSizeInMegabytes(): IReference<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPlanStatus> {
    public override fun getValue() = ABI.makeIDataPlanStatus(pointer.getPointer(0))

    public fun setValue(value: IDataPlanStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPlanStatus {
    public val __1534926904_Ptr: Pointer?

    public val _1534926904_VtblPtr: Pointer?
      get() = __1534926904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataPlanUsage(): DataPlanUsage? {
      val fnPtr = _1534926904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPlanUsage>()
      val hr = fn.invokeHR(arrayOf(__1534926904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPlanUsage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DataLimitInMegabytes(): IReference<WinDef.UINT>? {
      val fnPtr = _1534926904_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1534926904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InboundBitsPerSecond(): IReference<WinDef.ULONG>? {
      val fnPtr = _1534926904_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1534926904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OutboundBitsPerSecond(): IReference<WinDef.ULONG>? {
      val fnPtr = _1534926904_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1534926904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NextBillingCycle(): IReference<DateTime?>? {
      val fnPtr = _1534926904_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1534926904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MaxTransferSizeInMegabytes(): IReference<WinDef.UINT>? {
      val fnPtr = _1534926904_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1534926904_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IDataPlanStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1534926904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPlanStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("977a8b8c388540f3885142cd2bd568bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPlanStatus(ptr: Pointer?): WithDefault = IDataPlanStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPlanStatus {
      val address = segment.toRawLongValue()
      return makeIDataPlanStatus(Pointer(address))
    }

    public override fun toNative(obj: IDataPlanStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1534926904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPlanStatus): Array<IDataPlanStatus?> = (elements as
        Array<IDataPlanStatus?>).castToImpl<IDataPlanStatus,IDataPlanStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPlanStatus?> =
        arrayOfNulls<IDataPlanStatus_Impl>(size) as Array<IDataPlanStatus?>
  }
}
