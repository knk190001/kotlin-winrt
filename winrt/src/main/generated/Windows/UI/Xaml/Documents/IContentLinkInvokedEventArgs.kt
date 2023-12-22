package Windows.UI.Xaml.Documents

import Windows.UI.Text.ContentLinkInfo
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

@ABIMarker(IContentLinkInvokedEventArgs.ABI::class)
@Signature("{546717c1-e8df-4593-9639-97595fdf8310}")
@Guid("546717c1e8df4593963997595fdf8310")
@WinRTInterface("546717c1e8df4593963997595fdf8310")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentLinkInvokedEventArgs.ByReference::class)
public interface IContentLinkInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentLinkInfo(): ContentLinkInfo?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentLinkInvokedEventArgs> {
    public override fun getValue() = ABI.makeIContentLinkInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentLinkInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentLinkInvokedEventArgs {
    public val __1438147562_Ptr: Pointer?

    public val _1438147562_VtblPtr: Pointer?
      get() = __1438147562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentLinkInfo(): ContentLinkInfo? {
      val fnPtr = _1438147562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkInfo>()
      val hr = fn.invokeHR(arrayOf(__1438147562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1438147562_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1438147562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1438147562_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1438147562_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentLinkInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1438147562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentLinkInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("546717c1e8df4593963997595fdf8310")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentLinkInvokedEventArgs(ptr: Pointer?): WithDefault =
        IContentLinkInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentLinkInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentLinkInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentLinkInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1438147562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentLinkInvokedEventArgs):
        Array<IContentLinkInvokedEventArgs?> = (elements as
        Array<IContentLinkInvokedEventArgs?>).castToImpl<IContentLinkInvokedEventArgs,IContentLinkInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentLinkInvokedEventArgs?> =
        arrayOfNulls<IContentLinkInvokedEventArgs_Impl>(size) as
        Array<IContentLinkInvokedEventArgs?>
  }
}
