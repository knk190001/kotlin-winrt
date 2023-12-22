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

@ABIMarker(IAutomationPeerStatics3.ABI::class)
@Signature("{572c5714-7f87-4271-819f-6cf4c4d022d0}")
@Guid("572c57147f874271819f6cf4c4d022d0")
@WinRTInterface("572c57147f874271819f6cf4c4d022d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerStatics3.ByReference::class)
public interface IAutomationPeerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GenerateRawElementProviderRuntimeId(): RawElementProviderRuntimeId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerStatics3> {
    public override fun getValue() = ABI.makeIAutomationPeerStatics3(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerStatics3 {
    public val __1061218305_Ptr: Pointer?

    public val _1061218305_VtblPtr: Pointer?
      get() = __1061218305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GenerateRawElementProviderRuntimeId(): RawElementProviderRuntimeId? {
      val fnPtr = _1061218305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RawElementProviderRuntimeId>()
      val hr = fn.invokeHR(arrayOf(__1061218305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RawElementProviderRuntimeId>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1061218305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("572c57147f874271819f6cf4c4d022d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerStatics3(ptr: Pointer?): WithDefault =
        IAutomationPeerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerStatics3 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1061218305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerStatics3): Array<IAutomationPeerStatics3?>
        = (elements as
        Array<IAutomationPeerStatics3?>).castToImpl<IAutomationPeerStatics3,IAutomationPeerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerStatics3?> =
        arrayOfNulls<IAutomationPeerStatics3_Impl>(size) as Array<IAutomationPeerStatics3?>
  }
}
