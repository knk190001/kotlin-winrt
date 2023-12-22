package Windows.Storage

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

@ABIMarker(IStorageLibraryChangeTracker2.ABI::class)
@Signature("{cd051c3b-0f9f-42f9-8fb3-158d82e13821}")
@Guid("cd051c3b0f9f42f98fb3158d82e13821")
@WinRTInterface("cd051c3b0f9f42f98fb3158d82e13821")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryChangeTracker2.ByReference::class)
public interface IStorageLibraryChangeTracker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Enable(options: StorageLibraryChangeTrackerOptions?): Unit

  @InterfaceMethod(1)
  public fun Disable(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryChangeTracker2> {
    public override fun getValue() = ABI.makeIStorageLibraryChangeTracker2(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryChangeTracker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryChangeTracker2 {
    public val __1541315267_Ptr: Pointer?

    public val _1541315267_VtblPtr: Pointer?
      get() = __1541315267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Enable(options: StorageLibraryChangeTrackerOptions?): Unit {
      val fnPtr = _1541315267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541315267_Ptr, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Disable(): Unit {
      val fnPtr = _1541315267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541315267_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageLibraryChangeTracker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1541315267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryChangeTracker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd051c3b0f9f42f98fb3158d82e13821")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryChangeTracker2(ptr: Pointer?): WithDefault =
        IStorageLibraryChangeTracker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryChangeTracker2 {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryChangeTracker2(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryChangeTracker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1541315267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeTracker2):
        Array<IStorageLibraryChangeTracker2?> = (elements as
        Array<IStorageLibraryChangeTracker2?>).castToImpl<IStorageLibraryChangeTracker2,IStorageLibraryChangeTracker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeTracker2?> =
        arrayOfNulls<IStorageLibraryChangeTracker2_Impl>(size) as
        Array<IStorageLibraryChangeTracker2?>
  }
}
