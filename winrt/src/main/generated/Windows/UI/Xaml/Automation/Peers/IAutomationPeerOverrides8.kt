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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeerOverrides8.ABI::class)
@Signature("{0e1ebbd4-a003-4936-8175-f5457c07f0c6}")
@Guid("0e1ebbd4a00349368175f5457c07f0c6")
@WinRTInterface("0e1ebbd4a00349368175f5457c07f0c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides8.ByReference::class)
public interface IAutomationPeerOverrides8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetHeadingLevelCore(): AutomationHeadingLevel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides8> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides8(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides8 {
    public val __706645410_Ptr: Pointer?

    public val _706645410_VtblPtr: Pointer?
      get() = __706645410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetHeadingLevelCore(): AutomationHeadingLevel? {
      val fnPtr = _706645410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationHeadingLevel>()
      val hr = fn.invokeHR(arrayOf(__706645410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationHeadingLevel>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerOverrides8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e1ebbd4a00349368175f5457c07f0c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides8(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides8 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides8(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides8):
        Array<IAutomationPeerOverrides8?> = (elements as
        Array<IAutomationPeerOverrides8?>).castToImpl<IAutomationPeerOverrides8,IAutomationPeerOverrides8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides8?> =
        arrayOfNulls<IAutomationPeerOverrides8_Impl>(size) as Array<IAutomationPeerOverrides8?>
  }
}
