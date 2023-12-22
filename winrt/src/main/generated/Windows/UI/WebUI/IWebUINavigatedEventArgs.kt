package Windows.UI.WebUI

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

@ABIMarker(IWebUINavigatedEventArgs.ABI::class)
@Signature("{a75841b8-2499-4030-a69d-15d2d9cfe524}")
@Guid("a75841b824994030a69d15d2d9cfe524")
@WinRTInterface("a75841b824994030a69d15d2d9cfe524")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUINavigatedEventArgs.ByReference::class)
public interface IWebUINavigatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigatedOperation(): WebUINavigatedOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUINavigatedEventArgs> {
    public override fun getValue() = ABI.makeIWebUINavigatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebUINavigatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUINavigatedEventArgs {
    public val __1637555108_Ptr: Pointer?

    public val _1637555108_VtblPtr: Pointer?
      get() = __1637555108_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigatedOperation(): WebUINavigatedOperation? {
      val fnPtr = _1637555108_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUINavigatedOperation>()
      val hr = fn.invokeHR(arrayOf(__1637555108_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUINavigatedOperation>(result.getValue())
      return resultValue
    }
  }

  public class IWebUINavigatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1637555108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUINavigatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a75841b824994030a69d15d2d9cfe524")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUINavigatedEventArgs(ptr: Pointer?): WithDefault =
        IWebUINavigatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUINavigatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebUINavigatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebUINavigatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1637555108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUINavigatedEventArgs):
        Array<IWebUINavigatedEventArgs?> = (elements as
        Array<IWebUINavigatedEventArgs?>).castToImpl<IWebUINavigatedEventArgs,IWebUINavigatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUINavigatedEventArgs?> =
        arrayOfNulls<IWebUINavigatedEventArgs_Impl>(size) as Array<IWebUINavigatedEventArgs?>
  }
}
