package Windows.Web.UI

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

@ABIMarker(IWebViewControlSettings.ABI::class)
@Signature("{c9967fbf-5e98-4cfd-8cce-27b0911e3de8}")
@Guid("c9967fbf5e984cfd8cce27b0911e3de8")
@WinRTInterface("c9967fbf5e984cfd8cce27b0911e3de8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlSettings.ByReference::class)
public interface IWebViewControlSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsJavaScriptEnabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_IsJavaScriptEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsIndexedDBEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsIndexedDBEnabled(): Boolean

  @InterfaceMethod(4)
  public fun put_IsScriptNotifyAllowed(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsScriptNotifyAllowed(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlSettings> {
    public override fun getValue() = ABI.makeIWebViewControlSettings(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlSettings {
    public val __1482302807_Ptr: Pointer?

    public val _1482302807_VtblPtr: Pointer?
      get() = __1482302807_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsJavaScriptEnabled(value: Boolean): Unit {
      val fnPtr = _1482302807_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1482302807_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_IsJavaScriptEnabled(): Boolean {
      val fnPtr = _1482302807_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1482302807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsIndexedDBEnabled(value: Boolean): Unit {
      val fnPtr = _1482302807_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1482302807_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsIndexedDBEnabled(): Boolean {
      val fnPtr = _1482302807_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1482302807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsScriptNotifyAllowed(value: Boolean): Unit {
      val fnPtr = _1482302807_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1482302807_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsScriptNotifyAllowed(): Boolean {
      val fnPtr = _1482302807_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1482302807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWebViewControlSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1482302807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9967fbf5e984cfd8cce27b0911e3de8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlSettings(ptr: Pointer?): WithDefault =
        IWebViewControlSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlSettings {
      val address = segment.toRawLongValue()
      return makeIWebViewControlSettings(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1482302807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlSettings): Array<IWebViewControlSettings?>
        = (elements as
        Array<IWebViewControlSettings?>).castToImpl<IWebViewControlSettings,IWebViewControlSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlSettings?> =
        arrayOfNulls<IWebViewControlSettings_Impl>(size) as Array<IWebViewControlSettings?>
  }
}
