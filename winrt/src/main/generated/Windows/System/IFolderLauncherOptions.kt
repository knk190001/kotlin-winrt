package Windows.System

import Windows.Foundation.Collections.IVector
import Windows.Storage.IStorageItem
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFolderLauncherOptions.ABI::class)
@Signature("{bb91c27d-6b87-432a-bd04-776c6f5fb2ab}")
@Guid("bb91c27d6b87432abd04776c6f5fb2ab")
@WinRTInterface("bb91c27d6b87432abd04776c6f5fb2ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFolderLauncherOptions.ByReference::class)
public interface IFolderLauncherOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsToSelect(): IVector<IStorageItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFolderLauncherOptions> {
    public override fun getValue() = ABI.makeIFolderLauncherOptions(pointer.getPointer(0))

    public fun setValue(value: IFolderLauncherOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFolderLauncherOptions {
    public val __749154175_Ptr: Pointer?

    public val _749154175_VtblPtr: Pointer?
      get() = __749154175_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsToSelect(): IVector<IStorageItem?>? {
      val fnPtr = _749154175_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IStorageItem?>>()
      val hr = fn.invokeHR(arrayOf(__749154175_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IStorageItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IFolderLauncherOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __749154175_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFolderLauncherOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb91c27d6b87432abd04776c6f5fb2ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFolderLauncherOptions(ptr: Pointer?): WithDefault =
        IFolderLauncherOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFolderLauncherOptions {
      val address = segment.toRawLongValue()
      return makeIFolderLauncherOptions(Pointer(address))
    }

    public override fun toNative(obj: IFolderLauncherOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__749154175_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFolderLauncherOptions): Array<IFolderLauncherOptions?> =
        (elements as
        Array<IFolderLauncherOptions?>).castToImpl<IFolderLauncherOptions,IFolderLauncherOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFolderLauncherOptions?> =
        arrayOfNulls<IFolderLauncherOptions_Impl>(size) as Array<IFolderLauncherOptions?>
  }
}
