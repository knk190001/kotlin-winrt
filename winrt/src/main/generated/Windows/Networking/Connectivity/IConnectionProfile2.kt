package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectionProfile2.ABI::class)
@Signature("{e2045145-4c9f-400c-9150-7ec7d6e2888a}")
@Guid("e20451454c9f400c91507ec7d6e2888a")
@WinRTInterface("e20451454c9f400c91507ec7d6e2888a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfile2.ByReference::class)
public interface IConnectionProfile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsWwanConnectionProfile(): Boolean

  @InterfaceMethod(1)
  public fun get_IsWlanConnectionProfile(): Boolean

  @InterfaceMethod(2)
  public fun get_WwanConnectionProfileDetails(): WwanConnectionProfileDetails?

  @InterfaceMethod(3)
  public fun get_WlanConnectionProfileDetails(): WlanConnectionProfileDetails?

  @InterfaceMethod(4)
  public fun get_ServiceProviderGuid(): IReference<com.sun.jna.platform.win32.Guid.GUID?>?

  @InterfaceMethod(5)
  public fun GetSignalBars(): IReference<Byte>?

  @InterfaceMethod(6)
  public fun GetDomainConnectivityLevel(): DomainConnectivityLevel?

  @InterfaceMethod(7)
  public fun GetNetworkUsageAsync(
    startTime: DateTime?,
    endTime: DateTime?,
    granularity: DataUsageGranularity?,
    states: NetworkUsageStates?
  ): IAsyncOperation<IVectorView<NetworkUsage?>?>?

  @InterfaceMethod(8)
  public fun GetConnectivityIntervalsAsync(
    startTime: DateTime?,
    endTime: DateTime?,
    states: NetworkUsageStates?
  ): IAsyncOperation<IVectorView<ConnectivityInterval?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfile2> {
    public override fun getValue() = ABI.makeIConnectionProfile2(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfile2 {
    public val __2102938838_Ptr: Pointer?

    public val _2102938838_VtblPtr: Pointer?
      get() = __2102938838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsWwanConnectionProfile(): Boolean {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsWlanConnectionProfile(): Boolean {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_WwanConnectionProfileDetails(): WwanConnectionProfileDetails? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WwanConnectionProfileDetails>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WwanConnectionProfileDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_WlanConnectionProfileDetails(): WlanConnectionProfileDetails? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WlanConnectionProfileDetails>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WlanConnectionProfileDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ServiceProviderGuid():
        IReference<com.sun.jna.platform.win32.Guid.GUID?>? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<com.sun.jna.platform.win32.Guid.GUID?>>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<com.sun.jna.platform.win32.Guid.GUID?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetSignalBars(): IReference<Byte>? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetDomainConnectivityLevel(): DomainConnectivityLevel? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DomainConnectivityLevel>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DomainConnectivityLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetNetworkUsageAsync(
      startTime: DateTime?,
      endTime: DateTime?,
      granularity: DataUsageGranularity?,
      states: NetworkUsageStates?
    ): IAsyncOperation<IVectorView<NetworkUsage?>?>? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<NetworkUsage?>?>>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr, marshalToNative(startTime),
          marshalToNative(endTime), marshalToNative(granularity), marshalToNative(states), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<NetworkUsage?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetConnectivityIntervalsAsync(
      startTime: DateTime?,
      endTime: DateTime?,
      states: NetworkUsageStates?
    ): IAsyncOperation<IVectorView<ConnectivityInterval?>?>? {
      val fnPtr = _2102938838_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ConnectivityInterval?>?>>()
      val hr = fn.invokeHR(arrayOf(__2102938838_Ptr, marshalToNative(startTime),
          marshalToNative(endTime), marshalToNative(states), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ConnectivityInterval?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2102938838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e20451454c9f400c91507ec7d6e2888a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfile2(ptr: Pointer?): WithDefault = IConnectionProfile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfile2 {
      val address = segment.toRawLongValue()
      return makeIConnectionProfile2(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2102938838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfile2): Array<IConnectionProfile2?> =
        (elements as
        Array<IConnectionProfile2?>).castToImpl<IConnectionProfile2,IConnectionProfile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfile2?> =
        arrayOfNulls<IConnectionProfile2_Impl>(size) as Array<IConnectionProfile2?>
  }
}
