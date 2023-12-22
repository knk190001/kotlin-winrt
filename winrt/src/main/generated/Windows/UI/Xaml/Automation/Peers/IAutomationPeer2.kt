package Windows.UI.Xaml.Automation.Peers

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeer2.ABI::class)
@Signature("{ea1f89c7-ebf5-4ab8-88f7-680d821dac61}")
@Guid("ea1f89c7ebf54ab888f7680d821dac61")
@WinRTInterface("ea1f89c7ebf54ab888f7680d821dac61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer2.ByReference::class)
public interface IAutomationPeer2 : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer2> {
    public override fun getValue() = ABI.makeIAutomationPeer2(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer2 {
    public val __1075421567_Ptr: Pointer?

    public val _1075421567_VtblPtr: Pointer?
      get() = __1075421567_Ptr?.getPointer(0)
  }

  public class IAutomationPeer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea1f89c7ebf54ab888f7680d821dac61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer2(ptr: Pointer?): WithDefault = IAutomationPeer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer2 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer2(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer2): Array<IAutomationPeer2?> = (elements as
        Array<IAutomationPeer2?>).castToImpl<IAutomationPeer2,IAutomationPeer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer2?> =
        arrayOfNulls<IAutomationPeer2_Impl>(size) as Array<IAutomationPeer2?>
  }
}
