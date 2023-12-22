package Windows.System

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFolder
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

@ABIMarker(ILauncherStatics3.ABI::class)
@Signature("{234261a8-9db3-4683-aa42-dc6f51d33847}")
@Guid("234261a89db34683aa42dc6f51d33847")
@WinRTInterface("234261a89db34683aa42dc6f51d33847")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILauncherStatics3.ByReference::class)
public interface ILauncherStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LaunchFolderAsync(folder: IStorageFolder?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun LaunchFolderAsync(folder: IStorageFolder?, options: FolderLauncherOptions?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILauncherStatics3> {
    public override fun getValue() = ABI.makeILauncherStatics3(pointer.getPointer(0))

    public fun setValue(value: ILauncherStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILauncherStatics3 {
    public val __1765591491_Ptr: Pointer?

    public val _1765591491_VtblPtr: Pointer?
      get() = __1765591491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LaunchFolderAsync(folder: IStorageFolder?): IAsyncOperation<Boolean>? {
      val fnPtr = _1765591491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1765591491_Ptr, marshalToNative(folder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LaunchFolderAsync(folder: IStorageFolder?, options: FolderLauncherOptions?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1765591491_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1765591491_Ptr, marshalToNative(folder),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILauncherStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1765591491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILauncherStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("234261a89db34683aa42dc6f51d33847")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILauncherStatics3(ptr: Pointer?): WithDefault = ILauncherStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILauncherStatics3 {
      val address = segment.toRawLongValue()
      return makeILauncherStatics3(Pointer(address))
    }

    public override fun toNative(obj: ILauncherStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1765591491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILauncherStatics3): Array<ILauncherStatics3?> = (elements
        as Array<ILauncherStatics3?>).castToImpl<ILauncherStatics3,ILauncherStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILauncherStatics3?> =
        arrayOfNulls<ILauncherStatics3_Impl>(size) as Array<ILauncherStatics3?>
  }
}
