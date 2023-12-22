package Windows.Storage

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IStorageFolder2.ABI::class)
@Signature("{e827e8b9-08d9-4a8e-a0ac-fe5ed3cbbbd3}")
@Guid("e827e8b908d94a8ea0acfe5ed3cbbbd3")
@WinRTInterface("e827e8b908d94a8ea0acfe5ed3cbbbd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolder2.ByReference::class)
public interface IStorageFolder2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetItemAsync(name: String?): IAsyncOperation<IStorageItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFolder2> {
    public override fun getValue() = ABI.makeIStorageFolder2(pointer.getPointer(0))

    public fun setValue(value: IStorageFolder2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolder2 {
    public val __411386722_Ptr: Pointer?

    public val _411386722_VtblPtr: Pointer?
      get() = __411386722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetItemAsync(name: String?): IAsyncOperation<IStorageItem?>? {
      val fnPtr = _411386722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IStorageItem?>>()
      val hr = fn.invokeHR(arrayOf(__411386722_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IStorageItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFolder2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __411386722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolder2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e827e8b908d94a8ea0acfe5ed3cbbbd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolder2(ptr: Pointer?): WithDefault = IStorageFolder2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolder2 {
      val address = segment.toRawLongValue()
      return makeIStorageFolder2(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolder2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__411386722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolder2): Array<IStorageFolder2?> = (elements as
        Array<IStorageFolder2?>).castToImpl<IStorageFolder2,IStorageFolder2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolder2?> =
        arrayOfNulls<IStorageFolder2_Impl>(size) as Array<IStorageFolder2?>
  }
}
