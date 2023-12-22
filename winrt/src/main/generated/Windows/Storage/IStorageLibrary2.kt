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

@ABIMarker(IStorageLibrary2.ABI::class)
@Signature("{5b0ce348-fcb3-4031-afb0-a68d7bd44534}")
@Guid("5b0ce348fcb34031afb0a68d7bd44534")
@WinRTInterface("5b0ce348fcb34031afb0a68d7bd44534")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibrary2.ByReference::class)
public interface IStorageLibrary2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeTracker(): StorageLibraryChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibrary2> {
    public override fun getValue() = ABI.makeIStorageLibrary2(pointer.getPointer(0))

    public fun setValue(value: IStorageLibrary2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibrary2 {
    public val __431479993_Ptr: Pointer?

    public val _431479993_VtblPtr: Pointer?
      get() = __431479993_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeTracker(): StorageLibraryChangeTracker? {
      val fnPtr = _431479993_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageLibraryChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__431479993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageLibraryChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibrary2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __431479993_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibrary2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b0ce348fcb34031afb0a68d7bd44534")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibrary2(ptr: Pointer?): WithDefault = IStorageLibrary2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibrary2 {
      val address = segment.toRawLongValue()
      return makeIStorageLibrary2(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibrary2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__431479993_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibrary2): Array<IStorageLibrary2?> = (elements as
        Array<IStorageLibrary2?>).castToImpl<IStorageLibrary2,IStorageLibrary2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibrary2?> =
        arrayOfNulls<IStorageLibrary2_Impl>(size) as Array<IStorageLibrary2?>
  }
}
