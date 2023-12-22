package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ICommandBarFlyout2.ABI::class)
@Signature("{5f81ec9e-a9d2-5f04-b5b1-013daef026dd}")
@Guid("5f81ec9ea9d25f04b5b1013daef026dd")
@WinRTInterface("5f81ec9ea9d25f04b5b1013daef026dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyout2.ByReference::class)
public interface ICommandBarFlyout2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlwaysExpanded(): Boolean

  @InterfaceMethod(1)
  public fun put_AlwaysExpanded(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyout2> {
    public override fun getValue() = ABI.makeICommandBarFlyout2(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyout2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyout2 {
    public val __91109576_Ptr: Pointer?

    public val _91109576_VtblPtr: Pointer?
      get() = __91109576_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlwaysExpanded(): Boolean {
      val fnPtr = _91109576_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__91109576_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AlwaysExpanded(value: Boolean): Unit {
      val fnPtr = _91109576_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91109576_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBarFlyout2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __91109576_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyout2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f81ec9ea9d25f04b5b1013daef026dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyout2(ptr: Pointer?): WithDefault = ICommandBarFlyout2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyout2 {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyout2(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyout2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__91109576_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyout2): Array<ICommandBarFlyout2?> =
        (elements as
        Array<ICommandBarFlyout2?>).castToImpl<ICommandBarFlyout2,ICommandBarFlyout2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyout2?> =
        arrayOfNulls<ICommandBarFlyout2_Impl>(size) as Array<ICommandBarFlyout2?>
  }
}
