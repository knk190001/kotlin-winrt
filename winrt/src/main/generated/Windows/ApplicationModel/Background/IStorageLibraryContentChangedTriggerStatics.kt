package Windows.ApplicationModel.Background

import Windows.Foundation.Collections.IIterable
import Windows.Storage.StorageLibrary
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

@ABIMarker(IStorageLibraryContentChangedTriggerStatics.ABI::class)
@Signature("{7f9f1b39-5f90-4e12-914e-a7d8e0bbfb18}")
@Guid("7f9f1b395f904e12914ea7d8e0bbfb18")
@WinRTInterface("7f9f1b395f904e12914ea7d8e0bbfb18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryContentChangedTriggerStatics.ByReference::class)
public interface IStorageLibraryContentChangedTriggerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(storageLibrary: StorageLibrary?): StorageLibraryContentChangedTrigger?

  @InterfaceMethod(1)
  public fun CreateFromLibraries(storageLibraries: IIterable<StorageLibrary?>?):
      StorageLibraryContentChangedTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryContentChangedTriggerStatics> {
    public override fun getValue() =
        ABI.makeIStorageLibraryContentChangedTriggerStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryContentChangedTriggerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryContentChangedTriggerStatics {
    public val __1385799257_Ptr: Pointer?

    public val _1385799257_VtblPtr: Pointer?
      get() = __1385799257_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(storageLibrary: StorageLibrary?):
        StorageLibraryContentChangedTrigger? {
      val fnPtr = _1385799257_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageLibraryContentChangedTrigger>()
      val hr = fn.invokeHR(arrayOf(__1385799257_Ptr, marshalToNative(storageLibrary), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageLibraryContentChangedTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromLibraries(storageLibraries: IIterable<StorageLibrary?>?):
        StorageLibraryContentChangedTrigger? {
      val fnPtr = _1385799257_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageLibraryContentChangedTrigger>()
      val hr = fn.invokeHR(arrayOf(__1385799257_Ptr, marshalToNative(storageLibraries), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageLibraryContentChangedTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibraryContentChangedTriggerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1385799257_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryContentChangedTriggerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f9f1b395f904e12914ea7d8e0bbfb18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryContentChangedTriggerStatics(ptr: Pointer?): WithDefault =
        IStorageLibraryContentChangedTriggerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStorageLibraryContentChangedTriggerStatics {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryContentChangedTriggerStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryContentChangedTriggerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1385799257_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryContentChangedTriggerStatics):
        Array<IStorageLibraryContentChangedTriggerStatics?> = (elements as
        Array<IStorageLibraryContentChangedTriggerStatics?>).castToImpl<IStorageLibraryContentChangedTriggerStatics,IStorageLibraryContentChangedTriggerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryContentChangedTriggerStatics?> =
        arrayOfNulls<IStorageLibraryContentChangedTriggerStatics_Impl>(size) as
        Array<IStorageLibraryContentChangedTriggerStatics?>
  }
}
