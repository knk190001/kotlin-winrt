package Windows.UI.UIAutomation.Core

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreAutomationRemoteOperationContext.ABI::class)
@Signature("{b9af9cbb-3d3e-5918-a16b-7861626a3aeb}")
@Guid("b9af9cbb3d3e5918a16b7861626a3aeb")
@WinRTInterface("b9af9cbb3d3e5918a16b7861626a3aeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAutomationRemoteOperationContext.ByReference::class)
public interface ICoreAutomationRemoteOperationContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOperand(id: AutomationRemoteOperationOperandId?): IUnknown?

  @InterfaceMethod(1)
  public fun SetOperand(id: AutomationRemoteOperationOperandId?, operand: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun SetOperand(
    id: AutomationRemoteOperationOperandId?,
    operand: IUnknown?,
    operandInterfaceId: com.sun.jna.platform.win32.Guid.GUID?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAutomationRemoteOperationContext> {
    public override fun getValue() =
        ABI.makeICoreAutomationRemoteOperationContext(pointer.getPointer(0))

    public fun setValue(value: ICoreAutomationRemoteOperationContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAutomationRemoteOperationContext {
    public val __547889498_Ptr: Pointer?

    public val _547889498_VtblPtr: Pointer?
      get() = __547889498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOperand(id: AutomationRemoteOperationOperandId?): IUnknown? {
      val fnPtr = _547889498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__547889498_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetOperand(id: AutomationRemoteOperationOperandId?, operand: IUnknown?):
        Unit {
      val fnPtr = _547889498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__547889498_Ptr, marshalToNative(id), marshalToNative(operand),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetOperand(
      id: AutomationRemoteOperationOperandId?,
      operand: IUnknown?,
      operandInterfaceId: com.sun.jna.platform.win32.Guid.GUID?
    ): Unit {
      val fnPtr = _547889498_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__547889498_Ptr, marshalToNative(id), marshalToNative(operand),
          marshalToNative(operandInterfaceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreAutomationRemoteOperationContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __547889498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAutomationRemoteOperationContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9af9cbb3d3e5918a16b7861626a3aeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAutomationRemoteOperationContext(ptr: Pointer?): WithDefault =
        ICoreAutomationRemoteOperationContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreAutomationRemoteOperationContext {
      val address = segment.toRawLongValue()
      return makeICoreAutomationRemoteOperationContext(Pointer(address))
    }

    public override fun toNative(obj: ICoreAutomationRemoteOperationContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__547889498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAutomationRemoteOperationContext):
        Array<ICoreAutomationRemoteOperationContext?> = (elements as
        Array<ICoreAutomationRemoteOperationContext?>).castToImpl<ICoreAutomationRemoteOperationContext,ICoreAutomationRemoteOperationContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAutomationRemoteOperationContext?> =
        arrayOfNulls<ICoreAutomationRemoteOperationContext_Impl>(size) as
        Array<ICoreAutomationRemoteOperationContext?>
  }
}
