package Windows.Media.Import

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

@ABIMarker(IPhotoImportItemImportedEventArgs.ABI::class)
@Signature("{42cb2fdd-7d68-47b5-bc7c-ceb73e0c77dc}")
@Guid("42cb2fdd7d6847b5bc7cceb73e0c77dc")
@WinRTInterface("42cb2fdd7d6847b5bc7cceb73e0c77dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportItemImportedEventArgs.ByReference::class)
public interface IPhotoImportItemImportedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ImportedItem(): PhotoImportItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportItemImportedEventArgs> {
    public override fun getValue() =
        ABI.makeIPhotoImportItemImportedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportItemImportedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportItemImportedEventArgs {
    public val __905119304_Ptr: Pointer?

    public val _905119304_VtblPtr: Pointer?
      get() = __905119304_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ImportedItem(): PhotoImportItem? {
      val fnPtr = _905119304_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportItem>()
      val hr = fn.invokeHR(arrayOf(__905119304_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportItem>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportItemImportedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __905119304_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportItemImportedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42cb2fdd7d6847b5bc7cceb73e0c77dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportItemImportedEventArgs(ptr: Pointer?): WithDefault =
        IPhotoImportItemImportedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportItemImportedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPhotoImportItemImportedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportItemImportedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__905119304_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportItemImportedEventArgs):
        Array<IPhotoImportItemImportedEventArgs?> = (elements as
        Array<IPhotoImportItemImportedEventArgs?>).castToImpl<IPhotoImportItemImportedEventArgs,IPhotoImportItemImportedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportItemImportedEventArgs?> =
        arrayOfNulls<IPhotoImportItemImportedEventArgs_Impl>(size) as
        Array<IPhotoImportItemImportedEventArgs?>
  }
}
