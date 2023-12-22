package Windows.Networking.Connectivity

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectionProfile5.ABI::class)
@Signature("{85361ec7-9c73-4be0-8f14-578eec71ee0e}")
@Guid("85361ec79c734be08f14578eec71ee0e")
@WinRTInterface("85361ec79c734be08f14578eec71ee0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectionProfile5.ByReference::class)
public interface IConnectionProfile5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanDelete(): Boolean

  @InterfaceMethod(1)
  public fun TryDeleteAsync(): IAsyncOperation<ConnectionProfileDeleteStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectionProfile5> {
    public override fun getValue() = ABI.makeIConnectionProfile5(pointer.getPointer(0))

    public fun setValue(value: IConnectionProfile5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectionProfile5 {
    public val __2102938835_Ptr: Pointer?

    public val _2102938835_VtblPtr: Pointer?
      get() = __2102938835_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanDelete(): Boolean {
      val fnPtr = _2102938835_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102938835_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryDeleteAsync(): IAsyncOperation<ConnectionProfileDeleteStatus?>? {
      val fnPtr = _2102938835_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ConnectionProfileDeleteStatus?>>()
      val hr = fn.invokeHR(arrayOf(__2102938835_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ConnectionProfileDeleteStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IConnectionProfile5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2102938835_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectionProfile5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85361ec79c734be08f14578eec71ee0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectionProfile5(ptr: Pointer?): WithDefault = IConnectionProfile5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectionProfile5 {
      val address = segment.toRawLongValue()
      return makeIConnectionProfile5(Pointer(address))
    }

    public override fun toNative(obj: IConnectionProfile5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2102938835_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectionProfile5): Array<IConnectionProfile5?> =
        (elements as
        Array<IConnectionProfile5?>).castToImpl<IConnectionProfile5,IConnectionProfile5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectionProfile5?> =
        arrayOfNulls<IConnectionProfile5_Impl>(size) as Array<IConnectionProfile5?>
  }
}
