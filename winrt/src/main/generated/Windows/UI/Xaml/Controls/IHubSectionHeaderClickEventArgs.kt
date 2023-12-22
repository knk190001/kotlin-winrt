package Windows.UI.Xaml.Controls

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

@ABIMarker(IHubSectionHeaderClickEventArgs.ABI::class)
@Signature("{e1c5ef04-1edd-4112-aeeb-996c96400698}")
@Guid("e1c5ef041edd4112aeeb996c96400698")
@WinRTInterface("e1c5ef041edd4112aeeb996c96400698")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubSectionHeaderClickEventArgs.ByReference::class)
public interface IHubSectionHeaderClickEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Section(): HubSection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubSectionHeaderClickEventArgs> {
    public override fun getValue() = ABI.makeIHubSectionHeaderClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHubSectionHeaderClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubSectionHeaderClickEventArgs {
    public val __1412754104_Ptr: Pointer?

    public val _1412754104_VtblPtr: Pointer?
      get() = __1412754104_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Section(): HubSection? {
      val fnPtr = _1412754104_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HubSection>()
      val hr = fn.invokeHR(arrayOf(__1412754104_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HubSection>(result.getValue())
      return resultValue
    }
  }

  public class IHubSectionHeaderClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1412754104_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubSectionHeaderClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1c5ef041edd4112aeeb996c96400698")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubSectionHeaderClickEventArgs(ptr: Pointer?): WithDefault =
        IHubSectionHeaderClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubSectionHeaderClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIHubSectionHeaderClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHubSectionHeaderClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1412754104_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubSectionHeaderClickEventArgs):
        Array<IHubSectionHeaderClickEventArgs?> = (elements as
        Array<IHubSectionHeaderClickEventArgs?>).castToImpl<IHubSectionHeaderClickEventArgs,IHubSectionHeaderClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubSectionHeaderClickEventArgs?> =
        arrayOfNulls<IHubSectionHeaderClickEventArgs_Impl>(size) as
        Array<IHubSectionHeaderClickEventArgs?>
  }
}
