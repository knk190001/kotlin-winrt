package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IVectorView
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectionProfile.ABI::class)
@Signature("{71ba143c-598e-49d0-84eb-8febaedcc195}")
@Guid("71ba143c598e49d084eb8febaedcc195")
@WinRTInterface("71ba143c598e49d084eb8febaedcc195")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfile.ByReference::class)
public interface IConnectionProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileName(): String?

  @InterfaceMethod(1)
  public fun GetNetworkConnectivityLevel(): NetworkConnectivityLevel?

  @InterfaceMethod(2)
  public fun GetNetworkNames(): IVectorView<String?>?

  @InterfaceMethod(3)
  public fun GetConnectionCost(): ConnectionCost?

  @InterfaceMethod(4)
  public fun GetDataPlanStatus(): DataPlanStatus?

  @InterfaceMethod(5)
  public fun get_NetworkAdapter(): NetworkAdapter?

  @InterfaceMethod(6)
  public fun GetLocalUsage(StartTime: DateTime?, EndTime: DateTime?): DataUsage?

  @InterfaceMethod(7)
  public fun GetLocalUsage(
    StartTime: DateTime?,
    EndTime: DateTime?,
    States: RoamingStates?
  ): DataUsage?

  @InterfaceMethod(8)
  public fun get_NetworkSecuritySettings(): NetworkSecuritySettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfile> {
    public override fun getValue() = ABI.makeIConnectionProfile(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfile {
    public val __1868952056_Ptr: Pointer?

    public val _1868952056_VtblPtr: Pointer?
      get() = __1868952056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileName(): String? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetNetworkConnectivityLevel(): NetworkConnectivityLevel? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkConnectivityLevel>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkConnectivityLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetNetworkNames(): IVectorView<String?>? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetConnectionCost(): ConnectionCost? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectionCost>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectionCost>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDataPlanStatus(): DataPlanStatus? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPlanStatus>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPlanStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_NetworkAdapter(): NetworkAdapter? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkAdapter>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetLocalUsage(StartTime: DateTime?, EndTime: DateTime?): DataUsage? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataUsage>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr, marshalToNative(StartTime),
          marshalToNative(EndTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataUsage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetLocalUsage(
      StartTime: DateTime?,
      EndTime: DateTime?,
      States: RoamingStates?
    ): DataUsage? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataUsage>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr, marshalToNative(StartTime),
          marshalToNative(EndTime), marshalToNative(States), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataUsage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_NetworkSecuritySettings(): NetworkSecuritySettings? {
      val fnPtr = _1868952056_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkSecuritySettings>()
      val hr = fn.invokeHR(arrayOf(__1868952056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkSecuritySettings>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1868952056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71ba143c598e49d084eb8febaedcc195")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfile(ptr: Pointer?): WithDefault = IConnectionProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfile {
      val address = segment.toRawLongValue()
      return makeIConnectionProfile(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1868952056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfile): Array<IConnectionProfile?> =
        (elements as
        Array<IConnectionProfile?>).castToImpl<IConnectionProfile,IConnectionProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfile?> =
        arrayOfNulls<IConnectionProfile_Impl>(size) as Array<IConnectionProfile?>
  }
}
