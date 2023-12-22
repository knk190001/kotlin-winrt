package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(ISelectorItemAutomationPeerFactory.ABI::class)
@Signature("{66d7edfb-786d-4362-a964-ebfb21776c30}")
@Guid("66d7edfb786d4362a964ebfb21776c30")
@WinRTInterface("66d7edfb786d4362a964ebfb21776c30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectorItemAutomationPeerFactory.ByReference::class)
public interface ISelectorItemAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithParentAndItem(
    item: IUnknown?,
    parent: SelectorAutomationPeer?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): SelectorItemAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectorItemAutomationPeerFactory> {
    public override fun getValue() =
        ABI.makeISelectorItemAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: ISelectorItemAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectorItemAutomationPeerFactory {
    public val __1483114375_Ptr: Pointer?

    public val _1483114375_VtblPtr: Pointer?
      get() = __1483114375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithParentAndItem(
      item: IUnknown?,
      parent: SelectorAutomationPeer?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): SelectorItemAutomationPeer? {
      val fnPtr = _1483114375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SelectorItemAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1483114375_Ptr, marshalToNative(item), marshalToNative(parent),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SelectorItemAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class ISelectorItemAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1483114375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectorItemAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66d7edfb786d4362a964ebfb21776c30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectorItemAutomationPeerFactory(ptr: Pointer?): WithDefault =
        ISelectorItemAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectorItemAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeISelectorItemAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISelectorItemAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1483114375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectorItemAutomationPeerFactory):
        Array<ISelectorItemAutomationPeerFactory?> = (elements as
        Array<ISelectorItemAutomationPeerFactory?>).castToImpl<ISelectorItemAutomationPeerFactory,ISelectorItemAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectorItemAutomationPeerFactory?> =
        arrayOfNulls<ISelectorItemAutomationPeerFactory_Impl>(size) as
        Array<ISelectorItemAutomationPeerFactory?>
  }
}
