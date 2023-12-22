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

@ABIMarker(IStorageFolder3.ABI::class)
@Signature("{9f617899-bde1-4124-aeb3-b06ad96f98d4}")
@Guid("9f617899bde14124aeb3b06ad96f98d4")
@WinRTInterface("9f617899bde14124aeb3b06ad96f98d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolder3.ByReference::class)
public interface IStorageFolder3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetChangeTracker(): StorageLibraryChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFolder3> {
    public override fun getValue() = ABI.makeIStorageFolder3(pointer.getPointer(0))

    public fun setValue(value: IStorageFolder3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolder3 {
    public val __411386723_Ptr: Pointer?

    public val _411386723_VtblPtr: Pointer?
      get() = __411386723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetChangeTracker(): StorageLibraryChangeTracker? {
      val fnPtr = _411386723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageLibraryChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__411386723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageLibraryChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFolder3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __411386723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolder3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f617899bde14124aeb3b06ad96f98d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolder3(ptr: Pointer?): WithDefault = IStorageFolder3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolder3 {
      val address = segment.toRawLongValue()
      return makeIStorageFolder3(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolder3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__411386723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolder3): Array<IStorageFolder3?> = (elements as
        Array<IStorageFolder3?>).castToImpl<IStorageFolder3,IStorageFolder3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolder3?> =
        arrayOfNulls<IStorageFolder3_Impl>(size) as Array<IStorageFolder3?>
  }
}
