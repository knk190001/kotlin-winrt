package Windows.UI.Xaml.Automation.Provider

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

@ABIMarker(IInvokeProvider.ABI::class)
@Signature("{f7d1a187-b13c-4540-b09e-6778e2dc9ba5}")
@Guid("f7d1a187b13c4540b09e6778e2dc9ba5")
@WinRTInterface("f7d1a187b13c4540b09e6778e2dc9ba5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInvokeProvider.ByReference::class)
public interface IInvokeProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Invoke(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInvokeProvider> {
    public override fun getValue() = ABI.makeIInvokeProvider(pointer.getPointer(0))

    public fun setValue(value: IInvokeProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInvokeProvider {
    public val __907541087_Ptr: Pointer?

    public val _907541087_VtblPtr: Pointer?
      get() = __907541087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Invoke(): Unit {
      val fnPtr = _907541087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907541087_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInvokeProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __907541087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInvokeProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7d1a187b13c4540b09e6778e2dc9ba5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInvokeProvider(ptr: Pointer?): WithDefault = IInvokeProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInvokeProvider {
      val address = segment.toRawLongValue()
      return makeIInvokeProvider(Pointer(address))
    }

    public override fun toNative(obj: IInvokeProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__907541087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInvokeProvider): Array<IInvokeProvider?> = (elements as
        Array<IInvokeProvider?>).castToImpl<IInvokeProvider,IInvokeProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInvokeProvider?> =
        arrayOfNulls<IInvokeProvider_Impl>(size) as Array<IInvokeProvider?>
  }
}
