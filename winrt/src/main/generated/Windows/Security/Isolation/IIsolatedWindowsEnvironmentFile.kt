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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIsolatedWindowsEnvironmentFile.ABI::class)
@Signature("{4d5ae1ef-029f-4101-8c35-fe91bf9cd5f0}")
@Guid("4d5ae1ef029f41018c35fe91bf9cd5f0")
@WinRTInterface("4d5ae1ef029f41018c35fe91bf9cd5f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentFile.ByReference::class)
public interface IIsolatedWindowsEnvironmentFile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_HostPath(): String?

  @InterfaceMethod(2)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentFile> {
    public override fun getValue() = ABI.makeIIsolatedWindowsEnvironmentFile(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentFile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentFile {
    public val __1941126173_Ptr: Pointer?

    public val _1941126173_VtblPtr: Pointer?
      get() = __1941126173_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1941126173_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1941126173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HostPath(): String? {
      val fnPtr = _1941126173_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1941126173_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Close(): Unit {
      val fnPtr = _1941126173_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1941126173_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironmentFile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1941126173_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentFile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d5ae1ef029f41018c35fe91bf9cd5f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentFile(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentFile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentFile {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentFile(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentFile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1941126173_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentFile):
        Array<IIsolatedWindowsEnvironmentFile?> = (elements as
        Array<IIsolatedWindowsEnvironmentFile?>).castToImpl<IIsolatedWindowsEnvironmentFile,IIsolatedWindowsEnvironmentFile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentFile?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentFile_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentFile?>
  }
}
