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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeerOverrides4.ABI::class)
@Signature("{b186cda2-5d46-4bcd-a811-269ad15b3aee}")
@Guid("b186cda25d464bcda811269ad15b3aee")
@WinRTInterface("b186cda25d464bcda811269ad15b3aee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides4.ByReference::class)
public interface IAutomationPeerOverrides4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLandmarkTypeCore(): AutomationLandmarkType?

  @InterfaceMethod(1)
  public fun GetLocalizedLandmarkTypeCore(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides4> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides4(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides4 {
    public val __706645406_Ptr: Pointer?

    public val _706645406_VtblPtr: Pointer?
      get() = __706645406_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLandmarkTypeCore(): AutomationLandmarkType? {
      val fnPtr = _706645406_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLandmarkType>()
      val hr = fn.invokeHR(arrayOf(__706645406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLandmarkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetLocalizedLandmarkTypeCore(): String? {
      val fnPtr = _706645406_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__706645406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerOverrides4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b186cda25d464bcda811269ad15b3aee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides4(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides4 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides4(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides4):
        Array<IAutomationPeerOverrides4?> = (elements as
        Array<IAutomationPeerOverrides4?>).castToImpl<IAutomationPeerOverrides4,IAutomationPeerOverrides4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides4?> =
        arrayOfNulls<IAutomationPeerOverrides4_Impl>(size) as Array<IAutomationPeerOverrides4?>
  }
}
