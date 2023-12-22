package Windows.UI.UIAutomation.Core

import Windows.UI.UIAutomation.AutomationConnectionBoundObject
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

@ABIMarker(ICoreAutomationRemoteOperation2.ABI::class)
@Signature("{eefaf86f-e953-5099-8ce9-dca813482ba0}")
@Guid("eefaf86fe95350998ce9dca813482ba0")
@WinRTInterface("eefaf86fe95350998ce9dca813482ba0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAutomationRemoteOperation2.ByReference::class)
public interface ICoreAutomationRemoteOperation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ImportConnectionBoundObject(operandId: AutomationRemoteOperationOperandId?,
      connectionBoundObject: AutomationConnectionBoundObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAutomationRemoteOperation2> {
    public override fun getValue() = ABI.makeICoreAutomationRemoteOperation2(pointer.getPointer(0))

    public fun setValue(value: ICoreAutomationRemoteOperation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAutomationRemoteOperation2 {
    public val __1152792515_Ptr: Pointer?

    public val _1152792515_VtblPtr: Pointer?
      get() = __1152792515_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ImportConnectionBoundObject(operandId: AutomationRemoteOperationOperandId?,
        connectionBoundObject: AutomationConnectionBoundObject?): Unit {
      val fnPtr = _1152792515_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1152792515_Ptr, marshalToNative(operandId),
          marshalToNative(connectionBoundObject),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreAutomationRemoteOperation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1152792515_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAutomationRemoteOperation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eefaf86fe95350998ce9dca813482ba0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAutomationRemoteOperation2(ptr: Pointer?): WithDefault =
        ICoreAutomationRemoteOperation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreAutomationRemoteOperation2 {
      val address = segment.toRawLongValue()
      return makeICoreAutomationRemoteOperation2(Pointer(address))
    }

    public override fun toNative(obj: ICoreAutomationRemoteOperation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1152792515_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAutomationRemoteOperation2):
        Array<ICoreAutomationRemoteOperation2?> = (elements as
        Array<ICoreAutomationRemoteOperation2?>).castToImpl<ICoreAutomationRemoteOperation2,ICoreAutomationRemoteOperation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAutomationRemoteOperation2?> =
        arrayOfNulls<ICoreAutomationRemoteOperation2_Impl>(size) as
        Array<ICoreAutomationRemoteOperation2?>
  }
}
