package Windows.System.Update

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.HResult
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemUpdateManagerStatics.ABI::class)
@Signature("{b2d3fcef-2971-51be-b41a-8bd703bb701a}")
@Guid("b2d3fcef297151beb41a8bd703bb701a")
@WinRTInterface("b2d3fcef297151beb41a8bd703bb701a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemUpdateManagerStatics.ByReference::class)
public interface ISystemUpdateManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_State(): SystemUpdateManagerState?

  @InterfaceMethod(2)
  public fun add_StateChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_DownloadProgress(): Double

  @InterfaceMethod(5)
  public fun get_InstallProgress(): Double

  @InterfaceMethod(6)
  public fun get_UserActiveHoursStart(): TimeSpan?

  @InterfaceMethod(7)
  public fun get_UserActiveHoursEnd(): TimeSpan?

  @InterfaceMethod(8)
  public fun get_UserActiveHoursMax(): Int

  @InterfaceMethod(9)
  public fun TrySetUserActiveHours(start: TimeSpan?, end: TimeSpan?): Boolean

  @InterfaceMethod(10)
  public fun get_LastUpdateCheckTime(): DateTime?

  @InterfaceMethod(11)
  public fun get_LastUpdateInstallTime(): DateTime?

  @InterfaceMethod(12)
  public fun get_LastErrorInfo(): SystemUpdateLastErrorInfo?

  @InterfaceMethod(13)
  public fun GetAutomaticRebootBlockIds(): IVectorView<String?>?

  @InterfaceMethod(14)
  public fun BlockAutomaticRebootAsync(lockId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(15)
  public fun UnblockAutomaticRebootAsync(lockId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(16)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(17)
  public fun GetUpdateItems(): IVectorView<SystemUpdateItem?>?

  @InterfaceMethod(18)
  public fun get_AttentionRequiredReason(): SystemUpdateAttentionRequiredReason?

  @InterfaceMethod(19)
  public fun SetFlightRing(flightRing: String?): Boolean

  @InterfaceMethod(20)
  public fun GetFlightRing(): String?

  @InterfaceMethod(21)
  public fun StartInstall(action: SystemUpdateStartInstallAction?): Unit

  @InterfaceMethod(22)
  public fun RebootToCompleteInstall(): Unit

  @InterfaceMethod(23)
  public fun StartCancelUpdates(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemUpdateManagerStatics> {
    public override fun getValue() = ABI.makeISystemUpdateManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemUpdateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemUpdateManagerStatics {
    public val __996355388_Ptr: Pointer?

    public val _996355388_VtblPtr: Pointer?
      get() = __996355388_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _996355388_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_State(): SystemUpdateManagerState? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemUpdateManagerState>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemUpdateManagerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_StateChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _996355388_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DownloadProgress(): Double {
      val fnPtr = _996355388_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_InstallProgress(): Double {
      val fnPtr = _996355388_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_UserActiveHoursStart(): TimeSpan? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_UserActiveHoursEnd(): TimeSpan? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_UserActiveHoursMax(): Int {
      val fnPtr = _996355388_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun TrySetUserActiveHours(start: TimeSpan?, end: TimeSpan?): Boolean {
      val fnPtr = _996355388_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(start), marshalToNative(end),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_LastUpdateCheckTime(): DateTime? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_LastUpdateInstallTime(): DateTime? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_LastErrorInfo(): SystemUpdateLastErrorInfo? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemUpdateLastErrorInfo>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemUpdateLastErrorInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetAutomaticRebootBlockIds(): IVectorView<String?>? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun BlockAutomaticRebootAsync(lockId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(lockId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun UnblockAutomaticRebootAsync(lockId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(lockId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetUpdateItems(): IVectorView<SystemUpdateItem?>? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SystemUpdateItem?>>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SystemUpdateItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_AttentionRequiredReason(): SystemUpdateAttentionRequiredReason? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemUpdateAttentionRequiredReason>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemUpdateAttentionRequiredReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun SetFlightRing(flightRing: String?): Boolean {
      val fnPtr = _996355388_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(flightRing), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun GetFlightRing(): String? {
      val fnPtr = _996355388_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun StartInstall(action: SystemUpdateStartInstallAction?): Unit {
      val fnPtr = _996355388_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, marshalToNative(action),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun RebootToCompleteInstall(): Unit {
      val fnPtr = _996355388_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun StartCancelUpdates(): Unit {
      val fnPtr = _996355388_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__996355388_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemUpdateManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996355388_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemUpdateManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2d3fcef297151beb41a8bd703bb701a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemUpdateManagerStatics(ptr: Pointer?): WithDefault =
        ISystemUpdateManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemUpdateManagerStatics {
      val address = segment.toRawLongValue()
      return makeISystemUpdateManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemUpdateManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996355388_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemUpdateManagerStatics):
        Array<ISystemUpdateManagerStatics?> = (elements as
        Array<ISystemUpdateManagerStatics?>).castToImpl<ISystemUpdateManagerStatics,ISystemUpdateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemUpdateManagerStatics?> =
        arrayOfNulls<ISystemUpdateManagerStatics_Impl>(size) as Array<ISystemUpdateManagerStatics?>
  }
}
