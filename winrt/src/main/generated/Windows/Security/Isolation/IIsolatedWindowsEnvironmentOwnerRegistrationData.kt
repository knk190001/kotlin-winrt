package Windows.Security.Isolation

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IIsolatedWindowsEnvironmentOwnerRegistrationData.ABI::class)
@Signature("{f888ec22-e8cf-56c0-b1df-90af4ad80e84}")
@Guid("f888ec22e8cf56c0b1df90af4ad80e84")
@WinRTInterface("f888ec22e8cf56c0b1df90af4ad80e84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentOwnerRegistrationData.ByReference::class)
public interface IIsolatedWindowsEnvironmentOwnerRegistrationData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShareableFolders(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_ProcessesRunnableAsSystem(): IVector<String?>?

  @InterfaceMethod(2)
  public fun get_ProcessesRunnableAsUser(): IVector<String?>?

  @InterfaceMethod(3)
  public fun get_ActivationFileExtensions(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentOwnerRegistrationData> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationData(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentOwnerRegistrationData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentOwnerRegistrationData {
    public val __127621809_Ptr: Pointer?

    public val _127621809_VtblPtr: Pointer?
      get() = __127621809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShareableFolders(): IVector<String?>? {
      val fnPtr = _127621809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__127621809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProcessesRunnableAsSystem(): IVector<String?>? {
      val fnPtr = _127621809_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__127621809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProcessesRunnableAsUser(): IVector<String?>? {
      val fnPtr = _127621809_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__127621809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ActivationFileExtensions(): IVector<String?>? {
      val fnPtr = _127621809_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__127621809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentOwnerRegistrationData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __127621809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentOwnerRegistrationData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f888ec22e8cf56c0b1df90af4ad80e84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentOwnerRegistrationData(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentOwnerRegistrationData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentOwnerRegistrationData {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentOwnerRegistrationData(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentOwnerRegistrationData):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__127621809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentOwnerRegistrationData):
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationData?> = (elements as
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationData?>).castToImpl<IIsolatedWindowsEnvironmentOwnerRegistrationData,IIsolatedWindowsEnvironmentOwnerRegistrationData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentOwnerRegistrationData?>
        = arrayOfNulls<IIsolatedWindowsEnvironmentOwnerRegistrationData_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationData?>
  }
}
