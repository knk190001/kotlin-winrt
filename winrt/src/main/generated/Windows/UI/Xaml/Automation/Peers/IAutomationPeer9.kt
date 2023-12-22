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

@ABIMarker(IAutomationPeer9.ABI::class)
@Signature("{df2e0265-1d74-57fa-8094-f81c2f626b8c}")
@Guid("df2e02651d7457fa8094f81c2f626b8c")
@WinRTInterface("df2e02651d7457fa8094f81c2f626b8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer9.ByReference::class)
public interface IAutomationPeer9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsDialog(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer9> {
    public override fun getValue() = ABI.makeIAutomationPeer9(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer9 {
    public val __1075421560_Ptr: Pointer?

    public val _1075421560_VtblPtr: Pointer?
      get() = __1075421560_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsDialog(): Boolean {
      val fnPtr = _1075421560_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1075421560_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeer9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421560_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df2e02651d7457fa8094f81c2f626b8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer9(ptr: Pointer?): WithDefault = IAutomationPeer9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer9 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer9(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421560_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer9): Array<IAutomationPeer9?> = (elements as
        Array<IAutomationPeer9?>).castToImpl<IAutomationPeer9,IAutomationPeer9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer9?> =
        arrayOfNulls<IAutomationPeer9_Impl>(size) as Array<IAutomationPeer9?>
  }
}
