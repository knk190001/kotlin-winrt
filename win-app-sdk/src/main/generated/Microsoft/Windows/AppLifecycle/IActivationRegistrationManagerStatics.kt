package Microsoft.Windows.AppLifecycle

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

@ABIMarker(IActivationRegistrationManagerStatics.ABI::class)
@Signature("{5ac4e92e-017b-5d68-8198-f68636ab99d3}")
@Guid("5ac4e92e017b5d688198f68636ab99d3")
@WinRTInterface("5ac4e92e017b5d688198f68636ab99d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivationRegistrationManagerStatics.ByReference::class)
public interface IActivationRegistrationManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterForFileTypeActivation(
    supportedFileTypes: Array<String?>,
    logo: String?,
    displayName: String?,
    supportedVerbs: Array<String?>,
    exePath: String?
  ): Unit

  @InterfaceMethod(1)
  public fun RegisterForProtocolActivation(
    scheme: String?,
    logo: String?,
    displayName: String?,
    exePath: String?
  ): Unit

  @InterfaceMethod(2)
  public fun RegisterForStartupActivation(taskId: String?, exePath: String?): Unit

  @InterfaceMethod(3)
  public fun UnregisterForFileTypeActivation(fileTypes: Array<String?>, exePath: String?): Unit

  @InterfaceMethod(4)
  public fun UnregisterForProtocolActivation(scheme: String?, exePath: String?): Unit

  @InterfaceMethod(5)
  public fun UnregisterForStartupActivation(taskId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivationRegistrationManagerStatics> {
    public override fun getValue() =
        ABI.makeIActivationRegistrationManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IActivationRegistrationManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivationRegistrationManagerStatics {
    public val __787439268_Ptr: Pointer?

    public val _787439268_VtblPtr: Pointer?
      get() = __787439268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterForFileTypeActivation(
      supportedFileTypes: Array<String?>,
      logo: String?,
      displayName: String?,
      supportedVerbs: Array<String?>,
      exePath: String?
    ): Unit {
      val fnPtr = _787439268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__787439268_Ptr,
          supportedFileTypes.size,marshalToNative(supportedFileTypes), marshalToNative(logo),
          marshalToNative(displayName), supportedVerbs.size,marshalToNative(supportedVerbs),
          marshalToNative(exePath),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RegisterForProtocolActivation(
      scheme: String?,
      logo: String?,
      displayName: String?,
      exePath: String?
    ): Unit {
      val fnPtr = _787439268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__787439268_Ptr, marshalToNative(scheme), marshalToNative(logo),
          marshalToNative(displayName), marshalToNative(exePath),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RegisterForStartupActivation(taskId: String?, exePath: String?): Unit {
      val fnPtr = _787439268_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__787439268_Ptr, marshalToNative(taskId),
          marshalToNative(exePath),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun UnregisterForFileTypeActivation(fileTypes: Array<String?>,
        exePath: String?): Unit {
      val fnPtr = _787439268_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__787439268_Ptr, fileTypes.size,marshalToNative(fileTypes),
          marshalToNative(exePath),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun UnregisterForProtocolActivation(scheme: String?, exePath: String?): Unit {
      val fnPtr = _787439268_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__787439268_Ptr, marshalToNative(scheme),
          marshalToNative(exePath),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun UnregisterForStartupActivation(taskId: String?): Unit {
      val fnPtr = _787439268_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__787439268_Ptr, marshalToNative(taskId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IActivationRegistrationManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __787439268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivationRegistrationManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ac4e92e017b5d688198f68636ab99d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivationRegistrationManagerStatics(ptr: Pointer?): WithDefault =
        IActivationRegistrationManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivationRegistrationManagerStatics {
      val address = segment.toRawLongValue()
      return makeIActivationRegistrationManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IActivationRegistrationManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__787439268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivationRegistrationManagerStatics):
        Array<IActivationRegistrationManagerStatics?> = (elements as
        Array<IActivationRegistrationManagerStatics?>).castToImpl<IActivationRegistrationManagerStatics,IActivationRegistrationManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivationRegistrationManagerStatics?> =
        arrayOfNulls<IActivationRegistrationManagerStatics_Impl>(size) as
        Array<IActivationRegistrationManagerStatics?>
  }
}
