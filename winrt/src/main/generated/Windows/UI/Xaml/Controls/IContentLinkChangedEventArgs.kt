package Windows.UI.Xaml.Controls

import Windows.UI.Text.ContentLinkInfo
import Windows.UI.Xaml.Documents.TextRange
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

@ABIMarker(IContentLinkChangedEventArgs.ABI::class)
@Signature("{64f3f1de-89fb-4b77-8b9b-191b6d19290a}")
@Guid("64f3f1de89fb4b778b9b191b6d19290a")
@WinRTInterface("64f3f1de89fb4b778b9b191b6d19290a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentLinkChangedEventArgs.ByReference::class)
public interface IContentLinkChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeKind(): ContentLinkChangeKind?

  @InterfaceMethod(1)
  public fun get_ContentLinkInfo(): ContentLinkInfo?

  @InterfaceMethod(2)
  public fun get_TextRange(): TextRange?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentLinkChangedEventArgs> {
    public override fun getValue() = ABI.makeIContentLinkChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentLinkChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentLinkChangedEventArgs {
    public val __1737918170_Ptr: Pointer?

    public val _1737918170_VtblPtr: Pointer?
      get() = __1737918170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeKind(): ContentLinkChangeKind? {
      val fnPtr = _1737918170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkChangeKind>()
      val hr = fn.invokeHR(arrayOf(__1737918170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkChangeKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentLinkInfo(): ContentLinkInfo? {
      val fnPtr = _1737918170_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkInfo>()
      val hr = fn.invokeHR(arrayOf(__1737918170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TextRange(): TextRange? {
      val fnPtr = _1737918170_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextRange>()
      val hr = fn.invokeHR(arrayOf(__1737918170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextRange>(result.getValue())
      return resultValue
    }
  }

  public class IContentLinkChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1737918170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentLinkChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64f3f1de89fb4b778b9b191b6d19290a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentLinkChangedEventArgs(ptr: Pointer?): WithDefault =
        IContentLinkChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentLinkChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentLinkChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentLinkChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1737918170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentLinkChangedEventArgs):
        Array<IContentLinkChangedEventArgs?> = (elements as
        Array<IContentLinkChangedEventArgs?>).castToImpl<IContentLinkChangedEventArgs,IContentLinkChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentLinkChangedEventArgs?> =
        arrayOfNulls<IContentLinkChangedEventArgs_Impl>(size) as
        Array<IContentLinkChangedEventArgs?>
  }
}
