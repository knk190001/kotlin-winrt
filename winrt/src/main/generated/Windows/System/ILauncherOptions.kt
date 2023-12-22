package Windows.System

import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILauncherOptions.ABI::class)
@Signature("{bafa21d8-b071-4cd8-853e-341203e557d3}")
@Guid("bafa21d8b0714cd8853e341203e557d3")
@WinRTInterface("bafa21d8b0714cd8853e341203e557d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherOptions.ByReference::class)
public interface ILauncherOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TreatAsUntrusted(): Boolean

  @InterfaceMethod(1)
  public fun put_TreatAsUntrusted(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_DisplayApplicationPicker(): Boolean

  @InterfaceMethod(3)
  public fun put_DisplayApplicationPicker(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_UI(): LauncherUIOptions?

  @InterfaceMethod(5)
  public fun get_PreferredApplicationPackageFamilyName(): String?

  @InterfaceMethod(6)
  public fun put_PreferredApplicationPackageFamilyName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_PreferredApplicationDisplayName(): String?

  @InterfaceMethod(8)
  public fun put_PreferredApplicationDisplayName(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_FallbackUri(): Uri?

  @InterfaceMethod(10)
  public fun put_FallbackUri(value: Uri?): Unit

  @InterfaceMethod(11)
  public fun get_ContentType(): String?

  @InterfaceMethod(12)
  public fun put_ContentType(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherOptions> {
    public override fun getValue() = ABI.makeILauncherOptions(pointer.getPointer(0))

    public fun setValue(value: ILauncherOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherOptions {
    public val __452159375_Ptr: Pointer?

    public val _452159375_VtblPtr: Pointer?
      get() = __452159375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TreatAsUntrusted(): Boolean {
      val fnPtr = _452159375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TreatAsUntrusted(value: Boolean): Unit {
      val fnPtr = _452159375_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayApplicationPicker(): Boolean {
      val fnPtr = _452159375_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DisplayApplicationPicker(value: Boolean): Unit {
      val fnPtr = _452159375_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UI(): LauncherUIOptions? {
      val fnPtr = _452159375_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LauncherUIOptions>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LauncherUIOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PreferredApplicationPackageFamilyName(): String? {
      val fnPtr = _452159375_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PreferredApplicationPackageFamilyName(value: String?): Unit {
      val fnPtr = _452159375_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_PreferredApplicationDisplayName(): String? {
      val fnPtr = _452159375_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_PreferredApplicationDisplayName(value: String?): Unit {
      val fnPtr = _452159375_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_FallbackUri(): Uri? {
      val fnPtr = _452159375_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_FallbackUri(value: Uri?): Unit {
      val fnPtr = _452159375_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ContentType(): String? {
      val fnPtr = _452159375_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_ContentType(value: String?): Unit {
      val fnPtr = _452159375_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__452159375_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILauncherOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __452159375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bafa21d8b0714cd8853e341203e557d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherOptions(ptr: Pointer?): WithDefault = ILauncherOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherOptions {
      val address = segment.toRawLongValue()
      return makeILauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: ILauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__452159375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherOptions): Array<ILauncherOptions?> = (elements as
        Array<ILauncherOptions?>).castToImpl<ILauncherOptions,ILauncherOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherOptions?> =
        arrayOfNulls<ILauncherOptions_Impl>(size) as Array<ILauncherOptions?>
  }
}
