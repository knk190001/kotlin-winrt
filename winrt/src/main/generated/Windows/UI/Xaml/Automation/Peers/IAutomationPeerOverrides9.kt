package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IAutomationPeerOverrides9.ABI::class)
@Signature("{f3709e8b-091a-5db5-b896-ff78f01990c9}")
@Guid("f3709e8b091a5db5b896ff78f01990c9")
@WinRTInterface("f3709e8b091a5db5b896ff78f01990c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides9.ByReference::class)
public interface IAutomationPeerOverrides9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsDialogCore(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides9> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides9(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides9 {
    public val __706645411_Ptr: Pointer?

    public val _706645411_VtblPtr: Pointer?
      get() = __706645411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsDialogCore(): Boolean {
      val fnPtr = _706645411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__706645411_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeerOverrides9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3709e8b091a5db5b896ff78f01990c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides9(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides9 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides9(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides9):
        Array<IAutomationPeerOverrides9?> = (elements as
        Array<IAutomationPeerOverrides9?>).castToImpl<IAutomationPeerOverrides9,IAutomationPeerOverrides9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides9?> =
        arrayOfNulls<IAutomationPeerOverrides9_Impl>(size) as Array<IAutomationPeerOverrides9?>
  }
}
