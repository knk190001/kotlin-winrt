package Windows.UI.UIAutomation.Core

import Windows.UI.UIAutomation.AutomationElement
import Windows.UI.UIAutomation.AutomationTextRange
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreAutomationRemoteOperation.ABI::class)
@Signature("{3ac656f4-e2bc-5c6e-b8e7-b224fb74b060}")
@Guid("3ac656f4e2bc5c6eb8e7b224fb74b060")
@WinRTInterface("3ac656f4e2bc5c6eb8e7b224fb74b060")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAutomationRemoteOperation.ByReference::class)
public interface ICoreAutomationRemoteOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsOpcodeSupported(opcode: WinDef.UINT): Boolean

  @InterfaceMethod(1)
  public fun ImportElement(operandId: AutomationRemoteOperationOperandId?,
      element: AutomationElement?): Unit

  @InterfaceMethod(2)
  public fun ImportTextRange(operandId: AutomationRemoteOperationOperandId?,
      textRange: AutomationTextRange?): Unit

  @InterfaceMethod(3)
  public fun AddToResults(operandId: AutomationRemoteOperationOperandId?): Unit

  @InterfaceMethod(4)
  public fun Execute(bytecodeBuffer: Array<Byte>): AutomationRemoteOperationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAutomationRemoteOperation> {
    public override fun getValue() = ABI.makeICoreAutomationRemoteOperation(pointer.getPointer(0))

    public fun setValue(value: ICoreAutomationRemoteOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAutomationRemoteOperation {
    public val __2041023125_Ptr: Pointer?

    public val _2041023125_VtblPtr: Pointer?
      get() = __2041023125_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsOpcodeSupported(opcode: WinDef.UINT): Boolean {
      val fnPtr = _2041023125_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2041023125_Ptr, opcode, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun ImportElement(operandId: AutomationRemoteOperationOperandId?,
        element: AutomationElement?): Unit {
      val fnPtr = _2041023125_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2041023125_Ptr, marshalToNative(operandId),
          marshalToNative(element),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ImportTextRange(operandId: AutomationRemoteOperationOperandId?,
        textRange: AutomationTextRange?): Unit {
      val fnPtr = _2041023125_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2041023125_Ptr, marshalToNative(operandId),
          marshalToNative(textRange),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun AddToResults(operandId: AutomationRemoteOperationOperandId?): Unit {
      val fnPtr = _2041023125_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2041023125_Ptr, marshalToNative(operandId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Execute(bytecodeBuffer: Array<Byte>): AutomationRemoteOperationResult? {
      val fnPtr = _2041023125_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationRemoteOperationResult>()
      val hr = fn.invokeHR(arrayOf(__2041023125_Ptr,
          bytecodeBuffer.size,marshalToNative(bytecodeBuffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationRemoteOperationResult>(result.getValue())
      return resultValue
    }
  }

  public class ICoreAutomationRemoteOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2041023125_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAutomationRemoteOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ac656f4e2bc5c6eb8e7b224fb74b060")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAutomationRemoteOperation(ptr: Pointer?): WithDefault =
        ICoreAutomationRemoteOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreAutomationRemoteOperation {
      val address = segment.toRawLongValue()
      return makeICoreAutomationRemoteOperation(Pointer(address))
    }

    public override fun toNative(obj: ICoreAutomationRemoteOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2041023125_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAutomationRemoteOperation):
        Array<ICoreAutomationRemoteOperation?> = (elements as
        Array<ICoreAutomationRemoteOperation?>).castToImpl<ICoreAutomationRemoteOperation,ICoreAutomationRemoteOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAutomationRemoteOperation?> =
        arrayOfNulls<ICoreAutomationRemoteOperation_Impl>(size) as
        Array<ICoreAutomationRemoteOperation?>
  }
}
