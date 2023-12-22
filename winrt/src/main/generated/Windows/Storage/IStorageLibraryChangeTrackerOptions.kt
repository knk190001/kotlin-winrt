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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageLibraryChangeTrackerOptions.ABI::class)
@Signature("{bb52bcd4-1a6d-59c0-ad2a-823a20532483}")
@Guid("bb52bcd41a6d59c0ad2a823a20532483")
@WinRTInterface("bb52bcd41a6d59c0ad2a823a20532483")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryChangeTrackerOptions.ByReference::class)
public interface IStorageLibraryChangeTrackerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TrackChangeDetails(): Boolean

  @InterfaceMethod(1)
  public fun put_TrackChangeDetails(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryChangeTrackerOptions> {
    public override fun getValue() =
        ABI.makeIStorageLibraryChangeTrackerOptions(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryChangeTrackerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryChangeTrackerOptions {
    public val __204064847_Ptr: Pointer?

    public val _204064847_VtblPtr: Pointer?
      get() = __204064847_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TrackChangeDetails(): Boolean {
      val fnPtr = _204064847_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__204064847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_TrackChangeDetails(value: Boolean): Unit {
      val fnPtr = _204064847_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__204064847_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageLibraryChangeTrackerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __204064847_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryChangeTrackerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb52bcd41a6d59c0ad2a823a20532483")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryChangeTrackerOptions(ptr: Pointer?): WithDefault =
        IStorageLibraryChangeTrackerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryChangeTrackerOptions {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryChangeTrackerOptions(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryChangeTrackerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__204064847_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeTrackerOptions):
        Array<IStorageLibraryChangeTrackerOptions?> = (elements as
        Array<IStorageLibraryChangeTrackerOptions?>).castToImpl<IStorageLibraryChangeTrackerOptions,IStorageLibraryChangeTrackerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeTrackerOptions?> =
        arrayOfNulls<IStorageLibraryChangeTrackerOptions_Impl>(size) as
        Array<IStorageLibraryChangeTrackerOptions?>
  }
}
