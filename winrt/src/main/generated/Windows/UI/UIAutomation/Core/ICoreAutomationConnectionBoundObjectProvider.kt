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

@ABIMarker(ICoreAutomationConnectionBoundObjectProvider.ABI::class)
@Signature("{0620bb64-9616-5593-be3a-eb8e6daeb3fa}")
@Guid("0620bb6496165593be3aeb8e6daeb3fa")
@WinRTInterface("0620bb6496165593be3aeb8e6daeb3fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAutomationConnectionBoundObjectProvider.ByReference::class)
public interface ICoreAutomationConnectionBoundObjectProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsComThreadingRequired(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAutomationConnectionBoundObjectProvider> {
    public override fun getValue() =
        ABI.makeICoreAutomationConnectionBoundObjectProvider(pointer.getPointer(0))

    public fun setValue(value: ICoreAutomationConnectionBoundObjectProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAutomationConnectionBoundObjectProvider {
    public val __177568644_Ptr: Pointer?

    public val _177568644_VtblPtr: Pointer?
      get() = __177568644_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsComThreadingRequired(): Boolean {
      val fnPtr = _177568644_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__177568644_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreAutomationConnectionBoundObjectProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177568644_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAutomationConnectionBoundObjectProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0620bb6496165593be3aeb8e6daeb3fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAutomationConnectionBoundObjectProvider(ptr: Pointer?): WithDefault =
        ICoreAutomationConnectionBoundObjectProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreAutomationConnectionBoundObjectProvider {
      val address = segment.toRawLongValue()
      return makeICoreAutomationConnectionBoundObjectProvider(Pointer(address))
    }

    public override fun toNative(obj: ICoreAutomationConnectionBoundObjectProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177568644_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAutomationConnectionBoundObjectProvider):
        Array<ICoreAutomationConnectionBoundObjectProvider?> = (elements as
        Array<ICoreAutomationConnectionBoundObjectProvider?>).castToImpl<ICoreAutomationConnectionBoundObjectProvider,ICoreAutomationConnectionBoundObjectProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAutomationConnectionBoundObjectProvider?> =
        arrayOfNulls<ICoreAutomationConnectionBoundObjectProvider_Impl>(size) as
        Array<ICoreAutomationConnectionBoundObjectProvider?>
  }
}
