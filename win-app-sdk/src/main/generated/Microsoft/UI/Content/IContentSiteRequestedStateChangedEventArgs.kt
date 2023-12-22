package Microsoft.UI.Content

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

@ABIMarker(IContentSiteRequestedStateChangedEventArgs.ABI::class)
@Signature("{1b55fd1d-7292-562b-b4a1-d4de7972e684}")
@Guid("1b55fd1d7292562bb4a1d4de7972e684")
@WinRTInterface("1b55fd1d7292562bb4a1d4de7972e684")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteRequestedStateChangedEventArgs.ByReference::class)
public interface IContentSiteRequestedStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DidRequestedSizeChange(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteRequestedStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIContentSiteRequestedStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentSiteRequestedStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteRequestedStateChangedEventArgs {
    public val __937663676_Ptr: Pointer?

    public val _937663676_VtblPtr: Pointer?
      get() = __937663676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DidRequestedSizeChange(): Boolean {
      val fnPtr = _937663676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__937663676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContentSiteRequestedStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __937663676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteRequestedStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b55fd1d7292562bb4a1d4de7972e684")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteRequestedStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IContentSiteRequestedStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContentSiteRequestedStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentSiteRequestedStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteRequestedStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__937663676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteRequestedStateChangedEventArgs):
        Array<IContentSiteRequestedStateChangedEventArgs?> = (elements as
        Array<IContentSiteRequestedStateChangedEventArgs?>).castToImpl<IContentSiteRequestedStateChangedEventArgs,IContentSiteRequestedStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteRequestedStateChangedEventArgs?> =
        arrayOfNulls<IContentSiteRequestedStateChangedEventArgs_Impl>(size) as
        Array<IContentSiteRequestedStateChangedEventArgs?>
  }
}
