package Windows.System

import Windows.Foundation.Collections.IVector
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteLauncherOptions.ABI::class)
@Signature("{9e3a2788-2891-4cdf-a2d6-9dff7d02e693}")
@Guid("9e3a278828914cdfa2d69dff7d02e693")
@WinRTInterface("9e3a278828914cdfa2d69dff7d02e693")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteLauncherOptions.ByReference::class)
public interface IRemoteLauncherOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FallbackUri(): Uri?

  @InterfaceMethod(1)
  public fun put_FallbackUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_PreferredAppIds(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteLauncherOptions> {
    public override fun getValue() = ABI.makeIRemoteLauncherOptions(pointer.getPointer(0))

    public fun setValue(value: IRemoteLauncherOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteLauncherOptions {
    public val __475215447_Ptr: Pointer?

    public val _475215447_VtblPtr: Pointer?
      get() = __475215447_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FallbackUri(): Uri? {
      val fnPtr = _475215447_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__475215447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FallbackUri(value: Uri?): Unit {
      val fnPtr = _475215447_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__475215447_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PreferredAppIds(): IVector<String?>? {
      val fnPtr = _475215447_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__475215447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteLauncherOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __475215447_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteLauncherOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e3a278828914cdfa2d69dff7d02e693")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteLauncherOptions(ptr: Pointer?): WithDefault =
        IRemoteLauncherOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteLauncherOptions {
      val address = segment.toRawLongValue()
      return makeIRemoteLauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: IRemoteLauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__475215447_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteLauncherOptions): Array<IRemoteLauncherOptions?> =
        (elements as
        Array<IRemoteLauncherOptions?>).castToImpl<IRemoteLauncherOptions,IRemoteLauncherOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteLauncherOptions?> =
        arrayOfNulls<IRemoteLauncherOptions_Impl>(size) as Array<IRemoteLauncherOptions?>
  }
}
