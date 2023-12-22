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

@ABIMarker(ISplitView2.ABI::class)
@Signature("{5ea7dc10-cc83-409a-82f9-3e91d6d7084f}")
@Guid("5ea7dc10cc83409a82f93e91d6d7084f")
@WinRTInterface("5ea7dc10cc83409a82f93e91d6d7084f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitView2.ByReference::class)
public interface ISplitView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayMode(): LightDismissOverlayMode?

  @InterfaceMethod(1)
  public fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISplitView2> {
    public override fun getValue() = ABI.makeISplitView2(pointer.getPointer(0))

    public fun setValue(value: ISplitView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitView2 {
    public val __1871062961_Ptr: Pointer?

    public val _1871062961_VtblPtr: Pointer?
      get() = __1871062961_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayMode(): LightDismissOverlayMode? {
      val fnPtr = _1871062961_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LightDismissOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__1871062961_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LightDismissOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_LightDismissOverlayMode(value: LightDismissOverlayMode?): Unit {
      val fnPtr = _1871062961_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1871062961_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplitView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1871062961_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ea7dc10cc83409a82f93e91d6d7084f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitView2(ptr: Pointer?): WithDefault = ISplitView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitView2 {
      val address = segment.toRawLongValue()
      return makeISplitView2(Pointer(address))
    }

    public override fun toNative(obj: ISplitView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1871062961_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitView2): Array<ISplitView2?> = (elements as
        Array<ISplitView2?>).castToImpl<ISplitView2,ISplitView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitView2?> =
        arrayOfNulls<ISplitView2_Impl>(size) as Array<ISplitView2?>
  }
}
