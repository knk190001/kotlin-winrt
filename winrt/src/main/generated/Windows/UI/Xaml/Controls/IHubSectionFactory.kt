package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IHubSectionFactory.ABI::class)
@Signature("{fff55fa2-ece4-4bba-aa3b-9804aef47883}")
@Guid("fff55fa2ece44bbaaa3b9804aef47883")
@WinRTInterface("fff55fa2ece44bbaaa3b9804aef47883")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubSectionFactory.ByReference::class)
public interface IHubSectionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): HubSection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubSectionFactory> {
    public override fun getValue() = ABI.makeIHubSectionFactory(pointer.getPointer(0))

    public fun setValue(value: IHubSectionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubSectionFactory {
    public val __818126366_Ptr: Pointer?

    public val _818126366_VtblPtr: Pointer?
      get() = __818126366_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        HubSection? {
      val fnPtr = _818126366_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HubSection>()
      val hr = fn.invokeHR(arrayOf(__818126366_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HubSection>(result.getValue())
      return resultValue
    }
  }

  public class IHubSectionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __818126366_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubSectionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fff55fa2ece44bbaaa3b9804aef47883")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubSectionFactory(ptr: Pointer?): WithDefault = IHubSectionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubSectionFactory {
      val address = segment.toRawLongValue()
      return makeIHubSectionFactory(Pointer(address))
    }

    public override fun toNative(obj: IHubSectionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__818126366_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubSectionFactory): Array<IHubSectionFactory?> =
        (elements as
        Array<IHubSectionFactory?>).castToImpl<IHubSectionFactory,IHubSectionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubSectionFactory?> =
        arrayOfNulls<IHubSectionFactory_Impl>(size) as Array<IHubSectionFactory?>
  }
}
