package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Controls.Pivot
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

@ABIMarker(IPivotAutomationPeerFactory.ABI::class)
@Signature("{3efe0f94-0c91-4341-b9ac-1b56b4e6b84f}")
@Guid("3efe0f940c914341b9ac1b56b4e6b84f")
@WinRTInterface("3efe0f940c914341b9ac1b56b4e6b84f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotAutomationPeerFactory.ByReference::class)
public interface IPivotAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithOwner(owner: Pivot?): PivotAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIPivotAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IPivotAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotAutomationPeerFactory {
    public val __1931672249_Ptr: Pointer?

    public val _1931672249_VtblPtr: Pointer?
      get() = __1931672249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithOwner(owner: Pivot?): PivotAutomationPeer? {
      val fnPtr = _1931672249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PivotAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1931672249_Ptr, marshalToNative(owner), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PivotAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IPivotAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1931672249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3efe0f940c914341b9ac1b56b4e6b84f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IPivotAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIPivotAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IPivotAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1931672249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotAutomationPeerFactory):
        Array<IPivotAutomationPeerFactory?> = (elements as
        Array<IPivotAutomationPeerFactory?>).castToImpl<IPivotAutomationPeerFactory,IPivotAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotAutomationPeerFactory?> =
        arrayOfNulls<IPivotAutomationPeerFactory_Impl>(size) as Array<IPivotAutomationPeerFactory?>
  }
}
