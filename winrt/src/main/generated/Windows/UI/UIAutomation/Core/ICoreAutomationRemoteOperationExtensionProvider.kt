package Windows.UI.UIAutomation.Core

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreAutomationRemoteOperationExtensionProvider.ABI::class)
@Signature("{88f53e67-dc69-553b-a0aa-70477e724da8}")
@Guid("88f53e67dc69553ba0aa70477e724da8")
@WinRTInterface("88f53e67dc69553ba0aa70477e724da8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAutomationRemoteOperationExtensionProvider.ByReference::class)
public interface ICoreAutomationRemoteOperationExtensionProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CallExtension(
    extensionId: com.sun.jna.platform.win32.Guid.GUID?,
    context: CoreAutomationRemoteOperationContext?,
    operandIds: Array<AutomationRemoteOperationOperandId?>
  ): Unit

  @InterfaceMethod(1)
  public fun IsExtensionSupported(extensionId: com.sun.jna.platform.win32.Guid.GUID?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAutomationRemoteOperationExtensionProvider> {
    public override fun getValue() =
        ABI.makeICoreAutomationRemoteOperationExtensionProvider(pointer.getPointer(0))

    public fun setValue(value: ICoreAutomationRemoteOperationExtensionProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAutomationRemoteOperationExtensionProvider {
    public val __247371461_Ptr: Pointer?

    public val _247371461_VtblPtr: Pointer?
      get() = __247371461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CallExtension(
      extensionId: com.sun.jna.platform.win32.Guid.GUID?,
      context: CoreAutomationRemoteOperationContext?,
      operandIds: Array<AutomationRemoteOperationOperandId?>
    ): Unit {
      val fnPtr = _247371461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__247371461_Ptr, marshalToNative(extensionId),
          marshalToNative(context), operandIds.size,marshalToNative(operandIds),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun IsExtensionSupported(extensionId: com.sun.jna.platform.win32.Guid.GUID?):
        Boolean {
      val fnPtr = _247371461_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__247371461_Ptr, marshalToNative(extensionId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreAutomationRemoteOperationExtensionProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __247371461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAutomationRemoteOperationExtensionProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88f53e67dc69553ba0aa70477e724da8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAutomationRemoteOperationExtensionProvider(ptr: Pointer?): WithDefault =
        ICoreAutomationRemoteOperationExtensionProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreAutomationRemoteOperationExtensionProvider {
      val address = segment.toRawLongValue()
      return makeICoreAutomationRemoteOperationExtensionProvider(Pointer(address))
    }

    public override fun toNative(obj: ICoreAutomationRemoteOperationExtensionProvider):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__247371461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAutomationRemoteOperationExtensionProvider):
        Array<ICoreAutomationRemoteOperationExtensionProvider?> = (elements as
        Array<ICoreAutomationRemoteOperationExtensionProvider?>).castToImpl<ICoreAutomationRemoteOperationExtensionProvider,ICoreAutomationRemoteOperationExtensionProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAutomationRemoteOperationExtensionProvider?>
        = arrayOfNulls<ICoreAutomationRemoteOperationExtensionProvider_Impl>(size) as
        Array<ICoreAutomationRemoteOperationExtensionProvider?>
  }
}
