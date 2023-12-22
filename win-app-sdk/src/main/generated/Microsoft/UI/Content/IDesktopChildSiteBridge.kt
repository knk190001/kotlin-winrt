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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDesktopChildSiteBridge.ABI::class)
@Signature("{b2f2ff7b-1825-51b0-b80b-7599889c569f}")
@Guid("b2f2ff7b182551b0b80b7599889c569f")
@WinRTInterface("b2f2ff7b182551b0b80b7599889c569f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopChildSiteBridge.ByReference::class)
public interface IDesktopChildSiteBridge : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResizePolicy(): ContentSizePolicy?

  @InterfaceMethod(1)
  public fun put_ResizePolicy(value: ContentSizePolicy?): Unit

  @InterfaceMethod(2)
  public fun get_SiteView(): ContentSiteView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopChildSiteBridge> {
    public override fun getValue() = ABI.makeIDesktopChildSiteBridge(pointer.getPointer(0))

    public fun setValue(value: IDesktopChildSiteBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopChildSiteBridge {
    public val __1567661862_Ptr: Pointer?

    public val _1567661862_VtblPtr: Pointer?
      get() = __1567661862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResizePolicy(): ContentSizePolicy? {
      val fnPtr = _1567661862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSizePolicy>()
      val hr = fn.invokeHR(arrayOf(__1567661862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSizePolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ResizePolicy(value: ContentSizePolicy?): Unit {
      val fnPtr = _1567661862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1567661862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SiteView(): ContentSiteView? {
      val fnPtr = _1567661862_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSiteView>()
      val hr = fn.invokeHR(arrayOf(__1567661862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSiteView>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopChildSiteBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1567661862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopChildSiteBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2f2ff7b182551b0b80b7599889c569f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopChildSiteBridge(ptr: Pointer?): WithDefault =
        IDesktopChildSiteBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopChildSiteBridge {
      val address = segment.toRawLongValue()
      return makeIDesktopChildSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: IDesktopChildSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1567661862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopChildSiteBridge): Array<IDesktopChildSiteBridge?>
        = (elements as
        Array<IDesktopChildSiteBridge?>).castToImpl<IDesktopChildSiteBridge,IDesktopChildSiteBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopChildSiteBridge?> =
        arrayOfNulls<IDesktopChildSiteBridge_Impl>(size) as Array<IDesktopChildSiteBridge?>
  }
}
