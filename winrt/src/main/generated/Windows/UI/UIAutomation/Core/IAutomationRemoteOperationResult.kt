package Windows.UI.UIAutomation.Core

import Windows.Foundation.HResult
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationRemoteOperationResult.ABI::class)
@Signature("{e0f80c42-4a67-5534-bf5a-09e8a99b36b1}")
@Guid("e0f80c424a675534bf5a09e8a99b36b1")
@WinRTInterface("e0f80c424a675534bf5a09e8a99b36b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationRemoteOperationResult.ByReference::class)
public interface IAutomationRemoteOperationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AutomationRemoteOperationStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_ErrorLocation(): Int

  @InterfaceMethod(3)
  public fun HasOperand(operandId: AutomationRemoteOperationOperandId?): Boolean

  @InterfaceMethod(4)
  public fun GetOperand(operandId: AutomationRemoteOperationOperandId?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationRemoteOperationResult> {
    public override fun getValue() = ABI.makeIAutomationRemoteOperationResult(pointer.getPointer(0))

    public fun setValue(value: IAutomationRemoteOperationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationRemoteOperationResult {
    public val __1432429647_Ptr: Pointer?

    public val _1432429647_VtblPtr: Pointer?
      get() = __1432429647_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AutomationRemoteOperationStatus? {
      val fnPtr = _1432429647_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationRemoteOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1432429647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationRemoteOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1432429647_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1432429647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorLocation(): Int {
      val fnPtr = _1432429647_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1432429647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun HasOperand(operandId: AutomationRemoteOperationOperandId?): Boolean {
      val fnPtr = _1432429647_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1432429647_Ptr, marshalToNative(operandId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetOperand(operandId: AutomationRemoteOperationOperandId?): IUnknown? {
      val fnPtr = _1432429647_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1432429647_Ptr, marshalToNative(operandId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationRemoteOperationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432429647_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationRemoteOperationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0f80c424a675534bf5a09e8a99b36b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationRemoteOperationResult(ptr: Pointer?): WithDefault =
        IAutomationRemoteOperationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationRemoteOperationResult {
      val address = segment.toRawLongValue()
      return makeIAutomationRemoteOperationResult(Pointer(address))
    }

    public override fun toNative(obj: IAutomationRemoteOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432429647_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationRemoteOperationResult):
        Array<IAutomationRemoteOperationResult?> = (elements as
        Array<IAutomationRemoteOperationResult?>).castToImpl<IAutomationRemoteOperationResult,IAutomationRemoteOperationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationRemoteOperationResult?> =
        arrayOfNulls<IAutomationRemoteOperationResult_Impl>(size) as
        Array<IAutomationRemoteOperationResult?>
  }
}
