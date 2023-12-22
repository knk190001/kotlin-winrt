package Windows.System

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
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

@ABIMarker(ILauncherStatics.ABI::class)
@Signature("{277151c3-9e3e-42f6-91a4-5dfdeb232451}")
@Guid("277151c39e3e42f691a45dfdeb232451")
@WinRTInterface("277151c39e3e42f691a45dfdeb232451")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherStatics.ByReference::class)
public interface ILauncherStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LaunchFileAsync(`file`: IStorageFile?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun LaunchFileAsync(`file`: IStorageFile?, options: LauncherOptions?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun LaunchUriAsync(uri: Uri?): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun LaunchUriAsync(uri: Uri?, options: LauncherOptions?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherStatics> {
    public override fun getValue() = ABI.makeILauncherStatics(pointer.getPointer(0))

    public fun setValue(value: ILauncherStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherStatics {
    public val __195501898_Ptr: Pointer?

    public val _195501898_VtblPtr: Pointer?
      get() = __195501898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LaunchFileAsync(`file`: IStorageFile?): IAsyncOperation<Boolean>? {
      val fnPtr = _195501898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__195501898_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LaunchFileAsync(`file`: IStorageFile?, options: LauncherOptions?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _195501898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__195501898_Ptr, marshalToNative(file), marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun LaunchUriAsync(uri: Uri?): IAsyncOperation<Boolean>? {
      val fnPtr = _195501898_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__195501898_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LaunchUriAsync(uri: Uri?, options: LauncherOptions?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _195501898_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__195501898_Ptr, marshalToNative(uri), marshalToNative(options),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILauncherStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __195501898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("277151c39e3e42f691a45dfdeb232451")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherStatics(ptr: Pointer?): WithDefault = ILauncherStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherStatics {
      val address = segment.toRawLongValue()
      return makeILauncherStatics(Pointer(address))
    }

    public override fun toNative(obj: ILauncherStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__195501898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherStatics): Array<ILauncherStatics?> = (elements as
        Array<ILauncherStatics?>).castToImpl<ILauncherStatics,ILauncherStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherStatics?> =
        arrayOfNulls<ILauncherStatics_Impl>(size) as Array<ILauncherStatics?>
  }
}
