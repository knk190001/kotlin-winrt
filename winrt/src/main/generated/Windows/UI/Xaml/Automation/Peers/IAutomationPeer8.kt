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

@ABIMarker(IAutomationPeer8.ABI::class)
@Signature("{5c6a1fe6-9a55-4d7f-9498-cfe429e92da8}")
@Guid("5c6a1fe69a554d7f9498cfe429e92da8")
@WinRTInterface("5c6a1fe69a554d7f9498cfe429e92da8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer8.ByReference::class)
public interface IAutomationPeer8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetHeadingLevel(): AutomationHeadingLevel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer8> {
    public override fun getValue() = ABI.makeIAutomationPeer8(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer8 {
    public val __1075421561_Ptr: Pointer?

    public val _1075421561_VtblPtr: Pointer?
      get() = __1075421561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetHeadingLevel(): AutomationHeadingLevel? {
      val fnPtr = _1075421561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationHeadingLevel>()
      val hr = fn.invokeHR(arrayOf(__1075421561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationHeadingLevel>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeer8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c6a1fe69a554d7f9498cfe429e92da8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer8(ptr: Pointer?): WithDefault = IAutomationPeer8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer8 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer8(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer8): Array<IAutomationPeer8?> = (elements as
        Array<IAutomationPeer8?>).castToImpl<IAutomationPeer8,IAutomationPeer8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer8?> =
        arrayOfNulls<IAutomationPeer8_Impl>(size) as Array<IAutomationPeer8?>
  }
}
