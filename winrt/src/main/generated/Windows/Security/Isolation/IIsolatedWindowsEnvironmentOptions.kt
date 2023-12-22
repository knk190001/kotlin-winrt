package Windows.Security.Isolation

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

@ABIMarker(IIsolatedWindowsEnvironmentOptions.ABI::class)
@Signature("{b71d98f7-61f0-4008-b207-0bf9eb2d76f2}")
@Guid("b71d98f761f04008b2070bf9eb2d76f2")
@WinRTInterface("b71d98f761f04008b2070bf9eb2d76f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentOptions.ByReference::class)
public interface IIsolatedWindowsEnvironmentOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnvironmentOwnerId(): String?

  @InterfaceMethod(1)
  public fun put_EnvironmentOwnerId(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_AllowedClipboardFormats(): IsolatedWindowsEnvironmentAllowedClipboardFormats?

  @InterfaceMethod(3)
  public fun put_AllowedClipboardFormats(value: IsolatedWindowsEnvironmentAllowedClipboardFormats?):
      Unit

  @InterfaceMethod(4)
  public fun get_ClipboardCopyPasteDirections():
      IsolatedWindowsEnvironmentClipboardCopyPasteDirections?

  @InterfaceMethod(5)
  public
      fun put_ClipboardCopyPasteDirections(value: IsolatedWindowsEnvironmentClipboardCopyPasteDirections?):
      Unit

  @InterfaceMethod(6)
  public fun get_AvailablePrinters(): IsolatedWindowsEnvironmentAvailablePrinters?

  @InterfaceMethod(7)
  public fun put_AvailablePrinters(value: IsolatedWindowsEnvironmentAvailablePrinters?): Unit

  @InterfaceMethod(8)
  public fun get_SharedHostFolderPath(): String?

  @InterfaceMethod(9)
  public fun get_SharedFolderNameInEnvironment(): String?

  @InterfaceMethod(10)
  public fun ShareHostFolderForUntrustedItems(SharedHostFolderPath: String?,
      ShareFolderNameInEnvironment: String?): Unit

  @InterfaceMethod(11)
  public fun get_PersistUserProfile(): Boolean

  @InterfaceMethod(12)
  public fun put_PersistUserProfile(value: Boolean): Unit

  @InterfaceMethod(13)
  public fun get_AllowGraphicsHardwareAcceleration(): Boolean

  @InterfaceMethod(14)
  public fun put_AllowGraphicsHardwareAcceleration(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_AllowCameraAndMicrophoneAccess(): Boolean

  @InterfaceMethod(16)
  public fun put_AllowCameraAndMicrophoneAccess(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentOptions> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentOptions(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentOptions {
    public val __1044526377_Ptr: Pointer?

    public val _1044526377_VtblPtr: Pointer?
      get() = __1044526377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnvironmentOwnerId(): String? {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EnvironmentOwnerId(value: String?): Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AllowedClipboardFormats():
        IsolatedWindowsEnvironmentAllowedClipboardFormats? {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentAllowedClipboardFormats>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentAllowedClipboardFormats>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun put_AllowedClipboardFormats(value: IsolatedWindowsEnvironmentAllowedClipboardFormats?):
        Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ClipboardCopyPasteDirections():
        IsolatedWindowsEnvironmentClipboardCopyPasteDirections? {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentClipboardCopyPasteDirections>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentClipboardCopyPasteDirections>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun put_ClipboardCopyPasteDirections(value: IsolatedWindowsEnvironmentClipboardCopyPasteDirections?):
        Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AvailablePrinters(): IsolatedWindowsEnvironmentAvailablePrinters? {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentAvailablePrinters>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentAvailablePrinters>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_AvailablePrinters(value: IsolatedWindowsEnvironmentAvailablePrinters?):
        Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SharedHostFolderPath(): String? {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SharedFolderNameInEnvironment(): String? {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ShareHostFolderForUntrustedItems(SharedHostFolderPath: String?,
        ShareFolderNameInEnvironment: String?): Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, marshalToNative(SharedHostFolderPath),
          marshalToNative(ShareFolderNameInEnvironment),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_PersistUserProfile(): Boolean {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_PersistUserProfile(value: Boolean): Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_AllowGraphicsHardwareAcceleration(): Boolean {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_AllowGraphicsHardwareAcceleration(value: Boolean): Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_AllowCameraAndMicrophoneAccess(): Boolean {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_AllowCameraAndMicrophoneAccess(value: Boolean): Unit {
      val fnPtr = _1044526377_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1044526377_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironmentOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1044526377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b71d98f761f04008b2070bf9eb2d76f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentOptions(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentOptions {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentOptions(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1044526377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentOptions):
        Array<IIsolatedWindowsEnvironmentOptions?> = (elements as
        Array<IIsolatedWindowsEnvironmentOptions?>).castToImpl<IIsolatedWindowsEnvironmentOptions,IIsolatedWindowsEnvironmentOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentOptions?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentOptions_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentOptions?>
  }
}
