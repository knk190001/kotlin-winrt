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

@ABIMarker(IPopupWindowSiteBridge.ABI::class)
@Signature("{044597a2-e6ee-5dab-abe0-1923ebe34c2e}")
@Guid("044597a2e6ee5dababe01923ebe34c2e")
@WinRTInterface("044597a2e6ee5dababe01923ebe34c2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupWindowSiteBridge.ByReference::class)
public interface IPopupWindowSiteBridge : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Anchored(): Boolean

  @InterfaceMethod(1)
  public fun put_Anchored(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPopupWindowSiteBridge> {
    public override fun getValue() = ABI.makeIPopupWindowSiteBridge(pointer.getPointer(0))

    public fun setValue(value: IPopupWindowSiteBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupWindowSiteBridge {
    public val __1788809378_Ptr: Pointer?

    public val _1788809378_VtblPtr: Pointer?
      get() = __1788809378_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Anchored(): Boolean {
      val fnPtr = _1788809378_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1788809378_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Anchored(value: Boolean): Unit {
      val fnPtr = _1788809378_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788809378_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPopupWindowSiteBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1788809378_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupWindowSiteBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("044597a2e6ee5dababe01923ebe34c2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupWindowSiteBridge(ptr: Pointer?): WithDefault =
        IPopupWindowSiteBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupWindowSiteBridge {
      val address = segment.toRawLongValue()
      return makeIPopupWindowSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: IPopupWindowSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1788809378_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupWindowSiteBridge): Array<IPopupWindowSiteBridge?> =
        (elements as
        Array<IPopupWindowSiteBridge?>).castToImpl<IPopupWindowSiteBridge,IPopupWindowSiteBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupWindowSiteBridge?> =
        arrayOfNulls<IPopupWindowSiteBridge_Impl>(size) as Array<IPopupWindowSiteBridge?>
  }
}
