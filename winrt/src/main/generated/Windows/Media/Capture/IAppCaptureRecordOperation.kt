package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Storage.StorageFile
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureRecordOperation.ABI::class)
@Signature("{c66020a9-1538-495c-9bbb-2ba870ec5861}")
@Guid("c66020a91538495c9bbb2ba870ec5861")
@WinRTInterface("c66020a91538495c9bbb2ba870ec5861")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureRecordOperation.ByReference::class)
public interface IAppCaptureRecordOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StopRecording(): Unit

  @InterfaceMethod(1)
  public fun get_State(): AppCaptureRecordingState?

  @InterfaceMethod(2)
  public fun get_ErrorCode(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_Duration(): IReference<TimeSpan?>?

  @InterfaceMethod(4)
  public fun get_File(): StorageFile?

  @InterfaceMethod(5)
  public fun get_IsFileTruncated(): IReference<Boolean>?

  @InterfaceMethod(6)
  public fun add_StateChanged(value: TypedEventHandler<AppCaptureRecordOperation?,
      AppCaptureRecordingStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_DurationGenerated(value: TypedEventHandler<AppCaptureRecordOperation?,
      AppCaptureDurationGeneratedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_DurationGenerated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_FileGenerated(value: TypedEventHandler<AppCaptureRecordOperation?,
      AppCaptureFileGeneratedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_FileGenerated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureRecordOperation> {
    public override fun getValue() = ABI.makeIAppCaptureRecordOperation(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureRecordOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureRecordOperation {
    public val __1079449241_Ptr: Pointer?

    public val _1079449241_VtblPtr: Pointer?
      get() = __1079449241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StopRecording(): Unit {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_State(): AppCaptureRecordingState? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureRecordingState>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureRecordingState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorCode(): IReference<WinDef.UINT>? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Duration(): IReference<TimeSpan?>? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_File(): StorageFile? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsFileTruncated(): IReference<Boolean>? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_StateChanged(value: TypedEventHandler<AppCaptureRecordOperation?,
        AppCaptureRecordingStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_DurationGenerated(value: TypedEventHandler<AppCaptureRecordOperation?,
        AppCaptureDurationGeneratedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_DurationGenerated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_FileGenerated(value: TypedEventHandler<AppCaptureRecordOperation?,
        AppCaptureFileGeneratedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_FileGenerated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1079449241_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1079449241_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppCaptureRecordOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1079449241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureRecordOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c66020a91538495c9bbb2ba870ec5861")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureRecordOperation(ptr: Pointer?): WithDefault =
        IAppCaptureRecordOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureRecordOperation {
      val address = segment.toRawLongValue()
      return makeIAppCaptureRecordOperation(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureRecordOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1079449241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureRecordOperation):
        Array<IAppCaptureRecordOperation?> = (elements as
        Array<IAppCaptureRecordOperation?>).castToImpl<IAppCaptureRecordOperation,IAppCaptureRecordOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureRecordOperation?> =
        arrayOfNulls<IAppCaptureRecordOperation_Impl>(size) as Array<IAppCaptureRecordOperation?>
  }
}
