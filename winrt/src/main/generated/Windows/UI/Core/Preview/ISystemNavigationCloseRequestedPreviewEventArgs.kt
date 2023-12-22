package Windows.UI.Core.Preview

import Windows.Foundation.Deferral
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

@ABIMarker(ISystemNavigationCloseRequestedPreviewEventArgs.ABI::class)
@Signature("{83d00de1-cbe5-4f31-8414-361da046518f}")
@Guid("83d00de1cbe54f318414361da046518f")
@WinRTInterface("83d00de1cbe54f318414361da046518f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemNavigationCloseRequestedPreviewEventArgs.ByReference::class)
public interface ISystemNavigationCloseRequestedPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemNavigationCloseRequestedPreviewEventArgs> {
    public override fun getValue() =
        ABI.makeISystemNavigationCloseRequestedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISystemNavigationCloseRequestedPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemNavigationCloseRequestedPreviewEventArgs {
    public val __1413736887_Ptr: Pointer?

    public val _1413736887_VtblPtr: Pointer?
      get() = __1413736887_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1413736887_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1413736887_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1413736887_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1413736887_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1413736887_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1413736887_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ISystemNavigationCloseRequestedPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1413736887_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemNavigationCloseRequestedPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83d00de1cbe54f318414361da046518f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemNavigationCloseRequestedPreviewEventArgs(ptr: Pointer?): WithDefault =
        ISystemNavigationCloseRequestedPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISystemNavigationCloseRequestedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeISystemNavigationCloseRequestedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISystemNavigationCloseRequestedPreviewEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1413736887_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemNavigationCloseRequestedPreviewEventArgs):
        Array<ISystemNavigationCloseRequestedPreviewEventArgs?> = (elements as
        Array<ISystemNavigationCloseRequestedPreviewEventArgs?>).castToImpl<ISystemNavigationCloseRequestedPreviewEventArgs,ISystemNavigationCloseRequestedPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemNavigationCloseRequestedPreviewEventArgs?>
        = arrayOfNulls<ISystemNavigationCloseRequestedPreviewEventArgs_Impl>(size) as
        Array<ISystemNavigationCloseRequestedPreviewEventArgs?>
  }
}
