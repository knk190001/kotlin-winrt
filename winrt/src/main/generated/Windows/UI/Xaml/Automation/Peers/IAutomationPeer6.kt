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

@ABIMarker(IAutomationPeer6.ABI::class)
@Signature("{caf8608f-13ff-42fb-866d-22206434cc6b}")
@Guid("caf8608f13ff42fb866d22206434cc6b")
@WinRTInterface("caf8608f13ff42fb866d22206434cc6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer6.ByReference::class)
public interface IAutomationPeer6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCulture(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer6> {
    public override fun getValue() = ABI.makeIAutomationPeer6(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer6 {
    public val __1075421563_Ptr: Pointer?

    public val _1075421563_VtblPtr: Pointer?
      get() = __1075421563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCulture(): Int {
      val fnPtr = _1075421563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1075421563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeer6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("caf8608f13ff42fb866d22206434cc6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer6(ptr: Pointer?): WithDefault = IAutomationPeer6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer6 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer6(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer6): Array<IAutomationPeer6?> = (elements as
        Array<IAutomationPeer6?>).castToImpl<IAutomationPeer6,IAutomationPeer6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer6?> =
        arrayOfNulls<IAutomationPeer6_Impl>(size) as Array<IAutomationPeer6?>
  }
}
