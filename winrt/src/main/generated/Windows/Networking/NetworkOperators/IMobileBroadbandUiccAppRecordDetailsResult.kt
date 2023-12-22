package Windows.Networking.NetworkOperators

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandUiccAppRecordDetailsResult.ABI::class)
@Signature("{d919682f-be14-4934-981d-2f57b9ed83e6}")
@Guid("d919682fbe144934981d2f57b9ed83e6")
@WinRTInterface("d919682fbe144934981d2f57b9ed83e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandUiccAppRecordDetailsResult.ByReference::class)
public interface IMobileBroadbandUiccAppRecordDetailsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MobileBroadbandUiccAppOperationStatus?

  @InterfaceMethod(1)
  public fun get_Kind(): UiccAppRecordKind?

  @InterfaceMethod(2)
  public fun get_RecordCount(): Int

  @InterfaceMethod(3)
  public fun get_RecordSize(): Int

  @InterfaceMethod(4)
  public fun get_ReadAccessCondition(): UiccAccessCondition?

  @InterfaceMethod(5)
  public fun get_WriteAccessCondition(): UiccAccessCondition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandUiccAppRecordDetailsResult> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandUiccAppRecordDetailsResult(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandUiccAppRecordDetailsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandUiccAppRecordDetailsResult {
    public val __543017315_Ptr: Pointer?

    public val _543017315_VtblPtr: Pointer?
      get() = __543017315_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MobileBroadbandUiccAppOperationStatus? {
      val fnPtr = _543017315_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandUiccAppOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__543017315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandUiccAppOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): UiccAppRecordKind? {
      val fnPtr = _543017315_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UiccAppRecordKind>()
      val hr = fn.invokeHR(arrayOf(__543017315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UiccAppRecordKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RecordCount(): Int {
      val fnPtr = _543017315_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__543017315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_RecordSize(): Int {
      val fnPtr = _543017315_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__543017315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ReadAccessCondition(): UiccAccessCondition? {
      val fnPtr = _543017315_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UiccAccessCondition>()
      val hr = fn.invokeHR(arrayOf(__543017315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UiccAccessCondition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_WriteAccessCondition(): UiccAccessCondition? {
      val fnPtr = _543017315_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UiccAccessCondition>()
      val hr = fn.invokeHR(arrayOf(__543017315_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UiccAccessCondition>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandUiccAppRecordDetailsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __543017315_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandUiccAppRecordDetailsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d919682fbe144934981d2f57b9ed83e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandUiccAppRecordDetailsResult(ptr: Pointer?): WithDefault =
        IMobileBroadbandUiccAppRecordDetailsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMobileBroadbandUiccAppRecordDetailsResult {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandUiccAppRecordDetailsResult(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandUiccAppRecordDetailsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__543017315_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandUiccAppRecordDetailsResult):
        Array<IMobileBroadbandUiccAppRecordDetailsResult?> = (elements as
        Array<IMobileBroadbandUiccAppRecordDetailsResult?>).castToImpl<IMobileBroadbandUiccAppRecordDetailsResult,IMobileBroadbandUiccAppRecordDetailsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandUiccAppRecordDetailsResult?> =
        arrayOfNulls<IMobileBroadbandUiccAppRecordDetailsResult_Impl>(size) as
        Array<IMobileBroadbandUiccAppRecordDetailsResult?>
  }
}
