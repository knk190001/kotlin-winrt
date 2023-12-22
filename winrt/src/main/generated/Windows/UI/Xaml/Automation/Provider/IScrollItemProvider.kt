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

@ABIMarker(IScrollItemProvider.ABI::class)
@Signature("{9a3ec090-5d2c-4e42-9ee6-9d58db100b55}")
@Guid("9a3ec0905d2c4e429ee69d58db100b55")
@WinRTInterface("9a3ec0905d2c4e429ee69d58db100b55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollItemProvider.ByReference::class)
public interface IScrollItemProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ScrollIntoView(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollItemProvider> {
    public override fun getValue() = ABI.makeIScrollItemProvider(pointer.getPointer(0))

    public fun setValue(value: IScrollItemProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollItemProvider {
    public val __8885417_Ptr: Pointer?

    public val _8885417_VtblPtr: Pointer?
      get() = __8885417_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ScrollIntoView(): Unit {
      val fnPtr = _8885417_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__8885417_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollItemProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __8885417_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollItemProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a3ec0905d2c4e429ee69d58db100b55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollItemProvider(ptr: Pointer?): WithDefault = IScrollItemProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollItemProvider {
      val address = segment.toRawLongValue()
      return makeIScrollItemProvider(Pointer(address))
    }

    public override fun toNative(obj: IScrollItemProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__8885417_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollItemProvider): Array<IScrollItemProvider?> =
        (elements as
        Array<IScrollItemProvider?>).castToImpl<IScrollItemProvider,IScrollItemProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollItemProvider?> =
        arrayOfNulls<IScrollItemProvider_Impl>(size) as Array<IScrollItemProvider?>
  }
}
