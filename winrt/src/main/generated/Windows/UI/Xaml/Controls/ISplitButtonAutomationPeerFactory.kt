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

@ABIMarker(ISplitButtonAutomationPeerFactory.ABI::class)
@Signature("{d63a2534-77dc-5361-8422-4ad8750f45f4}")
@Guid("d63a253477dc536184224ad8750f45f4")
@WinRTInterface("d63a253477dc536184224ad8750f45f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitButtonAutomationPeerFactory.ByReference::class)
public interface ISplitButtonAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: SplitButton?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SplitButtonAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitButtonAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeISplitButtonAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISplitButtonAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitButtonAutomationPeerFactory {
    public val __846772159_Ptr: Pointer?

    public val _846772159_VtblPtr: Pointer?
      get() = __846772159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: SplitButton?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SplitButtonAutomationPeer? {
      val fnPtr = _846772159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplitButtonAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__846772159_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplitButtonAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISplitButtonAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __846772159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitButtonAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d63a253477dc536184224ad8750f45f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitButtonAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISplitButtonAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitButtonAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISplitButtonAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISplitButtonAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__846772159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitButtonAutomationPeerFactory):
        Array<ISplitButtonAutomationPeerFactory?> = (elements as
        Array<ISplitButtonAutomationPeerFactory?>).castToImpl<ISplitButtonAutomationPeerFactory,ISplitButtonAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitButtonAutomationPeerFactory?> =
        arrayOfNulls<ISplitButtonAutomationPeerFactory_Impl>(size) as
        Array<ISplitButtonAutomationPeerFactory?>
  }
}
