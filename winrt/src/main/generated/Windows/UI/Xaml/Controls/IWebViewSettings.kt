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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewSettings.ABI::class)
@Signature("{1d50ad4d-abf6-4785-8df3-fdebc1270301}")
@Guid("1d50ad4dabf647858df3fdebc1270301")
@WinRTInterface("1d50ad4dabf647858df3fdebc1270301")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewSettings.ByReference::class)
public interface IWebViewSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsJavaScriptEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsJavaScriptEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsIndexedDBEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsIndexedDBEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewSettings> {
    public override fun getValue() = ABI.makeIWebViewSettings(pointer.getPointer(0))

    public fun setValue(value: IWebViewSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewSettings {
    public val __935006144_Ptr: Pointer?

    public val _935006144_VtblPtr: Pointer?
      get() = __935006144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsJavaScriptEnabled(): Boolean {
      val fnPtr = _935006144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__935006144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsJavaScriptEnabled(value: Boolean): Unit {
      val fnPtr = _935006144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__935006144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsIndexedDBEnabled(): Boolean {
      val fnPtr = _935006144_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__935006144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsIndexedDBEnabled(value: Boolean): Unit {
      val fnPtr = _935006144_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__935006144_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __935006144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d50ad4dabf647858df3fdebc1270301")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewSettings(ptr: Pointer?): WithDefault = IWebViewSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewSettings {
      val address = segment.toRawLongValue()
      return makeIWebViewSettings(Pointer(address))
    }

    public override fun toNative(obj: IWebViewSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__935006144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewSettings): Array<IWebViewSettings?> = (elements as
        Array<IWebViewSettings?>).castToImpl<IWebViewSettings,IWebViewSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewSettings?> =
        arrayOfNulls<IWebViewSettings_Impl>(size) as Array<IWebViewSettings?>
  }
}
