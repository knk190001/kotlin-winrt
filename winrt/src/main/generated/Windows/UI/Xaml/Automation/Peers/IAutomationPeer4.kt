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

@ABIMarker(IAutomationPeer4.ABI::class)
@Signature("{761ce752-73c1-4f44-be75-43c49ec0d4d5}")
@Guid("761ce75273c14f44be7543c49ec0d4d5")
@WinRTInterface("761ce75273c14f44be7543c49ec0d4d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer4.ByReference::class)
public interface IAutomationPeer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLandmarkType(): AutomationLandmarkType?

  @InterfaceMethod(1)
  public fun GetLocalizedLandmarkType(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer4> {
    public override fun getValue() = ABI.makeIAutomationPeer4(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer4 {
    public val __1075421565_Ptr: Pointer?

    public val _1075421565_VtblPtr: Pointer?
      get() = __1075421565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLandmarkType(): AutomationLandmarkType? {
      val fnPtr = _1075421565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationLandmarkType>()
      val hr = fn.invokeHR(arrayOf(__1075421565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationLandmarkType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetLocalizedLandmarkType(): String? {
      val fnPtr = _1075421565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1075421565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("761ce75273c14f44be7543c49ec0d4d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer4(ptr: Pointer?): WithDefault = IAutomationPeer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer4 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer4(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer4): Array<IAutomationPeer4?> = (elements as
        Array<IAutomationPeer4?>).castToImpl<IAutomationPeer4,IAutomationPeer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer4?> =
        arrayOfNulls<IAutomationPeer4_Impl>(size) as Array<IAutomationPeer4?>
  }
}
