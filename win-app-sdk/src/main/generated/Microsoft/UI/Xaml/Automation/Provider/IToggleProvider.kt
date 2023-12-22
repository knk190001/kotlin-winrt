package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.ToggleState
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

@ABIMarker(IToggleProvider.ABI::class)
@Signature("{021080c2-30a9-52ef-bc32-2b79847b6ba7}")
@Guid("021080c230a952efbc322b79847b6ba7")
@WinRTInterface("021080c230a952efbc322b79847b6ba7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleProvider.ByReference::class)
public interface IToggleProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ToggleState(): ToggleState?

  @InterfaceMethod(1)
  public fun Toggle(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleProvider> {
    public override fun getValue() = ABI.makeIToggleProvider(pointer.getPointer(0))

    public fun setValue(value: IToggleProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleProvider {
    public val __1361046222_Ptr: Pointer?

    public val _1361046222_VtblPtr: Pointer?
      get() = __1361046222_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ToggleState(): ToggleState? {
      val fnPtr = _1361046222_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToggleState>()
      val hr = fn.invokeHR(arrayOf(__1361046222_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToggleState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Toggle(): Unit {
      val fnPtr = _1361046222_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1361046222_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToggleProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1361046222_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("021080c230a952efbc322b79847b6ba7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleProvider(ptr: Pointer?): WithDefault = IToggleProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleProvider {
      val address = segment.toRawLongValue()
      return makeIToggleProvider(Pointer(address))
    }

    public override fun toNative(obj: IToggleProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1361046222_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleProvider): Array<IToggleProvider?> = (elements as
        Array<IToggleProvider?>).castToImpl<IToggleProvider,IToggleProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleProvider?> =
        arrayOfNulls<IToggleProvider_Impl>(size) as Array<IToggleProvider?>
  }
}
