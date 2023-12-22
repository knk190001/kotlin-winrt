package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Controls.MenuBar
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

@ABIMarker(IMenuBarAutomationPeerFactory.ABI::class)
@Signature("{d3e1ca3f-1702-5bd3-8adb-e6f6cb9e7531}")
@Guid("d3e1ca3f17025bd38adbe6f6cb9e7531")
@WinRTInterface("d3e1ca3f17025bd38adbe6f6cb9e7531")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuBarAutomationPeerFactory.ByReference::class)
public interface IMenuBarAutomationPeerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    owner: MenuBar?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MenuBarAutomationPeer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuBarAutomationPeerFactory> {
    public override fun getValue() = ABI.makeIMenuBarAutomationPeerFactory(pointer.getPointer(0))

    public fun setValue(value: IMenuBarAutomationPeerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuBarAutomationPeerFactory {
    public val __1496528704_Ptr: Pointer?

    public val _1496528704_VtblPtr: Pointer?
      get() = __1496528704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      owner: MenuBar?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MenuBarAutomationPeer? {
      val fnPtr = _1496528704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuBarAutomationPeer>()
      val hr = fn.invokeHR(arrayOf(__1496528704_Ptr, marshalToNative(owner),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuBarAutomationPeer>(result.getValue())
      return resultValue
    }
  }

  public class IMenuBarAutomationPeerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1496528704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuBarAutomationPeerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3e1ca3f17025bd38adbe6f6cb9e7531")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuBarAutomationPeerFactory(ptr: Pointer?): WithDefault =
        IMenuBarAutomationPeerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuBarAutomationPeerFactory {
      val address = segment.toRawLongValue()
      return makeIMenuBarAutomationPeerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMenuBarAutomationPeerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1496528704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuBarAutomationPeerFactory):
        Array<IMenuBarAutomationPeerFactory?> = (elements as
        Array<IMenuBarAutomationPeerFactory?>).castToImpl<IMenuBarAutomationPeerFactory,IMenuBarAutomationPeerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuBarAutomationPeerFactory?> =
        arrayOfNulls<IMenuBarAutomationPeerFactory_Impl>(size) as
        Array<IMenuBarAutomationPeerFactory?>
  }
}
