package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.WindowId
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

@ABIMarker(IDesktopChildSiteBridgeStatics.ABI::class)
@Signature("{ab6b82de-6a47-5de3-a860-613c8db679ab}")
@Guid("ab6b82de6a475de3a860613c8db679ab")
@WinRTInterface("ab6b82de6a475de3a860613c8db679ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopChildSiteBridgeStatics.ByReference::class)
public interface IDesktopChildSiteBridgeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?, parentWindowId: WindowId?): DesktopChildSiteBridge?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopChildSiteBridgeStatics> {
    public override fun getValue() = ABI.makeIDesktopChildSiteBridgeStatics(pointer.getPointer(0))

    public fun setValue(value: IDesktopChildSiteBridgeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopChildSiteBridgeStatics {
    public val __122252683_Ptr: Pointer?

    public val _122252683_VtblPtr: Pointer?
      get() = __122252683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?, parentWindowId: WindowId?):
        DesktopChildSiteBridge? {
      val fnPtr = _122252683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DesktopChildSiteBridge>()
      val hr = fn.invokeHR(arrayOf(__122252683_Ptr, marshalToNative(compositor),
          marshalToNative(parentWindowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DesktopChildSiteBridge>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopChildSiteBridgeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __122252683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopChildSiteBridgeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab6b82de6a475de3a860613c8db679ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopChildSiteBridgeStatics(ptr: Pointer?): WithDefault =
        IDesktopChildSiteBridgeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopChildSiteBridgeStatics {
      val address = segment.toRawLongValue()
      return makeIDesktopChildSiteBridgeStatics(Pointer(address))
    }

    public override fun toNative(obj: IDesktopChildSiteBridgeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__122252683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopChildSiteBridgeStatics):
        Array<IDesktopChildSiteBridgeStatics?> = (elements as
        Array<IDesktopChildSiteBridgeStatics?>).castToImpl<IDesktopChildSiteBridgeStatics,IDesktopChildSiteBridgeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopChildSiteBridgeStatics?> =
        arrayOfNulls<IDesktopChildSiteBridgeStatics_Impl>(size) as
        Array<IDesktopChildSiteBridgeStatics?>
  }
}
