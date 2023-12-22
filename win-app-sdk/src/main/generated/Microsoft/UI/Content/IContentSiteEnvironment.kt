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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentSiteEnvironment.ABI::class)
@Signature("{685d085d-be53-55d1-aec4-ba2273d5468b}")
@Guid("685d085dbe5355d1aec4ba2273d5468b")
@WinRTInterface("685d085dbe5355d1aec4ba2273d5468b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteEnvironment.ByReference::class)
public interface IContentSiteEnvironment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppWindowId(): WindowId?

  @InterfaceMethod(1)
  public fun put_AppWindowId(value: WindowId?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayId(): DisplayId?

  @InterfaceMethod(3)
  public fun put_DisplayId(value: DisplayId?): Unit

  @InterfaceMethod(4)
  public fun get_View(): ContentSiteEnvironmentView?

  @InterfaceMethod(5)
  public fun NotifySettingChanged(setting: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteEnvironment> {
    public override fun getValue() = ABI.makeIContentSiteEnvironment(pointer.getPointer(0))

    public fun setValue(value: IContentSiteEnvironment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteEnvironment {
    public val __1382126397_Ptr: Pointer?

    public val _1382126397_VtblPtr: Pointer?
      get() = __1382126397_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppWindowId(): WindowId? {
      val fnPtr = _1382126397_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__1382126397_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AppWindowId(value: WindowId?): Unit {
      val fnPtr = _1382126397_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1382126397_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayId(): DisplayId? {
      val fnPtr = _1382126397_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayId>()
      val hr = fn.invokeHR(arrayOf(__1382126397_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayId(value: DisplayId?): Unit {
      val fnPtr = _1382126397_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1382126397_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_View(): ContentSiteEnvironmentView? {
      val fnPtr = _1382126397_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSiteEnvironmentView>()
      val hr = fn.invokeHR(arrayOf(__1382126397_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSiteEnvironmentView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun NotifySettingChanged(setting: String?): Unit {
      val fnPtr = _1382126397_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1382126397_Ptr, marshalToNative(setting),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentSiteEnvironment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1382126397_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteEnvironment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("685d085dbe5355d1aec4ba2273d5468b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteEnvironment(ptr: Pointer?): WithDefault =
        IContentSiteEnvironment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteEnvironment {
      val address = segment.toRawLongValue()
      return makeIContentSiteEnvironment(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1382126397_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteEnvironment): Array<IContentSiteEnvironment?>
        = (elements as
        Array<IContentSiteEnvironment?>).castToImpl<IContentSiteEnvironment,IContentSiteEnvironment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteEnvironment?> =
        arrayOfNulls<IContentSiteEnvironment_Impl>(size) as Array<IContentSiteEnvironment?>
  }
}
