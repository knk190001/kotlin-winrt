package Microsoft.UI.Content

import Microsoft.UI.DisplayId
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

@ABIMarker(IContentSiteEnvironmentView.ABI::class)
@Signature("{5b6fe420-0bb3-54dd-8589-786cf02e38f1}")
@Guid("5b6fe4200bb354dd8589786cf02e38f1")
@WinRTInterface("5b6fe4200bb354dd8589786cf02e38f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteEnvironmentView.ByReference::class)
public interface IContentSiteEnvironmentView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppWindowId(): WindowId?

  @InterfaceMethod(1)
  public fun get_DisplayId(): DisplayId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteEnvironmentView> {
    public override fun getValue() = ABI.makeIContentSiteEnvironmentView(pointer.getPointer(0))

    public fun setValue(value: IContentSiteEnvironmentView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteEnvironmentView {
    public val __1424251778_Ptr: Pointer?

    public val _1424251778_VtblPtr: Pointer?
      get() = __1424251778_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppWindowId(): WindowId? {
      val fnPtr = _1424251778_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__1424251778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayId(): DisplayId? {
      val fnPtr = _1424251778_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayId>()
      val hr = fn.invokeHR(arrayOf(__1424251778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayId>(result.getValue())
      return resultValue
    }
  }

  public class IContentSiteEnvironmentView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1424251778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteEnvironmentView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b6fe4200bb354dd8589786cf02e38f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteEnvironmentView(ptr: Pointer?): WithDefault =
        IContentSiteEnvironmentView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteEnvironmentView {
      val address = segment.toRawLongValue()
      return makeIContentSiteEnvironmentView(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteEnvironmentView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1424251778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteEnvironmentView):
        Array<IContentSiteEnvironmentView?> = (elements as
        Array<IContentSiteEnvironmentView?>).castToImpl<IContentSiteEnvironmentView,IContentSiteEnvironmentView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteEnvironmentView?> =
        arrayOfNulls<IContentSiteEnvironmentView_Impl>(size) as Array<IContentSiteEnvironmentView?>
  }
}
